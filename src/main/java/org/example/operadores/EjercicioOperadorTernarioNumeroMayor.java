package org.example.operadores;

import java.util.Scanner;

public class EjercicioOperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;
        int num1, num2, num3, num4;
        Scanner s = new Scanner(System.in);

        // Función para validar la entrada numérica
        num1 = getValidNumber(s, "Ingrese un número: ");
        num2 = getValidNumber(s, "Ingrese otro número: ");
        num3 = getValidNumber(s, "Ingrese otro número: ");
        num4 = getValidNumber(s, "Ingrese otro número: ");

        max = (num1 > num2) ? num1 : num2;  // Retornaría num1 o num2 y se asigna a max
        max = (max > num3) ? max : num3;    // Aquí compara max con num3
        max = (max > num4) ? max : num4;    // Finalmente compara con num4

        System.out.println("Primer número " + num1);
        System.out.println("Segundo número " + num2);
        System.out.println("Tercer número " + num3);
        System.out.println("Cuarto número " + num4);
        System.out.println("El mayor número es: " + max);
    }

    // Método para pedir un número y validar que sea un número entero
    public static int getValidNumber(Scanner scanner, String prompt) {
        int number;
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;  // Salir del bucle si es un número válido
            } else {
                System.out.println("¡Error! Por favor, ingrese un número entero.");
                scanner.next();  // Limpiar el buffer del scanner
            }
        }
        return number;
    }
}
