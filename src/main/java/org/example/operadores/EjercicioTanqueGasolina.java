package org.example.operadores;

import java.util.Scanner;

public class EjercicioTanqueGasolina {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        double cantidadGasolina = 0;
        boolean validInput = false;

        // Validación de la entrada
        while (!validInput) {
            try {
                // Pedir la medida actual en litros
                System.out.print("Introduce la cantidad actual de gasolina en litros: ");
                cantidadGasolina = Double.parseDouble(scanner.nextLine());  // Intentamos convertir la entrada a un número

                // Verificamos si el valor es válido (positivo)
                if (cantidadGasolina < 0) {
                    System.out.println("Por favor, ingresa un valor positivo.");
                } else {
                    validInput = true;  // Si no ocurre excepción, la entrada es válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingresa un número válido.");
            }
        }

        // Usamos operador ternario para determinar el estado del estanque
        String estado = (cantidadGasolina == 70) ? "Tanque lleno" :
                (cantidadGasolina >= 60) ? "Tanque casi lleno" :
                        (cantidadGasolina >= 40) ? "Tanque 3/4" :
                                (cantidadGasolina >= 35) ? "Medio Tanque" :
                                        (cantidadGasolina >= 20) ? "Suficiente" :
                                                (cantidadGasolina >= 1) ? "Insuficiente" :
                                                        "Cantidad no válida, por favor ingresa un valor positivo.";

        // Mostrar el estado del estanque
        System.out.println(estado);

        // Cerrar el scanner
        scanner.close();
    }
}
