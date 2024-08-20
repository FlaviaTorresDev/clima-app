package dev.flavia.clima_app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import dev.flavia.clima_app.model.ClimaResponse;


@Controller
public class ClimaController {
	
	@Value("${api.key}")
    private String apiKey;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/clima")
    public String getClima(@RequestParam("cidade") String cidade, Model model) {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + cidade + "&appid=" + apiKey + "&units=metric";
        RestTemplate restTemplate = new RestTemplate();
        ClimaResponse climaResponse = restTemplate.getForObject(url, ClimaResponse.class);

        if (climaResponse != null) {
            model.addAttribute("cidade", climaResponse.getNome());
            model.addAttribute("pais", climaResponse.getSistema().getPais());
            model.addAttribute("climaDescricao", climaResponse.getClima().get(0).getDescricao());
            model.addAttribute("temperatura", climaResponse.getMain().getTempo());
            model.addAttribute("umidade", climaResponse.getMain().getUmidade());
            model.addAttribute("velocidadeVento", climaResponse.getVento().getVelocidade());
            String weatherIcon = "wi wi-owm-" + climaResponse.getClima().get(0).getId();
            model.addAttribute("weatherIcon", weatherIcon);
        } else {
            model.addAttribute("error", "Cidade não encontrada.");
        }

        return "clima";
    }
}


