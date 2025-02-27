package org.example.arreglos;

import java.util.Scanner;

public class InsertarElementoEIncrementarArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo de ejemplo con 5 elementos
        int[] arreglo = {1, 2, 3, 4, 5};

        // Mostrar el arreglo original
        System.out.println("Arreglo original:");
        mostrarArreglo(arreglo);

        // Pedir al usuario que ingrese el nuevo elemento
        System.out.print("\nIngrese el nuevo elemento a agregar: ");
        int nuevoElemento = scanner.nextInt();

        // Insertar el nuevo elemento y aumentar el tamaño del arreglo
        arreglo = insertarElementoEIncrementar(arreglo, nuevoElemento);

        // Mostrar el arreglo después de insertar el nuevo elemento
        System.out.println("\nArreglo después de insertar el nuevo elemento:");
        mostrarArreglo(arreglo);

        scanner.close();
    }

    // Metodo para insertar un nuevo elemento y aumentar el tamaño del arreglo
    public static int[] insertarElementoEIncrementar(int[] arreglo, int nuevoElemento) {
        // Crear un nuevo arreglo con un tamaño mayor (1 más que el original)
        int[] nuevoArreglo = new int[arreglo.length + 1];

        // Copiar los elementos del arreglo original al nuevo arreglo
        for (int i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i];
        }

        // Insertar el nuevo elemento al final del nuevo arreglo
        nuevoArreglo[arreglo.length] = nuevoElemento;

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
