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
		boolean excepcion=false;
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
			excepcion = true;
		}
		assertTrue(excepcion);
	}

	@Test
	public void test3() throws Exception {
		ProcesadorRomano procesador3 = new ProcesadorRomano();
		boolean excepcionI =false;
		boolean excepcionL =false;
		boolean excepcionD =false;
		boolean excepcionX =false;
		boolean excepcionC =false;
		
		try {
		assertEquals(3, procesador3.Convierte("IIIII"));
		}catch (Exception e) {
			excepcionI = true;
		}
		try {
		assertEquals(3, procesador3.Convierte("LL"));
		}catch (Exception e) {
			excepcionL = true;
		}
		try {
		assertEquals(3, procesador3.Convierte("DD"));
		}catch (Exception e) {
			excepcionD = true;
		}
		
		try {
		assertEquals(3, procesador3.Convierte("XXXX"));
		}catch (Exception e) {
			excepcionX = true;
		}
		
		try {
		assertEquals(3, procesador3.Convierte("CCCC"));
		}catch (Exception e) {
			excepcionC = true;
		}
		
		assertTrue(excepcionI);
		assertTrue(excepcionL);
		assertTrue(excepcionD);
		assertTrue(excepcionX);
		assertTrue(excepcionC);
	}

}
