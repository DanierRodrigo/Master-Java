package org.example.matrices;

import java.util.Scanner;

public class TareaImprimirSilla {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Leer el tamaño de la matriz (n)
        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = sc.nextInt();

        // Verificar si el valor de n es menor o igual a cero
        if (n <= 0) {
            System.out.println("ERROR");
            return; // Finalizar la ejecución si n es menor o igual a cero
        }

        // Crear la matriz de tamaño n x n y dibujar la silla (letra 'h')
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Primera columna y última columna de la "silla"
                if (j == 0 || j == n - 1) {
                    System.out.print("1");
                }
                // La fila central (la base de la silla)
                else if (i == n / 2) {
                    System.out.print("1");
                }
                // Relleno con espacios (ceros)
                else {
                    System.out.print("0");
                }
            }
            // Saltar a la siguiente línea después de imprimir cada fila
            System.out.println();
        }
    }
}
