package PruebasProcesador;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebasProcesadorRomano {

	@Test
	public void test1() {
		ProcesadorRomano procesador = new ProcesadorRomano();
		assertEquals(procesador.Convierte(" "), 0);
		
	}
	@Test
	public void test2() {
		ProcesadorRomano procesador2 = new ProcesadorRomano();
		assertEquals(procesador2.Convierte("I"), 1);
		assertEquals(procesador2.Convierte("II"), 2);
		assertEquals(procesador2.Convierte("III"), 3);
		assertEquals(procesador2.Convierte("V"), 5);
		assertEquals(procesador2.Convierte("X"), 10);
		assertEquals(procesador2.Convierte("L"), 50);
		assertEquals(procesador2.Convierte("C"), 100);
		assertEquals(procesador2.Convierte("D"), 500);
		assertEquals(procesador2.Convierte("M"), 1000);
	}
}
