/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_05082024;

/**
 *
 * @author claudiacortes
 */
public class Clase_05082024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal(false,2);
        Gato muffin = new Gato(true,4);
        Perro brownie = new Perro(true,4);
        Pollito pio = new Pollito(false,2);
        Zorro fox = new Zorro(true,4);
        
        System.out.println("El animal hace ");
        animal.hacerSonido();
        
        System.out.println("El gato hace");
        muffin.hacerSonido();
        
        System.out.println("El perro hace ");
        brownie.hacerSonido();
        
        System.out.println("El pollito hace ");
        pio.hacerSonido();
        
        System.out.println("El zorro hace ");
        fox.hacerSonido();
        
        // ArrayList<Object> = animales, gatos, perros, Usuarios, Personas, Juegos, ArrayList<Object>
        
         
    }
    
}
