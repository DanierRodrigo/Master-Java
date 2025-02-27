package org.example.matrices;

public class LimitesYDiagonal {
    public static void main(String[] args) {
        // Crear una matriz 3x3 de ejemplo
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Encontrar el límite inferior (mínimo) y el límite superior (máximo)
        int limiteInferior = matriz[0][0];  // Inicializar con el primer valor de la matriz
        int limiteSuperior = matriz[0][0];  // Inicializar con el primer valor de la matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < limiteInferior) {
                    limiteInferior = matriz[i][j];  // Actualizar límite inferior si encontramos un valor menor
                }
                if (matriz[i][j] > limiteSuperior) {
                    limiteSuperior = matriz[i][j];  // Actualizar límite superior si encontramos un valor mayor
                }
            }
        }

        // Imprimir los límites
        System.out.println("Límite inferior (mínimo): " + limiteInferior);
        System.out.println("Límite superior (máximo): " + limiteSuperior);

        // Obtener los elementos de la diagonal principal
        System.out.println("\nElementos de la diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Elemento en la posición (" + i + ", " + i + "): " + matriz[i][i]);
        }
    }
}
