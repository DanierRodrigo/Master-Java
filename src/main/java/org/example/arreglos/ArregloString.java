package org.example.arreglos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        // Convertir el arreglo a una lista para poder usar Collections.reverseOrder
        List<String> listaNombres = Arrays.asList(nombres);

        // Ordenar en orden descendente
        listaNombres.sort(Collections.reverseOrder());

        // Mostrar el arreglo después de ordenar en orden descendente
        System.out.println("\nArreglo después de ordenar en orden inverso:");
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
    }
}
