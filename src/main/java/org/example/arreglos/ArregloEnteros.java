package org.example.arreglos;

public class ArregloEnteros {
    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo de enteros con 5 elementos
        int[] edades = new int[5];  // El tamaño del arreglo es 5

        // Asignación de valores a los elementos del arreglo
        edades[0] = 18;
        edades[1] = 25;
        edades[2] = 30;
        edades[3] = 22;
        edades[4] = 27;

        // Acceder y mostrar los valores almacenados en el arreglo
        System.out.println("Las edades son:");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Persona " + (i + 1) + ": " + edades[i] + " años");
        }

        // También podemos acceder a un elemento específico:
        System.out.println("\nLa edad de la tercera persona es: " + edades[2] + " años");
    }
}
