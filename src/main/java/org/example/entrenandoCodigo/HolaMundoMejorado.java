package org.example.entrenandoCodigo;

import java.util.Scanner;

public class HolaMundoMejorado {
    //¡Escribe un programa que imprima "Hola, [tu nombre]!", donde [tu nombre] se tome como entrada del usuario.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre);
    }
}
