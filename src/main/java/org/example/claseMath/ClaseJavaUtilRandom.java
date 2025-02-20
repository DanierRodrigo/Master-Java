package org.example.claseMath;

import java.util.Random;

public class ClaseJavaUtilRandom {
    public static void main(String[] args) {

        Random random = new Random();

        // Genera un número entero aleatorio
        int numeroAleatorio = random.nextInt();
        System.out.println("Número aleatorio entero: " + numeroAleatorio);

        // Genera un número aleatorio entre 0 y 9
        int numeroAleatorio1 = random.nextInt(10); // 10 es el límite superior exclusivo
        System.out.println("Número aleatorio entre 0 y 9: " + numeroAleatorio1);

        // Genera un número aleatorio entre min (inclusive) y max (inclusive)
        int min = 1;
        int max = 10;

        int numeroAleatorio2 = random.nextInt(max - min + 1) + min;
        System.out.println("Número aleatorio entre " + min + " y " + max + ": " + numeroAleatorio2);

        // Genera un número decimal aleatorio entre 0.0 y 1.0
        double numeroAleatorioDecimal = random.nextDouble();
        System.out.println("Número aleatorio decimal entre 0.0 y 1.0: " + numeroAleatorioDecimal);

        // Genera un valor booleano aleatorio
        boolean valorAleatorioBooleano = random.nextBoolean();
        System.out.println("Valor aleatorio booleano: " + valorAleatorioBooleano);

        // Crear un objeto Random con una semilla(seed)
        Random random1 = new Random(12345); // Semilla específica

        // Generar un número aleatorio
        int numeroAleatorio3 = random1.nextInt(10);
        System.out.println("Número aleatorio con semilla: " + numeroAleatorio3);


    }
}
