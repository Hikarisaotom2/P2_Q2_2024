/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_01082024;

/**
 *
 * @author claudiacortes
 */
public class Bebida extends Producto{
   private double mililitros;

    public Bebida(double mililitros, String nombre, double precio) {
        super(nombre, precio);
        this.mililitros = mililitros;
    }

    public double getMililitros() {
        return mililitros;
    }

    public void setMililitros(double mililitros) {
        this.mililitros = mililitros;
    }
   
    
     @Override
    public String toString() {
        return  super.nombre+" ("+super.precio+")"+mililitros+" ml" ;
    }
    
}
