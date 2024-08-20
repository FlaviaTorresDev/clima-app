package dev.flavia.clima_app.model;

import java.util.List;

import lombok.Data;

@Data
public class ClimaResponse {
	
	private String nome;
    private Sistema sistema;
    private List<Clima> clima;
    private Main main;
    private Vento vento;
    
    
    public static class Sistema {
        private String país;
        
        // Getters and setters

        public String getPaís() {
            return país;
        }

        public void setPaís(String país) {
            this.país = país;
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
