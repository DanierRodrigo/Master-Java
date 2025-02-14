package org.example.flujosDeControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        //Ponemos un nombre arriba o al lado para etiquetar
        bucle1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");

            }
        }
        System.out.println("\n=======================");

        bucle2:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break bucle2;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");

            }
        }
    }
}
