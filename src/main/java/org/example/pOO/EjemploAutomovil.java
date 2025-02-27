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

        auto.detalle();
        System.out.println();
        auto1.detalle();

    }
}
