

package persistencia;
import entidades.Inscripcion;
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
    //private MateriaData materiaData;
    
    
    
   public InscripcionData(Connection conexion, AlumnoData alumnoData/*, MateriaData materiaData */){
       this.conexion = conexion;
       this.alumnoData = alumnoData;
       //this.materiaData = materiaData;
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
                //inscripcion.setMateria(MateriaData);
            }
            
            
        } catch (SQLException ex) {
            System.out.println("No se pudo Obtener las inscripciones del alumno");
        }
       return inscripciones;
   }
   
}