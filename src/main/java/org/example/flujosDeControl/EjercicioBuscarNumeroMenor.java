package org.example.flujosDeControl;

import java.util.Scanner;

public class EjercicioBuscarNumeroMenor {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Declarar la variable para la cantidad de números a comparar
        int cantidad;

        // Solicitar al usuario la cantidad de números a comparar, y asegurarnos que sea al menos 10
        while (true) {
            System.out.print("¿Cuántos números quieres comparar? (Debe ser al menos 10): ");
            cantidad = scanner.nextInt();

            // Si la cantidad es al menos 10, salimos del bucle
            if (cantidad >= 10) {
                break;
            } else {
                System.out.println("Por favor, ingresa al menos 10 números.");
            }
        }

        // Inicializar el número menor con un valor grande (puede ser el primer valor ingresado)
        System.out.print("Ingresa un número: ");
        int numeroMenor = scanner.nextInt();

        // Iterar la cantidad de veces para ingresar los números
        for (int i = 1; i < cantidad; i++) {
            System.out.print("Ingresa otro número: ");
            int numero = scanner.nextInt();

            // Comparar el número ingresado con el actual número menor
            if (numero < numeroMenor) {
                numeroMenor = numero; // Actualizar el número menor si es necesario
            }
        }

        // Imprimir el número menor
        System.out.println("El número menor es: " + numeroMenor);

        // Condición para verificar si el número menor es menor que 10
        if (numeroMenor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
