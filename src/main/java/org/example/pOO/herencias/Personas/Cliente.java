package org.example.pOO.herencias.Personas;

class Cliente extends Persona {
    private int clienteId;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() { return clienteId; }

    @Override
    public String toString() {
        return super.toString() + ", ID Cliente: " + clienteId;
    }
}
