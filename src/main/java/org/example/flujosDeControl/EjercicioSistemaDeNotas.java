package org.example.flujosDeControl;

import java.util.Scanner;

public class EjercicioSistemaDeNotas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Inicialización de variables
            double sumaNotasMayoresA5 = 0;
            double sumaNotasMenoresA4 = 0;
            int contadorNotasMayoresA5 = 0;
            int contadorNotasMenoresA4 = 0;
            int contadorNotas1 = 0;
            double sumaTotal = 0;

            // Bucle para ingresar las 20 notas
            for (int i = 1; i <= 20; i++) {
                System.out.print("Ingresa la nota " + i + " (entre 1 y 7): ");
                double nota = scanner.nextDouble();

                // Si la nota es 0, termina el ciclo
                if (nota == 0) {
                    System.out.println("Error: Se ingresó una nota de 0. Reinicie el programa.");
                    return; // Termina la ejecución del programa
                }

                // Validación de nota entre 1 y 7
                if (nota < 1 || nota > 7) {
                    System.out.println("Nota inválida. Debe estar entre 1 y 7.");
                    i--; // Repite el ciclo para la misma nota
                    continue;
                }

                // Acumulación de suma total
                sumaTotal += nota;

                // Cálculos para notas mayores a 5
                if (nota > 5) {
                    sumaNotasMayoresA5 += nota;
                    contadorNotasMayoresA5++;
                }
                // Cálculos para notas menores a 4
                else if (nota < 4) {
                    sumaNotasMenoresA4 += nota;
                    contadorNotasMenoresA4++;
                }
                // Cálculos para notas igual a 1
                if (nota == 1) {
                    contadorNotas1++;
                }
            }

            // Cálculo de promedios, en los dos últimos usaremos el operador ternario
            double promedioTotal = sumaTotal / 20;
            double promedioMayoresA5 = (contadorNotasMayoresA5 > 0) ? sumaNotasMayoresA5 / contadorNotasMayoresA5 : 0;
            double promedioMenoresA4 = (contadorNotasMenoresA4 > 0) ? sumaNotasMenoresA4 / contadorNotasMenoresA4 : 0;

            // Mostrar resultados
            System.out.println("\nPromedio de notas mayores a 5: " + promedioMayoresA5);
            System.out.println("Promedio de notas menores a 4: " + promedioMenoresA4);
            System.out.println("Cantidad de notas 1: " + contadorNotas1);
            System.out.println("Promedio total de las 20 notas: " + promedioTotal);

            scanner.close();
        }
    }
