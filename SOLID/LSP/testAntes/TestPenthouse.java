package testAntes;


import org.junit.Test;

import sinAplicar.Penthouse;

import static org.junit.Assert.assertEquals;


public class TestPenthouse {
    @Test
    public void testInicialCuatroHabitaciones() {
        Penthouse penthouse = new Penthouse();
        assertEquals(4, penthouse.numeroDeCuartos);
    }

    @Test
    public void testSetMetrosCuadrados() {
        Penthouse penthouse = new Penthouse();
        penthouse.setMetrosCuadrados(1500);
        assertEquals(1500, penthouse.metrosCuadrados);
    }
}
