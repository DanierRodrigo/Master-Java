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

        double exp = Math.exp(2);
        System.out.println("exponente de 2 = " + exp);

        double logaritmo = Math.log(10);
        System.out.println("logaritmo de 10 = " + logaritmo);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia de 10 elevado a 3 = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz de 5 = " + raiz);


        //Métodos de trigonometría

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180.00): = " + radianes);

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0) = " + Math.cos(radianes));

    }
}
