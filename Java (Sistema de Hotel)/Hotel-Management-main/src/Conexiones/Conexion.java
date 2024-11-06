package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    static Connection contacto = null;
    public static String usuario = "Efren"; // Tu usuario de SQL Server
    public static String password = "12345678"; // Tu contraseña de SQL Server
    public static boolean status = false;

    public static Connection getConexion() {
        status = false;
        String url = "jdbc:sqlserver://DESKTOP-KOKC65M:1433;" +
                "databaseName=PPHS_San_Cristobal;" +
                "encrypt=true;" +
                "trustServerCertificate=true;" +
                "user=" + usuario + ";" + // Usuario
                "password=" + password;   // Contraseña

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion... revisar Driver" + e.getMessage(),
                    "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }

        try {
            contacto = DriverManager.getConnection(url);
            status = true;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
                    "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
    }

    public static void setcuenta(String usuario, String password) {
        Conexion.usuario = usuario;
        Conexion.password = password;
    }

    public static boolean getstatus() {
        return status;
    }

    public static ResultSet Consulta(String consulta) {
        Connection con = getConexion();
        Statement declara;
        ResultSet respuesta = null;
        try {
            declara = con.createStatement();
            respuesta = declara.executeQuery(consulta);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
                    "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        return respuesta;
    }
}
