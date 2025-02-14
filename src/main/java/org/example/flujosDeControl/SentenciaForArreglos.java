package org.example.flujosDeControl;

import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {

        String[] nombres = {"Daniel", "July", "Alucard", "Diddy", "Banjo", "Jesse",};

        int count = nombres.length;

        for(int i = 0; i < count; i++){
            System.out.println(i + ".- " + nombres[i]);
        }


        //Ahora usaremos continue para saltarnos algún nombre
        String[] nombres1 = {"Daniel", "July", "Alucard", "Diddy", "Banjo", "Jesse",};

        int count1 = nombres1.length;

        for(int i = 0; i < count1; i++){
            if(nombres1[i].contains("Daniel") || nombres1[i].equals("Alucard")){
                continue;
            }
            System.out.println(i + ".- " + nombres1[i]);
        }

        //Vamos a buscar un nombre en el arreglo

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Diddy\" o \"María\": ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){    //Para que se ignore mayúsculas y minúsculas
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue econtrado");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
        }

    }
}
