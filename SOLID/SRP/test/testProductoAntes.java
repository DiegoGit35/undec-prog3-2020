package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import antes.Producto;

class testProductoAntes {

	@Test
	void test() {
		Producto p = new Producto("Mouse", 100);
		assertEquals(p.getNombre(), "Mouse");
		assertEquals(p.getPrecioSinIVA(), 79);
	}

}
