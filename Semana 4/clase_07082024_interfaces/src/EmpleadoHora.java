/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author claudiacortes
 */

//cuando se trabaja con interface,no se utiliza lapalabra extennds, 
// a cambio se utiliza la palabra . implements
// extends -> herencia 
// implments -> asociar a las reglas de la interfaz 
// al mezclar herencia con interfaces, SIEMPRE se debe empezar por la herencia y luego la implementacion de la interfaz
class EmpleadoHora extends Empleado1 implements Empleado{
           private int cantHoras;
           private double tarifa;
           private final String empresa ="UNITEC"; // crear una constante en una clase.

    public EmpleadoHora(int cantHoras, double tarifa, int numTalentohumano, String nombre, String apellido, String puesto) {
        super(numTalentohumano, nombre, apellido, puesto);
        this.cantHoras = cantHoras;
        this.tarifa = tarifa;
    }

        @Override
    public double calcularSueldo() {
        // el empleado por hora tiene un sueldo que se calcula en base a la cantidad de horas trabajadas multiplicado por la tarifa.
        return this.cantHoras * this.tarifa;
    }

    @Override
    public void generarBoletaPago() {
        System.out.println("____________BOLETA DE PAGO____________");
        System.out.println("Empleado: " + nombre + " " + apellido);
        System.out.println("Cargo: " + puesto + " Tipo empleado: HORA");
        System.out.println("Ingreso neto bruto..............lps." + calcularSueldo());
        System.out.println("Deducciones: ................... lps.0");
        System.out.println("TOTAL____________________________lps. " + calcularSueldo());
    }
}
