package persistencia;

import entidades.Alumno;
import entidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

public class alumnoData {

    private Connection conexionAlumoData = null;

    public alumnoData(Conexion conexion) {
        this.conexionAlumoData = conexion.buscarConecion();
    }

    public void guardarAlumno(Alumno a) throws SQLException { //sin id porque es autoincremental por la BD en XAMPP

        String insertAlumno = "INSERT INTO alumnos(dni, apellido, nombre, fechaNacimiento, estado) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement psAlumno = conexionAlumoData.prepareStatement(insertAlumno, Statement.RETURN_GENERATED_KEYS);
            
            psAlumno.setLong(1, a.getDni());
            psAlumno.setString(2, a.getApellido());
            psAlumno.setString(3, a.getNombre());
            psAlumno.setDate(4, Date.valueOf(a.getFechaNac()));
            psAlumno.setBoolean(5, a.isEstado());
            psAlumno.executeUpdate();

            ResultSet rsAlumno = psAlumno.getGeneratedKeys();
            if (rsAlumno.next()) {
                a.setIdAlumno(rsAlumno.getInt(1));
            } else {
                System.out.println("No se pudo obtener el ID");
            }
            psAlumno.close();
            System.out.println("GUARDADO!!!!!");
        } catch (SQLException ex) {
            Logger.getLogger(alumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /*psAlumno es un objeto que guarda los datos que ingresamos parseados para ingresar a la BD, la frase Statement.RETURN KEYS es para 
    que cuando le pido a la BD me entregue los datos del Alumno nuevo guardado, obtenga el ID auntoincremenal que genera la BD.
    Esto se logra guardando los datos en rsAlumno y pidiendo las genKeys. Luego en el if que sigue a continuacion le pedimos el ID,
    Si no puede guardarlo, avisa por consola por el "ELSE", sino avisa por consola "GUARDADO". Todo el bloque va en un try-catch 
    SQLExeption por si hay algun error en los datos ingresados.
    Cuando hacemos psAlumno.Set y pedimos (#, getDATO) estamos obteniendo los datos del alumno en JAVA para convertirlos en SQL.*/

}
