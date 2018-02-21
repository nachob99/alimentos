import java.util.ArrayList;
class EjercicioR677
{
    public ArrayList<String> devolverPalabraMasLarga(ArrayList<String> palabras)
    {
        ArrayList<String> palabraMasLarga = new ArrayList<String>();
        String palabraMaxima = "";
        if(palabras.size()>0) {
            for(String palabraActual : palabras) {
                if(palabraActual.length() >= palabraMaxima.length()){
                    palabraMaxima = palabraActual;
                }
            }

            for(String palabraActual: palabras){
                if(palabraActual.length() == palabraMaxima.length()){
                    palabraMasLarga.add(palabraActual);
                }
            }
        }
        return palabraMasLarga;
    }

}