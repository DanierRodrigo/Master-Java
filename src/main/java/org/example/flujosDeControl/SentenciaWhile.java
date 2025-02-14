package org.example.flujosDeControl;

public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        while(i <= 5){       //Ejecuta un bloque mientras se cumple una condición
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while(prueba){
            if(i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        System.out.println();

        prueba = false;
        while (prueba){
            System.out.println("nunca se ejecuta, porque prueba es false");
        }

        do {
            System.out.println("Se ejecuta una vez al menos");
        } while (prueba);

    }
}
