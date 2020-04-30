package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import aplicado.Genero;
import aplicado.Libro;
import aplicado.Novela;

class testLibrosConOCP {

	@Test
	void test() {
		Novela n = new Novela();
		Libro l = new Libro("cien años de soledad", n, "Gabriel Garcia Marquez", 100);
		assertEquals(l.getNombre(), "cien años de soledad");
		assertEquals(l.getAutor(), "Gabriel Garcia Marquez");
		assertEquals(l.getPrecio(), 100);
		assertEquals(l.descuento(), 10);
	}

}
