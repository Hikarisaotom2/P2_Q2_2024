/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_05082024;

/**
 *
 * @author claudiacortes
 */
public class Perro extends Animal{

    public Perro(boolean tieneCola, int cantidadPatas) {
        super(tieneCola, cantidadPatas);
    }
    
       @Override
     public void hacerSonido(){
         System.out.println("guau guau");
     }
}
