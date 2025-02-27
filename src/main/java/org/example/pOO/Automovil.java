package org.example.pOO;

public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindrada;

    // Metodo para establecer los detalles del automóvil
    public void establecerDetalles(String fabricante, String modelo, String color, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    // Metodo para mostrar los detalles del automóvil
    public void mostrarDetalles() {
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Cilindrada: " + this.cilindrada);
    }
}
