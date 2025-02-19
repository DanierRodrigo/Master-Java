package org.example.claseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto de -3 = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto de 3 = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max entre 3.5 y 1.2 = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min entre 3.5 y 1.2 = " + min);

        double redondeoArriba = Math.ceil(3.5);
        System.out.println("redondeoArriba de 3.5 = " + redondeoArriba);

        double redondeoAbajo = Math.floor(3.5);
        System.out.println("redondeoAbajo de 3.5 = " + redondeoAbajo);

        double redondeo = Math.round(Math.PI);
        System.out.println("redondeo del número PI = " + redondeo);


    }
}
