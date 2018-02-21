/**
 * Write a description of class CalendarioBasico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private DisplayDosCaracteres day;
    private DisplayDosCaracteres month;
    private DisplayDosCaracteres year;
    private DisplayDosCaracteres hours;
    private DisplayDosCaracteres minuts;
    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        day = new DisplayDosCaracteres(31);
        month = new DisplayDosCaracteres(13);
        year = new DisplayDosCaracteres(2900);

    }

    /**
     * Avanzar de fecha dia a dia
     */
    public void avanzarFecha()
    {
        day.incrementaValorAlmacenado();
        if(day.getValorAlmacenado() == 1){
            month.incrementaValorAlmacenado();
            if(month.getValorAlmacenado() == 1){
                year.incrementaValorAlmacenado();
            }    
        }
    }

    /**
     * Fijar fecha
     */
    public void fijarFecha(int dia, int mes, int ano)
    {
        day.setValorAlmacenado(dia);
        month.setValorAlmacenado(mes);
        year.setValorAlmacenado(ano);  
    }

    /**
     * Nos muestra la fecha
     */
    public String obtenerFecha()
    {
        return day.getTextoDelDisplay() + "-" +  month.getTextoDelDisplay() + "-" + year.getTextoDelDisplay();
    }
}
