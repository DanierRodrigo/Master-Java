package org.example.operadores;

public class OperadoresTernarios {
    public static void main(String[] args) {

        //Es una versión simplificada del if else
        //variable = condicion ? si es verdadero: si es falso;

        String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("7 == 7 ? \"si es verdadero\" : \"si es falso\" = " + variable);

        String estado = "";
        double promedio = 6.2;
        estado = promedio >= 5.49 ? "Aprobado" : "Suspendido";
        System.out.println("promedio >= 5.49 = " + estado);

        promedio = 3.2;
        estado = promedio >= 5.49 ? "Aprobado" : "Suspendido";
        System.out.println("promedio >= 3.2 = " + estado);

        //Los ternarios equivalen a esto:

        if(promedio >= 5.49){
            estado = "Aprobado";
        }else{
            estado = "Suspenso";
        }
    }
}
