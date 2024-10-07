package vistas;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materias;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import persistencia.AlumnoData;
import persistencia.InscripcionData;
import persistencia.MateriaData;
public class Prueba {

    public static void main(String args[]) {
        
        Connection conexion = entidades.Conexion.getConexion();
        
              
        Alumno alumno = new Alumno(11,44642651, "Quiroga","maximo", LocalDate.of(2002, 11, 8), true);
        Alumno alumno2 = new Alumno(2,44642652, "Pestchanker","Andres", LocalDate.of(1984, 10, 1), true);
        Alumno alumno3 = new Alumno(3,44642654, "Sosa Chirino","Marcos Antonio", LocalDate.of(2006, 5, 30), true);
        Alumno alumno4 = new Alumno(4,3232323, "Sosa ","Marcos Antonio", LocalDate.of(2006, 5, 30), true);
        Alumno alumno6 = new Alumno(6,3232322, "Sosa ","Marcos Antonio", LocalDate.of(2006, 5, 30), true);
//        
        AlumnoData alumnoData = new AlumnoData(conexion);
//        //Guardado
//        alumnoData.guardarAlumno(alumno);
//        alumnoData.guardarAlumno(alumno2);
//        alumnoData.guardarAlumno(alumno3);
//        alumnoData.guardarAlumno(alumno4);
//        alumnoData.guardarAlumno(alumno5);

        //Busqueda por Id
//        System.out.println(data.buscarAlumnoPorId(3));
//        System.out.println(data.buscarAlumnoPorId(2));
//        alumnoData.buscarAlumnoPorId(6);
        //Busqueda TOTAL
        
//        System.out.println(data.listarAlumnos());
         //ACtualizacion
         
//        Alumno alumno11 = new Alumno(12,34642651, "Ricciardo","minimo", LocalDate.of(2002, 11, 8), true);
//        alumnoData.actualizarAlumno(alumno11);
        //BORRADO FISICO
        
//        alumnoData.borrarAlumnoFisico(5);
    
//DAR LA BAJA LOGICA
//           alumnoData.bajaLogicaAlumno(alumno2);
//           alumnoData.bajaLogicaAlumno(alumno2);

//Dar la ALTA LOGICA
//alumnoData.altaLogicaAlumno(alumno2);
        


// guardar Materia
    MateriaData materiaData = new MateriaData(conexion);
//    
    Materias materia = new Materias(1,"Matematica 1 ", 1, false);
    Materias materia2 = new Materias(2,"Ingles 1 ", 1, false);
    Materias materia3= new Materias(3,"Programacion 1 ", 1, false);
    Materias materia4 = new Materias(4,"Laboratorio de Programacion 1 ", 1, true);
    Materias materia5 = new Materias(5,"Desarrollo Web ", 1, true);
    Materias materia6 = new Materias(6,"Administracion de Bases de Datos ", 1, true);
//    
//    materiaData.guardarMateria(materia);
//    materiaData.guardarMateria(materia2);
//    materiaData.guardarMateria(materia3);
//    materiaData.guardarMateria(materia4);
//    materiaData.guardarMateria(materia5);
//    materiaData.guardarMateria(materia6);

        InscripcionData inscripcionData = new InscripcionData(conexion, alumnoData, materiaData);

        Inscripcion inscripcion = new Inscripcion(alumno, materia);
        Inscripcion inscripcion2 = new Inscripcion(alumno2, materia);
        Inscripcion inscripcion3 = new Inscripcion(alumno3, materia2);
        Inscripcion inscripcion4 = new Inscripcion(alumno4, materia3);
        Inscripcion inscripcion5 = new Inscripcion(alumno6, materia4);
        //NO PERMITIR INSCRIBIR A INSCRIPCIONES YA REALIZADAS, validar
        //VALIDAR SI LOS USUARIOS EXISTEN
        inscripcionData.guardarInscripcion(inscripcion);
        inscripcionData.guardarInscripcion(inscripcion2);
        inscripcionData.guardarInscripcion(inscripcion3);
        inscripcionData.guardarInscripcion(inscripcion4);
        inscripcionData.guardarInscripcion(inscripcion5);
        ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
          inscripciones = inscripcionData.obtenerInscripcionesPorAlumno(inscripcion.getAlumno().getIdAlumno());
        inscripciones.forEach( inscripcions -> System.out.println(inscripcion.toString()));
        System.out.println(inscripciones.size());


// MATERIAS

   
    
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
