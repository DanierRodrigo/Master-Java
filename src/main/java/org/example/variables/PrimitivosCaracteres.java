package org.example.variables;

public class PrimitivosCaracteres {
    public static void main(String[] args) {

        //Es necesario usar comillas simples
        char caracter = '@';
        System.out.println("caracter = " + caracter);

        //También acepta la referencia decimal sin comilla simple
        char decimal = 64;
        System.out.println("decimal = " + decimal);

        //También acepta la referencia unicode de los caracteres
        char unicode = '\u0040';
        System.out.println("caracter2 = " + unicode);

        //Vamos a comprarlos
        System.out.println("decimal = unicode: " + (decimal == unicode));

        System.out.println();

        System.out.println("char coresponde en byte = " + Character.BYTES);
        System.out.println("char coresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);

        System.out.println();

        //Caracteres especiales
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
    }
}
