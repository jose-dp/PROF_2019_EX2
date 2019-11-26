package es.upm.grise.control;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ClaseExamenTest {

	@Test
	public void testValido1() throws EntradaInvalida {
		List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(2);
		esperado.add(3);
		assertEquals(esperado, ClaseExamen.primos(6));
	}
	
	@Test
	public void testValido2() throws EntradaInvalida {
		List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(13);
		assertEquals(esperado, ClaseExamen.primos(13));
	}
	
	@Test
	public void testValido3() throws EntradaInvalida {
		List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(5);
		esperado.add(5);
		assertEquals(esperado, ClaseExamen.primos(25));
	}
	
	@Test (expected = EntradaInvalida.class)
	public void testInvalido() throws EntradaInvalida {
		ClaseExamen.primos(0);
	}
}
