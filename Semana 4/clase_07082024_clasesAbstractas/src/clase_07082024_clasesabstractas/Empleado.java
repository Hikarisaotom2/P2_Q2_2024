/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_07082024_clasesabstractas;

/**
 *
 * @author claudiacortes
 */

//Las clases abstractas NO se pueden instanciar
// no podemos crear objetos de esta clase. 
// El hecho de que no podamos instanciar la clase,no afecta a la herencia. 
public abstract class Empleado {
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
    
   //metodo abstracto: es un metodo que no posee cuerpo. 
    public abstract void generarBoletaPago();
    public abstract double calcularSueldo();

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
        return  nombre + " " + apellido + "(" + puesto + ')';
    }

}
