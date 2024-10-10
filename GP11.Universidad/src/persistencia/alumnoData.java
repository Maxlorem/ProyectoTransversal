package persistencia;

import entidades.Alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class AlumnoData {

    private Connection conexionAlumoData = null;

    public AlumnoData(Connection conexion) {
        this.conexionAlumoData = conexion;
    }

    public int guardarAlumno(Alumno a){ //sin id porque es autoincremental por la BD en XAMPP
        //Tenemos que validar que en la base de datos no haya un usuario con el mismo DNI que el enviado
        boolean validado = false;   
        int codigoDevuelto = 1;
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
            ps.setString(2, a.getApellido().trim());
            ps.setString(3, a.getNombre().trim());
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
                System.out.println("Codigo de error: " + ex.getErrorCode());
                codigoDevuelto = ex.getErrorCode();
            }
        }      
        
        return codigoDevuelto;
    }
    /*ps es un objeto que guarda los datos que ingresamos parseados para ingresar a la BD, la frase Statement.RETURN KEYS es para 
    que cuando le pido a la BD me entregue los datos del Alumno nuevo guardado, obtenga el ID auntoincremenal que genera la BD.
    Esto se logra guardando los datos en rs y pidiendo las genKeys. Luego en el if que sigue a continuacion le pedimos el ID,
    Si no puede guardarlo, avisa por consola por el "ELSE", sino avisa por consola "GUARDADO". Todo el bloque va en un try-catch 
    SQLExeption por si hay algun error en los datos ingresados.
    Cuando hacemos ps.Set y pedimos (#, getDATO) estamos obteniendo los datos del alumno en JAVA para convertirlos en SQL.*/

    
    public  Alumno buscarAlumnoPorId(int id){
        
            Alumno alumnoEnviado = new Alumno();
            
            String query = "SELECT * FROM alumnos WHERE idAlumno = ?";
        try {   
            PreparedStatement ps;
            
            ps = conexionAlumoData.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               alumnoEnviado = new Alumno();
               alumnoEnviado.setIdAlumno(rs.getInt("idAlumno"));
               alumnoEnviado.setDni(rs.getLong("dni"));
               alumnoEnviado.setApellido(rs.getString("apellido"));
               alumnoEnviado.setNombre(rs.getString("nombre"));
               alumnoEnviado.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
               alumnoEnviado.setEstado(rs.getBoolean("estado"));
            }
              ps.close();
            if(alumnoEnviado == null){
                throw new SQLException();
            }
        } catch (SQLException ex) {            
            System.out.println("Error, no se pudo encontrar el registro!");
            System.out.println("Mensaje de error: " + ex.getMessage());
            
        }
        return alumnoEnviado;
   
    } 
 
    //BUSCAR POR NOMBRE
    
    public  ArrayList<Alumno> buscarAlumnoPorApellido(String sername){
        
             ArrayList<Alumno> alumnosApellido = new ArrayList<>();   
            
            String query = "SELECT * FROM alumnos WHERE apellido = ?";
        try {   
            PreparedStatement ps;
            
            ps = conexionAlumoData.prepareStatement(query);
            ps.setString(1, sername.trim());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Alumno a = new Alumno();
               a.setIdAlumno(rs.getInt("idAlumno"));
               a.setDni(rs.getLong("dni"));
               a.setApellido(rs.getString("apellido"));
               a.setNombre(rs.getString("nombre"));
               a.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
               a.setEstado(rs.getBoolean("estado"));
               alumnosApellido.add(a);
            }
              ps.close();
            if(alumnosApellido.isEmpty()){
                throw new SQLException();
            }
        } catch (SQLException ex) {            
            System.out.println("Error, no se pudo encontrar el registro!");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return alumnosApellido;
    }
    
    public  Alumno buscarAlumnoPorDni(int doc){
        
            Alumno alumnoDevuelto = new Alumno();
            
            String query = "SELECT * FROM alumnos WHERE dni = ?";
        try {   
            PreparedStatement ps;
            
            ps = conexionAlumoData.prepareStatement(query);
            ps.setInt(1, doc);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               alumnoDevuelto = new Alumno();
               alumnoDevuelto.setIdAlumno(rs.getInt("idAlumno"));
               alumnoDevuelto.setDni(rs.getLong("dni"));
               alumnoDevuelto.setApellido(rs.getString("apellido"));
               alumnoDevuelto.setNombre(rs.getString("nombre"));
               alumnoDevuelto.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
               alumnoDevuelto.setEstado(rs.getBoolean("estado"));
            }
              ps.close();
            if(alumnoDevuelto == null){
                throw new SQLException();
            }
        } catch (SQLException ex) {            
            System.out.println("Error, no se pudo encontrar el registro!");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return alumnoDevuelto;
    }
    
    //BUSCAR POR ESTADO
    
    public  Alumno buscarAlumnoPorEstado(boolean status){
        
            Alumno alumnoDevuelto = null;
            
            String query = "SELECT * FROM alumnos WHERE estado = ?";
        try {   
            PreparedStatement ps;
            
            ps = conexionAlumoData.prepareStatement(query);
            ps.setBoolean(1, status);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               alumnoDevuelto = new Alumno();
               alumnoDevuelto.setIdAlumno(rs.getInt("idAlumno"));
               alumnoDevuelto.setDni(rs.getLong("dni"));
               alumnoDevuelto.setApellido(rs.getString("apellido"));
               alumnoDevuelto.setNombre(rs.getString("nombre"));
               alumnoDevuelto.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
               alumnoDevuelto.setEstado(rs.getBoolean("estado"));
            }
              ps.close();
            if(alumnoDevuelto == null){
                throw new SQLException();
            }
        } catch (SQLException ex) {            
            System.out.println("Error, no se pudo encontrar el registro!");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        return alumnoDevuelto;
    }
    
    public List<Alumno> listarAlumnos(){
    //copiar el buscar u aggregar el add a la lista, el SELECT es * FROM alumnos. y return nombre del array.
        Alumno alumnos;
        List<Alumno> listadoAlumnos = new ArrayList<>();    
            String query = "SELECT * FROM alumnos";
        try {   
            PreparedStatement ps;
            
            ps = conexionAlumoData.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               alumnos = new Alumno();
               alumnos.setIdAlumno(rs.getInt("idAlumno"));
               alumnos.setDni(rs.getLong("dni"));
               alumnos.setApellido(rs.getString("apellido"));
               alumnos.setNombre(rs.getString("nombre"));
               alumnos.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
               alumnos.setEstado(rs.getBoolean("estado"));
               listadoAlumnos.add(alumnos);
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
    
    public List<Alumno> listarAlumnosRegulares(){
    //copiar el buscar u aggregar el add a la lista, el SELECT es * FROM alumnos. y return nombre del array.
        Alumno alumnos;
        List<Alumno> listadoAlumnos = new ArrayList<>();    
            String query = "SELECT * FROM alumnos WHERE estado = 1";
        try {   
            PreparedStatement ps;
            
            ps = conexionAlumoData.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               alumnos = new Alumno();
               alumnos.setIdAlumno(rs.getInt("idAlumno"));
               alumnos.setDni(rs.getLong("dni"));
               alumnos.setApellido(rs.getString("apellido"));
               alumnos.setNombre(rs.getString("nombre"));
               alumnos.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
               alumnos.setEstado(rs.getBoolean("estado"));
               listadoAlumnos.add(alumnos);
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
    
        
    public void actualizarAlumno(Alumno alumnoPorParametro){
        //aca se usa UPDATE alumno SET ... Atributos ... WHERE idAlumno=?.
        String query = "UPDATE alumnos SET dni = ?, apellido = ?, nombre= ?, fechaNacimiento= ?, estado= ? WHERE idAlumno = ?";
        
        try {
            if(this.buscarAlumnoPorId(alumnoPorParametro.getIdAlumno()) == null){
                throw new SQLException();
            }else{
                PreparedStatement ps = conexionAlumoData.prepareStatement(query) ;
                ps.setLong(1,alumnoPorParametro.getDni());
                ps.setString(2, alumnoPorParametro.getApellido().trim());
                ps.setString(3, alumnoPorParametro.getNombre().trim());
                ps.setDate(4,Date.valueOf(alumnoPorParametro.getFechaNac()));
                ps.setBoolean(5, alumnoPorParametro.isEstado());
                ps.setInt(6, alumnoPorParametro.getIdAlumno());

                ps.executeQuery();
                ps.close();
                 System.out.println("Usuario Actualizado");
            }                               
        } catch (SQLException ex) {
            System.out.println("No se pudo actualizar");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        
    }
    
    public  boolean buscarAlumnoPorEstadoINDIVIDUAL(boolean status,Alumno alumnoEnviado){
                          
            String query = "SELECT * FROM alumnos WHERE alumnos.idAlumno = ?";
            Alumno alumnoEncontrado = null;
            try {               
            
            PreparedStatement ps = conexionAlumoData.prepareStatement(query);
            ps.setInt(1, alumnoEnviado.getIdAlumno());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                alumnoEncontrado = new Alumno();
                alumnoEncontrado.setIdAlumno(rs.getInt("idAlumno"));
                alumnoEncontrado.setDni(rs.getLong("dni"));
                alumnoEncontrado.setApellido(rs.getString("apellido"));
                alumnoEncontrado.setNombre(rs.getString("nombre"));
                alumnoEncontrado.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumnoEncontrado.setEstado(rs.getBoolean("estado"));
                System.out.println(alumnoEncontrado);
            }
            ps.close();
            if(alumnoEncontrado.isEstado() != status){
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
            System.out.println("Codigo de error: "+ex.getErrorCode()+"\nMensaje de error: " + ex.getMessage());
//            if(ex.getErrorCode() == 1451){
//                return 1451; //CODIGO DE ERROR QUE NO PUEDE BORRAR PORQUE TIENE UNA INSCRIPCION
//            }
        }
        
    }
    
    public void altaLogicaAlumno(Alumno alumnoPorParametro){
        //aca es una actualizar: UPDATE alumno SET estado=1 WHERE idAlumno=?.
        String query = "UPDATE alumnos SET estado= 1 WHERE idAlumno = ?";
        try {
            if(!this.buscarAlumnoPorEstadoINDIVIDUAL(true, alumnoPorParametro)) {
                System.out.println("El alumno ya esta dado de alta");
                throw new SQLException();
            }else{
                PreparedStatement ps = conexionAlumoData.prepareStatement(query) ;
                ps.setInt(1, alumnoPorParametro.getIdAlumno());
                ps.executeUpdate();
                ps.close();
            }          
        } catch (SQLException ex) {
            System.out.println("No se pudo dar la alta al registro");
            System.out.println("Mensaje de error: " + ex.getMessage());
        }
        
    }
    
    public void bajaLogicaAlumno(Alumno alumnoPorParametro){
        //aca es UPDATE alumno SET estado=0 WHERE idAlumno=?.
        String query = "UPDATE alumnos SET estado= false WHERE idAlumno = ?";
        try {
            if(!this.buscarAlumnoPorEstadoINDIVIDUAL(false, alumnoPorParametro)) {
                System.out.println("El alumno ya está dado de baja");
                throw new SQLException();
            } else{
                PreparedStatement ps = conexionAlumoData.prepareStatement(query) ;
                ps.setInt(1, alumnoPorParametro.getIdAlumno());         
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
