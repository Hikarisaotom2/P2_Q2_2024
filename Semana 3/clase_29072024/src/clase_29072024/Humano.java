package clase_29072024;

/**
 *
 * @author claudiacortes
 */
public class Humano {
    /*
    1) private: Nadie ademas de la clase puede acceder a ese valor.
    2) public: cualquier clase puede acceder al valor.
    3) protected: La informacion solamente se va a compartir a los hijos de esta clase.
    */
    protected String nombre;
    protected int edad;
    protected String colorOjos;
    protected String nacionalidad;

    public Humano(String nombre, int edad, String colorOjos, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorOjos = colorOjos;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Humano{" + "nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + '}';
    }

}
