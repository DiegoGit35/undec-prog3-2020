package testAntes;


import org.junit.Test;

import sinAplicar.Estudio;

import static org.junit.Assert.assertEquals;

public class TestEstudio {
    @Test
    public void testInicialZeroHabitaciones() {
        Estudio estudio = new Estudio();
        assertEquals(0, estudio.numeroDeCuartos);
    }

    @Test
    public void testSetMetrosCuadrados() {
        Estudio estudio = new Estudio();
        estudio.setMetrosCuadrados(600);
        assertEquals(600, estudio.metrosCuadrados);
    }
}
