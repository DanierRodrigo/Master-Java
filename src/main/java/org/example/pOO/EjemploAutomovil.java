package org.example.pOO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        // Crear dos objetos de la clase Automovil
        Automovil auto = new Automovil();
        auto.establecerDetalles("Nissan", "Qashqai", "Gris", 2.0); // Usamos el metodo con argumentos

        Automovil auto1 = new Automovil();
        auto1.establecerDetalles("Volkswagen", "Passat", "Verde", 2.0); // Usamos el metodo con argumentos

        Automovil auto2 = new Automovil();
        auto2.establecerDetalles("Toyota", "Corolla"); // Solo se establecen fabricante y modelo);

        Automovil auto3 = new Automovil();  // Constructor vacío y usamos métodos set
        auto3.setFabricante("Ford");
        auto3.setModelo("Focus");
        auto3.setColor("Rojo");
        auto3.setCilindrada(1.8);

        // Mostrar detalles usando toString()
        System.out.println(auto);  //Ya no hace falta poner auto.toString
        System.out.println();
        System.out.println(auto1);
        System.out.println();
        System.out.println(auto2);
        System.out.println();
        System.out.println(auto3);

        // Modificar detalles con los métodos setters
        auto.setColor("Azul");
        auto.setCilindrada(2.5);

        // Mostrar detalles actualizados de auto1
        System.out.println("\nDetalles actualizados de auto:");
        System.out.println(auto.obtenerDetalles());

        //Vamos a demostrar que cada objeto es único aunque tengan mismos atributos
        Automovil auto4 = new Automovil();
        auto1.establecerDetalles("Porche", "Carrera GT", "Amarillo", 2.0);

        Automovil auto5 = new Automovil();
        auto1.establecerDetalles("Porche", "Carrera GT", "Amarillo", 2.0);

        System.out.println(); // Salto de línea
        System.out.println(auto4.obtenerDetalles());
        System.out.println(); // Salto de línea
        System.out.println(auto5.obtenerDetalles());
        System.out.println(); // Salto de línea
        System.out.println("¿Son iguales auto4 y auto5?: " + (auto4 == auto5));
        System.out.println(); // Salto de línea
        System.out.println("¿Son iguales auto4 y auto5?: " + (auto4.equals(auto5)));
    }


}
