package entidades;


import java.time.LocalDate;


public class Alumno {
    
    private int idAlumno ;
    private long dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private boolean estado;
    
    public Alumno(){}

    public Alumno(long dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }


   

    public Alumno(int idAlumno, long dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {

        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNacimiento;
    }

    public void setFechaNac(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNac=" + fechaNacimiento + ", activo=" + estado + '}';
    }
    
    
    
            
    
}
