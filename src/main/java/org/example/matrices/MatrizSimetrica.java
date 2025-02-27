package org.example.matrices;

public class MatrizSimetrica {
    public static void main(String[] args) {
        // Crear una matriz 3x3
        int[][] matriz = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        // Verificar si la matriz es simétrica
        boolean esSimetrica = true;  // Suponemos que es simétrica hasta que se demuestre lo contrario

        // Verificamos solo la mitad superior de la matriz (debido a la simetría)
        for (int i = 0; i < matriz.length; i++) {  // Recorre las filas
            for (int j = i + 1; j < matriz[i].length; j++) {  // Solo recorre las columnas que están encima de la diagonal
                if (matriz[i][j] != matriz[j][i]) {  // Si no son iguales
                    esSimetrica = false;
                    break;
                }
            }
            if (!esSimetrica) {
                break;  // Si encontramos que no es simétrica, terminamos la búsqueda
            }
        }

        // Mostrar el resultado
        if (esSimetrica) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }
}
