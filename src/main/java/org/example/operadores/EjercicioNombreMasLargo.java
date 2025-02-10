package org.example.operadores;

import javax.swing.*;

public class EjercicioNombreMasLargo {
    public static void main(String[] args) {
        // Pedir el nombre completo de tres personas usando JOptionPane
        String persona1 = JOptionPane.showInputDialog("Introduce el nombre completo de la primera persona:");
        String persona2 = JOptionPane.showInputDialog("Introduce el nombre completo de la segunda persona:");
        String persona3 = JOptionPane.showInputDialog("Introduce el nombre completo de la tercera persona:");

        // Separar los nombres y apellidos de cada persona
        String nombre1 = persona1.split(" ")[0];
        String nombre2 = persona2.split(" ")[0];
        String nombre3 = persona3.split(" ")[0];

        // Comparar la longitud de los nombres y determinar el más largo
        String nombreMasLargo = (nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length()) ? persona1 :
                (nombre2.length() > nombre1.length() && nombre2.length() > nombre3.length()) ? persona2 :
                        persona3;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, nombreMasLargo + " tiene el nombre más largo.");
    }
}
