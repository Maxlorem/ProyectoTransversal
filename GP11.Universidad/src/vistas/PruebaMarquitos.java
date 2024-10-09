
package vistas;

import entidades.Alumno;
import entidades.Materias;
import java.sql.Connection;
import java.time.LocalDate;
import persistencia.AlumnoData;
import persistencia.MateriaData;

/**
 *
 * @author Usuario
 */
public class PruebaMarquitos {

    public static void main(String args[]) {
        
        Connection conexion = entidades.Conexion.getConexion();
    ///////////////////////////////////////////////////////////////////////////////////////
    //IMPORTANTE: HAY QUE VER EL BORRADO,HAY QUE ACTUALIZAR TANTO DE MATERIA COMO ALUMNOS//
    //            YA QUE HAY QUE ELIMINAR PRIMERO LA INSCRIPCION Y DESPUES LA MATERIA    //
    //            LO MISMO CON LOS ALUMNOS                                               // 
    ///////////////////////////////////////////////////////////////////////////////////////
              
    
        
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
        


// guardar Materia //RESUELTO 
    MateriaData materiaData = new MateriaData(conexion);
//    
    Materias materia = new Materias(1,"Matematica 1 ", 1, false);
    Materias materia2 = new Materias(2,"Ingles 1 ", 1, false);
    Materias materia3= new Materias(3,"Programacion 1 ", 1, false);
    Materias materia4 = new Materias(4,"Laboratorio de Programacion 1 ", 1, true);
    Materias materia5 = new Materias(5,"Desarrollo Web ", 1, true);
    Materias materia6 = new Materias(6,"Administracion de Bases de Datos ", 1, true);    
//   materiaData.guardarMateria(materia2);
//   materiaData.guardarMateria(materia3);
//   materiaData.guardarMateria(materia4);
//   materiaData.guardarMateria(materia5);
//   materiaData.guardarMateria(materia6);



    //BUSCAR MATERIAS POR ID //RESUELTO 
//        System.out.println(materiaData.buscarMateriaPorId(2));
//        System.out.println(materiaData.buscarMateriaPorId(3));
//        System.out.println(materiaData.buscarMateriaPorId(4));
//        System.out.println(materiaData.buscarMateriaPorId(5));
//        System.out.println(materiaData.buscarMateriaPorId(15));


    //BUSCAR MATERIAS POR NOMBRE //RESUELTO
       // System.out.println(materiaData.buscarMateriaPorName("Programacion 1"));
    
    //BUSCAR MATERIAS POR AÑO //RESUELTO 
       // System.out.println(    materiaData.buscarMateriaPorAño(2));

    //BUSCAR MATERIAS POR ESTADO //RESUELTO 
       //System.out.println(materiaData.buscarMateriaPorEstado(false));
    //LISTAR TODAS LAS MATERIAS //RESUELTO
       //System.out.println(materiaData.listarMaterias());
    
    //ACTUALIZAR MATERIAS //RESUELTO
    
//    Materias materiaActualizar = new Materias(6,"Administracion de Bases de Datos 2", 1, true);
//    Materias materiaActualizarConError = new Materias(16,"Administracion de Bases de Datos 2", 1, true);
//
//    materiaData.actualizarMateria(materiaActualizar);
    
    //BORRAR MATERIA FISICO (DEL TODO) //NO RESUELTO
    
        //System.out.println(materiaData.borrarMateriaFisico(5));
    
    //ALTA LOGICA MATERIA//RESUELTO
    
    //System.out.println(materiaData.buscarMateriaPorEstado(false));
    
        //materiaData.altaLogicaMateria(materia2);
    
    
    //BAJA LOGICA MATERIA //RESUELTO
        //materiaData.bajaLogicaMateria(materia2);
    }
    
}
