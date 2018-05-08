package racional;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestRacionalRendimiento5 {

	private Racional racional;
	private final static int numerador = 133333;
	private final static int denominador = 100000;

	@Before
	public void iniciar() {
		racional = new Racional(1.33333);
	}

	@Test
	public void testCISI5() {
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar iterativo 5: " + diff);
	}

	@Test
	public void testCRSI5() {
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar iterativo 5: " + diff);
	}

	@Test
	public void testCISR5() {
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar recursivo 5: " + diff);
	}

	@Test
	public void testCRSR5() {
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar recursivo 5: " + diff);
	}
}
