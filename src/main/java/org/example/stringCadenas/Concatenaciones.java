package org.example.stringCadenas;

public class Concatenaciones {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = "Daniel Rodrigo";

        String detalle = curso + " con el profesor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        //detalle es tipo String y el resto es tipo numérico
        System.out.println("detalle + numeroA + numeroB: " + detalle + numeroA + numeroB);
        //En este caso se debe a la precedencia de los operadores
        //Si Java encuentra primero un String, va a asumir que el resto de la
        //concatenación lo es, así que en lugar de 15, veremos 105

        //Con los paréntesis cambiamos la prioridad en la precedencia
        System.out.println("detalle + (numeroA + numeroB): "+ detalle + (numeroA + numeroB));

        //Ahora lo veremos al revés
        System.out.println("numeroA + numeroB + detalle: "+ numeroA + numeroB + detalle);

        //Método .concat
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2= "+ detalle2);

    }
}
