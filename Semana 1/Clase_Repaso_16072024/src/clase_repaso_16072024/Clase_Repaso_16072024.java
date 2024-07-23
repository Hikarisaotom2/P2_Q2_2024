/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_repaso_16072024;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
       
       
       /*
       1. clase prijcipal del main 
       2. clase inventario 
        3.clase auto
       4. clase recur
       
       */
       //argumentos 
       /*
       La computadora no hace nada que noostros no le digamos
       */
      JOptionPane.showMessageDialog(null, "este es mi mensaje");
        System.out.println("BUSQUEDA BINARIA");
        int [] arreglo = {1,4,6,7,9};
        int resp = busquedaBinaria(arreglo,7,0,arreglo.length-1);
        System.out.println("la pos en la que esta el numero es: "+resp);
             
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
    
    
    
    /*
    Busq,. Binaria 
    // 4
    // 3,5
    */
    
    /*
    1)debemos tener un arreglo   el numero que vamos a buscar 
    2) dividir el arreglo a la mitad. y comprara el numero a buscar con la mitad
        1. creando un arreglo mas pequeno [1,2,3,4,5] -> [1,2,3] [4,5]
        2. trabajar con dos indices o dos pos: inicio del arreglo temporal o final del arreglo temporal. 
    3) si el numero es mas grande que la mitad, seguimos buscando en el lado derecho, sino, en el lado izq
    4) regresar al punto #2 hasta que encontremos el numero o lleguemos al final del arreglo
    */
    
    
    public static int busquedaBinaria(int [] numeros, int num, int inicial, int fin){
        /*
            1. Caso Base; nos ayuda a deterner el ciclo 
        */
         int posMitad=  (inicial+fin)/2;
        if (fin<inicial) {
            return -1; 
        }
        /*2. Caso Recursivo: nos ayuda a seguirgenerando el ciclo*/
        if(num<numeros[posMitad]){ // debemos seguir buscando en la izq
            // parte izq: inicio.....mitad       valores de inicioy fin de la mitad izq
            return busquedaBinaria(numeros,num,inicial,posMitad-1);
            
        } else if (num>numeros[posMitad]){ // debemos seguir buscando en la derecha
             // parte derecha: mitad.....final 
             return busquedaBinaria(numeros,num,posMitad+1,fin);
            
        }else{ //el numero es igual al valor que esta en la mitad 
            return posMitad;
        }
        
    }
    
    
    

    
}
