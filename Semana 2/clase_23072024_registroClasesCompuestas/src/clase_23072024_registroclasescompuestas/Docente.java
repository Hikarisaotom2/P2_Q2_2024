/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_23072024_registroclasescompuestas;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */

/*Clase compuesta*/
public class Docente {
    private int id;
    private String nombre;
    private String password;
    private ArrayList<Clase_Asistencia> clases = new ArrayList<Clase_Asistencia>();

    public Docente(int id, String nombre, String password, ArrayList<Clase_Asistencia> clases) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.clases = clases;
    }

    public Docente() {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.clases = clases;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Clase_Asistencia> getClases() {
        return clases;
    }
    
    public void DarleClases(Clase_Asistencia clases) {
        this.clases.add(clases);
    }
    
    //Objetos - > tipo de datos por referencia
    
    //Cajas de seguridad; 
    // Variable_Con-objeto-> direccion-> objeto
    
    /*                     //direccion= hjhjgd66 , hascode = 5678
    Alumno variable1 = new Alumno(1234,"Claudia cortes",0);
    Alumno variable2 = variable1;
    variable2.setNombre("Patricia"); id = 1234, nombre = Patricia, asistencias = 0
    sout(variable1.getNombre()); //Patricia
    
    
    Alumno variable1 = direccion= hjhjgd66 , hascode = 5678
    Alumno variable2 = direccion= hjhjgd66 , hascode = 5678
    
    variable2.setNombre("Patricia")
    variable1.getNombre()//Patricia 
    
    */
    /*
    cada vez que hacemos new, creamos un nuevo objeto, 
    por cada vez que se crea un nuevo objeto, java les da un numero de identidad
    */
}