package org.example.variables;

import java.util.Scanner;

public class EjercicioDetalleFactura {
    public static void main(String[] args) {

        // Crear un objeto Scanner para recibir entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre o descripción de la factura
        System.out.println("Ingrese el nombre o descripción de la factura:");
        String nombreFactura = scanner.nextLine();  // Usamos nextLine() para permitir espacios

        // Solicitar el primer precio con validación
        double precio1 = obtenerPrecio(scanner, "Ingrese el precio del primer producto:");

        // Solicitar el segundo precio con validación
        double precio2 = obtenerPrecio(scanner, "Ingrese el precio del segundo producto:");

        // Calcular el total bruto
        double totalBruto = precio1 + precio2;

        // Calcular el impuesto (21%)
        double impuesto = totalBruto * 0.21;

        // Calcular el total neto (total bruto + impuesto)
        double totalNeto = totalBruto + impuesto;

        // Mostrar la información en un solo String
        String mensaje = "\n--- Detalles de la factura ---";
        mensaje += "\nLa factura: " + nombreFactura;
        mensaje += "\ntiene un total bruto de: " + totalBruto;
        mensaje += "\ncon un impuesto de: " + impuesto;
        mensaje += "\nresultando una cantidad total de: " + totalNeto;

        // Mostrar el mensaje
        System.out.println(mensaje);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para obtener y validar un precio
    public static double obtenerPrecio(Scanner scanner, String mensaje) {
        double precio = 0.0;
        System.out.println(mensaje);
        String precioStr = scanner.nextLine();

        try {
            precio = Double.parseDouble(precioStr);  // Intentamos convertir el valor a double
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido para el precio.");
            main(null);  // Volver a invocar el main si ocurre un error
            System.exit(0);  // Termina el programa si no se ingresa un número válido
        }

        return precio;
    }
}
