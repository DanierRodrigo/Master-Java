package org.example.entrenandoCodigo;

import java.util.Scanner;

public class ParOImpar {
    //Pide un número y determina si es par o impar.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("El número " + num + " es par");
        }else{
            System.out.println("El número " + num + " es impar");
        }

    }
}
