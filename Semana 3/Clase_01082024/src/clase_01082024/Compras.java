/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_01082024;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
public class Compras {
    private double total;
    private ArrayList<Producto> listaCompras;

    public Compras(double total) {
        this.total = total;
        this.listaCompras = new ArrayList<Producto>();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Producto> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(ArrayList<Producto> listaCompras) {
        this.listaCompras = listaCompras;
    }
    
    
}
