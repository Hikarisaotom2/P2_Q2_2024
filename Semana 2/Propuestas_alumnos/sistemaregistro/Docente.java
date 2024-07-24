package sistemaregistro;

import java.util.ArrayList;

/**
 *
 * @author Elias
 */
public class Docente {
    private int id;
    private String nombre;
    private String password;
    private ArrayList<Seccion> secciones;

    public Docente(int id, String nombre, String password) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.secciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean verificarPassword(String password) {
        return this.password.equals(password);
    }

    public ArrayList<Seccion> getSecciones() {
        return secciones;
    }

    public void agregarSeccion(Seccion seccion) {
        secciones.add(seccion);
    }

    public void eliminarSeccion(Seccion seccion) {
        secciones.remove(seccion);
    }

    @Override
    public String toString() {
        return "Docente{id=" + id + ", nombre='" + nombre + '\'' + ", secciones=" + secciones + '}';
    }
}
