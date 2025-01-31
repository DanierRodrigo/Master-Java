package org.example.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("l = " + l);
        System.out.println("k = " + k);


        //Operador AND (Si una falla, es falso)
        boolean b1 = i == j && k < l;
        System.out.println("b1 = i == j && k < l = " + b1);

        boolean b2 = i == j && k < l && m == false;
        System.out.println("b2 = i == j && k < l && m == false = " + b2);

        //Operador OR (Si una es buena, es verdadero)
        boolean b3 = i == j || k < l;
        System.out.println("b3 = i == j || k < l = " + b3);

        boolean b4 = i == j || k < l || m == true;
        System.out.println("b4 = i == j || k < l || m == true = " + b4);

        //En concurrencia, prevalece de izquierda a derecha
        //Para el resto, usar paréntesis ()
        boolean b5 = i == j && k > l || m == false;
        System.out.println("b5 = i == j && k > l || m == false = " + b5);

        boolean b6 = i != j && (k > l || m == false);
        System.out.println("b6 = i == j && (k > l || m == false) = " + b6);

        //El AND tiene preferencia frente al OR
        boolean b7 = i == j || k < l && m == true; //Resuelve primero el AND
        System.out.println("b7 = i == j || k < l && m == true = " + b7);
        //El AND da False, pero el OR da True, por eso el resultado es True

        boolean b8 = true || true && false;
        System.out.println("b8 = true || true && false = " + b8);

        boolean b9 = true || (true && false);
        System.out.println("b9 = true || (true && false) = " + b9);

        boolean b10 = true || (false && false) || false; //true
        System.out.println("b10 = true || (false && false) || false = " + b10);

        boolean b11 = ((true || false) && false) || false; //false
        System.out.println("b11 = ((true || false) && false) || false = " + b11);
    }
}
