package org.example.pOO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();
        auto.establecerDetalles("Nissan", "Qashqai", Color.GRIS, 2.0);

        Automovil auto1 = new Automovil();
        auto1.establecerDetalles("Volkswagen", "Passat", Color.VERDE, 2.0);

        Automovil auto2 = new Automovil();
        auto2.establecerDetalles("Toyota", "Corolla");

        Automovil auto3 = new Automovil();
        auto3.setFabricante("Ford");
        auto3.setModelo("Focus");
        auto3.setColor(Color.ROJO);
        auto3.setCilindrada(1.8);

        System.out.println(auto);
        System.out.println(auto.descripcionColor());
        System.out.println();
        System.out.println(auto1);
        System.out.println(auto1.descripcionColor());
        System.out.println();
        System.out.println(auto2);
        System.out.println(auto2.descripcionColor());
        System.out.println();
        System.out.println(auto3);
        System.out.println(auto3.descripcionColor());

        auto.setColor(Color.AZUL);
        auto.setCilindrada(2.5);
        System.out.println("\nDetalles actualizados de auto:");
        System.out.println(auto);

        Automovil auto4 = new Automovil();
        auto4.establecerDetalles("Porsche", "Carrera GT", Color.AMARILLO, 2.0);

        Automovil auto5 = new Automovil();
        auto5.establecerDetalles("Porsche", "Carrera GT", Color.AMARILLO, 2.0);

        System.out.println();
        System.out.println(auto4);
        System.out.println(auto4.descripcionColor());
        System.out.println();
        System.out.println(auto5);
        System.out.println(auto5.descripcionColor());
        System.out.println();
        System.out.println("¿Son iguales auto4 y auto5?: " + (auto4 == auto5));
        System.out.println("¿Son iguales auto4 y auto5 (equals)?: " + auto4.equals(auto5));
    }
}
