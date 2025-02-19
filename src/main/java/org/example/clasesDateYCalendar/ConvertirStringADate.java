package org.example.clasesDateYCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertirStringADate {
    public static void main(String[] args) {
        // Cadena de texto que representa una fecha
        String fechaString = "18/02/2025";

        // Definir el formato de la fecha que se espera en el String
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date fecha = formato.parse(fechaString);

            // Ahora, formateamos la fecha a un formato más legible
            SimpleDateFormat formatoSalida = new SimpleDateFormat("EEEE, dd MMMM yyyy");
            String fechaFormateada = formatoSalida.format(fecha);

            System.out.println("Fecha formateada: " + fechaFormateada);
        } catch (Exception e) {
            System.out.println("Error al convertir la fecha: " + e.getMessage());
        }
    }
}
