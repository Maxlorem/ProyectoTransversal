package vistas;
import entidades.Alumno;
import entidades.Materias;
import java.sql.Connection;
import java.time.LocalDate;
import persistencia.AlumnoData;
import persistencia.MateriaData;
public class Prueba {

    public static void main(String args[]) {
        
        Connection conexion = entidades.Conexion.getConexion();
        
              
//        Alumno alumno = new Alumno(44642651, "Quiroga","maximo", LocalDate.of(2002, 11, 8), true);
//        Alumno alumno2 = new Alumno(2,44642652, "Pestchanker","Andres", LocalDate.of(1984, 10, 1), true);
//        Alumno alumno3 = new Alumno(44642654, "Sosa Chirino","Marcos Antonio", LocalDate.of(2006, 5, 30), true);
//        Alumno alumno4 = new Alumno(3232323, "Sosa ","Marcos Antonio", LocalDate.of(2006, 5, 30), true);
//        Alumno alumno5 = new Alumno(3232322, "Sosa ","Marcos Antonio", LocalDate.of(2006, 5, 30), true);
//        
//        AlumnoData data = new AlumnoData(conexion);
//        //Guardado
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
//           data.bajaLogicaAlumno(alumno2);
//           data.bajaLogicaAlumno(alumno2);

//Dar la ALTA LOGICA
//data.altaLogicaAlumno(alumno2);
        

// MATERIAS

MateriaData materiaData = new MateriaData(conexion);
    
   /*Materias materia = new Materias("Matematica 1 ", 1, false);
    Materias materia2 = new Materias("Ingles 1 ", 1, false);
    Materias materia3= new Materias("Programacion 1 ", 1, false);
    Materias materia4 = new Materias("Laboratorio de Programacion 1 ", 1, true);
    Materias materia5 = new Materias("Desarrollo Web ", 1, true);
    Materias materia6 = new Materias("Administracion de Bases de Datos ", 1, true);
    Materias materia7 = new Materias("EDA", 1, false);
    
// GUARDAR MATERIAS    

    materiaData.guardarMateria(materia);
    materiaData.guardarMateria(materia2);
    materiaData.guardarMateria(materia3);
    materiaData.guardarMateria(materia4);
    materiaData.guardarMateria(materia5);
    materiaData.guardarMateria(materia6);
    materiaData.guardarMateria(materia7); */


//BUSCAR MATERIAS POR ID

        //System.out.println(materiaData.buscarMateriaPorId(3));
        //System.out.println(materiaData.buscarMateriaPorId(1));

//BUSQUEDA COMPLETA

        //System.out.println(materiaData.listarMaterias());
        
//ACTUALIZAR MATERIAS

Materias materia10 = new Materias(7, "Laboratorio de programacion 2", 1 ,true);
materiaData.actualizarMateria(materia10);
    }
}
