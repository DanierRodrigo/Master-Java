package org.example.arreglos;

import java.util.Scanner;

public class InsertarElementoArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo de ejemplo con espacio para 6 elementos
        int[] arreglo = {1, 2, 3, 4, 5};

        // Mostrar el arreglo original
        System.out.println("Arreglo original:");
        mostrarArreglo(arreglo);

        // Pedir al usuario que ingrese el elemento a agregar y la posición
        System.out.print("\nIngrese el elemento a agregar: ");
        int elemento = scanner.nextInt();
        System.out.print("Ingrese la posición donde desea agregar el elemento (0 a " + (arreglo.length) + "): ");
        int posicion = scanner.nextInt();

        // Validar que la posición esté dentro del rango
        if (posicion < 0 || posicion > arreglo.length) {
            System.out.println("Posición inválida.");
        } else {
            // Insertar el elemento
            arreglo = insertarElemento(arreglo, elemento, posicion);

            // Mostrar el arreglo después de la inserción
            System.out.println("\nArreglo después de insertar el elemento:");
            mostrarArreglo(arreglo);
        }

        scanner.close();
    }

    // Metodo para insertar un elemento en el arreglo
    public static int[] insertarElemento(int[] arreglo, int elemento, int posicion) {
        // Crear un nuevo arreglo con espacio adicional para el nuevo elemento
        int[] nuevoArreglo = new int[arreglo.length + 1];

        // Copiar los elementos antes de la posición indicada
        for (int i = 0; i < posicion; i++) {
            nuevoArreglo[i] = arreglo[i];
        }

        // Insertar el nuevo elemento en la posición indicada
        nuevoArreglo[posicion] = elemento;

        // Copiar los elementos después de la posición indicada
        for (int i = posicion; i < arreglo.length; i++) {
            nuevoArreglo[i + 1] = arreglo[i];
        }

        return nuevoArreglo;
    }

    // Metodo para mostrar el arreglo
    public static void mostrarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
