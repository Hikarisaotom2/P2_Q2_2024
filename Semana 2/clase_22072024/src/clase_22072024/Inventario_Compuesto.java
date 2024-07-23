/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_22072024;

import java.util.ArrayList;

/**
 *
 * Clase Compuesta: se caracteriza por que uno o mas de sus atributos, son un objeto. 
 * Se trata de divir los atributos lo mas que se pueda, hasta llegar a atributos atomicos (que no se pueden dividir)
 */
public class Inventario_Compuesto {
    
    /*
    
    Entra el juego el diseño
    
    El programador es quien decide si la clase va a ser simple o compuesta. 
        -> El contexto del problema. 
        -> Como se quiere que el sistema represente el elemento. 
    */
    String nombre; 
//    Producto producto;
    ArrayList<Producto> productos;
    
}


/*
-> Trabajo para clase todos juntos. 
->opciones para el docente: 
el docente va a poder hacer log in y ver sus clases 
el docente podra ver sus secciones para el periodo 
el docente podra selccionar una seccion (se debera visualizar la informacion)
    sub menu: 
        -> marcar asistencia  (ir recorriendo cada estudiante y marcarndolo o desmarcandolo)
        -> registrar asistencia 
        -> visualizar asistencias

-> Trabajo para la casa: 
Opciones para registro. (CRUD)
    C -> create (crear)
    R -> Read (Leer/ visualizar)
    U -> Update (Actualizar)
    D -> Delete (Eliminar)
    Agregar una seccion 
    Agregar un alumno 
    Eliminar a un alumno
    Agregar un alumno a una clase  
    Eliminar un alumno de una lista. 
    listar secciones 
    listar todos los alumnos

Sistema asistencia : (Clase compuesta)
    String nombredocente;
    ArrayList<Asistencia> clasesImartidas;

Asistencia: (clase compuesta )
seccion :(Clase simple)
	campus
	num seccion 
	codigo clase 
	hora 
lista alumnos 
	alumnos : (Clase simple)
	num cuenta 
	nombre 
	cantidad de asistencias

Sistema de asistencia: (clase sencilla, no es buena practica en este caso)
        campus
	num seccion 
	codigo clase 
	hora 
        lista alumnos(string) :
	arreglo num cuenta 
        arreglo nombre
        arreglo de cantidad de asistencias
*/