
package entidades;


public class Inscripcion {
    
    private int idInscripcion = -1;
    private Alumno alumno;
    private Materias materia;
    private double nota;
    
    public Inscripcion(){
        
    }
    public Inscripcion(double nota){
        this.nota = nota;
    }
      public Inscripcion(Alumno alumno, Materias materia) {
        this.alumno = alumno;
        this.materia = materia;        
    }

    public Inscripcion(Alumno alumno, Materias materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
        
    
    public Inscripcion(int idInscripcion, Alumno alumno, Materias materia) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materias materia, double nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}
