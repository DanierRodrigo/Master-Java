package org.example.matrices;

public class SumaDeFilasYColumnas {
    public static void main(String[] args) {
        // Crear una matriz 3x3 para ejemplo
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Paso 1: Sumar las filas
        int[] sumaFilas = new int[matriz.length];  // Array para almacenar la suma de cada fila

        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];  // Sumar los elementos de la fila
            }
            sumaFilas[i] = suma;  // Guardar la suma de la fila en el array sumaFilas
        }

        // Mostrar la suma de cada fila
        System.out.println("Suma de las filas:");
        for (int i = 0; i < sumaFilas.length; i++) {
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFilas[i]);
        }

        // Paso 2: Sumar las columnas
        int[] sumaColumnas = new int[matriz[0].length];  // Array para almacenar la suma de cada columna

        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];  // Sumar los elementos de la columna
            }
            sumaColumnas[j] = suma;  // Guardar la suma de la columna en el array sumaColumnas
        }

        // Mostrar la suma de cada columna
        System.out.println("\nSuma de las columnas:");
        for (int j = 0; j < sumaColumnas.length; j++) {
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumnas[j]);
        }
    }
}
