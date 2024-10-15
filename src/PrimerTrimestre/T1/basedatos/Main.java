package PrimerTrimestre.T1.basedatos;

import javax.xml.stream.events.StartElement;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String Mysql = "jdbc:mysql://localhost:3306/sisa";

            conexion = DriverManager.getConnection(Mysql, "root", "");
            System.out.println("Conexión exitosa a la base de datos");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Error al cargar el controlador JDBC", e);
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar a la base de datos", e);
        } finally {
            try {
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

