package org.example.wrappers;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("¿Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("¿Son el mismo objeto? " + (num1 == num2));

        //Es distinto porque se compara por objeto, tienen el mismo valor pero no la misma instancia

        //Cuando se compara en tipos primitivos si compara por valor

        //Para comparar por el valor usaremos .equals

        System.out.println("¿Tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("¿Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));
    }
}
