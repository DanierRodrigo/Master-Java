package org.example.flujosDeControl;

public class SentenciaFor {
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }

        System.out.println("for(int i = 10; i >= 5; i--){");

        for(int i = 10; i >= 5; i--){
            System.out.println("i = " + i);
        }

        System.out.println("for(int i = 0, j = 10; i < j; i++, j--)");

        for(int i = 0, j = 10; i < j; i++, j--){
            System.out.println(i + " - " + j);
        }

        System.out.println("Número impares usando continue: if(i % 2 == 0):");

        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0){           //Si yo quisiera números pares if( !(i % 2 == 0) ){
                continue;             //En lugar de salirse del bucle se sale de la iteración, así solo imprime número impares
            }
            System.out.println("i = " + i);
        }
    }
}
