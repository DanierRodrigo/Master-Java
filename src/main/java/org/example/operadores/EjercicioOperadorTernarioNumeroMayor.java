package org.example.operadores;

import java.util.Scanner;

public class EjercicioOperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = s.nextInt();

        System.out.println("Ingrese otro número: ");
        int num2 = s.nextInt();

        System.out.println("Ingrese otro número: ");
        int num3 = s.nextInt();

        max = (num1 > num2)? num1: num2;  //Retornaría num1 o num2 y se asigna a max
        max = (max > num3)? max: num3;    //Aquí compara max con num3

        System.out.println("Primer número " + num1);
        System.out.println("Segundo número " + num2);
        System.out.println("Tercer número " + num3);
        System.out.println("El mayor número es: " + max);


    }
}
