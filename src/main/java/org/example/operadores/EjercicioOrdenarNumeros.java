package org.example.operadores;

import java.util.Scanner;

public class EjercicioOrdenarNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir los dos números
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Usar operador ternario para determinar cuál es mayor
        int mayor = (num1 > num2) ? num1 : num2;
        int menor = (num1 < num2) ? num1 : num2;

        // Mostrar los números ordenados de mayor a menor
        System.out.println("Los números ordenados de mayor a menor son: " + mayor + " y " + menor);

        // Cerrar el scanner
        scanner.close();
    }
}
