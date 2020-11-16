package co.tutmosisii.gapbinario;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue; 

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void debePasar10001001con3(){
        App a=new App();
        int respuesta=a.calularGAP("10001001");
        assertEquals(3,respuesta );
    }

    @Test
    public void debePasar1000con0(){
        App a=new App();
        int respuesta=a.calularGAP("1000");
        assertEquals(0,respuesta );
    }

    @Test
    public void debePasar1111con0(){
        App a=new App();
        int respuesta=a.calularGAP("1111");
        assertEquals(0,respuesta );
    }
}
