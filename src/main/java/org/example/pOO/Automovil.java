package org.example.pOO;

public class Automovil {

    // Atributos privados (encapsulamiento) para que no sean accesibles directamente desde fuera de la clase
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;

    // Constructor vacío
    public Automovil() {
        // Inicializa los atributos con valores por defecto
        this.fabricante = "Desconocido";
        this.modelo = "Desconocido";
        this.color = "Desconocido";
        this.cilindrada = 0.0;
    }

    // Constructor con parámetros
    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    // Métodos con sobrecarga (mismo nombre pero diferente firma)

    // Metodo para establecer los detalles del automóvil
    public void establecerDetalles(String fabricante, String modelo, String color, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    // Sobrecarga de metodo para establecer detalles solo con algunos parámetros
    public void establecerDetalles(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // Metodo para obtener los detalles del automóvil (metodo con encapsulamiento)
    public String obtenerDetalles() {
        return "Fabricante: " + this.fabricante + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n" +
                "Cilindrada: " + this.cilindrada;
    }

    // Implementación del metodo toString()
    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }

    // Métodos getters y setters para acceder a los atributos privados (encapsulamiento)
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
