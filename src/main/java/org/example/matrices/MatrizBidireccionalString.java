package org.example.matrices;

public class MatrizBidireccionalString {
    public static void main(String[] args) {
        // Paso 1: Crear la matriz 2x3 con valores de tipo String
        String[][] matriz = {
                {"Daniel", "Ana", "Carlos"},
                {"Julie", "Laura", "Maria"}
        };

        // Paso 2: Recorrer la matriz usando un bucle for
        System.out.println("Elementos de la matriz:");
        for (int i = 0; i < matriz.length; i++) {  // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) {  // Recorre las columnas
                System.out.print(matriz[i][j] + " ");  // Imprime cada elemento
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }
}
