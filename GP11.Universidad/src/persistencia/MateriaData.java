
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

    public int guardarMateria(Materias a){ //sin id porque es autoincremental por la BD en XAMPP
        
        boolean validado = false;   
        int codigoDevuelto = 1;
        List<Materias> materias = this.listarMaterias();
        
        if(materias.isEmpty()){           
            validado = true;
        } else{
            for(Materias matery: materias){
                
                if(!matery.getNombre().equalsIgnoreCase(a.getNombre())){ 
                    validado = true;
                    
                }else{
                    validado = false;
                    System.out.println("Materias identicas no admitidas");                 
                    codigoDevuelto = 1500;
                    break;
                }
            }
        }

        
        if(validado){
            String query = "INSERT INTO materia(nombre, año, estado) VALUES (?,?,?)";
            try {
            PreparedStatement ps = conexionMateriaData.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, a.getNombre().trim());
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
                System.out.println("Error: || metodo: guardarMateria");
                System.out.println("No se ha podido guardar la materia");
                System.out.println("Mensaje de error: " + ex.getMessage());
                System.out.println("Codigo de error: " + ex.getErrorCode());
                codigoDevuelto = ex.getErrorCode();
            }
        }
        
        return codigoDevuelto;
    }
    public  Materias  buscarMateriaPorId(int id){
            
        Materias materias = null;
        String query = "SELECT * FROM materia WHERE idMateria = ?";
        try {             
            
            PreparedStatement ps = conexionMateriaData.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){       
                materias = new Materias();
                materias.setIdMateria(rs.getInt("idMateria"));
                materias.setNombre(rs.getString("nombre").trim());
                materias.setAnioMateria(rs.getInt("año"));
                materias.setEstado(rs.getBoolean("estado"));
                
            }
            ps.close();
            if(materias == null){                
                throw new Error();
            }
            System.out.println("BuscarMateriaPorId dice: Se ha enviado el registro");             
        } catch (SQLException ex) {            
            System.out.println("Error: || metodo: buscarMateriaPorID");
            System.out.println("Mensaje de error: " + ex.getMessage());
        } catch(Error e){
            System.out.println("No se encontro la materia");
        }
       
        return materias;
    }
    
    //BUSCADOR POR NOMBRE
    
    public  Materias buscarMateriaPorName(String name){
        
            Materias materia = null;
            
            String query = "SELECT * FROM materia WHERE materia.nombre = ?";
        try {   
                        
            PreparedStatement ps = conexionMateriaData.prepareStatement(query);
            ps.setString(1, name.trim());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                materia = new Materias();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre").trim());
                materia.setAnioMateria(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
            if(materia == null){
                throw new Error();
            } 
        } catch (SQLException ex) {            
            System.out.println("Error: || metodo: buscarMateriaPorName");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }catch(Error error){
            System.out.println("No se ha encontrado el registro por nombre");
        }
        return materia;
    }
    
    // BUSCAR POR AÑO
    
    public  ArrayList<Materias> buscarMateriaPorAño(int anio){
            
            ArrayList<Materias> materiasEncontradasPorAño = new ArrayList<>();            
            
            String query = "SELECT * FROM materia WHERE año = ?";
        try {             
            
            PreparedStatement ps = conexionMateriaData.prepareStatement(query);
            ps.setInt(1, anio);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Materias materia = new Materias();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre").trim());
                materia.setAnioMateria(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                materiasEncontradasPorAño.add(materia);
            }
            ps.close();
            if(!materiasEncontradasPorAño.isEmpty()){
                System.out.println("Materias encontradas por año enviadas");
            } else{
                System.out.println("No se encuentran registradas materias en dicho año");
            }
        } catch (SQLException ex) {            
            System.out.println("Error: || metodo: buscarMateriaPorAño");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return materiasEncontradasPorAño;
        
    }
    
    //BUSCAR POR ESTADO
    
    public  ArrayList<Materias> buscarMateriaPorEstado(boolean status){
        
            ArrayList<Materias> materiasEncontradasPorEstado = new ArrayList<>(); 
            
            String query = "SELECT * FROM materia WHERE estado = ?";
        try {   
            
            
            PreparedStatement ps = conexionMateriaData.prepareStatement(query);
            ps.setBoolean(1, status);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Materias materias = new Materias();
                materias.setIdMateria(rs.getInt("idMateria"));
                materias.setNombre(rs.getString("nombre").trim());
                materias.setAnioMateria(rs.getInt("año"));
                materias.setEstado(rs.getBoolean("estado"));
                materiasEncontradasPorEstado.add(materias);
            }
            ps.close();
            if(!materiasEncontradasPorEstado.isEmpty()){
                System.out.println("Materias encontradas por estado enviadas");
            } else{
                System.out.println("No se encuentran registradas materias en dicho estado");
            }
        } catch (SQLException ex) {            
            System.out.println("Error: || metodo: buscarMateriaPorEstado");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return materiasEncontradasPorEstado;
    }
    public  boolean buscarMateriaPorEstadoINDIVIDUAL(boolean status,Materias materiaEnviada){
                          
            String query = "SELECT * FROM materia WHERE materia.idMateria = ?";
            Materias materias = null;
            try {               
            
            PreparedStatement ps = conexionMateriaData.prepareStatement(query);
            ps.setInt(1, materiaEnviada.getIdMateria());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                materias = new Materias();
                materias.setIdMateria(rs.getInt("idMateria"));
                materias.setNombre(rs.getString("nombre").trim());
                materias.setAnioMateria(rs.getInt("año"));
                materias.setEstado(rs.getBoolean("estado"));
                System.out.println(materias);
            }
            ps.close();
            if(materias.isEstado() != status){
                System.out.println("Materia enviada");
                return true;
            }
            
           
        } catch (SQLException ex) {            
            System.out.println("Error: || metodo: buscarMateriaPorEstadoINDIVIDUAL");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }   catch(Error error){
            System.out.println("No se encotro registrada la materia en dicho estado");
            return false;
            
        }
        return false;
    }
    
    
    
    
    public List<Materias> listarMaterias(){
    //copiar el buscar u aggregar el add a la lista, el SELECT es * FROM alumnos. y return nombre del array.
        
        List<Materias> listadoMaterias = new ArrayList<>();    
            String query = "SELECT * FROM materia";
        try {   
            
            
            PreparedStatement ps = conexionMateriaData.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Materias materias = new Materias();
               materias.setIdMateria(rs.getInt("idMateria"));
               materias.setNombre(rs.getString("nombre").trim());
               materias.setAnioMateria(rs.getInt("año"));
               materias.setEstado(rs.getBoolean("estado"));
               listadoMaterias.add(materias);
            }
            ps.close();
            if(!listadoMaterias.isEmpty()){
                System.out.println("Todas las materias han sido enviadas");
            } else{
                System.out.println("No se encuentran materias registradas");
            }
        } catch (SQLException ex) {            
            System.out.println("Error: || metodo: listarMaterias");
            System.out.println("No hay materias registrados");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    
    return listadoMaterias;   
    }
    
    public List<Materias> listarMateriasPorNameActivas(){
    //copiar el buscar u aggregar el add a la lista, el SELECT es * FROM alumnos. y return nombre del array.
        
        List<Materias> listadoMaterias = new ArrayList<>();    
            String query = "SELECT * FROM materia WHERE estado = 1";
        try {   
            
            
            PreparedStatement ps = conexionMateriaData.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Materias materias = new Materias();
               materias.setIdMateria(rs.getInt("idMateria"));
               materias.setNombre(rs.getString("nombre").trim());
               materias.setAnioMateria(rs.getInt("año"));
               materias.setEstado(rs.getBoolean("estado"));
               listadoMaterias.add(materias);
            }
            ps.close();
            if(!listadoMaterias.isEmpty()){
                System.out.println("Todas las materias han sido enviadas");
            } else{
                System.out.println("No se encuentran materias registradas");
            }
        } catch (SQLException ex) {            
            System.out.println("Error: || metodo: listarMaterias");
            System.out.println("No hay materias registrados");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    
    return listadoMaterias;   
    }
    
    public void actualizarMateria(Materias materiaEnviada){
        //aca se usa UPDATE alumno SET ... Atributos ... WHERE idAlumno=?.
        String query = "UPDATE materia SET  nombre= ?, año = ?, estado= ? WHERE idMateria = ?";
        
        try {
            if(this.buscarMateriaPorId(materiaEnviada.getIdMateria()) == null){
                throw new SQLException();
            }else{
                PreparedStatement ps = conexionMateriaData.prepareStatement(query) ;
                ps.setString(1, materiaEnviada.getNombre());
                ps.setInt(2, materiaEnviada.getAnioMateria());
                ps.setBoolean(3, materiaEnviada.isEstado());
                ps.setInt(4, materiaEnviada.getIdMateria());
                ps.executeQuery();
                ps.close();
                 System.out.println("Usuario Actualizado");
            }                               
        } catch (SQLException ex) {
            System.out.println("Error: || metodo: actualizarMateria");
            System.out.println("No se pudo actualizar");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        
    }
    
    public void borrarMateriaFisico (int idMateria){ //NO FUNCIONA
        try {
            // similar al Update: DELETE FROM alumno WHERE idAlumno=?.
            if(this.buscarMateriaPorId(idMateria) == null){
                throw new SQLException();
            }
            String query = "DELETE FROM materia WHERE idMateria = ?";
            PreparedStatement ps = conexionMateriaData.prepareStatement(query);
            ps.setInt(1, idMateria);
            ps.executeUpdate();
            System.out.println("Registro eliminado con exito");
        } catch (SQLException ex) {
            System.out.println("Error: || metodo: borrarMateriaFisico");
            System.out.println("No se pudo eliminar el registro");
            System.out.println("Codigo de error: "+ex.getErrorCode()+"\nMensaje de error: " + ex.getMessage());
            
        }
        
    }
    
   
    public void altaLogicaMateria(Materias materiaEnviada){
        //aca es una actualizar: UPDATE alumno SET estado=1 WHERE idAlumno=?.
        String query = "UPDATE materia SET estado= 1 WHERE idMateria = ?";
        try {
            if(!this.buscarMateriaPorEstadoINDIVIDUAL(true, materiaEnviada)){
                System.out.println("La materia ya esta dado de alta");
                throw new SQLException();
            }else{
                PreparedStatement ps = conexionMateriaData.prepareStatement(query) ;
                ps.setInt(1, materiaEnviada.getIdMateria());
                ps.executeUpdate();
                ps.close();
                System.out.println("Materia Dada de ALTA");
            }
        } catch (SQLException ex) {
            System.out.println("Error: || metodo: altaLogicaMateria");
            System.out.println("No se pudo dar la alta al registro");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        
    }
    
    public void bajaLogicaMateria(Materias materiaEnviada){
        //aca es UPDATE alumno SET estado=0 WHERE idAlumno=?.
        String query = "UPDATE materia SET estado= false WHERE idMateria = ?";
        try {
             if(!this.buscarMateriaPorEstadoINDIVIDUAL(false, materiaEnviada)){
                System.out.println("La materia ya está dado de baja");
                throw new SQLException();
            } else{
                PreparedStatement ps = conexionMateriaData.prepareStatement(query) ;
                ps.setInt(1, materiaEnviada.getIdMateria());         
                ps.executeUpdate();
                ps.close();
                System.out.println("Materia dada de baja");
            }
        } catch (SQLException ex) {
            System.out.println("Error: || metodo: bajaLogicaMateria");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    }
}
