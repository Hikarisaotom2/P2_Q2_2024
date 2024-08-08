/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_06082024;

/**
 *
 * @author claudiacortes
 */
public class EmpleadoPermanente extends Empleado{
   private double sueldoMensual;
    public EmpleadoPermanente(double sueldoMensual, int numTalentohumano, String nombre, String apellido, String puesto) {
        super(numTalentohumano, nombre, apellido, puesto);
        this.sueldoMensual = sueldoMensual;
    }
   
    @Override
    public double calcularSueldo(){
        // No se debe hacer ningun calculo, por que el sueldo ya esta fijado.
        return this.sueldoMensual;
    }
          @Override 
      public void generarBoletaPago(){
//             1) IHSS: 500 lps. 
//            2) RAP: 300 lps. 
//            3) AFP: 300 lps. 
//            4) ISR: 5 %
         double sueldo = calcularSueldo();
         double ISR = sueldo*0.05;
         double totalDeducciones = 500+300+300+ISR;
         System.out.println("____________BOLETA DE PAGO____________");
         System.out.println("Empleado: "+nombre+" "+apellido);
         System.out.println("Cargo: "+puesto +" Tipo empleado: PERMANENTE");
         System.out.println("Ingreso neto bruto..............lps."+sueldo);
         System.out.println("Deducciones: ...........................");
         System.out.println("           -> IHSS:................LPS. 500");
         System.out.println("           -> RAP:................LPS. 300");
         System.out.println("           -> AFP:................LPS. 300");
         System.out.println("           -> ISR:................LPS."+ISR);
          System.out.println("TOTAL DEDUCCIONES: ..............LPS. "+totalDeducciones);
         System.out.println("TOTAL____________________________lps. "+(sueldo-totalDeducciones));
      }
}
