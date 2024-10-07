
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
}
