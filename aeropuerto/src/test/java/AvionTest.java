import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AvionTest {

    @Test
    void test01GetMatricula() {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals("LV-AAA", a.getMatricula());
    }

    @Test
    void test02GetMatricula() {
        Avion a = new Avion("lv-aaa", "modelo1", 120, 2010);
        assertEquals("LV-AAA", a.getMatricula());
    }

    @Test
    void test03GetMatricula() {
        Avion a = new Avion(" lv - aaa ", "modelo1", 120, 2010);
        assertEquals("LV-AAA", a.getMatricula());
    }
    @Test
    void test04setMatricula() {
        Avion a = new Avion(" lv - aaa ", "modelo1", 120, 2010);
        assertEquals("LV-AAA", a.getMatricula());
        a.setMatricula("LV-BBB");
        assertEquals("LV-BBB", a.getMatricula());
    }

    @Test
    void test05getModelo() {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals("modelo1", a.getModelo());
    }

    @Test
    void test06setModelo() {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals("modelo1", a.getModelo());
        a.setModelo("modelo2");
        assertEquals("modelo2", a.getModelo());
    }

    @Test
    void test07getCapacidad() {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals(120, a.getCapacidad());
    }

    @Test
    void test08setCapacidad() {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals(120, a.getCapacidad());
        a.setCapacidad(100);
        assertEquals(100, a.getCapacidad());
    }

    @Test
    void test09getAnioFab() {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals(2010, a.getAnioFab());
    }

    @Test
    void test10setAnioFab() {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals(2010, a.getAnioFab());
        a.setAnioFab(2012);
        assertEquals(2010, a.getAnioFab());
    }

    @Test
    void test11setAnioFab() {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals(2010, a.getAnioFab());
        a.setAnioFab(3012);
        assertEquals(2010, a.getAnioFab());
    }

    @Test
    void test12setAnioFab() {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals(2010, a.getAnioFab());
        a.setAnioFab(3012);
        assertEquals(2010, a.getAnioFab());
    }

    @Test
    void test13AvionAdd() {
        List <Avion> lista = new ArrayList<Avion>();
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        Avion a2 = new Avion("LV-AAB", "modelo2", 150, 2010);
        Avion a3 = new Avion("LV-AAC", "modelo5", 100, 2010);
        Avion a4 = new Avion("LQ-AAA", "modelo6", 80, 2010);
        Avion a5 = new Avion("LQ-AAB", "modelo6", 80, 2010);
        Avion a6 = new Avion("LV-X", "modelo9", 2, 2010);
        assertTrue(true, lista.addAvion(a));
        assertTrue(true, lista.addAvion(a2));
        assertTrue(true, lista.addAvion(a3));
        assertTrue(true, lista.addAvion(a4));
        assertTrue(true, lista.addAvion(a5));
        assertTrue(true, lista.addAvion(a6));
        assertTrue(false, lista.addAvion(a));
    }
}