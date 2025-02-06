package org.example.operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Sigue siendo un String pero ahora está asociado al tipo genérico padre, su super clase";

        Number num = 7;  //Lo mismo que arriba, Number es la clase padre de todos los tipos numericos, pero hereda de Object que es la clase suprema
        //Cuando hacemos Integer num = 7, por detrás se hace Integer num = Integer.valueOf(7);

        boolean b1 = texto instanceof String;

        System.out.println ("texto es instancia de String= " + b1);

        boolean b2 = texto instanceof Integer;

        System.out.println ("texto es instancia de Integer= " + b2); //String no es tipo Integer, pero como es Object, si deja poner esta expresión sin error de sintáxis

        boolean b3 = num instanceof Integer;

        System.out.println ("num es instancia de Integer= " + b3);

        boolean b4 = num instanceof Double;

        System.out.println ("num es instancia de Double= " + b4);

        boolean b5 = num instanceof Long;

        System.out.println ("num es instancia de Long= " + b5);

        Number decimal = 32.456;

        boolean b6 = decimal instanceof Double;
        System.out.println ("decimal es instancia de Double= " + b6);

        boolean b7 = decimal instanceof Float;
        System.out.println ("decimal es instancia de Float= " + b7);

        boolean b8 = decimal instanceof Integer;
        System.out.println ("decimal es instancia de Integer= " + b8);

    }
}
