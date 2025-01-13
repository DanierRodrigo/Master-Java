package org.example;

public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 9856.43e-3; // Sería 9.85643
        System.out.println("d = " + d);

        float f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);

        datoLogico = d > f;
        System.out.println("¿Es d mayor que f? = " + datoLogico);

        System.out.println();

        boolean esCierto = 3-2 == 1;
        System.out.println("¿esCierto 3-2=1? = " + esCierto);
        
    }
}
