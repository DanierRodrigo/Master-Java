package org.example.variables;

import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){  //Si simplemente ponemos Exception, contemplamos todas las excepciones
            System.out.println("Error: Debe ingresar un numero entero");
            main(args);                     //Volvemos a invocar el main
            System.exit(0);           //Si no hacemos esto, se repetiría en bucle el programa indefinidamente
        }

        String resultadoBinario = "numero binario de de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);

    }
}
