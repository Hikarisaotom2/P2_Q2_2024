/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_repaso_16072024;


/**
 *
 * @author claudiacortes
 */
public class prueba {
   
    /*
    Partes de una clase; 
    1)Atributos 
    2)Constructor 
    3) Mutadortes de acceso ( get/set)
    */
    
    
    /*
        Tipos de acceso: 
        1. public
        2. private 
    */
    
    //atributos
    public int contador;
    public String cadena;
    private String contrasena;
    private int numeroCuenta;
    
    /* constructor: SIEMPRE se llama igual que la clase
    Es un metodo comun y corriente */

    public prueba(int contador, String cadena) {
        this.contador = contador;
        this.cadena = cadena;
        if (this.contador<=0) {
            System.out.println("contador menor a 0");
        }
        this.contrasena = "123";
    }
   
    
    //mutadores de acceso.
        void setContrasena(String contrasena,int pinConfirmacion){
        if(pinConfirmacion==1234){
            this.contrasena = contrasena;
        }
    }

    
    String getContrasena(){
        return this.contrasena;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
   
    
    
    public String imprimir1(){
        return "hola";
    }
    
      public String imprimir2(){
        return "hola 2 ";
    }

    @Override
    public String toString() {
        return "contador=" + contador + ", cadena=" + cadena;
    }
    
    
    
    
}
