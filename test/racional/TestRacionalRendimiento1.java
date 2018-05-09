package racional;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRacionalRendimiento1 {

	private Racional racional;

	@Before
	public void iniciar() {
		racional = new Racional(1.5);
	}

	@Test
	public void testCISI1() {
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(3, racional.getNumerador());
		assertEquals(2, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar iterativo 1: " + diff);
	}

	@Test
	public void testCRSI1() {
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(3, racional.getNumerador());
		assertEquals(2, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar iterativo 1: " + diff);
	}

	@Test
	public void testCISR1() {
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarRecursivo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(3, racional.getNumerador());
		assertEquals(2, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar recursivo 1: " + diff);
	}

	@Test
	public void testCRSR1() {
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarRecursivo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(3, racional.getNumerador());
		assertEquals(2, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar recursivo 1: " + diff);
	}
}
