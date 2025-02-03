package org.example.operadores;

import java.util.Scanner;

public class EjercicioPromedioNotasTernario {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar las notas de las asignaturas
        System.out.print("Introduce la nota de Matemáticas: ");
        double matematicas = scanner.nextDouble();

        System.out.print("Introduce la nota de Lengua: ");
        double lengua = scanner.nextDouble();

        System.out.print("Introduce la nota de Física: ");
        double fisica = scanner.nextDouble();

        System.out.print("Introduce la nota de Inglés: ");
        double ingles = scanner.nextDouble();

        System.out.print("Introduce la nota de Educación Física: ");
        double educacionFisica = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (matematicas + lengua + fisica + ingles + educacionFisica) / 5;

        // Usar el operador ternario para determinar si el alumno está aprobado o suspendido
        String resultado = (promedio >= 5) ? "Aprobado" : "Suspenso";

        // Mostrar el resultado
        System.out.println("El promedio es: " + promedio);
        System.out.println("El alumno está: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }
}

