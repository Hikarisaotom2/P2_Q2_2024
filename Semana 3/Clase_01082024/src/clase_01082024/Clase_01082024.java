/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_01082024;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author claudiacortes
 */
public class Clase_01082024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList <Producto> inventario = new ArrayList<Producto>();
        inventario.add(new Comida(false,"Papas",20.50));
        inventario.add(new Comida(false,"Baleada",50.70));
        inventario.add(new Bebida(100,"Coca cola",25));
        while (true) {
            System.out.println("menu");
            System.out.println("1 agregar bebida");
            System.out.println("2 agregar comida");
            System.out.println("3 modificar producto");
            System.out.println("5 lISTAR productos");
            int op = entrada.nextInt();
            switch (op) {
                case 1 ->
                {
                 Bebida nuevaBebida= agregarBebida();
                 inventario.add(nuevaBebida);
                }
                case 2 ->{
                Comida nuevaComida = agregarComida();
                inventario.add(nuevaComida);
                }
                case 5 ->{
                    mostrarProductos(inventario);
                }
                default ->{
                    break;
                }
            }
        }
    }
    
    public static void mostrarProductos(ArrayList<Producto> productos){
        String acumulador="";
        System.out.println("_______COMIDAS_______");
        for (Producto producto : productos) {
            if(producto instanceof Comida){
                acumulador += producto.toString()+"\n";
                System.out.println(producto);
            }
        }
        System.out.println("_______BEBIDAS_______");
           for (Producto producto : productos) {
            if(producto instanceof Bebida){
                System.out.println(producto);
            }
        }
//        for (int i = 0; i < productos.size(); i++) {
//            Producto producto = productos.get(i);
//        }
        
    }
    public static ArrayList<Producto> modificarProducto(ArrayList<Producto> productos) {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
        System.out.println("ingrese que posicion desea modificar: ");
        Scanner entrada = new Scanner(System.in);
        int pos = entrada.nextInt();
        Producto productoModificar = productos.get(pos);
        if (productoModificar instanceof Comida) {
            System.out.println("Ingrese el nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el precio");
            double precio = entrada.nextDouble();
            System.out.println("Esta vencido o no 1 si 2 no");
            int exp = entrada.nextInt();
            boolean vencido = exp == 1;
            productoModificar.setNombre(nombre);
            productoModificar.setPrecio(precio);
            // Casteo -> con explicita de datos
            //String -> int Integer.parseInt("123")
            //(Tipo al que vamos a convertir)objeto que vamos a convertir;
//            Comida comidatemp = (Comida)productoModificar;
//            comidatemp.setVencimiento(vencido);
            ((Comida) productoModificar).setVencimiento(vencido);
        } else if (productoModificar instanceof Bebida) {
            System.out.println("Ingrese el nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el precio");
            double precio = entrada.nextDouble();
            System.out.println("Ingrese los ml de la bebida");
            double mililitros = entrada.nextDouble();
              productoModificar.setNombre(nombre);
            productoModificar.setPrecio(precio);
            ((Bebida) productoModificar).setMililitros(mililitros);
        }
        return productos;
    }
    public static Comida agregarComida(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el precio");
        double precio = entrada.nextDouble();
        System.out.println("Esta vencido o no 1 si 2 no");
        int exp = entrada.nextInt();
        boolean vencido = exp==1; // si exp es uno, el resultado es true
        Comida comida = new Comida(vencido,nombre,precio);  
        return comida;
    }
    
    public static Bebida agregarBebida(){
         Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el precio");
        double precio = entrada.nextDouble();
        System.out.println("Ingrese los ml de la bebida");
        double mililitros = entrada.nextDouble();
        Bebida bebida = new Bebida(mililitros,nombre,precio);
        return bebida;
    }
    
}
