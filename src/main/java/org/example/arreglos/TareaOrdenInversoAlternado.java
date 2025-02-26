package org.example.arreglos;

import java.util.Scanner;

public class TareaOrdenInversoAlternado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar los 10 números
        int[] arreglo = new int[10];

        // Leer los 10 números desde el teclado
        System.out.println("Por favor ingrese 10 números enteros:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Mostrar los números en el orden solicitado (último, primero, penúltimo, segundo, ...)
        System.out.println("\nLos números en el orden solicitado son:");
        for (int i = 0; i < arreglo.length / 2; i++) {
            // Mostrar el último y luego el primero
            System.out.print(arreglo[arreglo.length - 1 - i] + " ");
            System.out.print(arreglo[i] + " ");
        }

        // Si el número de elementos es impar, se muestra el elemento central
        if (arreglo.length % 2 != 0) {
            System.out.println(arreglo[arreglo.length / 2]);
        }

        scanner.close();
    }
}
