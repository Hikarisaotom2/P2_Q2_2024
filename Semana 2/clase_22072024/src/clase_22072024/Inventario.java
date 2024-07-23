/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_22072024;

/**
 *
 * CLASES SIMPLES: una clase donde los atributos son de tipos de datos primitivos 
 * Se utiliza pararepresentar elementos menos complejos. 
 */
public class Inventario {
    //atributos 
    int [] precios;
    String nombre;
    int cantidad;
    double precio;
    //Constructor
   
   
    public Inventario(int[] precios, String nombre) {
        this.precios = precios;
        this.nombre = nombre;
    }
    
     //Mutadores de acceso 

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
