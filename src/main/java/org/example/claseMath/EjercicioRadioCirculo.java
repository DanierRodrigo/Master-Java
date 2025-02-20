package org.example.claseMath;

import java.util.Scanner;

public class EjercicioRadioCirculo {
    public static void main(String[] args) {
        // Crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el radio del círculo
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área usando la fórmula: área = PI * r^2
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);

        // Cerrar el scanner
        scanner.close();
    }
}
