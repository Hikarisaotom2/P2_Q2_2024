/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_23072024_registroclasescompuestas;

/**
 *
 * @author claudiacortes
 */
/*Clase Simple*/
public class Seccion {
    private String campus;
    private int numseccion;
    private int codigoclase;
    private int hora;
    

    public Seccion(String campus, int numseccion, int codigoclase, int hora) {
        this.campus = campus;
        this.numseccion = numseccion;
        this.codigoclase = codigoclase;
        this.hora = hora;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public int getNumseccion() {
        return numseccion;
    }

    public void setNumseccion(int numseccion) {
        this.numseccion = numseccion;
    }

    public int getCodigoclase() {
        return codigoclase;
    }

    public void setCodigoclase(int codigoclase) {
        this.codigoclase = codigoclase;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Seccion{" + "campus=" + campus + ", numseccion=" + numseccion + ", codigoclase=" + codigoclase + ", hora=" + hora + '}';
    }
    
    
}