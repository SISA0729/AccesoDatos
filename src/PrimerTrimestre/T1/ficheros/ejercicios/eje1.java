package PrimerTrimestre.T1.ficheros.ejercicios;

import java.io.File;
import java.util.Scanner;

public class eje1 {

    //Escribir un programa en Java que para cualquier ruta indicada por el usuario,
    //muestre:
    // Si el fichero existe o no
    // Si se trata de un directorio o de un fichero
    // En caso de ser un fichero, debe mostrar los siguientes datos:
    //o Nombre
    //o Tamaño
    //o Permisos de lectura y escritura


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la ruta del fichero: ");
        String ruta = teclado.nextLine();

        File fichero = new File(ruta);

        if (fichero.exists()) {
            if (fichero.isDirectory()) {
                System.out.print("Es un directorio");
            } else if (fichero.isFile()) {
                System.out.println("Es un fichero");
                System.out.println("Nombre: " + fichero.getName());
                System.out.println("Tamaño: " + fichero.getTotalSpace());
                System.out.println("Permisos de lectura: " + fichero.canRead());
                System.out.println("Permisos de escritura: " + fichero.canWrite());
                {
                }
            }
        }
    }
}
