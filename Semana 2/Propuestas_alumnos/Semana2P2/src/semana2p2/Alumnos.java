package semana2p2;

public class Alumnos {
    
    private int numCuenta;
    private String nombre;
    private int inAsistencias;

    public Alumnos(int numCuenta, String nombre, int inAsistencias) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.inAsistencias = inAsistencias;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInAsistencias() {
        return inAsistencias;
    }

    public void setInAsistencias(int inAsistencias) {
        this.inAsistencias = inAsistencias;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + ", Número de cuenta: " + numCuenta +  ", Inasistencias: " + inAsistencias;
    }
    
}
