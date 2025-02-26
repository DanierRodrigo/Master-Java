package org.example.arreglos;

public class TareaHistograma {
    public static void main(String[] args) {
        // Arreglo de 12 elementos con números del 1 al 6
        int[] arreglo = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};

        // Crear un arreglo para contar la frecuencia de los números del 1 al 6
        int[] frecuencia = new int[6]; // índice 0 representa el número 1, índice 1 el número 2, etc.

        // Contar las ocurrencias de cada número
        for (int i = 0; i < arreglo.length; i++) {
            frecuencia[arreglo[i] - 1]++;  // Restamos 1 para que el número 1 se corresponda con el índice 0
        }

        // Imprimir el histograma
        for (int i = 0; i < frecuencia.length; i++) {
            System.out.print((i + 1) + ": ");  // Imprimir el número (i + 1 porque los índices comienzan en 0)
            for (int j = 0; j < frecuencia[i]; j++) {
                System.out.print("*");  // Imprimir asteriscos según la frecuencia
            }
            System.out.println();  // Salto de línea después de cada número
        }
    }
}
