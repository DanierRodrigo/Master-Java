package org.example.stringCadenas;

public class UsandoEquals {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        //Cada instancia de un String es un objeto único, aunque contengan lo mismo.

        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        //Equals compara el contenido del objeto, no su referencia.
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

        //Aquí es true porque curso también se ha creado de forma literal.
        //Java le asigna la misma referencia en memoria.
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);
    }
}
