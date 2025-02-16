package org.example.flujosDeControl;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class EjercicioMenuOpcionesIterativo {
    public static void main(String[] args) {
        // Crear el mapa de opciones
        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        // Convertir las claves del mapa a un arreglo para mostrar en el menú
        Object[] opArreglo = opciones.keySet().toArray();

        int opcionIndice = 0; // Variable que almacenará la opción seleccionada

        // Bucle que se repite hasta que el usuario elija "Salir"
        do {
            // Mostrar el menú al usuario
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opArreglo,
                    opArreglo[0]);

            // Si el usuario no seleccionó ninguna opción (opción null), mostramos un mensaje
            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                // Obtener el índice de la opción seleccionada
                opcionIndice = opciones.get(opcion.toString());

                // Realizar la acción según la opción seleccionada
                switch (opcionIndice) {
                    case 1: // Actualizar
                        JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
                        break;
                    case 2: // Eliminar
                        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                        break;
                    case 3: // Agregar
                        JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
                        break;
                    case 4: // Listar
                        JOptionPane.showMessageDialog(null, "Mostrando lista de productos");
                        break;
                    case 5: // Salir
                        JOptionPane.showMessageDialog(null, "Haz salido con éxito!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }
            }
        } while (opcionIndice != 5); // Continuar hasta que se elija "Salir"
    }
}
