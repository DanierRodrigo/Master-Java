package org.example.arreglos;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        // Crear un arreglo de enteros desordenado
        int[] arreglo = {64, 25, 12, 22, 11};

        // Llamar a la función de ordenamiento burbuja
        ordenamientoBurbuja(arreglo);

        // Imprimir el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }

    // Metodo de ordenamiento burbuja
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;

        // Recorrer completo el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Recorrer el arreglo de 0 a n-i-1
            // Últimos i elementos ya están en su lugar
            for (int j = 0; j < n - i - 1; j++) {
                // Si el elemento actual es mayor que el siguiente, intercambiarlos
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar los elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
}
