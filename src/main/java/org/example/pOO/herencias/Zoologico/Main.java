package org.example.pOO.herencias.Zoologico;

public class Main {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];
        mamiferos[0] = new Leon("África", 1.2f, 2.2f, 190f, "Panthera leo", 5.5f, 80, 10, 110f);
        mamiferos[1] = new Guepardo("Sabana", 0.9f, 1.5f, 72f, "Acinonyx jubatus", 4.8f, 120);
        mamiferos[2] = new Lobo("Bosques", 1.0f, 1.8f, 45f, "Canis lupus", "Gris", 4.5f, 5, "Lobo Gris");
        mamiferos[3] = new Perro("Sabana", 0.8f, 1.2f, 35f, "Lycaon pictus", "Moteado", 3.2f, 250);
        mamiferos[4] = new Tigre("Selva", 1.1f, 2.5f, 220f, "Panthera tigris", 6.0f, 65, "Tigre de Bengala");

        for (Mamifero animal : mamiferos) {
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
            System.out.println("--------------------");
        }
    }
}
