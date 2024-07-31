/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_29072024;

import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_29072024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Herencia*/
//        PADRE; -> una lase a partuir de la cual van a nacer o se van a crear mas clases (la base)
//       hijo/hija -> una clase que va a nacer o se va a crear a partir de un padre (va a adquirir o se va a aparecer a las carateristicas del papa)
          
           
        //Enums
        // TipoDeDato nombre ;
        // TipoDeDato nombre = valorinicial;
        
        Dias diaDeDoy = Dias.VIERNES;
        System.out.println("El simbolo del dia de hoy es; "
        +diaDeDoy.getSimbolo());
      
         /* try- catch */
        try{
            /* codigo que quiza de un exception*/
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int num = entrada.nextInt();
            int res = num*2;
            System.out.println(num);
        }catch(Exception error){
            System.out.println("ups, hay un error "+ error);
        }finally{
            System.out.println("Ejecutandose despues del try o del ");
        }
        
    }
    
}
