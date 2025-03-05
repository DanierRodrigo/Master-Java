package org.example.pOO;

public class Automovil {

    private String fabricante;
    private String modelo;
    private Color color;  // Usamos el enum Color
    private double cilindrada;

    public Automovil() {
        this.fabricante = "Desconocido";
        this.modelo = "Desconocido";
        this.color = Color.NEGRO; // Color por defecto
        this.cilindrada = 0.0;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public void establecerDetalles(String fabricante, String modelo, Color color, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public void establecerDetalles(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color +  // Mostramos el enum directamente
                ", cilindrada=" + cilindrada +
                '}';
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
