package org.example.pOO.herencias;

class Empleado extends Persona {
    protected double remuneracion;
    protected int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() { return remuneracion; }
    public int getEmpleadoId() { return empleadoId; }

    public void aumentarRemuneracion(int porcentaje) {
        this.remuneracion += this.remuneracion * porcentaje / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID Empleado: " + empleadoId + ", Remuneración: " + remuneracion;
    }
}
