package entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionNoEstatica {

    private String url;     //direccion donde está guardada la base de datos.
    private String user;    //Usuario: usamos "root" que es el super usuario.
    private String pass;    //Password: para el caso del super usuario, usamos "".

    private static Connection miConexion = null;

    public ConexionNoEstatica(String url, String user, String pass) {
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    public Connection buscarConecion() {
        if (miConexion == null) { //solo si es la primera vez

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                miConexion = DriverManager.getConnection(url, user, pass);
            } catch (ClassNotFoundException | SQLException ex) {//si hay error de conexion o error al cargar drivers
                System.out.println("No se ha podido establecer la conexion con el servidor");
            }
        }
        return miConexion;
    }

}
