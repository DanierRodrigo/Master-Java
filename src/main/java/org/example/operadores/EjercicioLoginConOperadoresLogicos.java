package org.example.operadores;

import java.util.Scanner;

public class EjercicioLoginConOperadoresLogicos {
    public static void main(String[] args) {

        String username = "daniel";
        String password = "12345";

        String username2 = "July";
        String password2 = "54321";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: ");
        String u = scanner.next();

        System.out.println("Ingrese la contraseña: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        if( username.equals(u) && password.equals(p) || username2.equals(u) && password2.equals(p)){
            esAutenticado = true;
        }else{
            System.out.println("El nombre de usuario o contraseña son incorrectos");
        }

        if(esAutenticado){   //No es necesario poner = true porque ya se entiende de esta forma
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("La autenticación es obligatoria");
        }
    }
}
