/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_26082024;

/**
 *
 * @author claudiacortes
 */
public class Docente extends Usuario {

    String Facultad;

    public Docente(int id, String nombre, String Facultad) {
        super(id, nombre);
    }

    @Override
    public String toString() {
        return this.Facultad+"-"+this.nombre;
    }

}
