/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author claudiacortes
 */
public class Empleado1 {
    protected int numTalentohumano = 123;
    protected String nombre = "";
    protected String apellido ="";
    protected String puesto ="";

        public Empleado1(int numTalentohumano, String nombre, String apellido, String puesto) {
        this.numTalentohumano = numTalentohumano;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
    }

    public int getNumTalentohumano() {
        return numTalentohumano;
    }

    public void setNumTalentohumano(int numTalentohumano) {
        this.numTalentohumano = numTalentohumano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado1{" + "numTalentohumano=" + numTalentohumano + ", nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto + '}';
    }
    
    
    
}
