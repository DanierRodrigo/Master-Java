package org.example.arreglos;

public class IteracionesDeArreglos {
    public static void main(String[] args) {
        // Crear un arreglo de enteros
        int[] numeros = {10, 20, 30, 40, 50};

        // 1. Usar un bucle for tradicional
        System.out.println("Iteración usando un bucle for tradicional:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en el índice " + i + ": " + numeros[i]);
        }

        // 2. Usar un bucle for-each (mejor para recorrer todos los elementos)
        System.out.println("\nIteración usando un bucle for-each:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // 3. Usar un bucle while
        System.out.println("\nIteración usando un bucle while:");
        int j = 0;
        while (j < numeros.length) {
            System.out.println("Elemento en el índice " + j + ": " + numeros[j]);
            j++;
        }
    }
}
