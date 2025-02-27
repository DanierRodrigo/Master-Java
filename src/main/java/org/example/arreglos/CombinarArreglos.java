package org.example.arreglos;

public class CombinarArreglos {
    public static int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // Creamos un nuevo arreglo que tenga espacio para ambos arreglos
        int[] combinado = new int[arreglo1.length + arreglo2.length];

        // Copiamos los elementos del primer arreglo al arreglo combinado
        for (int i = 0; i < arreglo1.length; i++) {
            combinado[i] = arreglo1[i];
        }

        // Copiamos los elementos del segundo arreglo al arreglo combinado
        for (int i = 0; i < arreglo2.length; i++) {
            combinado[arreglo1.length + i] = arreglo2[i];
        }

        return combinado;
    }

    public static void main(String[] args) {
        // Definimos dos arreglos de ejemplo
        int[] arreglo1 = {1, 2, 3};
        int[] arreglo2 = {4, 5, 6};

        // Llamamos al metodo para combinar los arreglos
        int[] arregloCombinado = combinarArreglos(arreglo1, arreglo2);

        // Imprimimos el arreglo combinado
        System.out.print("Arreglo combinado: ");
        for (int num : arregloCombinado) {
            System.out.print(num + " ");
        }
    }
}
