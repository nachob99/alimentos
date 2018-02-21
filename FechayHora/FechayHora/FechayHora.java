
/**
 * Write a description of class FechayHora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechayHora
{
    // instance variables - replace the example below with your own
    private int minuts;
    private int hours;
    private DisplayDosCaracteres day;
    private DisplayDosCaracteres month;
    private DisplayDosCaracteres year;

    /**
     * Constructor for objects of class FechayHora
     */
    public FechayHora()
    {
        day = new DisplayDosCaracteres(01);
        month = new DisplayDosCaracteres(01);
        year = new DisplayDosCaracteres(2099);
        minuts =00;
        hours =00;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getFechaYHoras()
    {
        // put your code here;
    }
        
    
    /*
     * Fijar 
     */
    public int fijarFechaYHora(int dia, int mes, int año ,int horas, int minutos){
       day.setValorAlmacenado(dia);
       month.setValorAlmacenado(mes);
       year.setValorAlmacenado(año); 
       minuts=minutos;
       hours=horas;
        
    }
    
}
