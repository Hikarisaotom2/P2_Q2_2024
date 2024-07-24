/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase23.pkg07.pkg2024;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arobo
 */
public class Clase23072024 {

    /**
     * @param args the command line arguments
     */
    static ArrayList alumnos = new ArrayList<Alumnos>();
    static ArrayList seccion = new ArrayList<Seccion>();

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        boolean flag = true;
        while (true) {
            System.out.println("Ingrese una opcion; ");
            System.out.println("0. Salir del programa");
            System.out.println("1.Agregar una seccion");
            System.out.println("2.  Agregar un alumno");
            System.out.println("3. Eliminar a un alumno");
            System.out.println("4. Agregar un alumno a una clase  ");
            System.out.println("5. Eliminar un alumno de una lista.");
            System.out.println("6.listar secciones");
            System.out.println("7. listar todos los alumnos");
            int op = leer.nextInt();
            
            switch(op){
                case 0->{
                    flag = false;
                    
                }
                case 1 ->{
                    seccion=agregarseccion(seccion);
                    System.out.println("");
                    break;
                }
                case 2->{
                    alumnos=agregaralumnos(alumnos);
                    System.out.println("");
                    break;
                }
                case 3->{
                    eliminar(alumnos);
                    System.out.println("");
                }
                case 6->{
                    mostrarseccion(seccion);
                    System.out.println("");
                }
                case 7 ->{
                mostraralumnos(alumnos);
                    System.out.println("");
                }
                    
            }

        }

    }

    public static Alumnos crearalumno() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese numero de cuenta: ");
        int cuenta = leer.nextInt();
        System.out.println("INgrese el nombre: ");
        String nombre = leer.nextLine();
        nombre=leer.nextLine();
        System.out.println("Ingrese la cantidad de asistencias:");
        int asistencia = leer.nextInt();

        Alumnos listaalumnos = new Alumnos(cuenta, nombre, asistencia);

        return listaalumnos;

    }

    public static ArrayList<Alumnos> agregaralumnos(ArrayList<Alumnos> listaAlumnos) {
        Alumnos nuevo = crearalumno();
        listaAlumnos.add(nuevo);
        return listaAlumnos;

    }
    //private String campus;
    // private int numseccion;
    // private int codigoclase;
    //private int hora;

    public static Seccion crearseccion() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el campus: ");
        String campus = leer.nextLine();
        System.out.println("INgrese el numero de seccion: ");
        int numseccion = leer.nextInt();
        System.out.println("Ingrese el codigo de clase:");
        int codigoclase = leer.nextInt();
        System.out.println("Ingrese la hora de la clase");
        int hora = leer.nextInt();

        Seccion listaseccion = new Seccion(campus, numseccion, codigoclase, hora);

        return listaseccion;

    }

    public static ArrayList<Seccion> agregarseccion(ArrayList<Seccion> listaSeccion) {
        Seccion nuevo = crearseccion();
        listaSeccion.add(nuevo);
        return listaSeccion;

    }

    public static void mostraralumnos(ArrayList<Alumnos> listaAlumnos) {
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(i + ")" + listaAlumnos.get(i));
        }
    }

    public static void mostrarseccion(ArrayList<Seccion> listaSeccion) {
        for (int i = 0; i < listaSeccion.size(); i++) {
            System.out.println(i + ")" + listaSeccion.get(i));
        }
    }
    
    public static ArrayList<Alumnos> eliminar(ArrayList<Alumnos> listaAlumnos) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno que eliminara: ");
        String nombre = leer.nextLine();
        for (int i = 0; i < listaAlumnos.size(); i++) {
            String Nombre = listaAlumnos.get(i).getNombre();
            if (Nombre.equalsIgnoreCase(nombre)) {
                listaAlumnos.remove(i);
                System.out.println("Se ha eliminado el alumno elegido");
                break;

            } else {
                System.out.println("No se encontro nada / el alumno ha sido eliminado");
            }
        }
        return listaAlumnos;
    }

}
