package racional;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestRacionalRendimiento2 {

	private Racional racional;
	private final static int numerador = 177;
	private final static int denominador = 100;

	@Before
	public void iniciar() {
		racional = new Racional(1.77);
	}

	@Test
	public void testCISI2() {
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar iterativo 2: " + diff);
	}

	@Test
	public void testCRSI2() {
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar iterativo 2: " + diff);
	}

	@Test
	public void testCISR2() {
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar recursivo 2: " + diff);
	}

	@Test
	public void testCRSR2() {
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(numerador, racional.getNumerador());
		assertEquals(denominador, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar recursivo 2: " + diff);
	}
}
