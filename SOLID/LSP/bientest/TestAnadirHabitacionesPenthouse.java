package bientest;


import org.junit.Test;

import aplicado.AnadirHabitacion;
import aplicado.Penthouse;

import static org.junit.Assert.assertEquals;

public class TestAnadirHabitacionesPenthouse {
    @Test
    public void testAgregarCuartoPenthouse() {
        Penthouse penthouse = new Penthouse();
        AnadirHabitacion add= new AnadirHabitacion();
        add.agregaCuarto(penthouse);

        assertEquals(5, penthouse.numeroDeCuartos);
    }
}
