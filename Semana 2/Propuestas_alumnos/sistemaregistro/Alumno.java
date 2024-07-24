package sistemaregistro;

/**
 *
 * @author Elias
 */
public class Alumno {
    private int id;
    private String nombre;

    public Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{id=" + id + ", nombre='" + nombre + '\'' + '}';
    }
}