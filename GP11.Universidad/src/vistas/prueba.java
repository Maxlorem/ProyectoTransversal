package vistas;
import entidades.Alumno;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import persistencia.alumnoData;
public class prueba {

    public static void main(String args[]) {
        
        Connection conexion = entidades.Conexion.getConexion();
        
        
        
        Alumno alumno = new Alumno(44642651, "Quiroga","maximo", LocalDate.of(2002, 11, 8), true);
        Alumno alumno2 = new Alumno(2,44642652, "Pestchanker","Andres", LocalDate.of(1984, 10, 1), true);
        Alumno alumno3 = new Alumno(44642654, "Sosa Chirino","Marcos Antonio", LocalDate.of(2006, 5, 30), true);
        Alumno alumno4 = new Alumno(3232323, "Sosa ","Marcos Antonio", LocalDate.of(2006, 5, 30), true);
        Alumno alumno5 = new Alumno(3232322, "Sosa ","Marcos Antonio", LocalDate.of(2006, 5, 30), true);
        
        alumnoData data = new alumnoData(conexion);
        //Guardado
//        data.guardarAlumno(alumno);
//        data.guardarAlumno(alumno2);
//        data.guardarAlumno(alumno3);
//        data.guardarAlumno(alumno4);
//        data.guardarAlumno(alumno5);
        //Busqueda por Id
//        System.out.println(data.buscarAlumnoPorId(3));
//        System.out.println(data.buscarAlumnoPorId(2));
//        data.buscarAlumnoPorId(6);
        //Busqueda TOTAL
//        System.out.println(data.listarAlumnos());
         //ACtualizacion
//        Alumno alumno11 = new Alumno(12,34642651, "Ricciardo","minimo", LocalDate.of(2002, 11, 8), true);
//        data.actualizarAlumno(alumno11);
        //BORRADO FISICO
//        data.borrarAlumnoFisico(5);
    
//DAR LA BAJA LOGICA
           data.bajaLogicaAlumno(alumno2);
           data.bajaLogicaAlumno(alumno2);
           //Dar la ALTA LOGICA
//data.altaLogicaAlumno(alumno2);
        
        
    }
}
