package org.example.arreglos;

import java.util.Scanner;

public class MoverElementosArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo de ejemplo
        int[] arreglo = {1, 2, 3, 4, 5, 6};

        // Mostrar el arreglo original
        System.out.println("Arreglo original:");
        mostrarArreglo(arreglo);

        // Mover los elementos una posición hacia la derecha
        moverElementos(arreglo);

        // Mostrar el arreglo después de mover los elementos
        System.out.println("\nArreglo después de mover los elementos:");
        mostrarArreglo(arreglo);

        scanner.close();
    }

    // Metodo para mover los elementos del arreglo una posición a la derecha
    public static void moverElementos(int[] arreglo) {
        int ultimaPosicion = arreglo[arreglo.length - 1]; // Guardar el último elemento

        // Mover los elementos una posición a la derecha
        for (int i = arreglo.length - 2; i >= 0; i--) {
            arreglo[i + 1] = arreglo[i];
        }

        // Colocar el primer elemento en la última posición
        arreglo[0] = ultimaPosicion;
    }

    // Metodo para mostrar el arreglo
    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
