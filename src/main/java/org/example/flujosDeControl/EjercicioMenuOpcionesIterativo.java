package org.example.flujosDeControl;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class EjercicioMenuOpcionesIterativo {
    public static void main(String[] args) {
        int opcionIndice = 0;
        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        do {
            // Muestra el menú
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opArreglo,
                    opArreglo[0]);

            // Si el usuario no selecciona una opción (presiona cancelar), se muestra un mensaje
            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                // Se ejecuta la opción seleccionada
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
                        JOptionPane.showMessageDialog(null, "Lista de productos: [Producto1, Producto2, Producto3]");
                        break;

                    case 5: // Salir
                        JOptionPane.showMessageDialog(null, "Haz salido con éxito!");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }
            }
        } while (opcionIndice != 5); // Repetir hasta que elija salir

    }
}
