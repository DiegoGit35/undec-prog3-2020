package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import despues.Producto;

class testProductoDespues {

	@Test
	void test1() {
		Producto p = new Producto("mouse", 100);
		assertEquals(p.getPrecio(), 100);
		assertEquals(p.getPrecioSinIva(), 79);
		assertEquals(p.getNombre(), "Mouse");
	}

}
