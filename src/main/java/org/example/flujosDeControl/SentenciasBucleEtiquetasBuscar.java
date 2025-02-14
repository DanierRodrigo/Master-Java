package org.example.flujosDeControl;

public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
        int cantidad = 0;

        buscar:
        for (int i = 0; i < maxFrase; i++) {          //Este bucle recorre cada caracter de la frase
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {    //Este bucle recorre cada caracter de la palabra
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }
            cantidad++;      //Si todos los caracteres de la palabra coinciden con una sección de frase, se incrementa el contador cantidad
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '"+palabra+"' en la frase: " + frase);
    }
}
