package clase_23072024_registroclasescompuestas;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author claudiacortes
 */
public class Clase_23072024_registroClasesCompuestas {
  public static ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
    public static ArrayList<Seccion> secciones = new ArrayList<Seccion>();
    public static ArrayList<Clase_Asistencia> clases = new ArrayList<Clase_Asistencia>();
    public static ArrayList<Docente> docentes = new ArrayList<Docente>();
    
   
    //Agregando secciones 
    public static int contador = 0;
    
        public static void main(String[] args) {
            //agregando alumnos al sistema manualmente
            alumnos.add(new Alumnos(1234,"Josue",0));
            alumnos.add(new Alumnos(1234,"Josue",0));
            alumnos.add(new Alumnos(1236,"Miguel",0));
            alumnos.add(new Alumnos(1234,"Nahun",0));
            
            //ejemplo de enlaces / uso de referencias de los objetos. 
            //OJO: ESTO SOLO FUNCIONA PARA LOS OBJETOS.
             // persona1 = direccion: hsjgdd7383735, hascode: 6498448
            Alumnos persona1 = alumnos.get(0);
            //persona2 = persona1 --> persona2 = direccion: hsjgdd7383735, hascode: 6498448
            Alumnos persona2 = persona1;
            System.out.println("El nombre de persona 1 es "+ persona1.getNombre());
            persona2.setNombre("Pedro pablo");
            System.out.println("El nombre de persona 1 es "+ persona1.getNombre());
            System.out.println("HASCODES DE PERSONA 1 Y PERSONA 2");
             System.out.println("El id del objeto es "+persona2.hashCode());
            System.out.println("El id del objeto es "+persona1.hashCode());
            
            //agregando asecciones manualmente al sistema
            secciones.add(new Seccion("TGU",1234,1234,"5:10 PM"));
            secciones.add(new Seccion("TGU",3451,7483,"7:00 AM"));
            secciones.add(new Seccion("TGU",3819,7638,"8:30 AM"));
            secciones.add(new Seccion("TGU",9814,9876,"6:30 PM"));          
            
            // agregando una clase manualmente al sistema
            clases.add(new Clase_Asistencia(secciones.get(0),alumnos, "Programacion II"));
            clases.add(new Clase_Asistencia(secciones.get(1),alumnos));
            
            //AGREGANDO DOCENTE MANUALMENTE.
            docentes.add(new Docente(1234,"Claudia","claudia",clases));
            
            
        boolean bandera = true;
        while (bandera) {
            String opcion = JOptionPane.showInputDialog(null, "Menú \n 0. Salir \n 1. Maestros \n 2. Administrativos \n Ingrese una opción: ");
            opcion = Corroborar(opcion);
            int op = Integer.parseInt(opcion);
            switch (op) {
                case 0 -> {
                    bandera = false;
                    JOptionPane.showMessageDialog(null, "Saliendo...", "Salir del programa", 1);
                }
                case 1 -> {
                    MenuDocente();
                }
                case 2 -> {
                    MenuAdministrativos();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Esa no es una opción, lo regresaremos al menú", "Regresando...", 1);
                }
            }
        }
    }
        
    public static String Corroborar(String cadena) {
        boolean verificacion = false;
        while(!verificacion) {
            for (int i = 0; i < cadena.length(); i++) {
                if(cadena.charAt(i) != '0' && cadena.charAt(i) != '1' && cadena.charAt(i) != '2' && cadena.charAt(i) != '3' && cadena.charAt(i) != '4' && cadena.charAt(i) != '5' && cadena.charAt(i) != '6' && cadena.charAt(i) != '7' && cadena.charAt(i) != '8' && cadena.charAt(i) != '9') {
                    verificacion = false;
                    break;
                } else {
                    verificacion = true;
                }
            }
            if (!verificacion) {
                cadena = JOptionPane.showInputDialog(null, "Usted ingresó una cadena \n Solo puede ingresar números:", "Opción no válida", 1);
            }
        }
        return cadena;
    }
    
    public static void MenuAdministrativos() {
        boolean bandera = true;
        while(bandera) {
            String opcion = JOptionPane.showInputDialog(null, "Menú \n 1. Entrar Al CRUD Estudiantil \n 2. Entrar Al CRUD de Secciones \n 3. Entrar Al CRUD de docentes \n 4. Agregar clase \n5.Listar Clases \n 6. Salir");
            opcion = Corroborar(opcion);
            int option = Integer.parseInt(opcion);
            switch(option) {
                case 1 -> {
                    CRUDAlumno();
                }
                case 2 -> {
                    CRUDSeccion();
                }
                case 3 -> {
                    CRUDdocentes();
                }
                case 4 -> {
                    if(alumnos.size() != 0 && secciones.size() != 0) {
                        agregarClase();
                    } else {
                        JOptionPane.showMessageDialog(null, "Por el momento no se puede agregar clases", "No hay secciones y/o alumnos", 3);
                    }
                }
                case 5->{
                    JOptionPane.showMessageDialog(null, ListarTodasLasClases(), "LISTA DE CLASES", 3);
                    
                }
                case 6 -> {
                    JOptionPane.showMessageDialog(null, "Usted ha salido del sistema administrativo", "Saliendo", 1);
                    bandera = false;
                }
                
                default -> {
                    JOptionPane.showMessageDialog(null, "Esa opción no es válida \n Lo regresaremos al menú", "Opción no válida", 1);
                }
            }
        }
    }
    
    public static void CRUDdocentes() {
        boolean bandera = true;
        while(bandera) {
            String opcion = JOptionPane.showInputDialog(null, "---CRUD DOCENTES--- \n 1. Agregar Docente \n 2. Eliminar Docente \n 3. Salir", "CRUD DE LOS DOCENTES", 1);
            opcion = Corroborar(opcion);
            int op = Integer.parseInt(opcion);
            switch(op) {
                case 1 -> {
                    crearDocente();
                }
                case 2 -> {
                    eliminarDocente();
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Saliendo del CRUD de docentes", "Saliendo...", 1);
                    bandera = false;
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Esa no es una opción válida", "Regresando...", 1);
                }
            }
        }
    }
    
    public static void crearDocente() {
        Docente teacher = new Docente();
        Random ran = new Random();
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del docente: ", "Nombre del docente", 1);
        String password = JOptionPane.showInputDialog(null, "Ingrese la contraseña del docente: ", "Contraseña del docente", 1);
        int id = ran.nextInt(1001);
        teacher.setNombre(nombre);
        teacher.setPassword(password);
        teacher.setId(id);
        boolean bandera = true;
        /*
        NOTA: Podriamos mover este fragmento de codigo, a un metodo que se llame actualizar clases, y reutilizarlo al momento de modificar los datos del maestro en el crud
        */
        while(bandera) {
            String option = JOptionPane.showInputDialog(null, "0. Salir \n 1. Añadirle una clase al docente ", "Añadiendo clases", 1);
            option = Corroborar(option);
            int op = Integer.parseInt(option);
            switch(op) {
                case 0 -> {
                    bandera = false;
                    JOptionPane.showMessageDialog(null, "Usted ha salido del SubMenu para añadir clases a los docentes", "Saliendo...", 1);
                }
                case 1 -> {
                    String posValidas = ListarTodasLasClases();
                    String eleccion = JOptionPane.showInputDialog(null, "Las Clases Que Hay: "+posValidas+"\n Ingrese una posición de una clase para vincularlo con un docente: ", "Vinculando clase con docente", 1);
                    eleccion = Corroborar(eleccion);
                    int election = Integer.parseInt(eleccion);
                    if (election < clases.size()) {
                        Clase_Asistencia nuevaClase = clases.get(election);
                        teacher.DarleClases(nuevaClase);
                    } else {
                        JOptionPane.showMessageDialog(null, "Posición Inválida");
                    }
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Esa opción no es válida", "Regresando...", 1);
                }
            }
        }
        docentes.add(teacher);
    }
    
    public static void eliminarDocente() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del docente que quiere eliminar: ", "Eliminando Docente", 1);
        int pos = BuscarDocente(nombre);
        if(pos > -1) {
            docentes.remove(pos);
            JOptionPane.showMessageDialog(null, "El docente fue eliminado", "Docente Eliminado", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Ese docente no existe o fue eliminado...", "Docente inexistente", 1);
        }
    }
    
    public static int BuscarDocente(String nombre) {
        int pos = -1;
        for (int i = 0; i < docentes.size(); i++) {
            if(docentes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static int BuscarContraseñaDelDocente(String password) {
        int pos = -1;
        for (int i = 0; i < docentes.size(); i++) {
            if(docentes.get(i).getPassword().equalsIgnoreCase(password)) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static void MenuDocente() {
        boolean bandera = true;
        int pos = 0;
//        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ", "LOG IN TEACHER", 1);
//        int pos = BuscarDocente(nombre);
//        if(pos > -1) {
//            String password = JOptionPane.showInputDialog(null, "Ingrese su contraseña", "LOG IN TEACHER", 1);
//            int pos2 = BuscarContraseñaDelDocente(password);
//            if(pos2 <= -1) {
//                bandera = false;
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "No hay ningún docente con ese nombre", "FAIL LOG IN", 3);
//            bandera = false;
//        }
        while(bandera) {
            String opcion = JOptionPane.showInputDialog(null, "Menú \n 0. Salir \n 1. Listar clases \n 2. Pasar asistencia \n 3. Registrar asistencia \n 4. Listar asistencia del dia");
            opcion = Corroborar(opcion);
            int option = Integer.parseInt(opcion);
            switch(option) {
                case 0 -> {
                    JOptionPane.showMessageDialog(null, "Saliendo del menu docente", "Saliendo...", 1);
                    bandera = false;
                }
                case 1 -> {
                    String clases = ListarSusClases(pos);
                    JOptionPane.showMessageDialog(null, "Estas son sus clases: \n "+clases, "Lista De Sus Clases", 1);
                }
                case 2 -> {
                     Docente maestro = docentes.get(pos);
                     String clases = ListarSusClases(pos);
                     JOptionPane.showMessageDialog(null, "Estas son sus clases: \n "+clases, "Lista De Sus Clases", 1);
                      String clase = JOptionPane.showInputDialog(null, "Que clase desea marcar: ");
                      String posClaseString  = Corroborar(clase);
                      int pos_clase = Integer.parseInt(posClaseString);
                      Clase_Asistencia claseMarcarLista = maestro.getClases().get(pos_clase);
                      //ejemp,o de alternativa
//                      String texto = claseMarcarLista.toString();
//                      JOptionPane.showMessageDialog(null, texto, "INFORMACION DE LA CLASE", 1);
                    JOptionPane.showMessageDialog(null, claseMarcarLista, "INFORMACION DE LA CLASE", 1);
                    claseMarcarLista.marcarAsistencia();
                    JOptionPane.showMessageDialog(null, claseMarcarLista, "SE ACTUALIZO LA INFORMACION DE LA ASISTENCIA", 1);
                       
                }
                case 3 -> {
                    
                }
                case 4 -> {
                    
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Esa opción no es válida \n Lo regresaremos al menú", "Opción no válida", 1);
                }
            }
        }
    }
    
    public static String ListarSusClases(int posTeacher) {
        String clasesYalumnos = "";
        for (int i = 0; i < docentes.get(posTeacher).getClases().size(); i++) {
            clasesYalumnos = clasesYalumnos + i + ")" + docentes.get(posTeacher).getClases().get(i) + ": \n";
            for (int j = 0; j < clases.get(i).getListaAlumnos().size(); j++) {
                clasesYalumnos = clasesYalumnos + j + ")" + clases.get(i).getListaAlumnos().get(j) + "\n";
            }
        }
        return clasesYalumnos;
    }
    

    
    public static void CRUDAlumno() {
        boolean bandera = true;
        while(bandera) {
            String opcion = JOptionPane.showInputDialog(null, "---CRUD ALUMNO--- \n 1. Agregar un alumno \n 2. Eliminar un alumno \n 3. Listar todos los alumnos \n 4. Salir", "CRUD DE LOS ALUMNOS", 1);
            opcion = Corroborar(opcion);
            int option = Integer.parseInt(opcion);
            switch(option) {
                case 1 -> {
                    AgregarAlumno();
                }
                case 2 -> {
                    EliminarAlumno();
                }
                case 3 -> {
                    String alumnos = ListarAlumnos();
                    JOptionPane.showMessageDialog(null, "Estos son todos los alumnos: \n"+alumnos, "Lista De Alumnos", 1);
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Usted ha salido del CRUD ALUMNO", "Saliendo", 1);
                    bandera = false;
                }
                default -> {
                    
                }
            }
        }
    }
    
    public static void AgregarAlumno() {
        Random random = new Random();
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno: ", "Agregar Alumno", 1);
        int id = random.nextInt(1001);
        Alumnos estudiante = new Alumnos(id, nombre, 0);
        alumnos.add(estudiante);
        JOptionPane.showMessageDialog(null, "Se ha agregado el alumno", "ALUMNO AGREGADO", 1);
    }
    
    public static void EliminarAlumno() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno que quiere eliminar: ", "Eliminar Alumno", 1);
        int pos = BuscarAlumno(nombre);
        if (pos > -1) {
            alumnos.remove(pos);
            JOptionPane.showMessageDialog(null, "El alumno fue eliminado.", "Alumno Eliminado", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El alumno no se encuentra.", "Alumno No Encontrado", 1);
        }
    }
    
    public static int BuscarAlumno(String nombre) {
        int pos = -1;
        for (int i = 0; i < alumnos.size(); i++) {
            if(alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static String ListarAlumnos() {
        String students = "";
        for (int i = 0; i < alumnos.size(); i++) {
            students = students + i + ") " + alumnos.get(i) + "\n";
        }
        return students;
    }
    
    public static void CRUDSeccion() {
        boolean bandera = true;
        while(bandera) {
            String opcion = JOptionPane.showInputDialog(null, "---CRUD SECCION--- \n 1. Agregar una seccion \n 2. Eliminar una seccion \n 3. Listar todas las secciones \n 4. Salir", "CRUD DE LAS SECCIONES", 1);
            opcion = Corroborar(opcion);
            int option = Integer.parseInt(opcion);
            switch(option) {
                case 1 -> {
                    AgregarSeccion();
                }
                case 2 -> {
                    EliminarSeccion();
                }
                case 3 -> {
                    String secciones = ListarSeccion();
                    JOptionPane.showMessageDialog(null, "Estas son todas las secciones: \n"+secciones, "Lista De Secciones", 1);
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Usted ha salido del CRUD SECCION", "Saliendo", 1);
                    bandera = false;
                }
                default -> {
                    
                }
            }
        }
    }
    
    public static void AgregarSeccion() {
        Random random = new Random();
        String campus = JOptionPane.showInputDialog(null, "Ingrese el nombre del campus: ", "Agregar Seccion", 1);
        String hora = JOptionPane.showInputDialog(null, "Ingrese la hora que será recibida la clase: ", "Agregar Seccion", 1);
        String numSeccion = JOptionPane.showInputDialog(null, "Ingrese el número de la sección: ", "Agregar Seccion", 1);
        numSeccion = Corroborar(numSeccion);
        int numSection = Integer.parseInt(numSeccion);
        int codigoClass = random.nextInt(1001);
        Seccion clase = new Seccion(campus, numSection, codigoClass, hora);
        secciones.add(clase);
    }
    
    public static void EliminarSeccion() {
        String codigo = JOptionPane.showInputDialog(null, "Ingrese el codigo de la sección que quiere eliminar: ", "ELIMINAR SECCION", 1);
        codigo = Corroborar(codigo);
        int codeClass = Integer.parseInt(codigo);
        int pos = BuscarSeccion(codeClass);
        if (pos > -1) {
            secciones.remove(pos);
            JOptionPane.showMessageDialog(null, "La sección fue eliminada.", "Sección Eliminada", 1);
        } else {
            JOptionPane.showMessageDialog(null, "La sección no se encuentra.", "Sección Sin Encontrar", 1);
        }
    }
    
    public static int BuscarSeccion(int codeClass) {
        int pos = -1;
        for (int i = 0; i < secciones.size(); i++) {
            if(secciones.get(i).getCodigoclase() == codeClass) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static String ListarSeccion() {
        String sections = "";
        for (int i = 0; i < secciones.size(); i++) {
            sections = sections + i + ") " + secciones.get(i) + "\n";
        }
        return sections;
    }
    
    public static void agregarClase(){
        String sections = ListarSeccion();
        String position = JOptionPane.showInputDialog(null, sections+"Ingrese la posición de la seccion a la que vinculará la clase: ", "Vinculando Seccion", 1);
        position = Corroborar(position);
        int pos = Integer.parseInt(position);
        if(pos < secciones.size()) {
            Seccion seccionAgregar = secciones.get(pos);
            Clase_Asistencia clase = new Clase_Asistencia();
            
            clase.setContador(contador);
            contador++;
            
            clase.setInfo_seccion(seccionAgregar);
            
            boolean bandera = true;
            while (bandera) {
                String opcion = JOptionPane.showInputDialog(null, "1. Seguir agregando alumnos \n 2. Salir \n Ingrese una opción: ", "Vinculando Estudiantes", 1);
                opcion = Corroborar(opcion);
                int op = Integer.parseInt(opcion);
                switch (op) {
                    case 1 ->{
                        String students = ListarAlumnos();
                        String posicion = JOptionPane.showInputDialog(null, students+"Ingrese la posición del alumno a la que vinculará la clase:", "Vinculando Estudiantes", 1);
                        int posAlumno = Integer.parseInt(posicion);
                        if (posAlumno < alumnos.size()) {
                            Alumnos alumnoAgregar = alumnos.get(posAlumno);
                            clase.matricularAlumno(alumnoAgregar);
                        } else {
                            JOptionPane.showMessageDialog(null, "Posición inválida");
                        }
                    }
                    case 2 ->{
                        bandera = false;
                        JOptionPane.showMessageDialog(null, "Usted ha salido", "Saliendo...", 1);
                    }    
                }
            }
            String nombre = JOptionPane.showInputDialog(null, "Nombre de la clase: ", "Nombrando clase", 1);
            clase.setNombre(nombre);
            clases.add(clase);
        } else {
            JOptionPane.showMessageDialog(null, "Esa posición no existe en la lista de secciones...", "Sección Inexistente", 1);
        }
    }
    
    public static String ListarTodasLasClases() {
        String aulas = "";
        for(int i = 0; i < clases.size(); i++) {
            aulas = aulas + i + ") " + clases.get(i).getNombre() + "\n";
        }
        return aulas;
    }

}// fin de la clase 

