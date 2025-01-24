package org.example.stringCadenas;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        //Manera de obtener la extensión de archivos

        String archivo = "alguna_imagen.jpeg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("nombre.substring(i+1) = " + archivo.substring(i+1));
    }


}
