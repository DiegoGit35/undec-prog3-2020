import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class PilotoTest {

    @Test
    void test01getCuil() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "Estrada", "Diego", f1);
        assertEquals("30-64140555-4", p.getCuil());
    }

    @Test
    void test02getCuil() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("11111111111", 1234321, "Estrada", "Diego", f1);
        assertEquals("Error, el cuil debe tener la estructura XX-XXXXXXXX-X", p.getCuil());
    }

    @Test
    void test03getCuil() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("11111111111", 1234321, "Estrada", "Diego", f1);
        assertEquals("Error, el cuil debe estar formado por numeros y guiones", p.getCuil());
    }

    @Test
    void test04setCuil() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "Estrada", "Diego", f1);
        assertEquals("30-64140555-4", p.getCuil());
        p.setCuil("11-11111111-1");
        assertEquals("11-11111111-1", p.getCuil());
    }

    @Test
    void test05getLegajo() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "Estrada", "Diego", f1);
        assertEquals(1234321, p.getLegajo());
    }

    @Test
    void test06setLegajo() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "Estrada", "Diego", f1);
        p.setLegajo(111111111);
        assertEquals(111111111, p.getCuil());
    }

    @Test
    void test07getApellido() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "Diego", f1);
        assertEquals("Estrada", p.getApellido());
    }

    @Test
    void test08setApellido() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "Diego", f1);
        p.setApellido("hidalgo");
        assertEquals("Hidalgo", p.getApellido());
    }

    @Test
    void test09getNombre() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "diego", f1);
        assertEquals("diego", p.getNombre());
    }

    @Test
    void test10setNombre() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "Diego", f1);
        p.setNombre("leonardo");
        assertEquals("Leonardo", p.getNombre());
    }

    @Test
    void test11getNombre() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "Estrada321", "diego", f1);
        assertEquals("Error el Apellido no puede contener numeros", p.getNombre());
    }
}