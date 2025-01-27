package org.example.operadores;

import javax.swing.*;

public class EjercicioNumeroParOImpar {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else{
            System.out.println("numero impar = " + numero);
        }
    }
}
