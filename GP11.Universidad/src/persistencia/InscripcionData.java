

package persistencia;
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
//   public void borrarInscripcionMateriaAlumno(int idAlumno,int idMateria){
//       
//   }
//   public void actualizarNota(int idAlumno,int idMateria,double nota){
//       
//   }
//   public ArrayList<Alumno> obtenerAlumnosXMateria(int idMateria){
//       
//   }
           
}