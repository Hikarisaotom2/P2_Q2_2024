/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author claudiacortes
 */
public interface Empleado {
    //No nos funciona que estos atributos esten qui, por que son constantes, entonces no los podemos actualizar
//    final int numTalentohumano = 123;
//    String nombre = "";
//    String apellido ="";
//    String puesto ="";
    
    public  void generarBoletaPago(); // el uso del abstract dentro de las interface es opcional
    public abstract double calcularSueldo();
    
}
