/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_23072024_registroclasescompuestas;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */

/*Clase compuesta*/
public class Docente {
    private int id;
    private String nombre;
    private String password;
    private ArrayList<Clase_Asistencia> clases;

    public Docente(int id, String nombre, String password) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.clases = new ArrayList<>();
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

    public ArrayList<Clase_Asistencia> getSecciones() {
        return clases;
    }

    public void agregarSeccion(Clase_Asistencia seccion) {
        clases.add(seccion);
    }

    public void eliminarSeccion(Seccion seccion) {
        clases.remove(seccion);
    }

    @Override
    public String toString() {
        return "Docente{id=" + id + ", nombre='" + nombre + '\'' + ", secciones=" + clases + '}';
    }
}