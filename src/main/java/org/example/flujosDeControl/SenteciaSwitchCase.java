package org.example.flujosDeControl;

import java.util.Scanner;

public class SenteciaSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 3: ");
        int num = scanner.nextInt();

        switch(num){
            case 0:
                System.out.println("El número es cero");
                break;                                    //Sin break se contemplarían el resto de cases
            case 1:
                System.out.println("El número es uno");
                break;
            case 2:
                System.out.println("El número es dos");
                break;
            case 3:
                System.out.println("El número es tres");
                break;
            default:                                       //Break es como el else. Es lo que ocurre si nada es true
                System.out.println("Número o caracter desconocido");
        }

        System.out.print("Ingrese un nombre: ");
        String nombre = scanner.next();

        switch(nombre){
            case "admin":
                System.out.println("Hola Admin, bienvenido");
                break;
            case "daniel":
                System.out.println("Hola Daniel, bienvenido");
                break;
            case "july":
                System.out.println("Hola July, bienvenida");
                break;
            case "alucard":
                System.out.println("Hola Alucard, bienvenido");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
