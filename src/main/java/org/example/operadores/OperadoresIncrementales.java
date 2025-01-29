package org.example.operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        System.out.println("**Pre incremento aumenta la variable en uno y la devuelve**");
        int i = 1;
        int j = ++i; // i = i + 1

        System.out.println("i = 1 = " + i);
        System.out.println("j = ++i = " + j);

        System.out.println("**Post incremento devuelve la variable y luego aumenta la variable en uno**");
        i = 2;
        System.out.println("valor inicial de i = " + i);

        j = i++;

        System.out.println("i = 2 = " + i);
        System.out.println("j = i++ = " + j);

        System.out.println("**Pre decremento decrementa la variable en uno y la devuelve**");
        i = 3;
        j = --i;  // i = i -1 = 2
        System.out.println("i = 3 = " + i);
        System.out.println("j = --i = " + j);

        System.out.println("**Post decremento devuelve la variable y luego decrementa la variable en uno**");
        i = 4;
        j = i--;
        System.out.println("i = 4 = " + i);
        System.out.println("j = i-- = " + j);

        // Los operadores de incremento y decremento se pueden colocar tanto antes como después de la expresión que deseemos modificar, pero solo devuelven el valor modificado si están delante.

    }
}
