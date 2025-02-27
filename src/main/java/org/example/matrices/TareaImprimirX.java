package org.example.matrices;

import java.util.Scanner;

public class TareaImprimirX {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Leer el tamaño de la matriz (n)
        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = sc.nextInt();

        // Verificar si el valor de n es cero
        if (n == 0 || n < 0) {
            System.out.println("ERROR");
            return; // Finalizar la ejecución si n es cero
        }

        // Crear la matriz de tamaño n x n
        for (int i = 0; i < n; i++) {
            // Imprimir cada fila de la matriz
            for (int j = 0; j < n; j++) {
                // Colocar 'X' en las diagonales
                if (i == j || i == n - j - 1) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            // Saltar a la siguiente línea después de imprimir cada fila
            System.out.println();
        }
    }
}
