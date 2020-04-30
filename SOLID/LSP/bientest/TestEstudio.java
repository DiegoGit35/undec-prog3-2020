package bientest;

import org.junit.Test;

import aplicado.Estudio;

import static org.junit.Assert.assertEquals;

public class TestEstudio {
    @Test
    public void testInitializedWithZeroBedrooms() {
        Estudio estudio = new Estudio();
        assertEquals(0, estudio.numeroDeCuartos);
    }

    @Test
    public void testSetsMetrosCuadrados() {
        Estudio estudio = new Estudio();
        estudio.setMetrosCuadrados(550);

        assertEquals(550, estudio.metrosCuadrados);
    }
}
