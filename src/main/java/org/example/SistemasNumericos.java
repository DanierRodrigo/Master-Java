package org.example;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog("Ingrese un numero entero: ");

        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println();

        System.out.println("numero binario de  " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        System.out.println();

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println();

        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));

        System.out.println();

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println();

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        System.out.println();

        int numeroHex = 0x1F4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
