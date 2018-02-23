import java.util.*;
/**
 * Write a description of class Comida here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    public String nombreComida;
    public int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombreComida, int calorias)
    {
        this.nombreComida=nombreComida;
        this.calorias=calorias;
    }

    public int getCalorias(){

        return calorias;

    }

    public String getNombreComida(){
        return nombreComida;

    }
    
    public void setCalorias(int calorias){
        this.calorias=calorias;
    
    }
    
    public void setNombreComida(String nombreComida){
        this.nombreComida=nombreComida;
    }
    
    public String detallesComida(){
        return getNombreComida() + "-" + getCalorias();
    
    }
}
