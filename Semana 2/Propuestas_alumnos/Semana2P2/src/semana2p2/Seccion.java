package semana2p2;

public class Seccion {
    private String campus;
    private int numSeccion;
    private int codigoClase;
    private String hora;

    public Seccion(String campus, int numSeccion, int codigoClase, String hora) {
        this.campus = campus;
        this.numSeccion = numSeccion;
        this.codigoClase = codigoClase;
        this.hora = hora;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public int getNumSeccion() {
        return numSeccion;
    }

    public void setNumSeccion(int numSeccion) {
        this.numSeccion = numSeccion;
    }

    public int getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(int codigoClase) {
        this.codigoClase = codigoClase;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Campus: " + campus + ", Número de la sección: " + numSeccion + ", Codigo: " + codigoClase + ", Hora: " + hora;
    }
    
    
    
}
