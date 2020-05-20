import org.junit.jupiter.api.Test;

import exceptions.ExceptionAvion;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AvionTest {

    @Test
    void test01GetMatricula() throws ExceptionAvion {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals("LV-AAA", a.getMatricula());
    }

    @Test
    void test02GetMatricula() throws ExceptionAvion {
        Avion a = new Avion("lv-aaa", "modelo1", 120, 2010);
        assertEquals("LV-AAA", a.getMatricula());
    }

    @Test
    void test03GetMatricula() throws ExceptionAvion {
        Avion a = new Avion(" lv - aaa ", "modelo1", 120, 2010);
        assertEquals("LV-AAA", a.getMatricula());
    }
    @Test
    void test04setMatricula() throws ExceptionAvion {
        Avion a = new Avion(" lv - aaa ", "modelo1", 120, 2010);
        assertEquals("LV-AAA", a.getMatricula());
        a.setMatricula("LV-BBB");
        assertEquals("LV-BBB", a.getMatricula());
    }

    @Test
    void test05getModelo() throws ExceptionAvion {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals("modelo1", a.getModelo());
    }

    @Test
    void test06setModelo() throws ExceptionAvion {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals("modelo1", a.getModelo());
        a.setModelo("modelo2");
        assertEquals("modelo2", a.getModelo());
    }

    @Test
    void test07getCapacidad() throws ExceptionAvion {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals(120, a.getCapacidad());
    }

    @Test
    void test08setCapacidad() throws ExceptionAvion {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals(120, a.getCapacidad());
        a.setCapacidad(100);
        assertEquals(100, a.getCapacidad());
    }

    @Test
    void test09getAnioFab() throws ExceptionAvion {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        assertEquals(2010, a.getAnioFab());
    }

    @Test
    void test10setAnioFab() throws ExceptionAvion {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        a.setAnioFab(2012);
        assertEquals(2012, a.getAnioFab());
    }

    @Test
    void test11setAnioFab() throws ExceptionAvion {
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        a.setAnioFab(-3012);
        assertEquals(2010, a.getAnioFab());
    }


    @Test
    void test12AddAvion() throws ExceptionAvion {
        Aerolinea al = new Aerolinea();
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        Avion a2 = new Avion("LV-AAB", "modelo2", 150, 2010);
        Avion a3 = new Avion("LV-AAC", "modelo5", 100, 2010);
        Avion a4 = new Avion("LQ-AAA", "modelo6", 80, 2010);
        al.addAvion(a);
        al.addAvion(a2);
        al.addAvion(a3);
        al.addAvion(a4);
        al.addAvion(a);
        al.addAvion(a2);
        assertEquals(4, al.cantAviones());
    }
    @Test
    void test13BuscarAvion() throws ExceptionAvion {
        Aerolinea al = new Aerolinea();
        List<Avion> l1 = new ArrayList<Avion>();
        Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);
        Avion a2 = new Avion("LV-AAB", "modelo2", 150, 2010);
        Avion a3 = new Avion("LV-ABC", "modelo5", 100, 2010);
        Avion a4 = new Avion("LQ-AAA", "modelo6", 80, 2010);
        al.addAvion(a);
        al.addAvion(a2);
        al.addAvion(a3);
        al.addAvion(a4);
        l1.add(a);
        assertEquals(l1, al.buscarAvionesxMatriculas("LV-AAA"));
        l1.add(a2);
        assertEquals(l1, al.buscarAvionesxMatriculas("LV-AA"));
    }
}