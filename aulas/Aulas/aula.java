import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
/**
 * Write a description of class aula here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aula
{
    // instance variables - replace the example below with your own
    private String nombreAula;
    private int numeroAula;
    private int numeroAlumnos;
    private int numeroIndentificativo;

    /**
     * Constructor for objects of class aula
     */
    public Aula(String nombre,int numeroClase,int alumnos,int numeroIdentificativo)
    {
        nombreAula=nombre;
        numeroAula=numeroClase;
        numeroAlumnos=alumnos;
        numeroIndentificativo=numeroIndentificativo;
    }

    public int getAula(){
        return numeroAula;
    }

    public void setAula(int nAula){  
        this.numeroAula=nAula;
    }

    public int getAlumnos(){
        return numeroAlumnos;
    }

    public void setAlumnos(int alumnos){  
        this.numeroAlumnos=alumnos;
    }

    public String getNombreAula(){
        return nombreAula;
    }

    public void setNombreAula(String nombreAula){
        this.nombreAula=nombreAula;
    }

    public int getnumeroIndentificativo(){
        return numeroIndentificativo;
    }

    public void setnumeroIndentificativo(int numeroIndentificativo){  
        this.numeroIndentificativo=numeroIndentificativo;
    }

    public String detallesAula(){
        return getNombreAula() + "-" + getAula() + "-" + getAlumnos() + "-" + getnumeroIndentificativo()
        + "-" ;
    }  

}

