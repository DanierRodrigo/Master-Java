package org.example.entrenandoCodigo;

import java.util.Scanner;

public class SumaDosNumeros {
    //Pide al usuario dos números y muestra la suma.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduzca otro número: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma);
    }
}
