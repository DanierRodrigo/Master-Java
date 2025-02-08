package org.example.operadores;

import java.util.Scanner;

public class EjercicioOrdenarNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        // Validación para el primer número
        while (!validInput) {
            try {
                System.out.print("Introduce el primer número: ");
                num1 = Integer.parseInt(scanner.nextLine());  // Intentamos convertir la entrada a un número
                validInput = true;  // Si no ocurre excepción, la entrada es válida
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingresa un número válido.");
            }
        }

        // Reiniciar la validación para el segundo número
        validInput = false;

        // Validación para el segundo número
        while (!validInput) {
            try {
                System.out.print("Introduce el segundo número: ");
                num2 = Integer.parseInt(scanner.nextLine());  // Intentamos convertir la entrada a un número
                validInput = true;  // Si no ocurre excepción, la entrada es válida
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingresa un número válido.");
            }
        }

        // Usar operador ternario para determinar cuál es mayor
        int mayor = (num1 > num2) ? num1 : num2;
        int menor = (num1 < num2) ? num1 : num2;

        // Mostrar los números ordenados de mayor a menor
        System.out.println("Los números ordenados de mayor a menor son: " + mayor + " y " + menor);

        // Cerrar el scanner
        scanner.close();
    }
}
