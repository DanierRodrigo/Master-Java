package org.example.matrices;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        // Crear una matriz 3x2
        int[][] matriz = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Crear una matriz transpuesta de tamaño invertido (filas -> columnas y columnas -> filas)
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizTranspuesta = new int[columnas][filas];  // Cambiar filas por columnas

        // Llenar la matriz transpuesta
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];  // Intercambiar filas y columnas
            }
        }

        // Imprimir la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Imprimir la matriz transpuesta
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
