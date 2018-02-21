import java.util.ArrayList;

class EjercicioR399
{
    public String encontrarPalabraConMasAes(ArrayList<String> palabras) 
    {
        String palabraAdevolver = null;
        int contador1 = 0;
        int contador2 =1;
        for (String palabra: palabras) {
            String palabraActual  = palabras.get(contador1);
            int aes = 0;
            for (int i=0;i < palabra.length();i++) {
                

                if ((palabraActual.charAt(i) == 'a') ) {            

                    aes++;
                    if(aes >= contador2){
                        contador2=aes;
                        palabraAdevolver = palabraActual;
                    }
                }           

                
            }
            contador1++;         
        }
        return palabraAdevolver;    
    }

}