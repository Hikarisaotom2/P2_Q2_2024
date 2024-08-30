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

    public Alumno(int id, String nombre,String Carrera) {
        super(id, nombre);
        this.Carrera = Carrera;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    

    @Override
    public String toString() {
        return  this.nombre+ "("+this.Carrera+")";
    }
    
    
}
