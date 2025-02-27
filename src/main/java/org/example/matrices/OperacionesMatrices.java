package org.example.matrices;

public class OperacionesMatrices {
    public static void main(String[] args) {
        // Crear dos matrices 2x2 para ejemplo
        int[][] matrizA = {
                {1, 2},
                {3, 4}
        };

        int[][] matrizB = {
                {5, 6},
                {7, 8}
        };

        // Suma de matrices
        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        // Verificar si las matrices tienen las mismas dimensiones
        if (matrizA.length == matrizB.length && matrizA[0].length == matrizB[0].length) {
            int[][] suma = new int[filas][columnas];

            // Realizar la suma de las matrices
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    suma[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }

            // Mostrar el resultado de la suma
            System.out.println("Suma de las matrices:");
            imprimirMatriz(suma);
        } else {
            System.out.println("Las matrices no tienen las mismas dimensiones para la suma.");
        }

        // Resta de matrices
        if (matrizA.length == matrizB.length && matrizA[0].length == matrizB[0].length) {
            int[][] resta = new int[filas][columnas];

            // Realizar la resta de las matrices
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    resta[i][j] = matrizA[i][j] - matrizB[i][j];
                }
            }

            // Mostrar el resultado de la resta
            System.out.println("Resta de las matrices:");
            imprimirMatriz(resta);
        } else {
            System.out.println("Las matrices no tienen las mismas dimensiones para la resta.");
        }

        // Multiplicación: Solo si las matrices tienen dimensiones compatibles
        if (matrizA[0].length == matrizB.length) {
            int[][] multiplicacion = new int[matrizA.length][matrizB[0].length];

            // Realizar la multiplicación
            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizB[0].length; j++) {
                    for (int k = 0; k < matrizA[0].length; k++) {
                        multiplicacion[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }

            // Mostrar el resultado de la multiplicación
            System.out.println("Multiplicación de las matrices:");
            imprimirMatriz(multiplicacion);
        } else {
            System.out.println("Las matrices no son compatibles para la multiplicación.");
        }
    }

    // Función para imprimir matrices
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
