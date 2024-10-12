

package persistencia;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
public class InscripcionData {
    
    private Connection conexion;    
    private AlumnoData alumnoData;
    private MateriaData materiaData;   
    
    
   public InscripcionData(Connection conexion, AlumnoData alumnoData, MateriaData materiaData ){
       this.conexion = conexion;
       this.alumnoData = alumnoData;
       this.materiaData = materiaData;
   } 
   
   public void guardarInscripcion(Inscripcion inscripcion){
       try{

           
            

            if(this.obtenerMateriasCursadasPorAlumno(inscripcion.getAlumno().getIdAlumno()).size() > 0){

                throw new Error();
            } else{
               try {
                String query = "INSERT INTO inscripcion( idAlumno ,idMateria ) VALUES (?,?)";
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
                ps.setInt(2, inscripcion.getMateria().getIdMateria());
                ps.executeUpdate();
                ps.close();
                System.out.println("Inscripcion Exitosa");
                } catch (SQLException ex) {
                    
                    if(ex.getErrorCode() == 1452){
                       
                        System.out.println("ERROR 1452: Revisa si en la base de datos existe el idAlumno enviado, o si existe el idMateria enviado.");
                    }else{
                        System.out.println("ERROR: Ocurrio un error inesperado y no se pudo inscribir");
                    }
                    
                } 
            } 
      } catch(Error e){
          System.out.println("El alumno ya esta inscripto a la materia");
          System.out.println("mensaje de error " + e.getMessage());
       }
              
       
   }
   public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        
        try {
            String query = " SELECT * FROM inscripcion WHERE idAlumno = ? ";
            
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
                inscripciones.add(inscripcion);
            }
            if(inscripciones.size() == 0){
                System.out.println("El alumno no tiene inscripciones");
            }
            
        } catch (SQLException ex) {
            System.out.println("Error obtenerInscripcionesPorAlumno");
            System.out.println("No se pudo Obtener las inscripciones del alumno");
        }
       return inscripciones;
   }
   public ArrayList<Materias> obtenerMateriasCursadasPorAlumno(int id){
        ArrayList<Materias> materiasObtenidas = new ArrayList<Materias>();
        
        try {
            String query = " SELECT materia.idMateria, materia.nombre ,materia.año,materia.estado "
                    + "FROM materia "
                    + "LEFT JOIN inscripcion ON materia.idMateria = inscripcion.idMateria "
                    + "WHERE inscripcion.idAlumno = ? " ;
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            ps.setBoolean(2, true);
            ResultSet rs = ps.executeQuery();
            ps.close();
            while(rs.next()){   
                Materias materias = new Materias();
                materias.setIdMateria(rs.getInt("idMateria"));
                materias.setAnioMateria(rs.getInt("año"));
                materias.setNombre(rs.getString("nombre"));
                materias.setEstado(rs.getBoolean("estado"));
                materiasObtenidas.add(materias);
                
            }
            if (materiasObtenidas.size() > 0) {
                System.out.println("Materias cursadas por el alumno enviadas=");
            } else{
                System.out.println("El alumno con ID: " + id
                        + "   ||  No está cursando materias");
            }
            
        } catch (SQLException ex) {
            System.out.println("ERROR: No se pudo traer las materias cursadas");
            System.out.println("ERROR_CODE: " + ex.getErrorCode());
        }
       return materiasObtenidas;
   }
   public ArrayList<Materias> obtenerMateriasNOCursadasPorAlumno(int id){
       ArrayList<Materias> materiasObtenidas = new ArrayList<Materias>();
       
        try {
            String query = " SELECT materia.idMateria, materia.nombre ,materia.año,materia.estado "
                    + "FROM materia "
                    + "LEFT JOIN inscripcion ON materia.idMateria = inscripcion.idMateria "
                    + "WHERE inscripcion.idAlumno IS NULL OR inscripcion.idAlumno <> ? "
                    + "";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            ps.close();
            while(rs.next()){     
                Materias materias = new Materias();
                materias.setIdMateria(rs.getInt("idMateria"));
                materias.setAnioMateria(rs.getInt("año"));
                materias.setNombre(rs.getString("nombre"));
                materias.setEstado(rs.getBoolean("estado"));
                materiasObtenidas.add(materias);
                
            }
            if (!materiasObtenidas.isEmpty()) {
                
                System.out.println("Materias NO cursadas por el alumno enviadas");
            } else{
                System.out.println("El alumno con ID: " + id
                        + "   ||  Cursa todas las materias dictadas");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: No se pudo traer las materias NO cursadas");
            System.out.println("ERROR_CODE: " + ex.getErrorCode());
        }
       return materiasObtenidas;
   }
   public boolean metodoAuxiliarRevisaSiExisteRegistro(int idAlumno,int idMateria){
        try {            
            String queryValidacion =  "select * FROM inscripcion  WHERE inscripcion.idAlumno =  ? AND inscripcion.idMateria = ?";
            PreparedStatement psValidacion = conexion.prepareStatement(queryValidacion);
            psValidacion.setInt(1, idAlumno);
            psValidacion.setInt(2, idMateria);
            ResultSet rsValidacion = psValidacion.executeQuery();
            if(!rsValidacion.next()){
                return false; 
            }
        }catch (SQLException ex) {
            System.out.println("Error en la consulta del metodo auxiliar");
            return false;
        }
        return true;
   }
   public void borrarInscripcionMateriaAlumno(int idAlumno,int idMateria){
        if(this.metodoAuxiliarRevisaSiExisteRegistro(idAlumno, idMateria)){
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
        }else{
            System.out.println("No se puede eliminar un registro que no existe");
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
            String query = "select alumnos.idAlumno,alumnos.dni,alumnos.apellido,alumnos.nombre,alumnos.fechaNacimiento,alumnos.estado FROM inscripcion, materia,alumnos WHERE inscripcion.idMateria = materia.idMateria AND alumnos.idAlumno = inscripcion.idAlumno AND materia.idMateria = ?";
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
            if(!alumnosPorMateria.isEmpty()){
                System.out.println("Alumnos por Materias enviados");
            } else{
                System.out.println("No hay alumnos registrados en la materia");
            }            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("NO ha sido posible obtener los alumnos por materia");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return alumnosPorMateria;
   }
   
    public ArrayList<Inscripcion> AlumnoInfo(int id){
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        
        try {
            String query = "SELECT inscripcion.idAlumno,inscripcion.idMateria,materia.nombre, materia.año, inscripcion.nota FROM inscripcion JOIN materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?";
            
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultados = ps.executeQuery();
            ps.close();
            while(resultados.next()){
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setAlumno(alumnoData.buscarAlumnoPorId(resultados.getInt("idAlumno")));
                inscripcion.setMateria(materiaData.buscarMateriaPorId(resultados.getInt("idMateria")));
                inscripcion.getMateria().setIdMateria(resultados.getInt("idMateria"));
                inscripcion.getMateria().setNombre(resultados.getString("materia.nombre"));
                inscripcion.getMateria().setAnioMateria(resultados.getInt("materia.año"));
                inscripcion.setNota(resultados.getDouble("nota"));
                
                inscripciones.add(inscripcion);
            }
            if(inscripciones.size() == 0){
                System.out.println("El alumno no tiene inscripciones");
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en metodillo AlumnoInfo");
            System.out.println("Mensaje: "+ex.getMessage());
            System.out.println("No se pudo Obtener las inscripciones del alumno");
        }
       return inscripciones;
   }
}