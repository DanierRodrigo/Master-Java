package org.example.pOO;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", "Pérez");
        Cliente cliente2 = new Cliente("Ana", "Gómez");
        Cliente cliente3 = new Cliente("Luis", "Martínez");

        // Crear productos diferentes para cada orden
        Producto p1 = new Producto("Sony", "Televisor 55\"", 750);
        Producto p2 = new Producto("Apple", "iPhone 13", 999);
        Producto p3 = new Producto("Samsung", "Galaxy S22", 899);
        Producto p4 = new Producto("Dell", "Laptop XPS 13", 1200);

        Producto p5 = new Producto("Nike", "Zapatillas Air Max", 150);
        Producto p6 = new Producto("Adidas", "Camiseta Deportiva", 50);
        Producto p7 = new Producto("Puma", "Mochila", 80);
        Producto p8 = new Producto("Under Armour", "Chaqueta", 120);

        Producto p9 = new Producto("Logitech", "Teclado Mecánico", 200);
        Producto p10 = new Producto("Razer", "Mouse Gaming", 130);
        Producto p11 = new Producto("Corsair", "Auriculares", 180);
        Producto p12 = new Producto("MSI", "Monitor 27\"", 300);

        // Crear órdenes de compra
        OrdenCompra orden1 = new OrdenCompra("Electrónica");
        orden1.setCliente(cliente1);
        orden1.setFecha(new Date());
        orden1.addProducto(p1);
        orden1.addProducto(p2);
        orden1.addProducto(p3);
        orden1.addProducto(p4);

        OrdenCompra orden2 = new OrdenCompra("Ropa y Accesorios");
        orden2.setCliente(cliente2);
        orden2.setFecha(new Date());
        orden2.addProducto(p5);
        orden2.addProducto(p6);
        orden2.addProducto(p7);
        orden2.addProducto(p8);

        OrdenCompra orden3 = new OrdenCompra("Periféricos para PC");
        orden3.setCliente(cliente3);
        orden3.setFecha(new Date());
        orden3.addProducto(p9);
        orden3.addProducto(p10);
        orden3.addProducto(p11);
        orden3.addProducto(p12);

    }

}
