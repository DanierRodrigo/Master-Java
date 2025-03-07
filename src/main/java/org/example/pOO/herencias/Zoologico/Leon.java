package org.example.pOO.herencias.Zoologico;

class Leon extends Felino {
    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public String comer() { return "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas"; }
    public String dormir() { return "El León duerme bajo la sombra de los árboles en " + habitat; }
    public String correr() { return "El León corre a una velocidad de " + velocidad + " km/h en busca de presas"; }
    public String comunicarse() { return "El León ruge con una potencia de " + potenciaRugidoDecibel + " decibeles"; }
}
