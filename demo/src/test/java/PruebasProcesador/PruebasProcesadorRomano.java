package PruebasProcesador;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebasProcesadorRomano {

	@Test
	public void test1() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		assertEquals(0, procesador.Convierte(""));
		
	}
	@Test
	public void test2() throws Exception {
		ProcesadorRomano procesador2 = new ProcesadorRomano();
		assertEquals(1, procesador2.Convierte("I"));
		assertEquals(2, procesador2.Convierte("II"));
		assertEquals(3, procesador2.Convierte("III"));
		assertEquals(5, procesador2.Convierte("V"));
		assertEquals(10, procesador2.Convierte("X"));
		assertEquals(50, procesador2.Convierte("L"));
		assertEquals(100, procesador2.Convierte("C"));
		assertEquals(500, procesador2.Convierte("D"));
		try {
		assertEquals(1000, procesador2.Convierte("IIII"));
		}catch (Exception e){
		}
	}
}
