/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_29072024;

/**
 *
 * @author claudiacortes
 */
public class Hombre extends Humano{
    
    // atributos especificos para el tipo de dato
    String voz;
    double altura;
    
    public Hombre(String nombre, int edad, String colorOjos, String nacionalidad, String Voz, double altura){
        super(nombre,edad,colorOjos,nacionalidad);// Humano(......) 
        this.altura= altura;
        this.voz = voz;
    }
}
