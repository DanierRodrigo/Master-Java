package org.example.clasesDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparacionDeFechas {
    public static void main(String[] args) {
        try {
            // Definir el formato de las fechas
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            // Crear dos fechas
            Date fecha1 = formato.parse("18/02/2025");
            Date fecha2 = formato.parse("20/02/2025");

            // Comparar las fechas usando before(), after() y equals()
            System.out.println("Fecha1 es antes que Fecha2? " + fecha1.before(fecha2));  // true
            System.out.println("Fecha1 es después que Fecha2? " + fecha1.after(fecha2));  // false
            System.out.println("Fecha1 es igual a Fecha2? " + fecha1.equals(fecha2));     // false

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
