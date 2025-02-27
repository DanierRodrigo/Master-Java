package org.example.pOO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        // Crear dos objetos de la clase Automovil
        Automovil auto = new Automovil();
        auto.establecerDetalles("Nissan", "Qashqai", "Gris", 2.0); // Usamos el metodo con argumentos

        Automovil auto1 = new Automovil();
        auto1.establecerDetalles("Volkswagen", "Passat", "Verde", 2.0); // Usamos el metodo con argumentos

        // Mostrar los detalles de ambos automóviles
        auto.mostrarDetalles();
        System.out.println(); // Salto de línea entre los dos coches
        auto1.mostrarDetalles();
    }


}
