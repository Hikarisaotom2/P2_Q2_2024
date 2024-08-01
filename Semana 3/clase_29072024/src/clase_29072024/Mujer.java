
package clase_29072024;

/**
 *
 * @author claudiacortes
 */
//La herencia SIEMPRE se configura en la clase hija
// En java solamente podemos heredar de una clase, herencia simple
public class Mujer extends Humano{
    //atributos especiales 
    String largoCabello;
    String fechaPeriodoMentrual;

    public Mujer(String largoCabello, String fechaPeriodoMentrual, String nombre, int edad, String colorOjos, String nacionalidad) {
        super(nombre, edad, colorOjos, nacionalidad);
        this.largoCabello = largoCabello;
        this.fechaPeriodoMentrual = fechaPeriodoMentrual;
    }
   public void ejemplo(){
       super.colorOjos ="hola mundo";
       this.largoCabello ="corto";
   }
    
}
