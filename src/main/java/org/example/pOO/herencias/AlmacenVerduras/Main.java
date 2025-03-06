package org.example.pOO.herencias.AlmacenVerduras;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];

        productos[0] = new Fruta("Manzana", 1.5, 0.3, "Rojo");
        productos[1] = new Fruta("Plátano", 1.2, 0.25, "Amarillo");
        productos[2] = new Limpieza("Lavandina", 3.5, "Cloro", 2.0);
        productos[3] = new Limpieza("Detergente", 2.0, "Jabón y químicos", 1.5);
        productos[4] = new Lacteo("Leche", 1.8, 1, 8);
        productos[5] = new Lacteo("Queso", 5.0, 2, 12);
        productos[6] = new NoPerecedero("Arroz", 2.5, 500, 350);
        productos[7] = new NoPerecedero("Lentejas", 3.0, 400, 320);

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
