package org.example.flujosDeControl;

import java.util.Scanner;

public class EjercicioMultiplicarDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los dos números al usuario
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Determinar si el resultado debe ser negativo o positivo
        boolean resultadoNegativo = (num1 < 0) ^ (num2 < 0); // XOR (^) para verificar si los signos son diferentes

        // Trabajar con los valores absolutos de los números para la multiplicación
        int valor1 = Math.abs(num1);
        int valor2 = Math.abs(num2);

        // Inicializar la variable de resultado
        int resultado = 0;

        // Realizar la multiplicación mediante sumas repetidas
        for (int i = 0; i < valor2; i++) {
            resultado += valor1; // Sumar valor1, valor2 veces
        }

        // Ajustar el signo del resultado
        if (resultadoNegativo) {
            resultado = -resultado;
        }
    }
}
