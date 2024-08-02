/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_01082024;

/**
 *
 * @author claudiacortes
 */
public class Comida extends Producto{
     private boolean vencimiento;
    public Comida(boolean vencimiento, String nombre, double precio) {
        super(nombre, precio);// llamando al constructor de la clase padre
        this.vencimiento = vencimiento;
    }

    public boolean isVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(boolean vencimiento) {
        this.vencimiento = vencimiento;
    }

    @Override
    public String toString() {
        return  super.nombre+" ("+super.precio+")"+vencimiento ;
    }
    
     
}
