
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
   //materiaData.guardarMateria(materia2);
   //materiaData.guardarMateria(materia3);
   //materiaData.guardarMateria(materia4);
   //materiaData.guardarMateria(materia5);
   //materiaData.guardarMateria(materia6);



//BUSCAR MATERIAS POR ID

        //System.out.println(materiaData.buscarMateriaPorId(3));
        //System.out.println(materiaData.buscarMateriaPorId(1));

//BUSQUEDA COMPLETA

        //System.out.println(materiaData.listarMaterias());
        
//ACTUALIZAR MATERIAS
       Materias materia10 = new Materias(1, "Programación 2", 1, true);
       materiaData.actualizarMateria(materia10);

}
}
