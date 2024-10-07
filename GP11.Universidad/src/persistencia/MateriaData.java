
package persistencia;

/**
 * @author Usuario(Marcos Antonio Chirino)
 */
import entidades.Materias;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
public class MateriaData {
    private Connection conexionMateriaData = null;

    public MateriaData(Connection conexion) {
        this.conexionMateriaData = conexion;
    }

    public void guardarMateria(Materias a){ //sin id porque es autoincremental por la BD en XAMPP
        
        boolean validado = false;   
        
        List<Materias> materias = this.listarMaterias();
        
        if(materias.isEmpty()){           
            validado = true;
        } else{
            for(Materias matery: materias){
                
                if(matery.getIdMateria() != a.getIdMateria() ){ 
                    validado = true;
                    
                }else{
                    validado = false;
                    System.out.println("Materias identicas no admitidas");                    
                    break;
                }
            }
        }

        
        if(validado){
            String query = "INSERT INTO materia(nombre, año, estado) VALUES (?,?,?)";
            try {
            PreparedStatement ps = conexionMateriaData.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, a.getNombre());
            ps.setInt(2,a.getAnioMateria());
            ps.setBoolean(3, a.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys(); // YA NO ES NECESARIO; SIRVE CUANDO LA INFORMACION SE GUARDA EN EL DISPOSITIVO
            if (rs.next()) {
                a.setIdMateria(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el ID");
            }
            ps.close();
            System.out.println("GUARDADO!!!!!");
            } catch (SQLException ex) {
                System.out.println("No se ha podido guardar la materia");
                System.out.println("Mensaje de error: " + ex.getMessage());
            }
        }
  }
    public  Materias buscarMateriaPorId(int id){
        
            Materias a = null;
            
            String query = "SELECT * FROM materia WHERE idMateria = ?";
        try {   
            PreparedStatement ps;
            
            ps = conexionMateriaData.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               a = new Materias();
               a.setIdMateria(rs.getInt("idMateria"));
               a.setNombre(rs.getString("nombre"));
               a.setAnioMateria(rs.getInt("año"));
              a.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
            if(a == null){
                throw new SQLException();
            }
        } catch (SQLException ex) {            
            System.out.println("Error, no se pudo encontrar el registro!");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return a;
    }
    
    //BUSCADOR POR NOMBRE
    
    public  Materias buscarMateriaPorName(String name){
        
            Materias a = null;
            
            String query = "SELECT * FROM materia WHERE nombre = ?";
        try {   
            PreparedStatement ps;
            
            ps = conexionMateriaData.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               a = new Materias();
               a.setIdMateria(rs.getInt("idMateria"));
               a.setNombre(rs.getString("nombre"));
               a.setAnioMateria(rs.getInt("año"));
              a.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
            if(a == null){
                throw new SQLException();
            }
        } catch (SQLException ex) {            
            System.out.println("Error, no se pudo encontrar el registro!");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return a;
    }
    
    // BUSCAR POR AÑO
    
    public  Materias buscarMateriaPorAño(int anio){
        
            Materias a = null;
            
            String query = "SELECT * FROM materia WHERE año = ?";
        try {   
            PreparedStatement ps;
            
            ps = conexionMateriaData.prepareStatement(query);
            ps.setInt(1, anio);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               a = new Materias();
               a.setIdMateria(rs.getInt("idMateria"));
               a.setNombre(rs.getString("nombre"));
               a.setAnioMateria(rs.getInt("año"));
              a.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
            if(a == null){
                throw new SQLException();
            }
        } catch (SQLException ex) {            
            System.out.println("Error, no se pudo encontrar el registro!");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return a;
        
    }
    
    //BUSCAR POR ESTADO
    
    public  Materias buscarMateriaPorEstado(boolean status){
        
            Materias a = null;
            
            String query = "SELECT * FROM materia WHERE estado = ?";
        try {   
            PreparedStatement ps;
            
            ps = conexionMateriaData.prepareStatement(query);
            ps.setBoolean(1, status);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               a = new Materias();
               a.setIdMateria(rs.getInt("idMateria"));
               a.setNombre(rs.getString("nombre"));
               a.setAnioMateria(rs.getInt("año"));
              a.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
            if(a == null){
                throw new SQLException();
            }
        } catch (SQLException ex) {            
            System.out.println("Error, no se pudo encontrar el registro!");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return a;
    }
    
    
    
    
    public List<Materias> listarMaterias(){
    //copiar el buscar u aggregar el add a la lista, el SELECT es * FROM alumnos. y return nombre del array.
        Materias a;
        List<Materias> listadoMaterias = new ArrayList<>();    
            String query = "SELECT * FROM materia";
        try {   
            PreparedStatement ps;
            
            ps = conexionMateriaData.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               a = new Materias();
               a.setIdMateria(rs.getInt("idMateria"));
               a.setNombre(rs.getString("nombre"));
               a.setAnioMateria(rs.getInt("año"));
               a.setEstado(rs.getBoolean("estado"));
               listadoMaterias.add(a);
            }
              ps.close();
            if(listadoMaterias == null){
                throw new SQLException();
            }
        } catch (SQLException ex) {            
            System.out.println("No hay materias registrados");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    
    return listadoMaterias;   
    }
    
    public void actualizarMateria(Materias a){
        //aca se usa UPDATE alumno SET ... Atributos ... WHERE idAlumno=?.
        String query = "UPDATE materia SET  nombre= ?, año = ?, estado= ? WHERE idAlumno = ?";
        
        try {
            if(this.buscarMateriaPorId(a.getIdMateria()) == null){
                throw new SQLException();
            }else{
                PreparedStatement ps = conexionMateriaData.prepareStatement(query) ;
                ps.setString(1, a.getNombre());
                ps.setInt(2, a.getAnioMateria());
                ps.setBoolean(3, a.isEstado());

                ps.executeQuery();
                ps.close();
                 System.out.println("Usuario Actualizado");
            }                               
        } catch (SQLException ex) {
            System.out.println("No se pudo actualizar");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        
    }
    
    public void borrarMateriaFisico (int idMateria){
        try {
            // similar al Update: DELETE FROM alumno WHERE idAlumno=?.
            if(this.buscarMateriaPorId(idMateria) == null){
                System.out.println();
                throw new SQLException();
            }
            String query = "DELETE FROM materia WHERE idMateria = ?";
            PreparedStatement ps = conexionMateriaData.prepareStatement(query);
            ps.setInt(1, idMateria);
            ps.executeUpdate();
            System.out.println("Registro eliminado con exito");
        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar el registro");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    }
    
   
    public void altaLogicaMateria(Materias a){
        //aca es una actualizar: UPDATE alumno SET estado=1 WHERE idAlumno=?.
        String query = "UPDATE materia SET estado= 1 WHERE idMateria = ?";
        try {
            if(a.isEstado()){
                System.out.println("La materia ya esta dado de alta");
                throw new SQLException();
            }else{
                PreparedStatement ps = conexionMateriaData.prepareStatement(query) ;
                ps.setInt(1, a.getIdMateria());
                ps.executeUpdate();
                ps.close();
            }          
        } catch (SQLException ex) {
            System.out.println("No se pudo dar la alta al registro");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        
    }
    
    public void bajaLogicaMateria(Materias a){
        //aca es UPDATE alumno SET estado=0 WHERE idAlumno=?.
        String query = "UPDATE materia SET estado= ? WHERE idMateria = ?";
        try {
            if(!a.isEstado()){
                System.out.println("La materia ya está dado de baja");
                throw new SQLException();
            } else{
                PreparedStatement ps = conexionMateriaData.prepareStatement(query) ;
                ps.setBoolean(1, false);
                ps.setInt(2, a.getIdMateria());         
                ps.executeUpdate();
                ps.close();
                System.out.println("Materia dada de baja");
            }
           
        } catch (SQLException ex) {
            System.out.println("No se pudo dar la baja al registro");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    }
}
