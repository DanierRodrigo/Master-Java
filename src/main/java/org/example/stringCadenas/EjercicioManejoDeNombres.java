package org.example.stringCadenas;

import java.util.Scanner;

public class EjercicioManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una variable para almacenar el resultado
        String resultado = "";

        // Solicitar 3 nombres
        for (int i = 1; i <= 3; i++) {
            System.out.print("Introduce el nombre " + i + ": ");
            String nombre = scanner.nextLine();

            // Verificar que el nombre tiene al menos 2 caracteres
            if (nombre.length() > 1) {
                // Tomar el segundo carácter y convertirlo a mayúscula
                char segundoCaracter = Character.toUpperCase(nombre.charAt(1));
                // Tomar los dos últimos caracteres del nombre
                String ultimosCaracteres = nombre.substring(nombre.length() - 2);
                // Crear el nuevo nombre con el formato requerido
                String nuevoNombre = segundoCaracter + "." + ultimosCaracteres;

                // Agregar el nuevo nombre al resultado, separándolos por un guion bajo
                if (resultado.isEmpty()) {
                    resultado = nuevoNombre;
                } else {
                    resultado += "_" + nuevoNombre;
                }
            } else {
                System.out.println("El nombre debe tener al menos dos caracteres.");
            }
        }

        // Imprimir el resultado final
        System.out.println("Resultado: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }
}
