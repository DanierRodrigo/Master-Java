package org.example.variables;

public class PrimitivosFloat {
    public static void main(String[] args) {
        
        float realFloat = 1;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("valor mínimo de un float: " + Float.MIN_VALUE);

        System.out.println();

        double realDouble = 3.56354E32;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("valor mínimo de un double: " + Double.MIN_VALUE);

        System.out.println();
        //Para variables dinámicas. Por defecto será Float
        //Si quieremos más que float o distinto, lo terminaremos en L,F o D
        var varFlotante = 127.423;
        System.out.println("varFlotante = " + varFlotante);
    }
    
}
