package org.example.operadores;

public class OperadoresAsignaciones {
    public static void main(String[] args) {

        int i = 5;
        int j = i + 4;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2; // i = i + 2
        System.out.println("i += 2 = " + i);

        i += 5; // i = i + 5
        System.out.println("i = += 5 = " + i);

        j -= 4; // j = j - 4
        System.out.println("j -= 4 = " + j);

        j*= 3; // j = j * 3;
        System.out.println("j*= 3 = " + j);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre = 'Daniel' ";
        sqlString += " and c.activo= 1 ";
        System.out.println("sqlString = " + sqlString);
    }
}
