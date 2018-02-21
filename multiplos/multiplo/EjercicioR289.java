import java.util.ArrayList;

class EjercicioR289
{
    public int sumaDeMultiplos(int valorTope, int numero)
    {
        int n = 1;
        int maximo = numero;
        int suma = 0;
        if (numero > 0 && valorTope>=0){
            while (maximo<valorTope){
                suma= suma+(numero*n);
                maximo = maximo + numero;
                n++;
            }

        }
        else {
            suma = -1;
        }
        return suma;
    }

} 