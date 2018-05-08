package racional;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestRacionalRendimiento4 {

	private Racional racional;
	private final static int numerador = 3753;
	private final static int denominador = 2000;

	@Before
	public void iniciar() {
		racional = new Racional(1.8765);
	}

	@Test
	public void testCISI4() {
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar iterativo 4: " + diff);
	}

	@Test
	public void testCRSI4() {
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar iterativo 4: " + diff);
	}

	@Test
	public void testCISR4() {
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar recursivo 4: " + diff);
	}

	@Test
	public void testCRSR4() {
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar recursivo 4: " + diff);
	}
}
