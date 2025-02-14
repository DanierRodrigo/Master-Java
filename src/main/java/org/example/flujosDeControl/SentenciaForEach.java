package org.example.flujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {

        //Similar al for pero para arreglos, va a hacer algo con cada iteración

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Daniel", "July", "Alucard", "Diddy", "Banjo", "Jesse",};

        for(String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
