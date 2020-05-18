import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AeropuertoTest {

    @Test
    void test01getCodIATA() {
        Aeropuerto a = new Aeropuerto("EZE", "Ezeiza", "Chilecito", 5360);
        assertEquals("EZE", a.getCodIATA());
    }

    @Test
    void test02setCodIATA() {
        Aeropuerto a = new Aeropuerto("EZE", "Ezeiza", "Chilecito", 5360);
        a.setCodIATA("ACH");
        assertEquals("ACH", a.getCodIATA());
    }

    @Test
    void test03getNombre() {
        Aeropuerto a = new Aeropuerto("EZE", "Ezeiza", "Chilecito", 5360);
        assertEquals("Ezeiza", a.getNombre());
    }

    @Test
    void test04setNombre() {
        Aeropuerto a = new Aeropuerto("EZE", "Ezeiza", "Chilecito", 5360);
        a.setNombre("la rioja");
        assertEquals("La Rioja", a.getCiudad());
    }

    @Test
    void test05getCiudad() {
        Aeropuerto a = new Aeropuerto("EZE", "Ezeiza", "la rioja", 5360);
        assertEquals("La Rioja", a.getCiudad());
    }

    @Test
    void test06setCiudad() {
        Aeropuerto a = new Aeropuerto("EZE", "Ezeiza", "la rioja", 5360);
        a.setCiudad("famatina");
        assertEquals("Famatina", a.getCiudad());
    }

    @Test
    void test07setCiudad() {
        Aeropuerto a = new Aeropuerto("EZE", "Ezeiza", "la rioja", 5360);
        a.setCiudad("12321");
        assertEquals("Error el nombre del aeropuerto no puede contener numeros", a.getNombre());
    }

    @Test
    void test08getCodPostal() {
        Aeropuerto a = new Aeropuerto("EZE", "Ezeiza", "Chilecito", 5360);
        assertEquals("5360", a.getCodPostal());
    }
}