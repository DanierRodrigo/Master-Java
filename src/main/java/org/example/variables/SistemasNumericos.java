package org.example.variables;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog("Ingrese un numero entero: ");

        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero");
            main(args); //Volvemos a invocar el main
            System.exit(0); //Si no hacemos esto, se repetiría en bucle
        }

        String resultadoBinario = "numero binario de de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        System.out.println("numero binario de  " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        System.out.println();

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println();

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        System.out.println();

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println();

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        System.out.println();

        int numeroHex = 0x1F4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
