package org.example.operadores;

import java.util.Scanner;

public class EjercicioTanqueGasolina {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir la medida actual en litros
        System.out.print("Introduce la cantidad actual de gasolina en litros: ");
        double cantidadGasolina = scanner.nextDouble();  // Usamos double para mayor precisión

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
