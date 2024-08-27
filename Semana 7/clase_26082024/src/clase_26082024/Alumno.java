/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_26082024;

/**
 *
 * @author claudiacortes
 */
public class Alumno extends Usuario{
    String Carrera;

    public Alumno(String Carrera, int id, String nombre) {
        super(id, nombre);
        this.Carrera = Carrera;
    }
    
    
}
