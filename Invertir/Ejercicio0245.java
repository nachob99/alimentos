class Ejercicio0245 
{
    public boolean esCapicua(String palabra) {
        if((palabra.length() == 4) && ((palabra.substring(3,4) + palabra.substring(2,3) + palabra.substring(1,2) + palabra.substring(0,1)).equals(palabra.substring(0,4)))) {
            return true;
        }
        else {
            return false;            
        }
    }
}