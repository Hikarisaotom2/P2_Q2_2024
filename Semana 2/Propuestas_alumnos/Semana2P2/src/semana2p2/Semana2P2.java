package semana2p2;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;

public class Semana2P2 {
    
    public static ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
    public static ArrayList<Seccion> secciones = new ArrayList<Seccion>();
    public static ArrayList<Clase_Asistencia> clases = new ArrayList<Clase_Asistencia>();
    public static ArrayList<Docente> docentes = new ArrayList<Docente>();
    public static int contador = 0;
    
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
            String opcion = JOptionPane.showInputDialog(null, "Menú \n 1. Entrar Al CRUD Estudiantil \n 2. Entrar Al CRUD de Secciones \n 3. Entrar Al CRUD de docentes \n 4. Agregar clase \n 5. Salir");
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
                case 5 -> {
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
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ", "LOG IN TEACHER", 1);
        int pos = BuscarDocente(nombre);
        if(pos > -1) {
            String password = JOptionPane.showInputDialog(null, "Ingrese su contraseña", "LOG IN TEACHER", 1);
            int pos2 = BuscarContraseñaDelDocente(password);
            if(pos2 <= -1) {
                bandera = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningún docente con ese nombre", "FAIL LOG IN", 3);
            bandera = false;
        }
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
    
    public static void main(String[] args) {
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
            if(secciones.get(i).getCodigoClase() == codeClass) {
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
            
            clase.setInfoSeccion(seccionAgregar);
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
                            clase.MatricularAlumno(alumnoAgregar);
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
    
}
