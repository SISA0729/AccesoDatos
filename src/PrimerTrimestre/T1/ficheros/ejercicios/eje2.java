package PrimerTrimestre.T1.ficheros.ejercicios;

import java.io.*;

public class eje2 {

    //Partiendo del fichero de csv de ejemplo, crear un programa de Java que muestre los
    //datos de todos aquellos restaurantes cuyo código postal empiece por 6.

    public static void main(String[] args) {
        String archivo = "/home/alumnot/IdeaProjects/Acceso a Datos/src/PrimerTrimestre/T1/ficheros/ejercicios/restaurante.csv";
        String linea = "";
        String separador = ",";


        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            // Leer la primera línea que corresponde a los títulos
            br.readLine();

            System.out.println("Restaurantes con código postal que empieza por 6:");

            // Leer el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(separador);

                // Verificar si el código postal empieza por 6
                if (datos[2].startsWith("6")) {
                    System.out.println("Nombre: " + datos[0] + ", Dirección: " + datos[1] +
                            ", Código Postal: " + datos[2] + ", Teléfono: " + datos[3]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
