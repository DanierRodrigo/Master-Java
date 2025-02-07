package org.example.operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = i + j + k / 3; //Resultado 28, muy lejano del 14 que buscamos
        System.out.println("Promedio de i + j + k / 3 = " + promedio);

        double promedio2 = i + j + k / 3d; //Para indicar que el 3 es double y así el resultado tenga decimales
        System.out.println("Promedio de i + j + k / 3d = " + promedio2);

        double promedio3 = (i + j + k) / 3; //Así habría que indicar según el order de precedencia
        System.out.println("Promedio de (i + j + k) / 3 = " + promedio3);

        double promedio4 = i + j + k / 3d * 10; //Según la precedencia primero divide y luego multiplica
        System.out.println("Promedio de i + j + k / 3d * 10 = " + promedio4);

        double promedio5 = i + j + k / (3d * 10); //Aquí se multiplica primero y se divide después
        System.out.println("Promedio de i + j + k / (3d * 10) = " + promedio5);

        double promedio6 = ((i + j + k) / 3d) * 10; //Ahora se suma primero, se divide después y se multiplica al final
        System.out.println("Promedio de ((i + j + k) / 3d) * 10) = " + promedio6);

        double promedio7 = ++i + j-- + k / 3d * 10; // (15+8) + 66.6
        System.out.println("Promedio de i + j + k / 3 = " + promedio7);
        System.out.println("i = " + i); //Sale 15 porque es pre incremento
        System.out.println("j = " + j); //En la operación anterior queda como 8, pero ahora se muestra 7 por ser post decremento

    }
}
