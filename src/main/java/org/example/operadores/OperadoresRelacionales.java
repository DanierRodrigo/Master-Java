package org.example.operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {


        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("l = " + l);
        System.out.println("k = " + k);

        boolean b1 = i == j;
        System.out.println("b1 = i == j = " + b1);

        boolean b2 = !b1;
        System.out.println("b2 = !b1 = " + b2);

        boolean b3 = i != j;
        System.out.println("b3 = i != j = " + b3);

        boolean b4 = m == true;
        System.out.println("b4 = m == true = " + b4);

        boolean b5 = m != true;
        System.out.println("b5 = m != true = " + b5);

        boolean b6 = i > j;
        System.out.println("b6 = i > j = " + b6);

        boolean b7 = i < j;
        System.out.println("b7 = i < j = " + b7);

        boolean b8 = l >= k;
        System.out.println("b8 = l >= k = " + b8);

        boolean b9 = l <= k;
        System.out.println("b9 = l <= k = " + b9);

        //Todo se resuelve de derecha a izquierda, primero las relaciones y luego la asignación a la variable, si queremos prioridad en otra cosa, usaremos paréntesis ()

    }
}
