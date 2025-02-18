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
            // Convertir el String a un objeto Date
            Date fecha = formato.parse(fechaString);

            // Mostrar el objeto Date resultante
            System.out.println("Fecha convertida: " + fecha);
        } catch (Exception e) {
            // Capturar cualquier excepción de formato
            System.out.println("Error al convertir la fecha: " + e.getMessage());
        }
    }
}
