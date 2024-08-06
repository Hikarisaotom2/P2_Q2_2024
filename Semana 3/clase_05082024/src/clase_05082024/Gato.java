/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_05082024;

/**
 *
 * @author claudiacortes
 */
public class Gato extends Animal{

    public Gato(boolean tieneCola, int cantidadPatas) {
        super(tieneCola, cantidadPatas);
    }
    
    @Override
     public void hacerSonido(){
         super.hacerSonido();
         System.out.println("miau miau");
         System.out.println("Lllamando al metodo del papa dentro del gato");
     }
     
     @Override
     public int getCantidadPatas() {
         return 8;
     }
     
     
    
}
