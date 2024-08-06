/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_05082024;

/**
 *
 * @author claudiacortes
 */
public class Animal {
    boolean tieneCola;
    int cantidadPatas;

    public Animal(boolean tieneCola, int cantidadPatas) {
        this.tieneCola = tieneCola;
        this.cantidadPatas = cantidadPatas;
    }

    public boolean isTieneCola() {
        return tieneCola;
    }

    public void setTieneCola(boolean tieneCola) {
        this.tieneCola = tieneCola;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }
    
    public void hacerSonido(){
        System.out.println("No hace nada");
    }

    @Override
    public String toString() {
        return "Animal{" + "tieneCola=" + tieneCola + ", cantidadPatas=" + cantidadPatas + '}';
    }
   
}
