package org.example.pOO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        // Crear dos objetos de la clase Automovil
        Automovil auto = new Automovil();
        auto.establecerDetalles("Nissan", "Qashqai", "Gris", 2.0); // Usamos el metodo con argumentos

        Automovil auto1 = new Automovil();
        auto1.establecerDetalles("Volkswagen", "Passat", "Verde", 2.0); // Usamos el metodo con argumentos

        // Mostrar los detalles de ambos automóviles
        System.out.println(auto.obtenerDetalles());
        System.out.println(); // Salto de línea
        System.out.println(auto1.obtenerDetalles());

        // Modificar detalles con los métodos setters
        auto.setColor("Azul");
        auto.setCilindrada(2.5);

        // Mostrar detalles actualizados de auto1
        System.out.println("\nDetalles actualizados de auto:");
        System.out.println(auto.obtenerDetalles());
    }


}
