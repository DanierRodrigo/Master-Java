package org.example.valorVsReferencia;

class Persona{        //Sabemos que lo correcto es hacerlo fuera pero es por probar
    private String nombre;

    public void  modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Daniel");

        System.out.println("Iniciamos método main");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Después de llamar al método test");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());

    }

    public static void test(Persona persona){
        System.out.println("Iniciamos método test");
        persona.modificarNombre("July");
        System.out.println("Finaliza el método test");
    }
}
