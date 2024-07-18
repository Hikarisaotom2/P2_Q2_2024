/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_repaso_16072024;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Clase_Repaso_16072024 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        1)Secuencial
        2)Decisiocnes 
        3) Ciclicca, repticion 
        */
       
       //argumentos 
       /*
       La computadora no hace nada que noostros no le digamos
       */
       int x= metodo_ejemplo(4,5);
       
       prueba test = new prueba(90,"Hola mundo");
               
       ArrayList <prueba> arr = new ArrayList<prueba>();
       
       
       arr.add(test);
       
        System.out.println(arr);
             
    }
    
    
    /*Metodos*/
    /*Los metodos pueden retornar cualquier tipo de dato valido para java*/
    /*
        snake_case
        kebab-case
        camelCase
        PascalCase
    */
    public static  int metodo_ejemplo(int num1, int num2){
        int resp = num1+num2;
        return num1+num2;
    }
    
    
    /*
        Clase -> programcion orientada a objetos 
        // clase = molde de la galleta 
        // objeto = galleta 
        clase != objeto
    clase-> instanciacion . -> objeto 
   
    */
    
    
    
    /*
    Recursion: que es un ciclo
    -> debe deternese en algun momento 
    -> debetener una manera para seguir repitiendo, 
    esto es gracias a la evaluacion(la condicion) que se hace. 
    partes de la recursion: 
    1) el caso base: nos ayuda a saber cuando se detiene el ciclo
    2) el caso recursivo: nos ayuda a seguir repitiendo. 
    
    1) traten de ver el roblema como un ciclo normal. 
    2) buscar los ptrones, 
    
    
    */
    

    
}
