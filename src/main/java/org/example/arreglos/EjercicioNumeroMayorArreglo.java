package org.example.arreglos;

import java.util.Scanner;

public class EjercicioNumeroMayorArreglo {
    public static int encontrarNumeroMayor(int[] arreglo) {
        // Suponemos que el primer elemento es el mayor
        int mayor = arreglo[0];

        // Recorremos el arreglo desde el segundo elemento
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];  // Actualizamos el mayor si encontramos uno más grande
            }
        }

        return mayor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos un arreglo de tamaño 5
        int[] miArreglo = new int[5];

        // Solicitamos al usuario que ingrese 5 números
        System.out.println("Ingresa 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            miArreglo[i] = scanner.nextInt();  // Leemos el número ingresado por el usuario
        }

        // Llamamos al metodo para encontrar el número mayor
        int numeroMayor = encontrarNumeroMayor(miArreglo);

        // Imprimimos el número mayor
        System.out.println("El número mayor en el arreglo es: " + numeroMayor);

        // Cerramos el scanner para evitar fugas de recursos
        scanner.close();
    }
}
