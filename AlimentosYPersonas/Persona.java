import java.util.*;
/**
 * Write a description of class Persona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persona
{
    // Campo del nombre de la persona
    private String nombrePersona;
    // Campo booleando si es hombre
    private boolean hombre;
    // Campo peso
    private int pesoEnKg;
    // campo altura
    private int alturaEnCm;
    //campo edad
    private int edad;
    //campo calorias
    private int caloriasIngeridas;

    private ArrayList<Comida> comidasCalorica;
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
        comidasCalorica = new ArrayList<Comida>();
    }

    /**
     * Metodo que nos permite ver el nombre de la persona
     */
    public String getNombrePersona(){
        return nombrePersona;
    }

    /**
     * Metodo que nos permite cambiar el nombre de la persona
     */
    public void setNombrePersona(String nombrePersona){
        this.nombrePersona=nombrePersona;

    }

    /**
     * Metodo que nos permite ver el sexo
     */
    public boolean getHombre(){
        return hombre;

    }

    /**
     * Metodo que nos permite cambiar el sexo
     */
    public void setHombre(boolean hombre){
        this.hombre=hombre;

    }

    /**
     * Metodo que nos permite ver el peso
     */
    public int getPeso(){
        return pesoEnKg;

    }

    /**
     * Metodo que nos permite cambiar el peso
     */
    public void setPeso(int peso){
        this.pesoEnKg=peso;
    }

    /**
     * Metodo que nos permite ver la altura
     */
    public int getAltura(){
        return alturaEnCm;

    }

    /**
     * Metodo que nos permite cambiar la altura
     */
    public void setAltura(int altura){
        this.alturaEnCm=altura;
    }

    /**
     * Metodo que nos permite ver al edad
     */
    public int getEdad(){
        return edad;

    }

    /**
     * Metodo que nos permite cambiar la edad
     */
    public void setEdad(int edad){
        this.edad=edad;
    }

    /**
     * Metodo que nos permite ver los detalles de la persona
     */
    public String detallesPersona(){
        return getNombrePersona() + "-" + getHombre() + "-" + getPeso() + "-" + getAltura() + "-" + getEdad();

    }

    /**
     * Metodo que nos comer la comida y devolver las calorias obtenidas
     */
    public int comer(Comida comida){

        String nombreComida= comida.getNombreComida(); 
        int calorias = comida.getCalorias();

        int metabolismoHombre = (10*getPeso() + 6*getAltura() + (5*getEdad()) + 5);
        int metabolismoMujer = (10*getPeso() + 6*getAltura() + (5*getEdad() - 161));
        if(hombre=true){
            if( caloriasIngeridas < metabolismoHombre){
                caloriasIngeridas = caloriasIngeridas + calorias;
                comidasCalorica.add(comida);
            }
            else{
                calorias=-1;
            }
        }

        if(hombre=false){
            if((caloriasIngeridas < metabolismoMujer)){
                caloriasIngeridas = caloriasIngeridas + calorias;
                comidasCalorica.add(comida);
            }
            else{
                calorias=-1;
            }
        }

        return calorias;
    }

    /**
     * Metodo que nos permite las calorias totales
     */
    public int getCaloriasIngeridas(){
        return caloriasIngeridas;

    }

    public String getAlimentoMasCaloricoConsumido(){
        String alimentoConMasCalorias=null;

        if(comidasCalorica.size()>0){
            Comida comidaMasCalorica = comidasCalorica.get(0);
            for(Comida comidaActual : comidasCalorica){
                if(comidaActual.getCalorias() >= comidaMasCalorica.getCalorias())

                    comidaMasCalorica = comidaActual;
            }
            alimentoConMasCalorias=comidaMasCalorica.getNombreComida();

        }

        System.out.println(alimentoConMasCalorias);
        return alimentoConMasCalorias;
    }


    /**
     * Metodo que nos permite contestar las preguntas de manera adecuada
     */
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

