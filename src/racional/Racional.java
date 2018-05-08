package racional;

public class Racional {

	private int nominador;
	private int denominador;
	private double numero;
	private int multiplicador;

	public Racional(final double numero) {
		this.numero = numero;
		this.multiplicador = 10;
	}

	public void convertirRacionalIterativo() {
		if (this.numero % 1 == 0) {
			this.nominador = (int) this.numero;
			this.denominador = 1;
		} else {
			while ((this.numero * this.multiplicador) % 1 != 0) {
				multiplicador *= 10;
			}
			this.nominador = (int) (this.numero * this.multiplicador);
			this.denominador = this.multiplicador;
			this.multiplicador = 10;
			if (this.denominador < 0) {
				this.invertirSigno();
			}
		}
	}

	public void convertirRacionalRecursivo() {
		if (this.numero % 1 == 0) {
			this.nominador = (int) this.numero;
			this.denominador = 1;
		} else {
			this.convertirRecursivo();
			this.nominador = (int) (this.numero * this.multiplicador);
			this.denominador = this.multiplicador;
			this.multiplicador = 10;
			if (this.denominador < 0) {
				this.invertirSigno();
			}
		}
	}

	private void convertirRecursivo() {
		if ((this.numero * this.multiplicador) % 1 != 0) {
			this.multiplicador *= 10;
			this.convertirRecursivo();
		}
	}

	public void simplificarIterativo() {
		int maximo, mcd = 0, pivot = 2;
		if (this.nominador < this.denominador) {
			maximo = this.denominador;
		} else {
			maximo = this.nominador;
		}
		while (pivot <= Math.abs(maximo)) {
			if (((this.nominador % pivot) == 0) && ((this.denominador % pivot) == 0)) {
				mcd = pivot;
			}
			pivot++;
		}
		if (mcd != 0) {
			this.denominador /= mcd;
			this.nominador /= mcd;
		}
	}

	public void simplificarRecursivo() {
		int maximo, mcd, pivot = 2;
		if (this.nominador < this.denominador) {
			maximo = this.denominador;
		} else {
			maximo = this.nominador;
		}

	}

	private void obtenerMCDRecursivo() {

	}

	private void invertirSigno() {
		this.denominador *= (-1);
		this.nominador *= (-1);
	}

	public int getNominador() {
		return nominador;
	}

	public int getDenominador() {
		return denominador;
	}
}
