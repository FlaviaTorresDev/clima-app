package dev.flavia.clima_app.model;

import java.util.List;


public class ClimaResponse {
	
    private String nome;
    private Sistema sistema;
    private List<Clima> clima;
    private Main main;
    private Vento vento;

    // Getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public List<Clima> getClima() {
        return clima;
    }

    public void setClima(List<Clima> clima) {
        this.clima = clima;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Vento getVento() {
        return vento;
    }

    public void setVento(Vento vento) {
        this.vento = vento;
    }

    public static class Sistema {
        private String pais;

        // Getters and setters

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }
    }

    public static class Clima {
        private int id;
        private String descricao;

        // Getters and setters

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    }

    public static class Main {
        private double tempo;
        private int umidade;

        // Getters and setters

        public double getTempo() {
            return tempo;
        }

        public void setTempo(double tempo) {
            this.tempo = tempo;
        }

        public int getUmidade() {
            return umidade;
        }

        public void setUmidade(int umidade) {
            this.umidade = umidade;
        }
    }

    public static class Vento {
        private double velocidade;

        // Getters and setters

        public double getVelocidade() {
            return velocidade;
        }

        public void setVelocidade(double velocidade) {
            this.velocidade = velocidade;
        }
    }
}
