package PrimerTrimestre.T1.basedatos;

import javax.xml.stream.events.StartElement;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection conexion = null;
        Statement smt = null;
        ResultSet rset = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String Mysql = "jdbc:mysql://localhost:3306/test";
            String urldbc = "jdbc:oracle:thin:@localhost:1521:xe";

            conexion = DriverManager.getConnection(urldbc, "sisa", "1234");

            smt = conexion.createStatement();
            rset = smt.executeQuery("select * from empleados");
            while (rset.next()) {
                // Process the result set
                int id = rset.getInt("id");
                String name = rset.getString("name");
                String position = rset.getString("position");
                System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (rset != null) rset.close();
                if (smt != null) smt.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

