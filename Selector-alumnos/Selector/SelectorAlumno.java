import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase que nos permite seleccionar uno o varios alumnos 
 * aleatoriamente de entre un listado de ellos
 */
public class SelectorAlumno
{
    private ArrayList<String> alumnos;

    /** 
     * Constructor de la clase
     */
    public SelectorAlumno()
    {
        alumnos = new ArrayList<String>();
    }

    /**
     * Añade un alumno
     */
    public void agregarAlumno(String nombreAlumno) 
    {
        alumnos.add(nombreAlumno);
    }

    /**
     * Añade varios alumnos separados por comas
     */
    public void agregarAlumnos(String nombreAlumnos) {
        ArrayList<String> listaAlumnos = new ArrayList(Arrays.asList(nombreAlumnos.split(",")));
        for(String alumno : listaAlumnos){
            alumnos.add(alumno);
        
        }
    }

    /**
     * Muestra por pantalla los alumnos añadidos uno por linea
     */
    public void verListadoAlumnos()
    {
        for (String alumno : alumnos)
        {
            System.out.println(alumno);
       }
    }

    /** 
     * Muestra por pantalla un alumno aleatoriamente. En caso de no haber alumnos
     * no muestra ninguno e informa del error.
     */
    public void seleccionarAlumnoAleatoriamente()
    {
        //Comprobamos si hay alumnos
        if (alumnos.size() != 0 ) {
            //Si los hay, sacamos un numero aleatorio y lo guardamos en una variable
            Random objetoRandom = new Random();
            int posicionAleatoria = objetoRandom.nextInt(alumnos.size());

            // Imprime por pantalla el nombre del alumno escogido
            System.out.println(alumnos.get(posicionAleatoria));
        }
        else {
            //Si no los hay, que aparezca un mensaje de error
            System.out.println("No hay candidatos");
        }

    }

    /**
     * Muestra por pantalla n alumnos seleccionados aleato
     * riamente. En caso de no haber 
     * alumnos suficientes no muestra ninguno e informa del error.
     */
    public void seleccionarNAlumnosAleatoriamente(int numeroAlumnosASeleccionar)
    {
        //Comprobamos si hay suficientes alumnos en funcion de los que tenemos que escoger
        if (alumnos.size() >= numeroAlumnosASeleccionar){

            //Si hay suficientes alumnos iteramos tantas veces como numero de alumnos queramos
            int contador = 0;
            while(contador<numeroAlumnosASeleccionar)
            {
                //Sacamos un numero aleatorio y lo guardamos en una variable
                Random objetoRandom = new Random();
                int posicionAleatoria = objetoRandom.nextInt(alumnos.size());

                //Imprime por pantalla el nombre del alumno escogido
                System.out.println(alumnos.get(posicionAleatoria));

                contador++;
            }
        }
        else {
            //Si no hay suficientes alumnos, mostramos un error
            System.out.println("Cantidad de alumnos invalida o lista vacia");
        }

    }

}
