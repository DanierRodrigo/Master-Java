package org.example.claseMath;

import java.util.Random;
import java.util.Scanner;

public class EjercicioAdivinaElNumero {
    public static void main(String[] args) {
    // Crear el generador de números aleatorios con una semilla fija
    Random random = new Random(12345);  // Semilla fija para reproducir el mismo número cada vez

    // Generar un número aleatorio entre 1 y 100
    int numeroSecreto = random.nextInt(100) + 1;

    // Crear un scanner para leer las respuestas del jugador
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenido al juego 'Adivina el número'!");
    System.out.println("He generado un número entre 1 y 100. ¡Intenta adivinarlo!");

    int intento = 0;
    boolean adivinado = false;

    while (!adivinado) {
        // Solicitar al jugador que ingrese un número
        System.out.print("Introduce tu intento: ");
        intento = scanner.nextInt();

        // Verificar si el jugador adivinó el número
        if (intento < numeroSecreto) {
            System.out.println("Demasiado bajo. Intenta nuevamente.");
        } else if (intento > numeroSecreto) {
            System.out.println("Demasiado alto. Intenta nuevamente.");
        } else {
            adivinado = true;
            System.out.println("¡Felicidades! Has adivinado el número secreto: " + numeroSecreto);
        }
    }

    // Cerrar el scanner
    scanner.close();
}
}
