package bientest;


import org.junit.Test;

import aplicado.Penthouse;

import static org.junit.Assert.assertEquals;

public class TestPenthouse {
    
	@Test
    public void testInicializarConCuatroCuartos() {
        Penthouse penthouse = new Penthouse();
        assertEquals(4, penthouse.numeroDeCuartos);
    }

    @Test
    public void testSetsSquareFootage() {
        Penthouse penthouse = new Penthouse();
        penthouse.setMetrosCuadrados(1600);

        assertEquals(1600, penthouse.metrosCuadrados);
    }
}
