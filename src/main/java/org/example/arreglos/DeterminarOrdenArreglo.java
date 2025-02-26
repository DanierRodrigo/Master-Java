package org.example.arreglos;

public class DeterminarOrdenArreglo {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 7, 4, 5}; //Probamos distintas combinaciones

        if (esAscendente(arreglo)) {
            System.out.println("El arreglo está en orden ascendente.");
        } else if (esDescendente(arreglo)) {
            System.out.println("El arreglo está en orden descendente.");
        } else {
            System.out.println("El arreglo no está en orden.");
        }
    }

    // Método para verificar si el arreglo está en orden ascendente
    public static boolean esAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                return false; // Si algún elemento es mayor que el siguiente, no está ascendente
            }
        }
        return true;
    }

    // Método para verificar si el arreglo está en orden descendente
    public static boolean esDescendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] < arreglo[i + 1]) {
                return false; // Si algún elemento es menor que el siguiente, no está descendente
            }
        }
        return true;
    }
}
