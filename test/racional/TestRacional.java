package racional;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRacional {

	@Test
	public void testConvertirIterativo() {
		Racional racional = new Racional(1.5);
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(15, racional.getNumerador());
		assertEquals(10, racional.getDenominador());
		System.out.println("Convertir iterativo: " + diff);
	}

	@Test
	public void testConvertirRecursivo() {
		Racional racional = new Racional(1.5);
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(15, racional.getNumerador());
		assertEquals(10, racional.getDenominador());
		System.out.println("Convertir recursivo: " + diff);
	}

	@Test
	public void testCISI() {
		Racional racional = new Racional(1.5);
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(3, racional.getNumerador());
		assertEquals(2, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar iterativo: " + diff);
	}

	@Test
	public void testCRSI() {
		Racional racional = new Racional(1.5);
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(3, racional.getNumerador());
		assertEquals(2, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar iterativo: " + diff);
	}

	@Test
	public void testCISR() {
		Racional racional = new Racional(1.5);
		long tIni = System.nanoTime();
		racional.convertirRacionalIterativo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(3, racional.getNumerador());
		assertEquals(2, racional.getDenominador());
		System.out.println("Convertir iterativo - Simplificar recursivo: " + diff);
	}

	@Test
	public void testCRSR() {
		Racional racional = new Racional(1.5);
		long tIni = System.nanoTime();
		racional.convertirRacionalRecursivo();
		racional.simplificarIterativo();
		long tFin = System.nanoTime();
		long diff = tFin - tIni;
		assertEquals(3, racional.getNumerador());
		assertEquals(2, racional.getDenominador());
		System.out.println("Convertir recursivo - Simplificar recursivo: " + diff);
	}
}
