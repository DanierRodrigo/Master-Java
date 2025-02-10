package org.example.operadores;

import javax.swing.*;

public class EjercicioNombreMasLargo {
    public static void main(String[] args) {
        // Pedir el nombre completo de tres personas usando JOptionPane
        String persona1 = obtenerNombreValido("Introduce el nombre completo de la primera persona:");
        String persona2 = obtenerNombreValido("Introduce el nombre completo de la segunda persona:");
        String persona3 = obtenerNombreValido("Introduce el nombre completo de la tercera persona:");

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

    // Método para obtener un nombre válido (solo letras y espacios)
    public static String obtenerNombreValido(String mensaje) {
        String nombre;
        while (true) {
            nombre = JOptionPane.showInputDialog(mensaje);
            // Validar que el nombre no esté vacío y que solo contenga letras y espacios
            if (nombre != null && nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Error: Por favor, ingresa un nombre válido (solo letras y espacios).");
            }
        }
        return nombre;
    }
}
