package es.upm.dit.repaso.ej703;

/** Ejercicio 7.3: numero racional con suma, multiplicacion y simplificacion. */
public class Racional {

	private int numerador;
	private int denominador;

	public Racional() {
		this.numerador = 0;
		this.denominador = 1;
	}

	public Racional(Racional otro) {
		this.numerador = otro.numerador;
		this.denominador = otro.denominador;
	}

	public Racional(int numerador, int denominador) {
		if (denominador == 0) {
			throw new IllegalArgumentException("El denominador no puede ser 0");
		}
		this.numerador = numerador;
		this.denominador = denominador;
		simplificar();
	}

	public Racional sumar(Racional otro) {
		int numeradorSuma = numerador * otro.denominador + otro.numerador * denominador;
		int denominadorSuma = denominador * otro.denominador;
		return new Racional(numeradorSuma, denominadorSuma);
	}

	public Racional multiplicar(Racional otro) {
		return new Racional(numerador * otro.numerador, denominador * otro.denominador);
	}

	// Reduce la fraccion dividiendo por el maximo comun divisor
	public void simplificar() {
		int mcd = maximoComunDivisor(Math.abs(numerador), Math.abs(denominador));
		if (mcd > 1) {
			numerador /= mcd;
			denominador /= mcd;
		}
		if (denominador < 0) {
			numerador = -numerador;
			denominador = -denominador;
		}
	}

	private int maximoComunDivisor(int a, int b) {
		if (b == 0) {
			return a == 0 ? 1 : a;
		}
		return maximoComunDivisor(b, a % b);
	}

	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}
}
