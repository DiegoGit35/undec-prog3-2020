package tests;
import org.junit.Test;

import sinAplicar.CabecitaNegra;

import static org.junit.Assert.assertEquals;


public class TestCabecitaNegra{
    @Test
    public void testEstaVolando() {
    	CabecitaNegra cn = new CabecitaNegra(5);
        cn.volar();
        assertEquals("En el aire", cn.ubicacionActual);
    }

    @Test
    public void testPierdePlumas() {
    	CabecitaNegra cn = new CabecitaNegra(5);
        cn.mudarPlumas();
        assertEquals(4, cn.cantidadDePlumas);
    }
}
