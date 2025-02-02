package org.example.operadores;

import java.util.Scanner;

public class EjercicioLoginConOperadoresLogicos {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];  //Arreglo de tres Strings, en este caso se añaden más a mano
        String[] passwords = new String[3];
        usernames[0] = "daniel";             //Pero la primera posición es el 0
        passwords[0] = "12345";

        usernames[1] = "july";
        passwords[1] = "54321";

        usernames[2] = "alucard";
        passwords[2] = "tepes";*/


        String[] usernames = {"daniel", "july", "alucard"};
        String[] passwords = {"12345", "54321", "tepes"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: ");
        String u = scanner.next();

        System.out.println("Ingrese la contraseña: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            if( usernames[i].equals(u) && passwords[i].equals(p) ){
                esAutenticado = true;
                break;                       //Para acabar la iteración si ya tenemos el true
            }                                //Quitamos el else porque saldría 3 veces en caso de error
        }                                    //Mejor poner el mensaje de error fuera de este if


        if(esAutenticado){   //No es necesario poner = true porque ya se entiende de esta forma
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("La autenticación es obligatoria");
        }
    }
}
