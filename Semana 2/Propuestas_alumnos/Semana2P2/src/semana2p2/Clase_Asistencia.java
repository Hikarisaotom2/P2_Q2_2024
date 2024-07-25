package semana2p2;
import java.util.ArrayList;

public class Clase_Asistencia {
    
    private String nombre;
    private int contador;
    private Seccion infoSeccion;
    private ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();

    public Clase_Asistencia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public Seccion getInfoSeccion() {
        return infoSeccion;
    }

    public void setInfoSeccion(Seccion infoSeccion) {
        this.infoSeccion = infoSeccion;
    }

    public ArrayList<Alumnos> getListaAlumnos() {
        return listaAlumnos;
    }

    public void MatricularAlumno(Alumnos NuevoAlumno) {
        this.listaAlumnos.add(NuevoAlumno);
    }

    @Override
    public String toString() {
        return "Clase: " + nombre;
    }
    
    
}
