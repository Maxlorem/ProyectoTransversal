

package persistencia;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
public class InscripcionData {
    
    private Connection conexion;
    
    private AlumnoData alumnoData;
    private MateriaData materiaData;
    
    
    
   public InscripcionData(Connection conexion, AlumnoData alumnoData/*, MateriaData materiaData */){
       this.conexion = conexion;
       this.alumnoData = alumnoData;
       this.materiaData = materiaData;
   } 
   
   public void guardarInscripcion(Inscripcion inscripcion){
             
       
        try {
            String query = "INSERT INTO inscripcion( idAlumno ,idMateria ) VALUES (?,?)";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo inscribir");
        }
       
   }
   public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        try {
            String query = " SELECT * FROM inscripcion WHERE idInscripcion = ? ";
            
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultados = ps.executeQuery();
            ps.close();
            while(resultados.next()){
                Inscripcion inscripcion = new Inscripcion();
                
                inscripcion.setIdInscripcion(resultados.getInt("idInscripcion"));
                inscripcion.setAlumno(alumnoData.buscarAlumnoPorId(resultados.getInt("idAlumno")));
                inscripcion.setMateria(materiaData.buscarMateriaPorId(resultados.getInt("idMateria")));
                inscripcion.setNota(resultados.getDouble("nota"));
            }
            
            System.out.println("Notas Obtenidas");
        } catch (SQLException ex) {
            System.out.println("No se pudo Obtener las inscripciones del alumno");
        }
       return inscripciones;
   }
   public ArrayList<Materias> obtenerMateriasCursadas(int id){
        ArrayList<Materias> materiasObtenidas = new ArrayList<Materias>();
        try {
            String query = " SELECT inscripcion.idMateria, nombre ,año "
                    + "FROM inscripcion,materia"
                    + "WHERE inscripcion.idMateria = materia.idMateria"
                    + "AND inscripcion.idAlumno = ?"
                    + "AND materia.estado = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            ps.setBoolean(2, true);
            ResultSet rs = ps.executeQuery();
            ps.close();
            while(rs.next()){
                Materias materias = new Materias();
                materias.setAnioMateria(rs.getInt("idMateria"));
                materias.setAnioMateria(rs.getInt("año"));
                materias.setNombre(rs.getString("nombre"));
                materiasObtenidas.add(materias);
            }
            
        } catch (SQLException ex) {
            System.out.println("No se pudo traer las materias cursadas");
        }
       return materiasObtenidas;
   }
   public ArrayList<Materias> obtenerMateriasNOCursadas(int id){
       ArrayList<Materias> materiasObtenidas = new ArrayList<Materias>();
        try {
            String query = " SELECT inscripcion.idMateria, nombre ,año "
                    + "FROM inscripcion,materia"
                    + "WHERE inscripcion.idMateria = materia.idMateria"
                    + "AND inscripcion.idAlumno = ?"
                    + "AND materia.estado = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            ps.setBoolean(2, false);
            ResultSet rs = ps.executeQuery();
            ps.close();
            while(rs.next()){
                Materias materias = new Materias();
                materias.setAnioMateria(rs.getInt("idMateria"));
                materias.setAnioMateria(rs.getInt("año"));
                materias.setNombre(rs.getString("nombre"));
                materiasObtenidas.add(materias);
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo traer las materias NO cursadas");
        }
       return materiasObtenidas;
   }
   public void borrarInscripcionMateriaAlumno(int idAlumno,int idMateria){
       
        try {
            String query = "DELETE FROM inscripcion WHERE inscripcion.idAlumno = ? AND inscripcion.idMateria = ? ";            
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.executeUpdate();
            System.out.println("Inscripcion borrada con exito");
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido un error, la inscripcion NO ha sido eliminada");
            System.out.println("MENSAJE DE ERROR: " + ex.getMessage());
        }
       
   }
   public void actualizarNota(int idAlumno,int idMateria,double nota){
        try {
            String query = "UPDATE inscripcion SET inscripcion.nota = ?  WHERE inscripcion.idAlumno = ? AND inscripcion.idMateria = ? ";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            ps.executeUpdate();
            ps.close();
            System.out.println("La nota del alumno con ID: " + idAlumno + " ha sido actualizada.");
        } catch (SQLException ex) {
            System.out.println("No se ha podido actualizar la nota");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
   }
   public ArrayList<Alumno> obtenerAlumnosXMateria(int idMateria){
       ArrayList<Alumno> alumnosPorMateria = new ArrayList<>();
        try {            
            String query = "SELECT * FROM materia WHERE materia.idMateria = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno")); //VER PORQUE NO SE SI FUNCIONE
                alumno.setDni(rs.getLong("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnosPorMateria.add(alumno);
            }
            System.out.println("Alumnos por Materias enviados");
            ps.close();
        } catch (SQLException ex) {
            System.out.println("NO ha sido posible obtener los alumnos por materia");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return alumnosPorMateria;
   }
           
}