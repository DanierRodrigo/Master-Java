package org.example.claseMath;

import java.util.Random;

public class EjercicioEleccionAleatoria {
    public static void main(String[] args) {
            // Arreglo con varias opciones
            String[] opciones = {
                    "Ir al cine",
                    "Leer un libro",
                    "Salir a correr",
                    "Ver una serie",
                    "Cocinar una receta nueva",
                    "Jugar videojuegos"
            };

            // Crear un objeto Random para generar un número aleatorio
            Random random = new Random();

            // Elegir un índice aleatorio entre 0 y el tamaño del arreglo (opciones.length - 1)
            int indiceAleatorio = random.nextInt(opciones.length);

            // Mostrar la opción seleccionada
            System.out.println("La opción seleccionada es: " + opciones[indiceAleatorio]);

    }
}
