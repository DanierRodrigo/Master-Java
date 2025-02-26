package org.example.arreglos;

import java.util.Scanner;

public class TareaPromediosyCeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo de 7 elementos
        int[] arreglo = new int[7];

        // Leer los 7 números desde el teclado
        System.out.println("Por favor ingrese 7 números enteros:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Inicializar variables para los cálculos
        int sumaPositivos = 0, sumaNegativos = 0, cantidadPositivos = 0, cantidadNegativos = 0, cantidadCeros = 0;

        // Recorrer el arreglo y realizar los cálculos
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 0) {
                sumaPositivos += arreglo[i];
                cantidadPositivos++;
            } else if (arreglo[i] < 0) {
                sumaNegativos += arreglo[i];
                cantidadNegativos++;
            } else {
                cantidadCeros++;
            }
        }

        // Calcular los promedios
        double promedioPositivos = (cantidadPositivos > 0) ? (double) sumaPositivos / cantidadPositivos : 0;
        double promedioNegativos = (cantidadNegativos > 0) ? (double) sumaNegativos / cantidadNegativos : 0;

        // Mostrar los resultados
        System.out.println("\nPromedio de los números positivos: " + promedioPositivos);
        System.out.println("Promedio de los números negativos: " + promedioNegativos);
        System.out.println("Cantidad de ceros: " + cantidadCeros);

        scanner.close();
    }
}
