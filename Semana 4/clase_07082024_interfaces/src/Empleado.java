/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author claudiacortes
 */
public interface Empleado {
    int numTalentohumano = 123;
    String nombre = "";
    String apellido ="";
    String puesto ="";
    
    public  void generarBoletaPago(); // el uso del abstract dentro de las interface es opcional
    public abstract double calcularSueldo();
    
}
