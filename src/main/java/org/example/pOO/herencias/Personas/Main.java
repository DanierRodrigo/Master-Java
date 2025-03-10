package org.example.pOO.herencias.Personas;

public class Main {
    public static void main(String[] args) {
        // Crear un gerente
        Gerente gerente = new Gerente("Daniel", "Rodrigo", "123456789", "Av. Principal 123", 5000.0, 101, 20000.0);

        // Crear un empleado
        Empleado empleado = new Empleado("Julie", "Bucas", "987654321", "Calle Secundaria 456", 3000.0, 102);

        // Crear un cliente
        Cliente cliente = new Cliente("Luis", "Gomez", "456123789", "Avenida Norte 789", 201);

        // Mostrar datos
        System.out.println("Datos del Gerente:");
        System.out.println(gerente);

        System.out.println("\nDatos del Empleado:");
        System.out.println(empleado);

        System.out.println("\nDatos del Cliente:");
        System.out.println(cliente);

        // Aumentar sueldo al gerente y empleado
        gerente.aumentarRemuneracion(15);
        empleado.aumentarRemuneracion(10);

        // Modificar presupuesto del gerente
        gerente.setPresupuesto(25000.0);

        // Mostrar datos actualizados
        System.out.println("\nDespués de aumentar salario y modificar presupuesto:");
        System.out.println("Gerente actualizado:");
        System.out.println(gerente);

        System.out.println("\nEmpleado actualizado:");
        System.out.println(empleado);
    }
}
