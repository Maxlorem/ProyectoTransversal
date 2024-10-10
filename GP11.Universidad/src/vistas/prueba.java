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
        System.out.println("RESULTADO DNI BUSCADO: " + alumnoData.buscarAlumnoPorDni(44642651));
//        //Guardado
//        alumnoData.guardarAlumno(alumno);
//        alumnoData.guardarAlumno(alumno2);
//        alumnoData.guardarAlumno(alumno3);
//        alumnoData.guardarAlumno(alumno4);
//        alumnoData.guardarAlumno(alumno6);

        //Busqueda por Id
//        System.out.println(data.buscarAlumnoPorId(2));
//        System.out.println(data.buscarAlumnoPorId(3));
//        alumnoData.buscarAlumnoPorId(6);
        //Busqueda TOTAL
        
//        System.out.println(data.listarAlumnos());
         //ACtualizacion
         
//        Alumno alumno11 = new Alumno(12,34642651, "Ricciardo","minimo", LocalDate.of(2002, 11, 8), true);
//        alumnoData.actualizarAlumno(alumno11);
        //BORRADO FISICO
        
      //alumnoData.borrarAlumnoFisico(3);
    
//DAR LA BAJA LOGICA
//           alumnoData.bajaLogicaAlumno(alumno2);
//           alumnoData.bajaLogicaAlumno(alumno2);

//Dar la ALTA LOGICA
//alumnoData.altaLogicaAlumno(alumno2);
        


// guardar Materia
    MateriaData materiaData = new MateriaData(conexion);
//    
// MATERIAS
    //materiaData.borrarMateriaFisico(3);
   
    
    Materias materia = new Materias("Matematica 1 ", 1, false);
    Materias materia2 = new Materias("Ingles 1 ", 1, false);
    Materias materia3= new Materias("Programacion 1 ", 1, false);
    Materias materia4 = new Materias("Laboratorio de Programacion 1 ", 1, true);
    Materias materia5 = new Materias("Desarrollo Web ", 1, true);
    Materias materia6 = new Materias("Administracion de Bases de Datos ", 1, true);
    Materias materia7 = new Materias("EDA", 1, false);
    
//    materiaData.guardarMateria(materia);
//    materiaData.guardarMateria(materia2);
//    materiaData.guardarMateria(materia3);
//    materiaData.guardarMateria(materia4);
//    materiaData.guardarMateria(materia5);
//    materiaData.guardarMateria(materia6);



// INSCRIPCIONES
        InscripcionData inscripcionData = new InscripcionData(conexion, alumnoData, materiaData);

        Inscripcion inscripcion = new Inscripcion(alumno, materia);
        Inscripcion inscripcion2 = new Inscripcion(alumno2, materia);
        Inscripcion inscripcion3 = new Inscripcion(alumno3, materia2);
        Inscripcion inscripcion4 = new Inscripcion(alumno4, materia3);
        Inscripcion inscripcion5 = new Inscripcion(alumno6, materia4);
       //GUARDAR INSCRIPCION

//        InscripcionData inscripcionData = new InscripcionData(conexion, alumnoData, materiaData);
//
//        Inscripcion inscripcion = new Inscripcion(alumno, materia);
//        Inscripcion inscripcion2 = new Inscripcion(alumno2, materia);
//        Inscripcion inscripcion3 = new Inscripcion(alumno3, materia2);
//        Inscripcion inscripcion4 = new Inscripcion(alumno4, materia3);
//        Inscripcion inscripcion5 = new Inscripcion(alumno6, materia4);
//        //NO PERMITIR INSCRIBIR A INSCRIPCIONES YA REALIZADAS, validar
//        //VALIDAR SI LOS USUARIOS EXISTEN

//        inscripcionData.guardarInscripcion(inscripcion);
//        inscripcionData.guardarInscripcion(inscripcion2);
//        inscripcionData.guardarInscripcion(inscripcion3);
//        inscripcionData.guardarInscripcion(inscripcion4);

//        inscripcionData.guardarInscripcion(inscripcion5);        
        
        //OBTENER INSCRIPCIONES POR ID DE ALUMNO
        ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();        
        ArrayList<Inscripcion> inscripciones2 = new ArrayList<Inscripcion>();        
        ArrayList<Inscripcion> inscripciones3 = new ArrayList<Inscripcion>();        
        ArrayList<Inscripcion> inscripciones4 = new ArrayList<Inscripcion>();        
        
        //inscripciones = inscripcionData.obtenerInscripcionesPorAlumno(inscripcion.getAlumno().getIdAlumno());
        //inscripciones.forEach( inscripcion11 -> System.out.println(inscripcion11.toString()));
        
       // inscripciones2 = inscripcionData.obtenerInscripcionesPorAlumno(inscripcion2.getAlumno().getIdAlumno());
        //inscripciones2.forEach( inscripcion22 -> System.out.println(inscripcion22.toString()));
        
       // inscripciones3 = inscripcionData.obtenerInscripcionesPorAlumno(inscripcion3.getAlumno().getIdAlumno());
        //inscripciones3.forEach( inscripcion33 -> System.out.println(inscripcion33.toString()));
        
       // inscripciones4 = inscripcionData.obtenerInscripcionesPorAlumno(inscripcion4.getAlumno().getIdAlumno());
        //inscripciones4.forEach( inscripcion44 -> System.out.println(inscripcion44.toString()));
        
        //OBTENER MATERIAS CURSADAS POR ALUMNO
        
        ArrayList<Materias> obtenerMateriasCursadas = new ArrayList<>();
        ArrayList<Materias> obtenerMateriasCursadas2 = new ArrayList<>();
        ArrayList<Materias> obtenerMateriasCursadas3 = new ArrayList<>();
        ArrayList<Materias> obtenerMateriasCursadas4 = new ArrayList<>();
        ArrayList<Materias> obtenerMateriasCursadas5 = new ArrayList<>();
//        
//         obtenerMateriasCursadas = inscripcionData.obtenerMateriasCursadasPorAlumno(1);
//         obtenerMateriasCursadas.forEach(inscripcionMateriass -> System.out.println(inscripcionMateriass));
//         obtenerMateriasCursadas2 = inscripcionData.obtenerMateriasCursadasPorAlumno(2);
//         obtenerMateriasCursadas3 = inscripcionData.obtenerMateriasCursadasPorAlumno(3);
//         obtenerMateriasCursadas4 = inscripcionData.obtenerMateriasCursadasPorAlumno(4);
//         obtenerMateriasCursadas5 = inscripcionData.obtenerMateriasCursadasPorAlumno(5);
        
        ArrayList<Materias> obtenerMateriasNOCursadas = new ArrayList<>();
        ArrayList<Materias> obtenerMateriasNOCursadas2 = new ArrayList<>();
        ArrayList<Materias> obtenerMateriasNOCursadas3 = new ArrayList<>();
        ArrayList<Materias> obtenerMateriasNOCursadas4 = new ArrayList<>();
        ArrayList<Materias> obtenerMateriasNOCursadas5 = new ArrayList<>();

//        inscripcionData.guardarInscripcion(inscripcion5);
//        ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
//          inscripciones = inscripcionData.obtenerInscripcionesPorAlumno(inscripcion.getAlumno().getIdAlumno());
//        inscripciones.forEach( inscripcions -> System.out.println(inscripcion.toString()));
//        System.out.println(inscripciones.size());


//        obtenerMateriasNOCursadas = inscripcionData.obtenerMateriasNOCursadasPorAlumno(1);
//        
//        obtenerMateriasNOCursadas2 = inscripcionData.obtenerMateriasNOCursadasPorAlumno(2);
//        obtenerMateriasNOCursadas3 = inscripcionData.obtenerMateriasNOCursadasPorAlumno(3);
//        obtenerMateriasNOCursadas4 = inscripcionData.obtenerMateriasNOCursadasPorAlumno(4);
//        obtenerMateriasNOCursadas5 = inscripcionData.obtenerMateriasNOCursadasPorAlumno(5);
        
        //ELIMINAR REGISTROS
        //inscripcionData.borrarInscripcionMateriaAlumno(2, 1);
        
        //OBTENER ALUMNOS POR MATERIAS
//        ArrayList<Alumno> alumnosQueTrajo = inscripcionData.obtenerAlumnosXMateria(5);
//        for(Alumno alumnoo:alumnosQueTrajo){
//            System.out.println(alumnoo);
//        }

    }
}
