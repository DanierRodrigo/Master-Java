package org.example.arreglos;

import java.util.Scanner;

public class EliminarElementoArreglo {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Crear un arreglo de ejemplo
    int[] arreglo = {10, 20, 30, 40, 50, 60};

    // Mostrar el arreglo original
    System.out.println("Arreglo original:");
    mostrarArreglo(arreglo);

    // Pedir al usuario que ingrese el elemento a eliminar
    System.out.print("\nIngrese el elemento que desea eliminar: ");
    int elemento = scanner.nextInt();

    // Eliminar el elemento
    arreglo = eliminarElemento(arreglo, elemento);

    // Mostrar el arreglo después de eliminar el elemento
    System.out.println("\nArreglo después de eliminar el elemento:");
    mostrarArreglo(arreglo);

    scanner.close();
}

    // Metodo para eliminar un elemento del arreglo
    public static int[] eliminarElemento(int[] arreglo, int elemento) {
        // Buscar el índice del elemento
        int indice = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                indice = i;
                break;
            }
        }

        // Si el elemento no se encuentra, se devuelve el arreglo sin cambios
        if (indice == -1) {
            System.out.println("El elemento no se encuentra en el arreglo.");
            return arreglo;
        }

        // Crear un nuevo arreglo con un espacio menos
        int[] nuevoArreglo = new int[arreglo.length - 1];

        // Copiar los elementos antes del índice del elemento a eliminar
        for (int i = 0; i < indice; i++) {
            nuevoArreglo[i] = arreglo[i];
        }

        // Copiar los elementos después del índice del elemento a eliminar
        for (int i = indice + 1; i < arreglo.length; i++) {
            nuevoArreglo[i - 1] = arreglo[i];
        }

        return nuevoArreglo;
    }

    // Metodo para mostrar el arreglo
    public static void mostrarArreglo(int[] arreglo) {
        if (arreglo.length == 0) {
            System.out.println("El arreglo está vacío.");
        } else {
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        }
    }
}
