package sistemaregistro;

import java.util.ArrayList;

/**
 *
 * @author Elias
 */
public class Seccion {
    private int id;
    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Seccion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
    }

    @Override
    public String toString() {
        return "Seccion{id=" + id + ", nombre='" + nombre + '\'' + ", alumnos=" + alumnos + '}';
    }
}