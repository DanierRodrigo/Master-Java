package org.example.pOO.herencias.Zoologico;

class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public String comer() { return "El Lobo de especie " + especieLobo + " caza en manada"; }
    public String dormir() { return "El Lobo " + color + " duerme en las cavernas de " + habitat; }
    public String correr() { return "El Lobo corre en grupo para acechar a su presa"; }
    public String comunicarse() { return "El Lobo aúlla para comunicarse con su manada"; }
}
