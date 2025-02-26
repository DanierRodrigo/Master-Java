package org.example.arreglos;

public class TareaNumeroMasAlto {
    public static void main(String[] args) {
        // Arreglo de ejemplo con 7 elementos (algunos repetidos)
        int[] arreglo = {14, 33, 15, 36, 78, 21, 43, 36, 33};

        // Crear un arreglo para almacenar los elementos únicos
        int[] arregloSinDuplicados = new int[arreglo.length];
        int contador = 0;

        // Eliminar duplicados y almacenar los valores únicos
        for (int i = 0; i < arreglo.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < contador; j++) {
                if (arreglo[i] == arregloSinDuplicados[j]) {
                    repetido = true;
                    break;  // Si encontramos un duplicado, salimos del bucle
                }
            }
            if (!repetido) {
                arregloSinDuplicados[contador] = arreglo[i];
                contador++;  // Incrementar el contador de elementos únicos
            }
        }

        // Buscar el número más alto entre los elementos únicos
        int max = arregloSinDuplicados[0];  // Inicializamos con el primer valor
        for (int i = 1; i < contador; i++) {
            if (arregloSinDuplicados[i] > max) {
                max = arregloSinDuplicados[i];
            }
        }

        // Imprimir el número más alto
        System.out.println("El número más alto del arreglo es: " + max);
    }
}
