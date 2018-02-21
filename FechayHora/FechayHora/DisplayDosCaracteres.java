/**
 * La clase DisplayDosCarcateres representa un display que muestra valores numéricos enteros 
 * desde 1 a un valor limite. El valor del display se muestra siempre con dos caracteres. 
 * El valor limite se especifica cuando se crea el objeto. Se puede hacer avanzar el valor 
 * mostrado a traves de un método, de tal manera que si el valor llega el limite vuelve a uno.
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class DisplayDosCaracteres
{
    // El valor limite que nunca alcanza el display y en el que vuelve a 1
    private int limite;
    // El valor actual que almacena el display
    private int valorAlmacenado;


    /**
     * Constructor de la clase DisplayDosCaracteres
     *
     * @param limiteDisplay El valor máximo que ya no puede mostrar el display
     */
    public DisplayDosCaracteres(int limiteDisplay)
    {
        limite = 2;
        valorAlmacenado = 1;
    }

    /**
     * Devuelve el valor actual como número entero
     */
    public int getValorAlmacenado()
    {
        return valorAlmacenado;
    }

    /**
     * Devuelve el valor del display como cadena de caracteres de longitud 2
     */
    public String getTextoDelDisplay()
    {
        if(valorAlmacenado < 10) {
            return "0" + valorAlmacenado;
        }
        else {
            return "" + valorAlmacenado;
        }
    }

    /**
     * Fija un nuevo valor para el display. Si el nuevo valor no es legal, 
     * entonces no hace nada.
     */
    public void setValorAlmacenado(int nuevoValor)
    {
        if((nuevoValor >= 1) && (nuevoValor < limite)) {
            valorAlmacenado = nuevoValor;
        }
    }

    /**
     * Incrementa el valor del display. Si llega al limite cambia a uno.
     */
    public void incrementaValorAlmacenado()
    {
        valorAlmacenado = valorAlmacenado + 1;
        if (valorAlmacenado == limite) {
            valorAlmacenado = 1;
        }
    }
}