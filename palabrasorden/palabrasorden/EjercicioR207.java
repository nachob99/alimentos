import java.util.ArrayList;

class EjercicioR207
{
    public String devolverEnOrden(ArrayList<String> palabras)
    {
        String listado = "";
        while(palabras.size() !=0){

            String palabraOrdenada = palabras.get(0);
            for(String listaPalabra : palabras) {
                if (listaPalabra.length() >= palabraOrdenada.length()){
                    palabraOrdenada = listaPalabra;
                }
            }
            listado = (listado+palabraOrdenada);
            palabras.remove(palabraOrdenada);
            if(palabras.size() >0){
                listado=listado+",";
            }

        }
        return listado;
    }

}
// A continuación puedes escribir otros métodos si lo necesitas...
