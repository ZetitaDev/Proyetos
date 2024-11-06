package Conexiones;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class Procedimientos {
    
    public static void EntradaEmpleado(String nombre, String apellido, String cargo, double salario, String fechaContratacion, String correoElectronico, String telefono) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EntradaEmpleado(?,?,?,?,?,?,?)}");
        entrada.setString(1, nombre);
        entrada.setString(2, apellido);
        entrada.setString(3, cargo);
        entrada.setDouble(4, salario);
        entrada.setString(5, fechaContratacion);
        entrada.setString(6, correoElectronico);
        entrada.setString(7, telefono);
        entrada.execute();
    }
    
    public static void EliminarEmpleado(int idEmpleado) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarEmpleado(?)}");
        entrada.setInt(1, idEmpleado);
        entrada.execute();
        
        
    }
       }