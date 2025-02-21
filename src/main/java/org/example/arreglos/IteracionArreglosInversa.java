package org.example.arreglos;

public class IteracionArreglosInversa {
    public static void main(String[] args) {
        // Definir un arreglo
        int[] arreglo = {10, 20, 30, 40, 50};

        // Bucle for clásico para iterar en orden inverso
        System.out.println("Bucle for clásico para iterar en orden inverso");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }

        // Inicializar el índice, comenzando en el último índice del arreglo
        int i = arreglo.length - 1;

        // Bucle while para iterar en orden inverso
        System.out.println("\nBucle while para iterar en orden inverso");
        while (i >= 0) {
            System.out.println(arreglo[i]);
            i--;  // Decrementamos el índice
        }

        // Inicializar el índice
        i = arreglo.length - 1;

        // Bucle do-while para iterar en orden inverso
        System.out.println("\nBucle do-while para iterar en orden inverso");
        do {
            System.out.println(arreglo[i]);
            i--;  // Decrementamos el índice
        } while (i >= 0);  // Comprobamos que i no sea negativo
    }
}
