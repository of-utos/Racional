package racional;

/**
 * Clase que administra la conversión de números a objetos racionales. <br>
 */
public class Racional {
	/**
	 * Numerador del racional. <br>
	 */
	private int numerador;
	/**
	 * Denominador del racional. <br>
	 */
	private int denominador;
	/**
	 * Número original. <br>
	 */
	private double numero;
	/**
	 * Multiplicador para el conversor. <br>
	 */
	private int multiplicador;

	/**
	 * Crea un número del tipo racional, con nominador y deominador. <br>
	 * 
	 * @param numero
	 *            Número a convertir. <br>
	 */
	public Racional(final double numero) {
		this.numero = numero;
		this.multiplicador = 10;
	}

	/**
	 * Convierte un número a objeto del tipo racional de manera iterativa. <br>
	 */
	public void convertirRacionalIterativo() {
		if (this.numero % 1 == 0) {
			this.numerador = (int) this.numero;
			this.denominador = 1;
		} else {
			while ((this.numero * this.multiplicador) % 1 != 0) {
				multiplicador *= 10;
			}
			this.numerador = (int) (this.numero * this.multiplicador);
			this.denominador = this.multiplicador;
			this.multiplicador = 10;
			if (this.denominador < 0) {
				this.invertirSigno();
			}
		}
	}

	/**
	 * Convierte un número a objeto del tipo racional de manera recursiva. <br>
	 */
	public void convertirRacionalRecursivo() {
		if (this.numero % 1 == 0) {
			this.numerador = (int) this.numero;
			this.denominador = 1;
		} else {
			this.convertirRecursivo();
			this.numerador = (int) (this.numero * this.multiplicador);
			this.denominador = this.multiplicador;
			this.multiplicador = 10;
			if (this.denominador < 0) {
				this.invertirSigno();
			}
		}
	}

	/**
	 * Convierte un número de manera recursiva. <br>
	 */
	private void convertirRecursivo() {
		if ((this.numero * this.multiplicador) % 1 != 0) {
			this.multiplicador *= 10;
			this.convertirRecursivo();
		}
	}

	/**
	 * Simplifica los componentes del racional de manera iterativa. <br>
	 */
	public void simplificarIterativo() {
		int maximo, mcd = 0, pivot = 2;
		if (this.numerador < this.denominador) {
			maximo = this.denominador;
		} else {
			maximo = this.numerador;
		}
		while (pivot <= Math.abs(maximo)) {
			if (((this.numerador % pivot) == 0) && ((this.denominador % pivot) == 0)) {
				mcd = pivot;
			}
			pivot++;
		}
		if (mcd != 0) {
			this.denominador /= mcd;
			this.numerador /= mcd;
		}
	}

	/**
	 * Simplifica los componentes del racional de manera recursiva. <br>
	 */
	public void simplificarRecursivo() {
		int maximo, mcd, pivot = 2;
		if (this.numerador < this.denominador) {
			maximo = this.denominador;
		} else {
			maximo = this.numerador;
		}

	}

	private void obtenerMCDRecursivo() {

	}

	/**
	 * Inviertoel signo de los números. <br>
	 */
	private void invertirSigno() {
		this.denominador *= (-1);
		this.numerador *= (-1);
	}

	/**
	 * Devuelve el numerador. <br>
	 * 
	 * @return Numerador. <br>
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 * Devuelve el denominador. <br>
	 * 
	 * @return Denominador. <br>
	 */
	public int getDenominador() {
		return denominador;
	}
}
