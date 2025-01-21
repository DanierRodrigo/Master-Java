package org.example.variables;

public class ConversionDeTipos {
    public static void main(String[] args) {

        //De String a int
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //De String a double
        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //De String a boolean
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //De int a String usando Integer.toString() y String.valueOf()
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr (usando Integer.toString) = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10  );
        System.out.println("otroNumeroStr (usando String.valueOf) = " + otroNumeroStr);

        //De double a String
        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        //De double a String usando notación científica
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        //Uso de Cast para pasar de int a short y long
        int i = 10000;

        //No es compatible porque hay perdida de datos, hay que hacer un cast para forzar la conversión sin perdida de informacion
        short s = (short)i;
        System.out.println("s (int a short) = " + s);
        long l = i;
        System.out.println("l (int a long) = " + l);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);

    }
}
