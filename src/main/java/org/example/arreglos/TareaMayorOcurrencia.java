package org.example.arreglos;

public class TareaMayorOcurrencia {
    public static void main(String[] args) {
        // Arreglo de 10 elementos (enteros en el rango de 1 a 9)
        int[] arreglo = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};

        // Crear un arreglo para contar las ocurrencias de cada número (del 1 al 9)
        int[] contador = new int[10];  // El índice 0 no se usará, ya que los números son del 1 al 9

        // Contar las ocurrencias de cada número
        for (int i = 0; i < arreglo.length; i++) {
            contador[arreglo[i]]++;  // Incrementamos el contador del número correspondiente
        }

        // Encontrar el número con más ocurrencias
        int maxOcurrencias = 0;
        int numeroMasRepetido = 0;

        for (int i = 1; i < contador.length; i++) {  // Comenzamos desde el índice 1
            if (contador[i] > maxOcurrencias) {
                maxOcurrencias = contador[i];
                numeroMasRepetido = i;
            }
        }

        // Imprimir los resultados
        System.out.println("La mayor ocurrencia es: " + maxOcurrencias);
        System.out.println("El elemento que más se repite es: " + numeroMasRepetido);
    }
}
