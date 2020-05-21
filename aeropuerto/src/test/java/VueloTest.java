import exceptions.*;
import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VueloTest {
    GregorianCalendar fPiloto = new GregorianCalendar(1996, 11, 27);
    GregorianCalendar fCopiloto = new GregorianCalendar(1996, 11, 27);
    GregorianCalendar fAerolinea = new GregorianCalendar(1996, 11, 27);
    GregorianCalendar hSalida = new GregorianCalendar(2020, 05, 20, 8, 30);
    GregorianCalendar hLlegada = new GregorianCalendar(2020, 05, 20, 10, 30 );
    Piloto p = new Piloto("30-64140555-4", 1234321, "estrada", "diego", fPiloto,RolTripulacion.PILOTO);
    Piloto Cop = new Piloto("30-64140555-4", 1234321, "estrada", "diego", fCopiloto, RolTripulacion.COPILOTO);
    List<Piloto> t = new ArrayList<Piloto>();
    Aeropuerto apSalida = new Aeropuerto("MDZ", "Mendoza", "El Plumerillo", 4360);
    Aeropuerto apDestino = new Aeropuerto("EZE", "Ezeiza", "Ezeiza", 5360);
    Aerolinea al = new Aerolinea("30-64140555-4", "ar", "Aerolíneas Argentinas", fAerolinea);
    Avion a = new Avion("LV-AAA", "modelo1", 120, 2010);

    VueloTest() throws ExceptionPiloto, ExceptionAvion, ExceptionAeropuerto, ExceptionAerolinea {
    }

    @Test
    void test01getCodVuelo() throws ExceptionVuelo {
        t.add(p);
        t.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        assertEquals("AR 0001", v.getCodVuelo());
        Vuelo v2 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        assertEquals("AR 0002", v.getCodVuelo());
    }

    @Test
    void test02getHoraSalida() throws ExceptionVuelo {
        t.add(p);
        t.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        assertEquals("08:30", v.getSalida());
    }
//    23 Cambiar fechas del vuelo (reprogramar)
    @Test
    void test03setSalida() throws ExceptionVuelo {
        t.add(p);
        t.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        v.setSalida(2020, 05, 20, 9, 30);
        assertEquals("09:30", v.getSalida());
    }

    @Test
    void test04getArribo() throws ExceptionVuelo {
        t.add(p);
        t.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        assertEquals("10:30", v.getArribo());
    }

    @Test
    void test05setArribo() throws ExceptionVuelo {
        t.add(p);
        t.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        v.setArribo(2020, 05, 20, 11, 30);
        assertEquals("11:30", v.getArribo());
    }

    @Test
    void test06getAeropuertoSal() throws ExceptionVuelo {
        t.add(p);
        t.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        assertEquals(apSalida, v.getAeropuertoSal());
    }

    @Test
    void test07setAeropuertoSal() throws ExceptionVuelo, ExceptionAeropuerto {
        t.add(p);
        t.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        Aeropuerto apSalida2 = new Aeropuerto("IRJ", "La Rioja", "La Rioja", 4360);
        v.setAeropuertoSal(apSalida2);
        assertSame(apSalida2, v.getAeropuertoSal());
    }

    @Test
    void test08test08getAeropuertoDest() throws ExceptionVuelo {
        t.add(p);
        t.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        assertEquals(apDestino, v.getAeropuertoDest());
    }

    @Test
    void test09setAeropuertoDest() throws ExceptionVuelo, ExceptionAeropuerto {
        t.add(p);
        t.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        Aeropuerto apDestino2 = new Aeropuerto("IRJ", "La Rioja", "La Rioja", 4360);
        v.setAeropuertoDest(apDestino2);
        assertSame(apDestino2, v.getAeropuertoDest());
    }

    @Test
    void test10getAvion() throws ExceptionVuelo {
        t.add(p);
        t.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        assertEquals(a, v.getAvion());
    }

    //    20. Cambiar un avión de un vuelo
    @Test
    void test11setAvion() throws ExceptionAvion, ExceptionVuelo {
        t.add(p);
        t.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        Avion a2 = new Avion("LV-ABB", "modelo2", 150, 2006);
        v.setAvion(a2);
        assertEquals(a2, v.getAvion());
    }

    @Test
    void test12getTripulacion() throws ExceptionVuelo {
        t.add(p);
        t.add(Cop);
        List<Piloto> lp = new ArrayList<Piloto>();
        lp.add(p);
        lp.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        assertEquals(lp, v.getTripulacion());
    }

//    21. Cambiar el comandante de un vuelo
    @Test
    void test13setPiloto() throws ExceptionPiloto, ExceptionVuelo {
        Piloto p2 = new Piloto("30-64140555-4", 1234321, "estrada", "diego", fPiloto, RolTripulacion.PILOTO);
        List<Piloto> lp = new ArrayList<Piloto>();
        t.remove(p);
        t.add(p2);
        lp.add(p2);
        lp.add(Cop);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        v.setTripulacion(lp);
    }

//    22. Cambiar el copiloto de un vuelo
    @Test
    void test14setCoPiloto() throws ExceptionPiloto, ExceptionVuelo {
        Piloto cop2 = new Piloto("30-64140555-4", 1234321, "estrada", "diego", fPiloto, RolTripulacion.COPILOTO);
        List<Piloto> lp = new ArrayList<Piloto>();
        t.remove(Cop);
        t.add(cop2);
        lp.add(p);
        lp.add(cop2);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        v.setTripulacion(lp);
    }
//    19 Cargar nuevos vuelos
    @Test
    void test15addVuelo() throws ExceptionAerolinea, ExceptionVuelo {
        Aerolinea al2 = new Aerolinea("30-64140555-4", "CL", "Aerolíneas Chile", fAerolinea);
        Aerolinea al3 = new Aerolinea("30-64140555-4", "UR", "Aerolíneas Uru", fAerolinea);
        Vuelo v = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        Vuelo v2 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al2);
        Vuelo v3 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al3);
        GestorVuelo gv = new GestorVuelo();
        gv.addVuelo(v);
        gv.addVuelo(v2);
        gv.addVuelo(v3);
        assertEquals(3, gv.misVuelos.size());
    }
//    24. Buscar vuelos por fecha
    @Test
    void test16buscarVuelosXfecha() throws ExceptionAerolinea, ExceptionVuelo {
        Aerolinea al2 = new Aerolinea("30-64140555-4", "CL", "Aerolíneas Chile", fAerolinea);
        Aerolinea al3 = new Aerolinea("30-64140555-4", "UR", "Aerolíneas Uru", fAerolinea);
        GregorianCalendar fecha = new GregorianCalendar(2020, 05, 20);
        GregorianCalendar hSalida2 = new GregorianCalendar(2020, 05, 19, 9, 40);
        Vuelo v = new Vuelo(hSalida2, hLlegada, apSalida, apDestino, a, t, al);
        Vuelo v2 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al2);
        Vuelo v3 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al3);
        GestorVuelo gv = new GestorVuelo();
        gv.addVuelo(v);
        gv.addVuelo(v2);
        gv.addVuelo(v3);
        List<Vuelo> lv = new ArrayList<Vuelo>();
        lv.add(v2);
        lv.add(v3);
        assertEquals(lv, gv.buscarVuelosXfecha(fecha));
    }

//    25 Buscar vuelos por aerolínea
    @Test
    void test17buscarVuelosXAerolinea() throws ExceptionAerolinea, ExceptionVuelo {
        Aerolinea al2 = new Aerolinea("30-64140555-4", "CL", "Aerolíneas Chile", fAerolinea);
        Aerolinea al3 = new Aerolinea("30-64140555-4", "UR", "Aerolíneas Uru", fAerolinea);
        GregorianCalendar fecha = new GregorianCalendar(2020, 05, 20);
        GregorianCalendar hSalida2 = new GregorianCalendar(2020, 05, 19, 9, 40);
        Vuelo v = new Vuelo(hSalida2, hLlegada, apSalida, apDestino, a, t, al);
        Vuelo v2 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al2);
        Vuelo v3 = new Vuelo(hSalida, hLlegada, apSalida, apDestino, a, t, al);
        GestorVuelo gv = new GestorVuelo();
        gv.addVuelo(v);
        gv.addVuelo(v2);
        gv.addVuelo(v3);
        List<Vuelo> lv = new ArrayList<Vuelo>();
        lv.add(v);
        lv.add(v3);
        assertEquals(lv, gv.buscarVuelosXaerolnea(al));
    }

}