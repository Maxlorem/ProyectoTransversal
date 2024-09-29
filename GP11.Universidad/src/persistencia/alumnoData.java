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
import java.util.List;
import java.util.ArrayList;

public class alumnoData {

    private Connection conexionAlumoData = null;

    public alumnoData(Conexion conexion) {
        this.conexionAlumoData = conexion.buscarConecion();
    }

    public void guardarAlumno(Alumno a) throws SQLException { //sin id porque es autoincremental por la BD en XAMPP

        String query = "INSERT INTO alumnos(dni, apellido, nombre, fechaNacimiento, estado) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conexionAlumoData.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            ps.setLong(1, a.getDni());
            ps.setString(2, a.getApellido());
            ps.setString(3, a.getNombre());
            ps.setDate(4, Date.valueOf(a.getFechaNac()));
            ps.setBoolean(5, a.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                a.setIdAlumno(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el ID");
            }
            ps.close();
            System.out.println("GUARDADO!!!!!");
        } catch (SQLException ex) {
            Logger.getLogger(alumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /*ps es un objeto que guarda los datos que ingresamos parseados para ingresar a la BD, la frase Statement.RETURN KEYS es para 
    que cuando le pido a la BD me entregue los datos del Alumno nuevo guardado, obtenga el ID auntoincremenal que genera la BD.
    Esto se logra guardando los datos en rs y pidiendo las genKeys. Luego en el if que sigue a continuacion le pedimos el ID,
    Si no puede guardarlo, avisa por consola por el "ELSE", sino avisa por consola "GUARDADO". Todo el bloque va en un try-catch 
    SQLExeption por si hay algun error en los datos ingresados.
    Cuando hacemos ps.Set y pedimos (#, getDATO) estamos obteniendo los datos del alumno en JAVA para convertirlos en SQL.*/

    
    public Alumno buscarAlumno(int id){
        
            Alumno a = null;
            
            String query = "SELECT FROM alumnos WHERE idAlumno = ?";
        try {   
            PreparedStatement ps;
            
            ps = conexionAlumoData.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               a = new Alumno();
               a.setIdAlumno(rs.getInt("idAlumno"));
               a.setDni(rs.getLong("dni"));
               a.setApellido(rs.getString("apellido"));
               a.setNombre(rs.getString("nombre"));
               a.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
               a.setEstado(rs.getBoolean("estado"));
            }
              ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(alumnoData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error, no se pudo encontrar el registro!");
        }
        return a;
    } 
    
    public List<Alumno> listarAlumnos(){
    //copiar el buscar u aggregar el add a la lista, el SELECT es * FROM alumnos. y return nombre del array.
        Alumno a = null;
        List<Alumno> listadoAlumnos = new ArrayList<>();    
            String query = "SELECT * FROM alumnos";
        try {   
            PreparedStatement ps;
            
            ps = conexionAlumoData.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               a = new Alumno();
               a.setIdAlumno(rs.getInt("idAlumno"));
               a.setDni(rs.getLong("dni"));
               a.setApellido(rs.getString("apellido"));
               a.setNombre(rs.getString("nombre"));
               a.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
               a.setEstado(rs.getBoolean("estado"));
               listadoAlumnos.add(a);
            }
              ps.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(alumnoData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error, no se pudo encontrar el registro!");
        }
    
    return listadoAlumnos;   
    }
    
    public void actualizarAlumno(Alumno a){
        //aca se usa UPDATE alumno SET ... Atributos ... WHERE idAlumno=?.
        String query = "UPDATE alumnos SET dni = ?, apellido = ?, nombre= ?, fechaNacimiento= ?, estado= ? WHERE= idAlumno = ?";
        try {
            PreparedStatement ps = conexionAlumoData.prepareStatement(query) ;
            ps.setLong(1,a.getDni());
            ps.setString(2, a.getApellido());
            ps.setString(3, a.getNombre());
            ps.setDate(4,Date.valueOf(a.getFechaNac()));
            ps.setBoolean(5, a.isEstado());
            ps.setInt(6, a.getIdAlumno());
            ps.executeQuery();
            ps.close();
          
        } catch (SQLException ex) {
            Logger.getLogger(alumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void borrarAlumnoFisico (int idAlumno){
        try {
            // similar al Update: DELETE FROM alumno WHERE idAlumno=?.
            String query = "DELETE FROM alumnos WHERE idAlumno = ?";
            PreparedStatement ps = conexionAlumoData.prepareStatement(query);
            ps.setInt(1, idAlumno);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(alumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void altaLogicaAlumno(Alumno a){
        //aca es una actualizar: UPDATE alumno SET estado=1 WHERE idAlumno=?.
        String query = "UPDATE alumnos SET estado= 1 WHERE= idAlumno = ?";
        try {
            PreparedStatement ps = conexionAlumoData.prepareStatement(query) ;
            ps.setInt(1, a.getIdAlumno());
            ps.executeQuery();
            ps.close();
          
        } catch (SQLException ex) {
            Logger.getLogger(alumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void bajaLogicaAlumno(Alumno a){
        //aca es UPDATE alumno SET estado=0 WHERE idAlumno=?.
        String query = "UPDATE alumnos SET estado= 0 WHERE= idAlumno = ?";
        try {
            PreparedStatement ps = conexionAlumoData.prepareStatement(query) ;
            ps.setInt(1, a.getIdAlumno());
            ps.executeQuery();
            ps.close();
          
        } catch (SQLException ex) {
            Logger.getLogger(alumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
