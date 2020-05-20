import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AerolineaTest {

    @Test
    void test01getCuit() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Aerolinea al = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        assertEquals("30-64140555-4", al.getCuit());
    }

    @Test
    void test03setCuit() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Aerolinea al = new Aerolinea("a30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        al.setCuit("30-64140555-3");
        assertEquals("30-64140555-3", al.getCuit());
    }

    @Test
    void test04getCodIATA() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Aerolinea al = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        assertEquals("AR", al.getCodIATA());
    }

    @Test
    void test06setCodIATA() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Aerolinea al = new Aerolinea("a30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        al.setCodIATA("as");
        assertEquals("AS", al.getCodIATA());
    }

    @Test
    void test07getNombre() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Aerolinea al = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        assertEquals("Aerolíneas Argentinas", al.getNombre());
    }

    @Test
    void test08setNombre() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Aerolinea al = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        al.setNombre("Alas del Sur");
        assertEquals("Alas Del Sur", al.getNombre());
    }

    @Test
    void test09getFecha() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 10, 27);
        Aerolinea al = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        assertEquals("27/11/1996", al.getFecha());
    }

    @Test
    void test10SetFecha() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Aerolinea al = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        al.setFecha(2019, 9, 11);
        assertEquals("11/10/2019", al.getFecha());
    }
    @Test
    void test11addAerolinea() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        GregorianCalendar f2 = new GregorianCalendar(1983, 04, 13);
        GregorianCalendar f3 = new GregorianCalendar(2000, 06, 06);
        Aerolinea al = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        Aerolinea al2 = new Aerolinea("30-64142124-2", "CL", "Aerolíneas Argentinas", f2);
        Aerolinea al3 = new Aerolinea("30-64140515-4", "UR", "Aerolíneas Argentinas", f3);
        GestorAerolieas ga = new GestorAerolieas();
        assertEquals(0, ga.cantAerolineas());
        ga.addAerolinea(al);
        assertEquals(1, ga.cantAerolineas());
        ga.addAerolinea(al);
        assertEquals(1, ga.cantAerolineas());
    }
    @Test
    void test12buscarAerolineaxNombre() {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        GregorianCalendar f2 = new GregorianCalendar(1983, 04, 13);
        GregorianCalendar f3 = new GregorianCalendar(2000, 06, 06);
        Aerolinea al = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", f1);
        Aerolinea al2 = new Aerolinea("30-64142124-2", "CL", "Aerolíneas Chilenas", f2);
        Aerolinea al3 = new Aerolinea("30-64140515-4", "UR", "Aerolíneas Uruguayas", f3);
        GestorAerolieas ga = new GestorAerolieas();
        ga.addAerolinea(al);
        ga.addAerolinea(al2);
        ga.addAerolinea(al3);
        List<Aerolinea> lista2 = new ArrayList<Aerolinea>();
        lista2.add(al);
        assertEquals(lista2, ga.buscarAerolineaXnombre("Aerolíneas Argentinas"));
    }
}