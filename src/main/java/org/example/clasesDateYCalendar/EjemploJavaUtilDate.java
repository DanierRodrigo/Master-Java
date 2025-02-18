package org.example.clasesDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        //Hay muchísimos patrones según combinaciones de mayúsculas y minúsculas a nuestro antojo

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);

        SimpleDateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
        String fechaStr1 = df1.format(fecha);

        System.out.println("fechaStr1 = " + fechaStr1);

        SimpleDateFormat df2 = new SimpleDateFormat("EEEE dd 'de' MMMM 'de' yyyy");
        String fechaStr2 = df2.format(fecha);

        System.out.println("fechaStr2 = " + fechaStr2);
    }
}
