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
        comidasIngeridas = new ArrayList<Comida>();
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

        int metabolismoHombre = (10*getPeso() + 6*getAltura() + (5*getEdad()) + 5);
        int metabolismoMujer = (10*getPeso() + 6*getAltura() + (5*getEdad() - 161));
        if(hombre=true){
            if( caloriasIngeridas < metabolismoHombre){
                caloriasIngeridas = caloriasIngeridas + calorias;
            }
            else{
                calorias=-1;
            }
        }

        if(hombre=false){
            if((caloriasIngeridas < metabolismoMujer)){
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

    public void getAlimentoMasCaloricoConsumido(){
        int variable = 0;
        for (int i = 0; i < comidasIngeridas.size(); i++) {
            Comida comidaConMasCalorias = comidasIngeridas.get(i);
            int posicion = i;
            for (int j = i + 1; j < comidasIngeridas.size(); j++) {
                Comida comidaActual = comidasIngeridas.get(j);
                if (comidaConMasCalorias.getCalorias() < comidaActual.getCalorias()) {
                    comidaConMasCalorias = comidaActual;
                    posicion = j;
                }
            }
            if (posicion != i) {                
                Comida aux = comidasIngeridas.get(i);
                comidasIngeridas.set(i, comidasIngeridas.get(posicion));
                comidasIngeridas.set(posicion, aux);
            } 

            if (comidaConMasCalorias.getCalorias() != variable) {
                if (comidaConMasCalorias.getCalorias() == 1) {
                    System.out.println("");
                    System.out.println(comidaConMasCalorias.getCalorias() + " calorias");
                    System.out.println();
                }
                else {
                    System.out.println("");
                    System.out.println(comidaConMasCalorias.getCalorias() + " calorias");
                    System.out.println("");
                }
                variable = comidaConMasCalorias.getCalorias();
            }
            System.out.println(comidaConMasCalorias.getCalorias());

        } 

    }

    public String contestar(String pregunta){
        String respuesta = "";
        int metabolismoHombre = (10*getPeso() + 6*getAltura() + (5*getEdad()) + 5);
        int metabolismoMujer = (10*getPeso() + 6*getAltura() + (5*getEdad() - 161));
        if(metabolismoHombre > caloriasIngeridas || metabolismoMujer > caloriasIngeridas){
            
            if(pregunta.length() %3 == 0){
                respuesta="SI";
            
            }
            else{
                respuesta="NO";
            
            }
        }
        
        
        if(pregunta.contains(nombrePersona) || metabolismoHombre < caloriasIngeridas || metabolismoMujer < caloriasIngeridas){
            respuesta = pregunta.toUpperCase();

        }
        
        
        return respuesta;
    }

}

