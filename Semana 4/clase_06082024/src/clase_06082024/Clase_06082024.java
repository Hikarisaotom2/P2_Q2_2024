package clase_06082024;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_06082024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Polimorfismo
    1. Sobreescritura simple 
        -> el metodo polimorfico que vamos a sobreescribir, debe teer la misma estructira que el padre
        -> El hijo puede o no decidir si implementar el polimorfismo. 
    2. Clases abstractas 

    3. Interfaces
    */
        /*
         MINI SISTEMA DE PAGOS DE RRHH
        1) listar empleados creados en el sistema (precargados)
        2) Calcular los sueldos del mes de cada empleado
        3) Generar boleta de pago para cada empleado. 
        
        
        NOTAS: 
        
        1) Se tienen dos tipos de empleados (Todos los empleados tiene un id de rh,  nombre, apellido y puesto):
            1) Empleados por hora: cantidad de horas trabajadas por mes y tarifa por hora. 
            2) Empleado permanente: sueldo mensual. 
        2) Se tiene en consideracion las siguientes deducciones:
            1) IHSS: 500 lps. 
            2) RAP: 300 lps. 
            3) AFP: 300 lps. 
            4) ISR: 5 %
            Estas deducciones aplican unicamente a los empleados permanentes, el empleado por hora no posee ningun tipo de deducciones.
        
        */
        //int cantHoras, double tarifa, int numTalentohumano, String nombre, String apellido, String puesto
        ArrayList <Empleado> recursosHumano = new   ArrayList <Empleado>();
        EmpleadoHora josue =  new EmpleadoHora(160,500,1234,"Josue","Rivera","Programador-Consultor");
        recursosHumano.add(josue);
        EmpleadoPermanente alvaro = new EmpleadoPermanente(40500,1235,"Alvaro","Reyes","Abogado");
        recursosHumano.add(alvaro);
        EmpleadoHora angel =  new EmpleadoHora(70,550.0,1236,"Angel","Gomez","Programador BDD");
        recursosHumano.add(angel);
        EmpleadoPermanente claudia = new EmpleadoPermanente(25000,1236,"Claudia","Cortes","Jefa de programacion");
        recursosHumano.add(claudia);
        
        listarEmpleados(recursosHumano);
        calcularSueldos(recursosHumano);
        mostrarBoletasPago(recursosHumano);
    }
    
    
    public static void listarEmpleados(ArrayList <Empleado> recursosHumano){
        System.out.println("______________EMPLEADOS______________");
        for (Empleado empleado : recursosHumano) {
            System.out.println(empleado);
        }
        System.out.println("______________FIN EMPLEADOS______________");
    }
    
    public static void calcularSueldos(ArrayList <Empleado> recursosHumano){
        for (Empleado empleado : recursosHumano) {
            System.out.println("El sueldo Agosto de : "+empleado.getNombre()+" -> "+empleado.calcularSueldo());
        }
    }
    
     public static void mostrarBoletasPago(ArrayList <Empleado> recursosHumano){
        for (Empleado empleado : recursosHumano) {
            empleado.generarBoletaPago();
        }
    }
    
}// fin de la clase
