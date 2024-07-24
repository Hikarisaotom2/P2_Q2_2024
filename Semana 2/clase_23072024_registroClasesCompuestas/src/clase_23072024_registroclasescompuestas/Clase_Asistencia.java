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
public class Clase_Asistencia {
   int contador;
   Seccion info_seccion;
   ArrayList<Alumnos> lista_alumnos = new ArrayList<Alumnos>();

    public Clase_Asistencia() {}
   
   /*sobrecarga -> constructor*/

    public Seccion getInfo_seccion() {
        return info_seccion;
    }

    public void setInfo_seccion(Seccion info_seccion) {
        this.info_seccion = info_seccion;
    }

    public ArrayList<Alumnos> getLista_alumnos() {
        return lista_alumnos;
    }

//    public void setLista_alumnos(ArrayList<Alumnos> lista_alumnos) {
//        this.lista_alumnos = lista_alumnos;
//    }
    
    public void matricularAlumno (Alumnos NuevoAlumno){
        this.lista_alumnos.add(NuevoAlumno); 
    }
    
}
