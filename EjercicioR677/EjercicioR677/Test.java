import java.util.ArrayList;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Test
     */
    public ArrayList<String> Test()
    {
        EjercicioR677 objeto = new EjercicioR677();
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Adios");
        palabras.add("MuyLarga");
        palabras.add("Corta");
        return objeto.devolverPalabraMasLarga(palabras);
        
    }

}
