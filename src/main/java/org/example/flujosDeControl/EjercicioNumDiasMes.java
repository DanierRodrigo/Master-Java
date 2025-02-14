package org.example.flujosDeControl;

public class EjercicioNumDiasMes {
    public static void main(String[] args) {

        int mes = 9;
        int numeroDias = 0;
        int anio = 2020;

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){   //Corresponde a los meses de 31 días
            numeroDias = 31;
        } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {                            //Meses de 30 días
            numeroDias = 30;
        } else if(mes == 2){
            if(anio % 400 == 0 || ( (anio % 4 == 0) && !(anio % 100 == 0))){              //Fórmula del año bisiesto
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        }
        System.out.println("El mes " + mes + " tiene " + numeroDias + " dias en el año " + anio);
    }
}
