
package entidades;


public class Inscripcion {
    
    private int idInscripcion = -1;
    private Alumno alumno;
    private Materias materia;
    private Double nota;
    
    public Inscripcion(){
        
    }
    public Inscripcion(Double nota){
        this.nota = nota;
    }
      public Inscripcion(Alumno alumno, Materias materia) {
        this.alumno = alumno;
        this.materia = materia;        
    }

    public Inscripcion(Alumno alumno, Materias materia, Double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
        
    
    public Inscripcion(int idInscripcion, Alumno alumno, Materias materia) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materias materia, Double nota) {
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

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion" + "idInscripcion=" + idInscripcion + ", IDalumno=" + alumno.getIdAlumno() + ", IDmateria=" + materia.getIdMateria() + ", nota=" + nota + '}';
    }
    
    
}
