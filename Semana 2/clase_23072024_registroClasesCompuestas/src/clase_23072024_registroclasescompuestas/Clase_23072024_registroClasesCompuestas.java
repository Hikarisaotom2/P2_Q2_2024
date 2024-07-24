package clase_23072024_registroclasescompuestas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author claudiacortes
 */
public class Clase_23072024_registroClasesCompuestas {

    static ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
    static ArrayList<Seccion> seccion = new ArrayList<Seccion>();
    static ArrayList<Clase_Asistencia> clases = new ArrayList<Clase_Asistencia>();

    public static void main(String[] args) {
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        while (bandera) {
            System.out.println("Menu");
            System.out.println("1.maestros ");
            System.out.println("2. Administrativos");

            int op = entrada.nextInt();
            System.out.println("Ingrese una opcion");
            switch (op) {
                case 1:
                    menuMaestros();
                case 2:
                    menuAdministrativos();
                    break;
                default:
                    bandera = false;
                    System.out.println("saliendo....");
            }
        }
    }

    public static void menuMaestros() {
        boolean bandera = true;
        while (bandera) {
            System.out.println("1. Listar clases");
            System.out.println("2. pasar asistencia");
            System.out.println("3. Registrar asistencia");
            System.out.println("4. Listar asistencias del dia");
        }
    }

    public static void menuAdministrativos() {
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        while (flag) {
            System.out.println("Ingrese una opcion; ");
            System.out.println("0. Salir del programa");
            System.out.println("1. Agregar una seccion");
            System.out.println("2.  Agregar un alumno");
            System.out.println("3. Eliminar a un alumno");
            System.out.println("4. Agregar clases");
//            System.out.println("4. Agregar un alumno a una clase  ");
//            System.out.println("5. Eliminar un alumno de una lista.");
            System.out.println("6.listar secciones");
            System.out.println("7. listar todos los alumnos");
            int op = leer.nextInt();

            switch (op) {
                case 0 -> {
                    flag = false;
                }
                case 1 -> {
                    seccion = agregarseccion(seccion);
                    System.out.println("");
                    break;
                }
                case 2 -> {
                    alumnos = agregaralumnos(alumnos);
                    System.out.println("");
                    break;
                }
                case 3 -> {
                    eliminar(alumnos);
                    System.out.println("");
                }
                case 6 -> {
                    mostrarseccion(seccion);
                    System.out.println("");
                }
                case 7 -> {
                    mostraralumnos(alumnos);
                    System.out.println("");
                }

            }

        }

    }//fin del metodo de menu administrativos
    public static ArrayList<Clase_Asistencia> agregarClase( ArrayList<Clase_Asistencia> clases){
        mostrarseccion(seccion);
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la pos de la seccion a la vinculara la clase: ");
        int pos = entrada.nextInt(); //se deberia validar
        Seccion seccionAgregar = seccion.get(pos);
        Clase_Asistencia clase = new Clase_Asistencia();
        
        clase.setInfo_seccion(seccionAgregar);/*vinculando la seccion con la clase, para utilizar las referencias en el futuro*/
       boolean bandera = true;
        while (bandera) {
            System.out.println("1. Seguir agregando alumnos ");
            System.out.println("2. salir");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1 ->{
                    mostraralumnos(alumnos);
                    System.out.println("ingrese la pos de la seccion a la vinculara la clase: ");
                    int posAlumno = entrada.nextInt(); //se deberia validar
                    Alumnos alumnoAgregar = alumnos.get(posAlumno);
                    /*vinculando el alumno  con la clase, para utilizar las referencias en el futuro*/
                    clase.matricularAlumno(alumnoAgregar);
                }
                case 2 ->{
                    bandera = false;
                }    
            }
        }
        //despues de esta linea, la variable  clase, ya tiene toda la informacion actualizada
        clases.add(clase);
        return clases;
    }
        public static Alumnos crearalumno() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese numero de cuenta: ");
        int cuenta = leer.nextInt();
        System.out.println("INgrese el nombre: ");
        String nombre = leer.nextLine();
        nombre = leer.nextLine();
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

}// fin de la clase 

