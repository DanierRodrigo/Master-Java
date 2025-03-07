package org.example.pOO.herencias.Zoologico;

class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String comer() { return "El Tigre de especie " + especieTigre + " caza sigilosamente en la selva"; }
    public String dormir() { return "El Tigre duerme oculto entre la maleza en " + habitat; }
    public String correr() { return "El Tigre corre a una velocidad de " + velocidad + " km/h para atrapar a su presa"; }
    public String comunicarse() { return "El Tigre emite gruñidos y rugidos para comunicarse"; }
}

