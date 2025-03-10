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

    // Métodos setter solo para fecha y cliente
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Agregar productos, máximo 4
    public void addProducto(Producto producto) {
        if (indiceProductos < productos.length) {
            productos[indiceProductos++] = producto;
        } else {
            System.out.println("No se pueden agregar más de 4 productos a la orden.");
        }
    }

    // Metodo para calcular el gran total
    public int getGranTotal() {
        int total = 0;
        for (Producto producto : productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }
        return total;
    }
}

