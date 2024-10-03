
package entidades;


public class Materias {
    
    private int idMateria = -1;
    private String nombre;
    private int anioMateria;
    private boolean estado;
    
    public Materias(){
    
    }

    public Materias(int idMateria,String nombre, int anioMateria) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
    }
    
    public Materias(String nombre, int anioMateria, boolean activo) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.estado = activo;
    }

    public Materias(int idMateria, String nombre, int anioMateria, boolean activo) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.estado = activo;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Materias{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", anioMateria=" + anioMateria + ", activo=" + estado + '}';
    }
    
}
