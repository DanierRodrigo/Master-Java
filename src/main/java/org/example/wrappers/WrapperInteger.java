package org.example.wrappers;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 78685;
        Integer intAutoboxing = Integer.valueOf(intPrimitivo); //Forma autoboxing

        Integer intObjeto = Integer.valueOf(intPrimitivo); //Forma explícita
        Integer intObjeto1 = intPrimitivo;                    //Forma implícita

        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;              //Forma implícita
        int num2 = intObjeto.intValue();  //Forma explícita

        System.out.println("num2 = " + num2);

        String valorTv = "7467";
        Integer valor = Integer.valueOf(valorTv);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjeto.byteValue();              //Se va a perder información
        System.out.println("byteObjeto = " + byteObjeto);     //Es mejor convertir de más pequeño a más grande
        
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
        
    }
}
