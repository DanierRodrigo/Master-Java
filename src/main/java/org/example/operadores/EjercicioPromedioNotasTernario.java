package org.example.operadores;

import java.util.Scanner;

public class EjercicioPromedioNotasTernario {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar las notas
        double matematicas = obtenerNotaValida(scanner, "Matemáticas");
        double lengua = obtenerNotaValida(scanner, "Lengua");
        double fisica = obtenerNotaValida(scanner, "Física");
        double historia = obtenerNotaValida(scanner, "Historia");
        double tecnologia = obtenerNotaValida(scanner, "Tecnología");

        // Calcular el promedio
        double promedio = (matematicas + lengua + fisica + historia + tecnologia) / 5;

        // Usar el operador ternario para determinar si el alumno está aprobado o suspendido
        String resultado = (promedio >= 5) ? "Aprobado" : "Suspenso";

        // Mostrar el resultado
        System.out.println("El promedio es: " + promedio);
        System.out.println("El alumno está: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para obtener una nota válida entre 0.0 y 10.0
    public static double obtenerNotaValida(Scanner scanner, String materia) {
        double nota;
        while (true) {
            System.out.print("Introduce la nota de " + materia + " (entre 0.0 y 10.0): ");
            // Verificar si la entrada es un número
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                // Comprobar si la nota está en el rango válido
                if (nota >= 0.0 && nota <= 10.0) {
                    break; // Nota válida, salimos del bucle
                } else {
                    System.out.println("Error: La nota debe estar entre 0.0 y 10.0.");
                }
            } else {
                System.out.println("Error: Debes ingresar un número válido.");
                scanner.next(); // Limpiar el buffer para evitar bucles infinitos
            }
        }
        return nota;
    }
}

