package org.example.pOO;

public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindrada;

    public void detalle(){
        System.out.println("coche.fabricante = " + this.fabricante);
        System.out.println("coche.modelo = " + this.modelo);
        System.out.println("coche.color = " + this.color);
        System.out.println("coche.cilindrada = " + this.cilindrada);
    }
}
