package co.tutmosisii.gapbinario;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert; 

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

    @Test
    public void obtener2Cadenasvinariasde10001001(){
        App a=new App();
        String binarios[]=a.obtenerCadenasCon0("10001001");
        assertEquals(binarios[0],"10001");
        assertEquals(binarios[1],"1001");
    }


    @Test
    public void obtenerArreglovacio(){
        App a=new App();
        String binarios[]=a.obtenerCadenasCon0("1111111");
        Assert.assertNull(binarios, "Cadena inexperada");
    }
}
