package org.example.matrices;

public class BuscarElementoMatriz {
    public static void main(String[] args) {
        // Crear la matriz 3x3 con valores de tipo String
        String[][] matriz = {
                {"Daniel", "Julie", "Carlos"},
                {"Pedro", "Laura", "Maria"},
                {"Carlos", "Sofia", "Pedro"}
        };

        // Elemento a buscar
        String buscar = "Sofia";

        // Etiqueta para salir de los bucles
        boolean encontrado = false;

        // Etiqueta 'busqueda' para romper ambos bucles cuando encontramos el elemento
        busqueda:
        for (int i = 0; i < matriz.length; i++) {  // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) {  // Recorre las columnas de cada fila
                if (matriz[i][j].equals(buscar)) {  // Si encontramos el elemento
                    System.out.println("Elemento '" + buscar + "' encontrado en la fila " + i + ", columna " + j);
                    encontrado = true;
                    break busqueda;  // Salir de ambos bucles
                }
            }
        }

        // Si no encontramos el elemento
        if (!encontrado) {
            System.out.println("Elemento '" + buscar + "' no encontrado en la matriz.");
        }
    }
}
