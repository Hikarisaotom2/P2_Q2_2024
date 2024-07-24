/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase23.pkg07.pkg2024;

/**
 *
 * @author arobo
 */
public class Alumnos {
    
    private int cuenta;
   private String nombre;
   private int asistencia;

    public Alumnos(int cuenta, String nombre, int asistencia) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.asistencia = asistencia;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "cuenta=" + cuenta + ", nombre=" + nombre + ", asistencia=" + asistencia + '}';
    }
   
}
