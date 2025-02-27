package org.example.arreglos;

public class IntercambioSimetrico {
    public static void intercambiarPrimerConUltimo(int[] lista) {
        int n = lista.length;

        // Hacemos el intercambio de los elementos de manera simétrica
        for (int i = 0; i < n / 2; i++) {
            // Intercambiamos el elemento en la posición i con el elemento en la posición n-i-1
            int temp = lista[i];
            lista[i] = lista[n - i - 1];
            lista[n - i - 1] = temp;

            // Mostramos el arreglo después de cada intercambio
            System.out.print("Iteración " + (i + 1) + ": ");
            for (int num : lista) {
                System.out.print(num + " ");
            }
            System.out.println(); // Nueva línea para separar cada iteración
        }
    }

    public static void main(String[] args) {
        // Definimos un arreglo de ejemplo
        int[] miLista = {1, 2, 3, 4, 5, 6};

        // Llamamos a la función de intercambio
        intercambiarPrimerConUltimo(miLista);
    }
}
