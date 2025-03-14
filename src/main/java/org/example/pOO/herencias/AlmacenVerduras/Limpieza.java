package org.example.pOO.herencias.AlmacenVerduras;

class Limpieza extends Producto {
    private String componentes;
    private double litros;

    public Limpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() { return componentes; }
    public double getLitros() { return litros; }

    @Override
    public String toString() {
        return "Limpieza{" +
                "componentes='" + componentes + '\'' +
                ", litros=" + litros +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
