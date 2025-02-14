package org.example.flujosDeControl;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 5.8f;

        if (promedio >= 6.5) {                                                          //Si se cumple una expresión, por dentro se toma un booleano true
            System.out.println("Felicidades, excelente promedio");               //Ocurrirá lo que se contemple aqui
        } else {                                                                      //Al existir un else, cuando la expresión sea false
            System.out.println("Necesitas esforzarte un poco más");               //Ocurrirá lo que se contemple aqui
        }


        float nota = 6.4f;

        if (nota >= 6.5) {
            System.out.println("Felicidades, excelente promedio");
        } else if (nota >= 6.0) {
            System.out.println("Muy buen promedio");
        } else if (nota >= 5.5) {
            System.out.println("Buen promedio");
        } else if (nota >= 5.0) {
            System.out.println("Regular, necesitas esforzarte un poco más");
        } else {
            System.out.println("Suspenso");
        }
    }
}
