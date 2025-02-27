package org.example.matrices;

public class MatrizIrregular {
    public static void main(String[] args) {
        // Crear la matriz jagged (con tamaños variables de columnas por fila)
        String[][] matriz = new String[3][];  // Declaramos la matriz con 3 filas, pero columnas variables

        // Inicializamos las filas con diferentes números de columnas
        matriz[0] = new String[]{"Daniel", "Julie"};          // Fila 1 tiene 2 elementos
        matriz[1] = new String[]{"Pedro", "Laura", "Maria"};  // Fila 2 tiene 3 elementos
        matriz[2] = new String[]{"Carlos"};              // Fila 3 tiene 1 elemento

        // Recorrer la matriz usando un bucle for
        System.out.println("Elementos de la matriz jagged:");
        for (int i = 0; i < matriz.length; i++) {  // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) {  // Recorre las columnas de cada fila
                System.out.print(matriz[i][j] + " ");  // Imprime cada elemento
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }
}
