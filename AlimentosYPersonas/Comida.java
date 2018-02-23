import java.util.*;
/**
 * Write a description of class Comida here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comida
{
    // Campo del nombre de la comida
    public String nombreComida;
    //Campo del numero de calorias
    public int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombreComida, int calorias)
    {
        this.nombreComida=nombreComida;
        this.calorias=calorias;
    }
    /**
     * Metodo que nos permite ver las calorias de la comida
     */
    public int getCalorias(){

        return calorias;

    }
    
    /**
     * Metodo que nos permite ver el nombre de la comida
     */
    public String getNombreComida(){
        return nombreComida;

    }
    
    /**
     * Metodo que nos permite cambiar las calorias de la comida
     */
    public void setCalorias(int calorias){
        this.calorias=calorias;
    
    }
    /**
     * Metodo que nos permite cambiar el nombre
     */
    public void setNombreComida(String nombreComida){
        this.nombreComida=nombreComida;
    }
    /**
     * Metodo que nos permite ver los detalles de la comida
     */
    public String detallesComida(){
        return getNombreComida() + "-" + getCalorias();
    
    }
}
