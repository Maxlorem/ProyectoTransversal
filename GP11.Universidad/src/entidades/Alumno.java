package entidades;


import java.time.LocalDate;


public class Alumno {
    
    private int idAlumno = -1;
    private long dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    private boolean estado;
    
    public Alumno(){}

    public Alumno(long dni, String apellido, String nombre, LocalDate fechaNac, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }

    public Alumno(int idAlumno,long dni ,String apellido, String nombre, LocalDate fechaNac, boolean estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
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
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", activo=" + estado + '}';
    }
    
    
    
            
    
}
