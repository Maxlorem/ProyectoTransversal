package entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static final String url = "jdbc:mariadb://localhost/";//direccion donde está guardada la base de datos.
    private static final String DbName = "universidad";//nombre de la base de datos
    private static final String user = "root";    //Usuario: usamos "root" que es el super usuario.
    private static final String pass = "";    //Password: para el caso del super usuario, usamos "".

    private static Connection miConexion = null;
                                                               //LEER IMPORTANTE
//    public Conexion(String url, String user, String pass) { //Saque el constructor, porque nosotros necesitamos tener "1 sola conexion",
//        this.url = url;                                     //por lo tanto es innecesario y ahorra problemas directamente no tener el constructor,
//        this.user = user;                                   //con el metodo estatico buscar conexion es suficiente, establece la conexion y devuelve la misma
//        this.pass = pass;                                   //Luego esa variable conexion hay que ir pasandola por las vistas, como en los arrays de los tps anteriores
//    }
    private Conexion(){
        
    }

    public static Connection buscarConexion() {
        if (miConexion == null) { //solo si es la primera vez
            String urlcompleta = url+DbName; // une el nombre de la base de datos con la url
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                miConexion = DriverManager.getConnection(urlcompleta, user, pass);
                System.out.println("Conexion lograda");
            } catch (ClassNotFoundException | SQLException ex) {//si hay error de conexion o error al cargar drivers
                System.out.println("No se ha podido establecer la conexion con el servidor");
            }
        }
        return miConexion;
    }

}
