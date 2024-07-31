/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package clase_29072024;

/**
 *
 * @author claudiacortes
 */
public enum Dias {
    /*Se comporta como un objeto*/
    LUNES("L"), // new Dias("L")
    MARTES("M"), //New Dias("M")
    MIERCOLES("X"),
    JUEVES("J"),
    VIERNES("V");
    
    private String simbolo;
    
    private Dias (String simbolo){
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
    
}
