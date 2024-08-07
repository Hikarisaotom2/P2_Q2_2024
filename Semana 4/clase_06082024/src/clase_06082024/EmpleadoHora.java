/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_06082024;

/**
 *
 * @author claudiacortes
 */
public class EmpleadoHora extends Empleado{
    private int cantHoras;
    private double tarifa;

    public EmpleadoHora(int cantHoras, double tarifa, int numTalentohumano, String nombre, String apellido, String puesto) {
        super(numTalentohumano, nombre, apellido, puesto);
        this.cantHoras = cantHoras;
        this.tarifa = tarifa;
    }
    
    @Override
     public double calcularSueldo(){
         // el empleado por hora tiene un sueldo que se calcula en base a la cantidad de horas trabajadas multiplicado por la tarifa.
       return this.cantHoras * this.tarifa;  
     }
     
     @Override 
      public void generarBoletaPago(){
         System.out.println("____________BOLETA DE PAGO____________");
         System.out.println("Empleado: "+nombre+" "+apellido);
         System.out.println("Cargo: "+puesto +" Tipo empleado: HORA");
         System.out.println("Ingreso neto bruto..............lps."+ calcularSueldo());
         System.out.println("Deducciones: ................... lps.0");
         System.out.println("TOTAL____________________________lps. "+calcularSueldo());
      }
    
}
