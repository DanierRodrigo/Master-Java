package org.example.operadores;

import java.util.Scanner;

public class EjercicioLoginTernario {
    public static void main(String[] args) {

        String[] usernames = {"daniel", "july", "alucard"};
        String[] passwords = {"12345", "54321", "tepes"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: ");
        String u = scanner.next();

        System.out.println("Ingrese la contraseña: ");
        String p = scanner.next();

        // Utilizamos el operador ternario para verificar la autenticación
        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            // Aquí comprobamos si el usuario y la contraseña coinciden usando un operador ternario
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
            if(esAutenticado) {
                break;  // Sale del bucle si ya se ha autenticado
            }
        }

        // Ahora mostramos el mensaje usando un operador ternario
        String mensaje = esAutenticado ? "Bienvenido usuario " + u + "!" : "La autenticación es obligatoria";
        System.out.println(mensaje);
    }
}
