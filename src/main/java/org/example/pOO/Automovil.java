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

    // Metodo que usa switch-case para devolver una descripción del color
    public String descripcionColor() {
        switch (color) {
            case ROJO:
                return "El automóvil es de un color rojo vibrante y deportivo.";
            case AZUL:
                return "El automóvil es azul, un color elegante y tranquilo.";
            case VERDE:
                return "El automóvil tiene un color verde, símbolo de naturaleza y frescura.";
            case GRIS:
                return "El automóvil es gris, un color neutro y sofisticado.";
            case NEGRO:
                return "El automóvil es negro, reflejando lujo y exclusividad.";
            case BLANCO:
                return "El automóvil es blanco, mostrando pureza y modernidad.";
            case AMARILLO:
                return "El automóvil es amarillo, llamativo y enérgico.";
            case NARANJA:
                return "El automóvil es naranja, un color audaz y dinámico.";
            case PLATEADO:
                return "El automóvil es plateado, con un diseño moderno y futurista.";
            default:
                return "Color desconocido.";
        }
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
