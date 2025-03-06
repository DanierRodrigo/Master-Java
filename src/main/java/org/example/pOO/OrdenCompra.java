package org.example.pOO;

import java.util.Date;

public class OrdenCompra {
    private static int contador = 1; // Para el identificador autoincremental
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProductos; // Controla cuántos productos se han agregado

    public OrdenCompra(String descripcion) {
        this.identificador = contador++;
        this.descripcion = descripcion;
        this.productos = new Producto[4]; // Tamaño fijo de 4
        this.indiceProductos = 0;
    }

    // Métodos getter
    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

}

