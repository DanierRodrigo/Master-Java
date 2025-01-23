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

        //Métodos más importantes

        String trabalengua = "trabalenguas";
        System.out.println("trabalenguas = " + trabalengua.replace("a","."));
        System.out.println("trabalenguas = " + trabalengua); //No  muta tras el cambio
        System.out.println("trabalenguas.indexOf('a') = " + trabalengua.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalengua.indexOf('t'));
        System.out.println("trabalenguas.indexOf('z') = " + trabalengua.indexOf('z'));
        System.out.println("trabalenguas.contains('t') = " + trabalengua.contains("t"));
        System.out.println("trabalenguas.contains('z') = " + trabalengua.contains("z"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalengua.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalengua.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"traba\") = " + trabalengua.endsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalengua.endsWith("guas"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());  //Ideal para formularios, quita espacios
    }
}
