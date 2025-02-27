package org.example.arreglos;

import java.util.Scanner;

public class BuscarElementoArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo de ejemplo
        int[] arreglo = {5, 12, 8, 20, 33, 44, 15, 10};

        // Pedir al usuario que ingrese el número a buscar
        System.out.print("Ingrese el número que desea buscar: ");
        int numeroBuscar = scanner.nextInt();

        // Llamar al metodo para buscar el número en el arreglo
        int indice = buscarNumero(arreglo, numeroBuscar);

        // Mostrar el resultado
        if (indice != -1) {
            System.out.println("El número " + numeroBuscar + " se encuentra en el índice " + indice + ".");
        } else {
            System.out.println("El número " + numeroBuscar + " no se encuentra en el arreglo.");
        }

        scanner.close();
    }

    // Metodo para buscar un número en el arreglo
    public static int buscarNumero(int[] arreglo, int numeroBuscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscar) {
                return i; // Si lo encuentra, devuelve el índice
            }
        }
        return -1; // Si no lo encuentra, devuelve -1
    }
}
