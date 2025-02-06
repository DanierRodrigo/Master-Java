package org.example.operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Con instanceof vamos a poder revisar los tipos y herencias de las variables";

        Integer num = 7;  //Estas clases y las wrapper no necesitan el new para crearse, aunque por detrás se hace el objeto
        //Se llama AutoPosting
        boolean b1 = texto instanceof String;

        System.out.println ("texto es instancia de String= " + b1);

        boolean b2 = texto instanceof Object; //Todas las clases heredan de esta

        System.out.println ("texto es instancia de Object= " + b2);

        boolean b3 = num instanceof Integer;

        System.out.println ("num es instancia de Integer= " + b3);

        boolean b4 = num instanceof Number;

        System.out.println ("num es instancia de Number= " + b4);

        boolean b5 = num instanceof Object;

        System.out.println ("num es instancia de Object= " + b5);

        Double decimal = 32.456;

        b5 = decimal instanceof Number;
        System.out.println ("decimal es instancia de Number= " + b5);

    }
}

