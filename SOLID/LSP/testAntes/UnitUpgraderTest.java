package testAntes;


import org.junit.Test;

import sinAplicar.ActualizarUnidad;
import sinAplicar.Estudio;
import sinAplicar.Penthouse;

import static org.junit.Assert.assertEquals;

public class UnitUpgraderTest {
    @Test
    public void testAumentarMetrosCuadradosPenthouse() {
        Penthouse penthouse = new Penthouse();
        penthouse.setMetrosCuadrados(1500);
        ActualizarUnidad actualiza = new ActualizarUnidad();
        actualiza.upgrade(penthouse);

        assertEquals(1540, penthouse.metrosCuadrados);
    }

    @Test
    public void testAnadirCuartosPenhouse() {
        Penthouse penthouse = new Penthouse();
        ActualizarUnidad actualiza= new ActualizarUnidad();
        actualiza.upgrade(penthouse);

        assertEquals(5, penthouse.metrosCuadrados);
    }

    @Test
    public void testAumentarMetrosCuadradosEstudio() {
        Estudio estudio = new Estudio();
        estudio.setMetrosCuadrados(550);
        ActualizarUnidad actualiza = new ActualizarUnidad();
        actualiza.upgrade(estudio);

        assertEquals(590, estudio.metrosCuadrados);
    }

    @Test
    public void testAnadirCuartosEstudioNoDeberiaAndar() {
        Estudio estudio = new Estudio();
        ActualizarUnidad actualiza = new ActualizarUnidad();
        actualiza.upgrade(estudio);

        assertEquals(0, estudio.numeroDeCuartos);
    }
}
