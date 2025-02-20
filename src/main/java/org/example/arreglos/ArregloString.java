package org.example.arreglos;

import java.util.Arrays;

public class ArregloString {
    public static void main(String[] args) {
        // Crear un arreglo de String con algunos nombres
        String[] nombres = {"Daniel", "Carlos", "Pedro", "July", "María"};

        // Mostrar el arreglo antes de ordenar
        System.out.println("Arreglo antes de ordenar:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Ordenar el arreglo alfabéticamente usando Arrays.sort()
        Arrays.sort(nombres);

        // Mostrar el arreglo después de ordenar
        System.out.println("\nArreglo después de ordenar:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
