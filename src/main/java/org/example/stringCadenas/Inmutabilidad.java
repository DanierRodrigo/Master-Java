package org.example.stringCadenas;

public class Inmutabilidad {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Daniel Rodrigo";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });

        //Vemos que a pesar de la "transformación", curso sigue inmutable
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        //No podemos cambiar nada salvo que creemos una nueva instancia
        String resultado3 = resultado.replace("a", "A");

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}
