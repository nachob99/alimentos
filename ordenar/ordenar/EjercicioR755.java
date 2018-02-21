import java.util.ArrayList;
import java.util.Collections;
class EjercicioR755
{
    public String devolverEnOrden(ArrayList<Integer> numeros)
    { 

        String ordenado ="";
        int indice,menor;
        int aux;

        for(int i=0;i<numeros.size();i++){       

            menor = numeros.get(i);
            indice = i;
            aux = 0;

            for(int j=i+1;j<numeros.size();j++){
                aux = numeros.get(j);
                indice = aux > menor ? j : indice;
                menor = aux > menor ? aux : menor;
            }

            numeros.set(indice,numeros.get(i));
            numeros.set(i,menor);

        }
        for (Integer elementoActual: numeros) {
            ordenado += elementoActual + ", ";
        }

        return (ordenado.length()>0) ? (ordenado.substring(0, ordenado.length()-2)) : (ordenado);
    }
}