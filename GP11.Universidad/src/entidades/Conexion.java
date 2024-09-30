package entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    private static Conexion conexion = null;
    
    private Conexion(){
        
        try {
            Class.forName("org.matiadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el driver");
        }
    }
    
    public static Connection getConexion(){
        Connection con = null;
        if(conexion == null){
            
            conexion = new Conexion();
        }
        
        try {
            con = DriverManager.getConnection("jdbc:mysql:/localhost/universidad", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        return con;
    }

}
