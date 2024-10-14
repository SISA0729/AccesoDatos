package PrimerTrimestre.T1.basedatos;

import javax.xml.stream.events.StartElement;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection conexion;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String Mysql = "jdbc:mysql://localhost:3306/test";
            String urldbc = "jdbc:oracle:thin:@localhost:1521:xe";

            conexion = DriverManager.getConnection(urldbc, "sisa", "1234");

            Statement smt = conexion.createStatement();
            ResultSet rset = smt.executeQuery("select * from empleados");
            while (rset.next()) {
                // Process the result set
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
