package org.example.arreglos;

import java.util.Scanner;

public class EjercicioNumerosParesEImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para almacenar los números pares e impares
        int[] numerosPares = new int[10];
        int[] numerosImpares = new int[10];
        int contadorPares = 0;
        int contadorImpares = 0;

        // Pedir 10 números al usuario
        System.out.println("Por favor, ingresa 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // Verificar si el número es par o impar
            if (numero % 2 == 0) {
                numerosPares[contadorPares] = numero;
                contadorPares++;
            } else {
                numerosImpares[contadorImpares] = numero;
                contadorImpares++;
            }
        }

        // Mostrar los números pares
        System.out.println("\nLos números pares son:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.println(numerosPares[i]);
        }

        // Mostrar los números impares
        System.out.println("\nLos números impares son:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.println(numerosImpares[i]);
        }

        scanner.close();
    }
}
