import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AeropuertoTest {
    Aeropuerto a = new Aeropuerto("EZE", "Ezeiza", "Chilecito", 5360);
    Aeropuerto a2 = new Aeropuerto("ALP", "Aeropuerto La Plata", "La Plata", 5132);
    Aeropuerto a3 = new Aeropuerto("ALR", "Aeropuerto La Rioja", "La Rioja", 6421);
    @Test
    void test01getCodIATA() {
        assertEquals("EZE", a.getCodIATA());
    }

    @Test
    void test02setCodIATA() {
        a.setCodIATA("ACH");
        assertEquals("ACH", a.getCodIATA());
    }

    @Test
    void test03getNombre() {
        assertEquals("Ezeiza", a.getNombre());
    }

    @Test
    void test04setNombre() {
        Aeropuerto a = new Aeropuerto("EZE", "Ezeiza", "Chilecito", 5360);
        a.setNombre("Aeropuerto la rioja");
        assertEquals("Aeropuerto La Rioja", a.getNombre());
    }

    @Test
    void test05getCiudad() {
        assertEquals("Chilecito", a.getCiudad());
    }

    @Test
    void test06setCiudad() {
        a.setCiudad("famatina");
        assertEquals("Famatina", a.getCiudad());
    }

    @Test
    void test07getCodPostal() {
        assertEquals(5360, a.getCodPostal());
    }

//    15. Cargar un aeropuerto nuevo
    @Test
    void test08addAeropuerto(){
        GestorAeropuerto gap = new GestorAeropuerto();
        gap.addAeropuerto(a);
        gap.addAeropuerto(a2);
        gap.addAeropuerto(a3);
        gap.addAeropuerto(a3);
        assertEquals(3, gap.cantAeropuertos());
    }
//    16. Modificar un aeropuerto existente

//    17. Consultar los aeropuertos
    @Test
    void test09getAeropuertos(){
        List<Aeropuerto> lista2 = new ArrayList<Aeropuerto>();
        GestorAeropuerto gap = new GestorAeropuerto();
        gap.addAeropuerto(a);
        gap.addAeropuerto(a2);
        gap.addAeropuerto(a3);
        lista2.add(a);
        lista2.add(a2);
        lista2.add(a3);
        assertEquals(lista2, gap.getAeropuertos());
    }
//    18. Buscar aeropuerto por código IATA
    @Test
    void test10buscarAeropuertosXcodIATA(){
        List<Aeropuerto> lista2 = new ArrayList<Aeropuerto>();
        GestorAeropuerto gap = new GestorAeropuerto();
        gap.addAeropuerto(a);
        gap.addAeropuerto(a2);
        gap.addAeropuerto(a3);
        lista2.add(a2);
        assertEquals(lista2, gap.buscarXcodIATA("ALP"));
    }

}