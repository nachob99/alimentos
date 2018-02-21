class Ejercicio0122 
{
    public String invertirPalabrasDe4Letras(String palabra) {
        if(palabra.length() != 4) {
            return "";
        }
        else {
            return palabra.substring(3,4) + palabra.substring(2,3) + palabra.substring(1,2) + palabra.substring(0,1);            
        }
    }
}
