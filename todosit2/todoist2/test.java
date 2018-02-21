

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test
{
    /**
     * Default constructor for test class test
     */
    public test()
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
    public void test01()
    {
        Todoist2 todoist22 = new Todoist2();
        todoist22.addTarea("hola");
        todoist22.addTarea("dormir");
        todoist22.addTarea("beber");
        todoist22.addTarea("soñar");
        todoist22.fijarLimite(0, 22, 12, 2018);
        todoist22.mostrarTareasNumeradas();
        todoist22.fijarLimite(1, 15, 01, 2018);
        todoist22.fijarLimite(2, 5, 11, 2017);
        todoist22.mostrarTareasNumeradas();
        todoist22.olvidaTareasYaPasadas();
        todoist22.mostrarTareasNumeradas();
    }
}

