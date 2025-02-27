package org.example.pOO;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();
        auto.fabricante = "Nissan";
        auto.modelo = "Qashqai";
        auto.color = "Gris";
        auto.cilindrada = 2.0;

        Automovil auto1 = new Automovil();
        auto1.fabricante = "Wolkswagen";
        auto1.modelo = "Passat";
        auto1.color = "Verde";
        auto1.cilindrada = 2.0;

        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrada = " + auto.cilindrada);

        System.out.println("\nauto1.fabricante = " + auto1.fabricante);
        System.out.println("auto1.modelo = " + auto1.modelo);
        System.out.println("auto1.color = " + auto1.color);
        System.out.println("auto1.cilindrada = " + auto1.cilindrada);

    }
}
