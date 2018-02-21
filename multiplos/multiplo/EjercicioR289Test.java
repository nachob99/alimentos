

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EjercicioR289Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EjercicioR289Test
{
    /**
     * Default constructor for test class EjercicioR289Test
     */
    public EjercicioR289Test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void text()
    {
        EjercicioR289 ejercici1 = new EjercicioR289();
    assertEquals(90, ejercici1.sumaDeMultiplos(20, 2));
    assertEquals(18, ejercici1.sumaDeMultiplos(10, 3));
    assertEquals(4950, ejercici1.sumaDeMultiplos(100, 1));
    assertEquals(75, ejercici1.sumaDeMultiplos(30, 5));
    assertEquals(-1, ejercici1.sumaDeMultiplos(100, 0));
    }
}

