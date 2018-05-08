package racional;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestRacionalRendimiento3 {

	private Racional racional;
	private final static int numerador = 617;
	private final static int denominador = 500;

	@Before
	public void iniciar() {
		racional = new Racional(1.234);
	}

	@Test
	public void testCISI3() {
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar iterativo 3: " + diff);
	}

	@Test
	public void testCRSI3() {
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar iterativo 3: " + diff);
	}

	@Test
	public void testCISR3() {
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar recursivo 3: " + diff);
	}

	@Test
	public void testCRSR3() {
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar recursivo 3: " + diff);
	}
}
