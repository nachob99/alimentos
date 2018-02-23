import java.util.*;
/**
 * Write a description of class Persona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombrePersona;

    private boolean hombre;

    private int pesoEnKg;

    private int alturaEnCm;

    private int edad;

    private int caloriasIngeridas;

    private ArrayList<Comida> comidasIngeridas;
    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombrePersona, boolean hombre, int pesoEnKg , int alturaEnCm, int edad)
    {
        this.nombrePersona=nombrePersona;
        this.hombre=hombre;
        this.pesoEnKg=pesoEnKg;
        this.alturaEnCm=alturaEnCm;
        this.edad=edad;
        caloriasIngeridas=0;
    }

    public String getNombrePersona(){
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona){
        this.nombrePersona=nombrePersona;

    }

    public boolean getHombre(){
        return hombre;

    }

    public void setHombre(boolean hombre){
        this.hombre=hombre;

    }

    public int getPeso(){
        return pesoEnKg;

    }

    public void setPeso(int peso){
        this.pesoEnKg=peso;
    }

    public int getAltura(){
        return alturaEnCm;

    }

    public void setAltura(int altura){
        this.alturaEnCm=altura;
    }

    public int getEdad(){
        return edad;

    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String detallesPersona(){
        return getNombrePersona() + "-" + getHombre() + "-" + getPeso() + "-" + getAltura() + "-" + getEdad();

    }

    public int comer(Comida comida){

        String nombreComida= comida.getNombreComida(); 
        int calorias = comida.getCalorias();

        if(hombre=true){
            if( caloriasIngeridas < (10*getPeso() + 6*getAltura() + (5*getEdad()) + 5)){
                caloriasIngeridas = caloriasIngeridas + calorias;
            }
            else{
                calorias=-1;
            }
        }

        if(hombre=false){
            if((caloriasIngeridas < (10*getPeso() + 6*getAltura() + (5*getEdad() - 161)))){
                caloriasIngeridas = caloriasIngeridas + calorias;
            }
            else{
                calorias=-1;
            }
        }


        return calorias;
    }

    public int getCaloriasIngeridas(){
        return caloriasIngeridas;

    }

}

