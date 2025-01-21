package org.example.variables;

public class HolaMundo {

    //Atajo psvm + tab
    public static void main(String[] args) {

        //Esto es hardcodear
        //Atajo sout + tab
        System.out.println("Hola mundo");

        //Así serían las buenas prácticas
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);

        //Otro atajo es soutv que además trae la primera variable que encuentra
        System.out.println("saludar = " + saludar);

        //Podemos usar métodos predefinidos con saludar al ser un tipo String
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

    }
}
