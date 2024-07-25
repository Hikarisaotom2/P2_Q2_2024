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
   String nombre; 
   Seccion info_seccion;
   ArrayList<Alumnos> lista_alumnos = new ArrayList<Alumnos>();

            /*Sobrecarga de metodos
            Crear varios metodos,
            que tienen un funcionamiento similar, que se laman igual pero que se diferencian por los parametros
            */
            
            /*
            EJEMPLOS
            deposito (
            identificiacion 
            numero de cuenta 
            cantidad ) = el resultado es que depositaron dinero
            
            NOMBRE DE LAS PERSONAS 
            
            CLAUDIA PATRICIA CORTES  PAVON 
            CLAUDIA maria perez  nunez 
            
            JOSUE andres RIVERA reyes 080120041234
            JOSUE andres RIVERA reyes 080119901111
            
            ALVARO roberto  REYES claros
            ALVARO juan REYES claros
            
             deposito(
            string DNI 
            int numero de cuenta 
            double cantidad ){
             CUAL SU NOMBRE 
            REVISAN LA IDENTIDAD 
            DEPOSITAN
            }
            
              deposito(
            int Pasaporte 
            int numero de cuenta 
            double cantidad ){
            CUAL SU NOMBRE 
            CUAL ES LA NACIONALIDAD
            CUAL ES EL MOTIVO DEL DEPOSITO 
            .......
            DEPOSITAR
            
            }
            //DEPOSITO EN LINEA 
            // BAC A BAC 
               deposito(
            int numero de cuenta 
            double cantidad ){
            EL NMERO DE IDENTIDAD DE QUIEN DEPOSITA ES ESTE POR QUE ESTA CON SESION INICIADA
            DEPOSITAR
            
            }
            */
    public Clase_Asistencia() {
    }

    public Clase_Asistencia(Seccion info_seccion, ArrayList<Alumnos> lista_alumnos, String nombre ){
        this.info_seccion = info_seccion;
        this.lista_alumnos= lista_alumnos;
        this.contador= 0;
        this.nombre = nombre;
    } 
      public Clase_Asistencia(Seccion info_seccion, ArrayList<Alumnos> lista_alumnos){
        this.info_seccion = info_seccion;
        this.lista_alumnos= lista_alumnos;
        this.contador= 0;
        this.nombre = "clase Sorpresa";
    }
      // aunque el contenido y los parametros sean los mismos, como vienen en diferente orden, java los considera como metodos diferentes
//        public Clase_Asistencia(ArrayList<Alumnos> lista_alumnos, Seccion info_seccion){
//        this.info_seccion = info_seccion;
//        this.lista_alumnos= lista_alumnos;
//        this.contador= 0;
//        this.nombre = "clase Sorpresa";
//    }
    
    


    public String getNombre() {
        return nombre;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    /*sobrecarga -> constructor*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Seccion getInfo_seccion() {
        return info_seccion;
    }

    public void setInfo_seccion(Seccion info_seccion) {
        this.info_seccion = info_seccion;
    }

    public ArrayList<Alumnos> getListaAlumnos() {
            return lista_alumnos;
        }
//    public void setLista_alumnos(ArrayList<Alumnos> lista_alumnos) {
//        this.lista_alumnos = lista_alumnos;
//    }
    public void matricularAlumno (Alumnos NuevoAlumno){
        this.lista_alumnos.add(NuevoAlumno); 
    }
    
}
