
public class FechaYHora
{
    private NumberDisplay minuto;
    private NumberDisplay hora;
    private DisplayDosCaracteres dia;
    private DisplayDosCaracteres mes;
    private DisplayDosCaracteres anio;

    public  FechaYHora()
    {
        dia = new DisplayDosCaracteres(31);
        mes = new DisplayDosCaracteres(13);
        anio = new DisplayDosCaracteres(100);
        hora = new NumberDisplay(24);
        minuto = new NumberDisplay(60);
    }

    public String getFechaYHora()
    {
        return dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-" + anio.getTextoDelDisplay() +
        " " + hora.getDisplayValue() + ":" + minuto.getDisplayValue();
    }

    public void fijarFechaYHora(int day, int month, int year, int hours, int minutes)
    {
        dia.setValorAlmacenado(day);
        mes.setValorAlmacenado(month);
        anio.setValorAlmacenado(year);
        hora.setValue(hours);
        minuto.setValue(minutes);
    }

    public void avanzar()
    {
        minuto.increment();
        if (minuto.getValue() == 0){
            hora.increment();
            if (hora.getValue() == 0) {
                dia.incrementaValorAlmacenado();
            }
            if (dia.getValorAlmacenado() == 1){
                mes.incrementaValorAlmacenado();
            }
            if (mes.getValorAlmacenado() == 1){
                anio.incrementaValorAlmacenado();
            }
        }
    }
}  
    

    
    
    
    
    
     
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
