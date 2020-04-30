package tests;
import org.junit.Test;

import aplicado.Pinguino;

import static org.junit.Assert.assertEquals;


public class TestPinguino {
    @Test
    public void testPuedoNadaaaar() {
        Pinguino p = new Pinguino(5);
        p.nadar();
        assertEquals("En el agua", p.ubicacionActual);
    }

    @Test
    public void testPierdePlumas() {
        Pinguino p = new Pinguino(5);
        p.mudarPlumas();
        assertEquals(1, p.cantidadDePlumas);
    }
}
