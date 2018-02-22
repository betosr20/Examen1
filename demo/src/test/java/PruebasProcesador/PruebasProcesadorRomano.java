package PruebasProcesador;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebasProcesadorRomano {
	private ProcesadorRomano procesador = new ProcesadorRomano();
	@Test
	public void test1() throws Exception {
		assertEquals(0, procesador.Convierte(""));
		
	}
	@Test
	public void test2() throws Exception {
		boolean excepcion=false;
		assertEquals(1, procesador.Convierte("I"));
		assertEquals(2, procesador.Convierte("II"));
		assertEquals(3, procesador.Convierte("III"));
		assertEquals(5, procesador.Convierte("V"));
		assertEquals(10, procesador.Convierte("X"));
		assertEquals(50, procesador.Convierte("L"));
		assertEquals(100, procesador.Convierte("C"));
		assertEquals(500, procesador.Convierte("D"));
		assertEquals(1000, procesador.Convierte("M"));
		try {
		assertEquals(1000, procesador.Convierte("IIII"));
		}catch (Exception e){
			excepcion = true;
		}
		assertTrue(excepcion);
	}

	@Test
	public void test3() throws Exception {
		boolean excepcionI =false;
		boolean excepcionL =false;
		boolean excepcionD =false;
		boolean excepcionX =false;
		boolean excepcionC =false;
		
		try {
		assertEquals(3, procesador.Convierte("IIIII"));
		}catch (Exception e) {
			excepcionI = true;
		}
		try {
		assertEquals(3, procesador.Convierte("LL"));
		}catch (Exception e) {
			excepcionL = true;
		}
		try {
		assertEquals(3, procesador.Convierte("DD"));
		}catch (Exception e) {
			excepcionD = true;
		}
		
		try {
		assertEquals(3, procesador.Convierte("XXXX"));
		}catch (Exception e) {
			excepcionX = true;
		}
		
		try {
		assertEquals(3, procesador.Convierte("CCCC"));
		}catch (Exception e) {
			excepcionC = true;
		}
		
		assertTrue(excepcionI);
		assertTrue(excepcionL);
		assertTrue(excepcionD);
		assertTrue(excepcionX);
		assertTrue(excepcionC);
	}
	
	@Test
	public void test4() throws Exception {
		boolean excepcion=false;
		try {
		assertEquals(1000, procesador.Convierte("XXL"));
		}catch (Exception e){
			excepcion = true;
		}
		assertTrue(excepcion);
	}

	@Test
	public void test5() throws Exception {
		assertEquals(60, procesador.Convierte("LX"));
		assertEquals(16, procesador.Convierte("XVI"));
		assertEquals(8, procesador.Convierte("VIII"));
		assertEquals(21, procesador.Convierte("XXI"));
		assertEquals(101, procesador.Convierte("CI"));
		assertEquals(161, procesador.Convierte("CLXI"));
	}
}
