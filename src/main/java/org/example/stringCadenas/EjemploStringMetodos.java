package org.example.stringCadenas;

public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Daniel";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Daniel\") = " + nombre.equals("Daniel"));
        System.out.println("nombre.equals(\"daniel\") = " + nombre.equals("daniel"));
        System.out.println("nombre.equalsIgnoreCase(\"daniel\") = " + nombre.equalsIgnoreCase("daniel"));
        System.out.println("nombre.compareTo(\"Daniel\") = " + nombre.compareTo("Daniel"));
        System.out.println("nombre.compareTo(\"David\") = " + nombre.compareTo("David"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(4, 6) = " + nombre.substring(4, 6));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
    }
}
