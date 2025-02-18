package org.example.clasesDateYCalendar;

import java.util.Calendar;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        // Crear una instancia de Calendar (por defecto, es el calendario gregoriano)
        Calendar calendario = Calendar.getInstance();

        // Obtener valores individuales de la fecha y hora
        int year = calendario.get(Calendar.YEAR);
        int month = calendario.get(Calendar.MONTH) + 1;  // Los meses en Calendar comienzan desde 0 (enero = 0)
        int day = calendario.get(Calendar.DAY_OF_MONTH);
        int hour = calendario.get(Calendar.HOUR_OF_DAY);
        int minute = calendario.get(Calendar.MINUTE);
        int second = calendario.get(Calendar.SECOND);

        // Mostrar la fecha y hora actuales
        System.out.println("Fecha y hora actuales: ");
        System.out.println("Año: " + year);
        System.out.println("Mes: " + month);
        System.out.println("Día: " + day);
        System.out.println("Hora: " + hour);
        System.out.println("Minuto: " + minute);
        System.out.println("Segundo: " + second);

        // Establecer una nueva fecha (por ejemplo: 1 de enero de 2020)
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JANUARY);  // Enero es 0
        calendario.set(Calendar.DAY_OF_MONTH, 1);

        // Mostrar la nueva fecha
        System.out.println("Nueva fecha establecida: ");
        System.out.println("Año: " + calendario.get(Calendar.YEAR));
        System.out.println("Mes: " + (calendario.get(Calendar.MONTH) + 1));
        System.out.println("Día: " + calendario.get(Calendar.DAY_OF_MONTH));

        // Mostrar la fecha actual
        System.out.println("Fecha actual: " + calendario.getTime());

        // Sumar 5 días a la fecha actual
        calendario.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Fecha después de sumar 5 días: " + calendario.getTime());

        // Restar 10 días a la fecha actual
        calendario.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println("Fecha después de restar 10 días: " + calendario.getTime());

    }

}
