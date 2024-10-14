package PrimerTrimestre.T1.ficheros.ejercicios;

import java.io.FileWriter;
import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {
        //Partiendo del fichero de csv de ejemplo, crear un programa de Java que permita al
        //usuario añadir datos nuevos a ese fichero, utilizando el mismo formato que los ya
        //existentes.


        String archivo = "/home/alumnot/IdeaProjects/Acceso a Datos/src/PrimerTrimestre/T1/ficheros/ejercicios/restaurante.csv";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre del restaurante:");
        String nombre = teclado.nextLine();

        System.out.println("Introduce la dirección del restaurante:");
        String direccion = teclado.nextLine();

        System.out.println("Introduce el código postal del restaurante:");
        String codigoPostal = teclado.nextLine();

        System.out.println("Introduce el teléfono del restaurante:");
        String telefono = teclado.nextLine();

        try (FileWriter fw = new FileWriter(archivo, true)) {
            fw.write(nombre + "," + direccion + "," + codigoPostal + "," + telefono + "\n");
            System.out.println("Datos añadidos correctamente.");
        } catch (Exception e) {
            e.printStackTrace();

        }





    }
}
