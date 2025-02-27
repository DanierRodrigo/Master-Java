package org.example.arreglos;

import java.util.Scanner;

public class EjercicioSistemaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar las notas
        double[] historia = new double[7];
        double[] lengua = new double[7];
        double[] matematicas = new double[7];

        // Ingresar las notas para cada asignatura
        System.out.println("Ingrese las notas para la asignatura Historia:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            historia[i] = scanner.nextDouble();
        }

        System.out.println("\nIngrese las notas para la asignatura Lengua:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            lengua[i] = scanner.nextDouble();
        }

        System.out.println("\nIngrese las notas para la asignatura Matemáticas:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            matematicas[i] = scanner.nextDouble();
        }

        // Calcular el promedio de cada asignatura
        double promedioHistoria = calcularPromedio(historia);
        double promedioLengua = calcularPromedio(lengua);
        double promedioMatematicas = calcularPromedio(matematicas);

        // Calcular el promedio global del curso
        double promedioCurso = (promedioHistoria + promedioLengua + promedioMatematicas) / 3;

        // Mostrar los resultados
        System.out.println("\nPromedios de cada asignatura:");
        System.out.println("Promedio de Historia: " + promedioHistoria);
        System.out.println("Promedio de Lengua: " + promedioLengua);
        System.out.println("Promedio de Matemáticas: " + promedioMatematicas);

        System.out.println("\nPromedio general del curso: " + promedioCurso);

        scanner.close();
    }

    // Metodo para calcular el promedio de un arreglo de notas
    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}
