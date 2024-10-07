package persistencia;

import entidades.Alumno;

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

public class AlumnoData {

    private Connection conexionAlumoData = null;

    public AlumnoData(Connection conexion) {
        this.conexionAlumoData = conexion;
    }

    public void guardarAlumno(Alumno a){ //sin id porque es autoincremental por la BD en XAMPP
        //Tenemos que validar que en la base de datos no haya un usuario con el mismo DNI que el enviado
        boolean validado = false;   
        
        List<Alumno> alumnos = this.listarAlumnos();
        
        if(alumnos.isEmpty()){           
            validado = true;
        } else{
            for(Alumno alumno: alumnos){
                
                if(alumno.getDni() != a.getDni() ){                                       
                    validado = true;
                    
                }else{
                    validado = false;
                    System.out.println("Usuarios con dni identicos no son admitidos");                    
                    break;
                }
            }
        }
                       
        
                
        if(validado){
            String query = "INSERT INTO alumnos(dni, apellido, nombre, fechaNacimiento, estado) VALUES (?,?,?,?,?)";
            try {
            PreparedStatement ps = conexionAlumoData.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            ps.setLong(1, a.getDni());
            ps.setString(2, a.getApellido());
            ps.setString(3, a.getNombre());
            ps.setDate(4, Date.valueOf(a.getFechaNac()));
            ps.setBoolean(5, a.isEstado());
            ps.executeUpdate();

                       // SIRVE CUANDO SE QUIERE GUARDAR EL ID QUE LE GENERA LA BASE DE DATOS AL ALUMNO, PERO LA INFORMACION TIENE QUE ESTAR GUARDADA LOCALMENTE
//            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                a.setIdAlumno(rs.getInt(1));
//            } else {
//                System.out.println("No se pudo obtener el ID");
//  
            ps.close();
            System.out.println("GUARDADO!!!!!");
            } catch (SQLException ex) {
                System.out.println("No se ha podido guardar el alumno");
                System.out.println("Mensaje de error: " + ex.getMessage());
            }
        }      
        

    }
    /*ps es un objeto que guarda los datos que ingresamos parseados para ingresar a la BD, la frase Statement.RETURN KEYS es para 
    que cuando le pido a la BD me entregue los datos del Alumno nuevo guardado, obtenga el ID auntoincremenal que genera la BD.
    Esto se logra guardando los datos en rs y pidiendo las genKeys. Luego en el if que sigue a continuacion le pedimos el ID,
    Si no puede guardarlo, avisa por consola por el "ELSE", sino avisa por consola "GUARDADO". Todo el bloque va en un try-catch 
    SQLExeption por si hay algun error en los datos ingresados.
    Cuando hacemos ps.Set y pedimos (#, getDATO) estamos obteniendo los datos del alumno en JAVA para convertirlos en SQL.*/

    
    public  Alumno buscarAlumnoPorId(int id){
        
            Alumno a = null;
            
            String query = "SELECT * FROM alumnos WHERE idAlumno = ?";
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
            if(a == null){
                throw new SQLException();
            }
        } catch (SQLException ex) {            
            System.out.println("Error, no se pudo encontrar el registro!");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return a;
    } 
    
    public List<Alumno> listarAlumnos(){
    //copiar el buscar u aggregar el add a la lista, el SELECT es * FROM alumnos. y return nombre del array.
        Alumno a;
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
            if(listadoAlumnos == null){
                throw new SQLException();
            }
        } catch (SQLException ex) {            
            System.out.println("No hay alumnos registrados");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    
    return listadoAlumnos;   
    }
    
    public void actualizarAlumno(Alumno a){
        //aca se usa UPDATE alumno SET ... Atributos ... WHERE idAlumno=?.
        String query = "UPDATE alumnos SET dni = ?, apellido = ?, nombre= ?, fechaNacimiento= ?, estado= ? WHERE idAlumno = ?";
        
        try {
            if(this.buscarAlumnoPorId(a.getIdAlumno()) == null){
                throw new SQLException();
            }else{
                PreparedStatement ps = conexionAlumoData.prepareStatement(query) ;
                ps.setLong(1,a.getDni());
                ps.setString(2, a.getApellido());
                ps.setString(3, a.getNombre());
                ps.setDate(4,Date.valueOf(a.getFechaNac()));
                ps.setBoolean(5, a.isEstado());
                ps.setInt(6, a.getIdAlumno());

                ps.executeQuery();
                ps.close();
                 System.out.println("Usuario Actualizado");
            }                               
        } catch (SQLException ex) {
            System.out.println("No se pudo actualizar");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        
    }
    
    public void borrarAlumnoFisico (int idAlumno){
        try {
            // similar al Update: DELETE FROM alumno WHERE idAlumno=?.
            if(this.buscarAlumnoPorId(idAlumno) == null){
                System.out.println();
                throw new SQLException();
            }
            String query = "DELETE FROM alumnos WHERE idAlumno = ?";
            PreparedStatement ps = conexionAlumoData.prepareStatement(query);
            ps.setInt(1, idAlumno);
            ps.executeUpdate();
            System.out.println("Registro eliminado con exito");
        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar el registro");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    }
    
    public void altaLogicaAlumno(Alumno a){
        //aca es una actualizar: UPDATE alumno SET estado=1 WHERE idAlumno=?.
        String query = "UPDATE alumnos SET estado= 1 WHERE idAlumno = ?";
        try {
            if(a.isEstado()){
                System.out.println("El alumno ya esta dado de alta");
                throw new SQLException();
            }else{
                PreparedStatement ps = conexionAlumoData.prepareStatement(query) ;
                ps.setInt(1, a.getIdAlumno());
                ps.executeUpdate();
                ps.close();
            }          
        } catch (SQLException ex) {
            System.out.println("No se pudo dar la alta al registro");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        
    }
    
    public void bajaLogicaAlumno(Alumno a){
        //aca es UPDATE alumno SET estado=0 WHERE idAlumno=?.
        String query = "UPDATE alumnos SET estado= ? WHERE idAlumno = ?";
        try {
            if(!a.isEstado()){
                System.out.println("El alumno ya está dado de baja");
                throw new SQLException();
            } else{
                PreparedStatement ps = conexionAlumoData.prepareStatement(query) ;
                ps.setBoolean(1, false);
                ps.setInt(2, a.getIdAlumno());         
                ps.executeUpdate();
                ps.close();
                System.out.println("Usuario dado de baja");
            }
           
        } catch (SQLException ex) {
            System.out.println("No se pudo dar la baja al registro");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
    }
}
