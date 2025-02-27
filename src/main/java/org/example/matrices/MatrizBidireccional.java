package org.example.matrices;

public class MatrizBidireccional {
    public static void main(String[] args) {
        // Crear la matriz 3x3 con valores específicos
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calcular la suma de todos los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {  // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) {  // Recorre las columnas
                suma += matriz[i][j];
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();  // Salto de línea después de cada fila
        }

        // Mostrar la suma
        System.out.println("La suma de todos los elementos de la matriz es: " + suma);
    }
}
