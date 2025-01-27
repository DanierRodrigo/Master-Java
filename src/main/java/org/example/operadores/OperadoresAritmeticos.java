package org.example.operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j);
        System.out.println("(i + j) = " + (i + j));
        System.out.println(i + j + "i + j");

        int resta = i - j;

        System.out.println("resta i - j = " + resta);
        System.out.println("(i - j) = " + (i - j));

        int multi = i * j;
        System.out.println("multiplicación = " + multi);

        int div = i / j;
        float div2 = (float) i / (float) j;
        System.out.println("división i / j = " + div);
        System.out.println("div2 (float) i / (float) j = " + div2);

        int resto = i % j;
        System.out.println("resto i % j = " + resto);

        resto = 8 % 5;
        System.out.println("resto 8 % 5 = " + resto);
    }
}
