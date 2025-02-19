package org.example.clasesDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjercicioCalcularEdad {
    public static void main(String[] args) {
        try {
            // Paso 1: Leer la fecha de nacimiento como un String
            String fechaNacimientoString = "07/03/1991";
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            // Paso 2: Convertir la fecha de nacimiento a un objeto Date
            Date fechaNacimiento = formato.parse(fechaNacimientoString);

            // Paso 3: Obtener la fecha actual
            Date fechaActual = new Date();

            // Convertir las fechas a objetos Calendar para facilitar los cálculos
            Calendar calendarNacimiento = Calendar.getInstance();
            calendarNacimiento.setTime(fechaNacimiento);

            Calendar calendarActual = Calendar.getInstance();
            calendarActual.setTime(fechaActual);

            // Paso 4: Calcular la edad en años
            int edad = calendarActual.get(Calendar.YEAR) - calendarNacimiento.get(Calendar.YEAR);

            // Ajustar la edad si la persona aún no ha cumplido años este año
            if (calendarActual.get(Calendar.MONTH) < calendarNacimiento.get(Calendar.MONTH) ||
                    (calendarActual.get(Calendar.MONTH) == calendarNacimiento.get(Calendar.MONTH) &&
                            calendarActual.get(Calendar.DAY_OF_MONTH) < calendarNacimiento.get(Calendar.DAY_OF_MONTH))) {
                edad--;  // Si aún no ha cumplido años este año
            }

            // Mostrar la edad calculada
            System.out.println("La edad de la persona es: " + edad + " años.");

        } catch (Exception e) {
            System.out.println("Error al procesar la fecha: " + e.getMessage());
        }
    }
}
