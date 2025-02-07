package org.example;

public class ModoDebug {

    //Para el modo depuración o debug debemos marcar una línea del código
    //Se marcará como breakpoint o punto de ruptura, donde se iniciará la aplicación
    //Ejecutaremos con el debug en lugar del run
    //Empezará a dar información sobre las variables, argumentos, parámetros...
    //Se activa un menú y podremos tener botones para avanzar cada línea, pasar al siguiente método, saltarlo...
    //Damos a step over para que se ejecute la línea de código que está marcada
    //Arrastrando el ratón sobre la sentencia podremos ver el valor de las variables antes de dar a step over

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 0;
        int resultado;

        // Intentando dividir por cero (esto causará un error)
        resultado = dividir(numero1, numero2);

        System.out.println("El resultado es: " + resultado);
    }

    public static int dividir(int a, int b) {
        return a / b; // Aquí está el error, no se puede dividir por cero
    }
}
