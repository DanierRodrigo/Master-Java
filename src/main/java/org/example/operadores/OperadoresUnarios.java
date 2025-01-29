package org.example.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {

//Se usan realmente para cambiar el signo del entero a conveniencia

        int i = -5;
        int j = +i; // j = (i)*i => -5
        System.out.println("j = +i = " + j);

        int k = -i; // k = (i)*i => 5
        System.out.println("k = -i = " + k);

        i = 6;
        j = +1;
        System.out.println("j = +1 = " + j);

        k = -1;
        System.out.println("k = -1 = " + k);

    }
}
