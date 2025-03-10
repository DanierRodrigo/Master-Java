package org.example.pOO.herencias.Zoologico;

class Guepardo extends Felino {
    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    public String comer() { return "El Guepardo caza con gran velocidad y precisión"; }
    public String dormir() { return "El Guepardo duerme en las praderas de " + habitat; }
    public String correr() { return "El Guepardo es el mamífero más rápido, alcanzando " + velocidad + " km/h"; }
    public String comunicarse() { return "El Guepardo emite sonidos agudos para llamar a su cría"; }
}

