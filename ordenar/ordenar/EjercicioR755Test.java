import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class EjercicioR755Test {


    @Test
    public void test01() {
        // Failure message: 
        // Tu codigo no pasa los test
        EjercicioR755 ejercici1 = new EjercicioR755();


        ArrayList<Integer> origen = new ArrayList<>(Arrays.asList(5, 8, 2, 1, 9, 7, 4));
        String resultadoEsperado = "9, 8, 7, 5, 4, 2, 1";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));


        origen = new ArrayList<>(Arrays.asList(10, 4, 5, 4, 3, 9, 1));
        resultadoEsperado = "10, 9, 5, 4, 4, 3, 1";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));


        origen = new ArrayList<>(Arrays.asList(6, 4, 5, 4, 3, 9, 10));
        resultadoEsperado = "10, 9, 6, 5, 4, 4, 3";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));


        origen = new ArrayList<>();
        resultadoEsperado = "";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));
    }
}