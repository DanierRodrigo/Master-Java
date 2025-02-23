package org.example.claseMath;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        double numeroAleatorio = Math.random();
        System.out.println("Número aleatorio entre 0 y 1: " + numeroAleatorio);

        // Genera un número aleatorio entre 1 y 10
        int numeroAleatorio1 = (int)(Math.random() * 10) + 1;
        System.out.println("Número aleatorio entre 1 y 10: " + numeroAleatorio1);

        // Genera un número aleatorio entre min (inclusive) y max (inclusive)
        int min = 5;
        int max = 15;

        int numeroAleatorio2 = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("Número aleatorio entre " + min + " y " + max + ": " + numeroAleatorio2);

        // Genera un número aleatorio entre min (inclusive) y max (exclusivo)
        double min1 = 1.5;
        double max1 = 5.5;

        double numeroAleatorio3 = Math.random() * (max - min) + min;
        System.out.println("Número aleatorio decimal entre " + min1 + " y " + max1 + ": " + numeroAleatorio3);

    }
}
