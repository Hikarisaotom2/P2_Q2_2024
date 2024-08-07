/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_06082024;

/**
 *
 * @author claudiacortes
 */
public class Empleado {
    protected int numTalentohumano;
    protected String nombre;
    protected String apellido;
    protected String puesto;

    public Empleado(int numTalentohumano, String nombre, String apellido, String puesto) {
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
    
    /*Metodos*/
    
    // calcular el sueldo de cada empleado 
    public double calcularSueldo(){
        return 0;
    }
    // generar la boleta de pago para cada empleado. 
    public void generarBoletaPago(){}

    @Override
    public String toString() {
        return  nombre + " " + apellido + "(" + puesto + ')';
    }
    
    
}
