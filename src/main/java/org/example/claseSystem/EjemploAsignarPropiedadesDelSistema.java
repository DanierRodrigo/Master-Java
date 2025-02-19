package org.example.claseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/main/java/org.example/claseSystem/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");

            System.setProperties(p);
            Properties ps = System.getProperties();
            ps.list(System.out);

            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo = " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
