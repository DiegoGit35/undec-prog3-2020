import exceptions.ExceptionPiloto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PilotoTest {

    @Test
    void test01getCuil() throws ExceptionPiloto {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "Estrada", "Diego", f1, RolTripulacion.PILOTO);
        assertEquals("30-64140555-4", p.getCuil());
    }

    @Test
    void test02getCuil() throws ExceptionPiloto {
        try {
            GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
            Piloto p = new Piloto("", 1234321, "Estrada", "Diego", f1, RolTripulacion.PILOTO);
            fail();
        }catch(ExceptionPiloto e){
            assertEquals("el cuil no puede ser vacio", e.getMessage());
        }
    }
    @Test
    void test03getCuil() throws ExceptionPiloto {
        try {
            GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
            Piloto p = new Piloto(null, 1234321, "Estrada", "Diego", f1, RolTripulacion.PILOTO);
            fail();
        }catch(ExceptionPiloto e){
            assertEquals("el cuil no puede ser Nulo", e.getMessage());
        }
    }

    @Test
    void test04getCuil() throws ExceptionPiloto {
        try {
            GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
            Piloto p = new Piloto("121623426", 1234321, "Estrada", "Diego", f1, RolTripulacion.PILOTO);
            fail();
        }catch(ExceptionPiloto e){
            assertEquals("Error, el cuil debe tener la estructura XX-XXXXXXXX-X", e.getMessage());
        }
    }

    @Test
    void test04setCuil() throws ExceptionPiloto {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "Estrada", "Diego", f1, RolTripulacion.PILOTO);
        assertEquals("30-64140555-4", p.getCuil());
        p.setCuil("11-11111111-1");
        assertEquals("11-11111111-1", p.getCuil());
    }

    @Test
    void test05getLegajo() throws ExceptionPiloto {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "Estrada", "Diego", f1, RolTripulacion.PILOTO);
        assertEquals(1234321, p.getLegajo());
    }

    @Test
    void test06setLegajo() throws ExceptionPiloto {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "Estrada", "Diego", f1, RolTripulacion.PILOTO);
        p.setLegajo(111111111);
        assertEquals(111111111, p.getLegajo());
    }

    @Test
    void test07getApellido() throws ExceptionPiloto {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "Diego", f1, RolTripulacion.PILOTO);
        assertEquals("Estrada", p.getApellido());
    }

    @Test
    void test08setApellido() throws ExceptionPiloto {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "Diego", f1, RolTripulacion.PILOTO);
        p.setApellido("hidalgo");
        assertEquals("Hidalgo", p.getApellido());
    }

    @Test
    void test09getNombre() throws ExceptionPiloto {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "diego", f1, RolTripulacion.PILOTO);
        assertEquals("Diego", p.getNombre());
    }

    @Test
    void test10setNombre() throws ExceptionPiloto {
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "Diego", f1, RolTripulacion.PILOTO);
        p.setNombre("leonardo");
        assertEquals("Leonardo", p.getNombre());
    }

//    6. Cargar un piloto nuevo
    @Test
    void test11addPiloto() throws ExceptionPiloto{
        Aerolinea al = new Aerolinea();
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        GregorianCalendar f2 = new GregorianCalendar(1983, 04, 13);
        GregorianCalendar f3 = new GregorianCalendar(2000, 06, 06);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "Diego", f1, RolTripulacion.PILOTO);
        Piloto p2 = new Piloto("30-64140341-2", 1234312, "perez", "jose", f2, RolTripulacion.PILOTO);
        Piloto p3 = new Piloto("30-64149492-3", 1234353, "jimenez", "pedro", f3, RolTripulacion.PILOTO);
        al.addPiloto(p);
        al.addPiloto(p2);
        al.addPiloto(p3);
        assertEquals(3, al.cantPilotos());
    }

//    8. Consultar pilotos
    @Test
    void test12getPilotos() throws ExceptionPiloto {
        Aerolinea al = new Aerolinea();
        List<Piloto> lp= new ArrayList<Piloto>();
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        GregorianCalendar f2 = new GregorianCalendar(1983, 04, 13);
        GregorianCalendar f3 = new GregorianCalendar(2000, 06, 06);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "Diego", f1, RolTripulacion.PILOTO);
        Piloto p2 = new Piloto("30-64140341-2", 1234312, "perez", "jose", f2, RolTripulacion.PILOTO);
        Piloto p3 = new Piloto("30-64149492-3", 1234353, "jimenez", "pedro", f3, RolTripulacion.PILOTO);
        al.addPiloto(p);
        al.addPiloto(p2);
        al.addPiloto(p3);
        lp.add(p);
        lp.add(p2);
        lp.add(p3);
        assertEquals(lp, al.getPilotos());
    }

//    9. Buscar un piloto por legajo
    @Test
    void test13buscarPilotoxLegajo() throws ExceptionPiloto {
        Aerolinea al = new Aerolinea();
        List<Piloto> lp = new ArrayList<Piloto>();
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        GregorianCalendar f2 = new GregorianCalendar(1983, 04, 13);
        GregorianCalendar f3 = new GregorianCalendar(2000, 06, 06);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "Diego", f1, RolTripulacion.PILOTO);
        Piloto p2 = new Piloto("30-64140341-2", 1234312, "perez", "jose", f2, RolTripulacion.PILOTO);
        Piloto p3 = new Piloto("30-64149492-3", 1234353, "jimenez", "pedro", f3, RolTripulacion.PILOTO);
        al.addPiloto(p);
        al.addPiloto(p2);
        al.addPiloto(p3);
        lp.add(p3);
        assertEquals(lp, al.buscarPilotoxLegajo("30-64149492-3"));
    }

//    10. Buscar pilotos por apellido
    @Test
    void test14buscarPilotoxApellido() throws ExceptionPiloto {
        Aerolinea al = new Aerolinea();
        List<Piloto> lp = new ArrayList<Piloto>();
        GregorianCalendar f1 = new GregorianCalendar(1996, 11, 27);
        GregorianCalendar f2 = new GregorianCalendar(1983, 04, 13);
        GregorianCalendar f3 = new GregorianCalendar(2000, 06, 06);
        Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "Diego", f1, RolTripulacion.PILOTO);
        Piloto p2 = new Piloto("30-64140341-2", 1234312, "perez", "jose", f2, RolTripulacion.PILOTO);
        Piloto p3 = new Piloto("30-64149492-3", 1234353, "perez", "pedro", f3, RolTripulacion.PILOTO);
        al.addPiloto(p);
        al.addPiloto(p2);
        al.addPiloto(p3);
        lp.add(p2);
        lp.add(p3);
        assertEquals(lp, al.buscarPilotoxApellido("Perez"));
    }
}