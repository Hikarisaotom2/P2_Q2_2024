package semana2p2;
import java.util.ArrayList;

public class Docente {
    private int id;
    private String nombre;
    private String password;
    private ArrayList<Clase_Asistencia> clases = new ArrayList<Clase_Asistencia>();

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
    
    
}
