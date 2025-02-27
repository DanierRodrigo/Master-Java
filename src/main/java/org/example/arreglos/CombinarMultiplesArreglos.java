package org.example.arreglos;

public class CombinarMultiplesArreglos {
    public static int[] combinarMultiplesArreglos(int[][] arreglos) {
        // Primero, calculamos el tamaño total del arreglo combinado
        int totalLength = 0;
        for (int[] arreglo : arreglos) {
            totalLength += arreglo.length;  // Sumar la longitud de cada arreglo
        }

        // Creamos un arreglo con el tamaño total
        int[] combinado = new int[totalLength];

        // Variable para controlar la posición en el arreglo combinado
        int indice = 0;

        // Copiamos los elementos de cada arreglo en el arreglo combinado
        for (int[] arreglo : arreglos) {
            for (int i = 0; i < arreglo.length; i++) {
                combinado[indice] = arreglo[i];
                indice++;
            }
        }

        return combinado;
    }

    public static void main(String[] args) {
        // Definimos varios arreglos
        int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {4, 5, 6};
        int[] arreglo3 = {7, 8, 9, 10};
        int[] arreglo4 = {11, 12};

        // Creamos un arreglo bidimensional que contiene todos los arreglos
        int[][] arreglos = {arreglo1, arreglo2, arreglo3, arreglo4};

        // Llamamos al metodo para combinar todos los arreglos
        int[] arregloCombinado = combinarMultiplesArreglos(arreglos);

        // Imprimimos el arreglo combinado
        System.out.print("Arreglo combinado: ");
        for (int num : arregloCombinado) {
            System.out.print(num + " ");
        }
    }
}
