package es.upm.dit.repaso.ej704;

import java.util.Random;

/** Ejercicio 7.4: DNI español con calculo y validacion de letra. */
public class DNI {

	private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
	private static final int MODULO = 23;
	private static final int NUMERO_MAX = 99999999;

	private int numero;
	private char letra;

	public DNI(int numero) {
		this.numero = numero;
		this.letra = calcularLetra(numero);
	}

	public DNI(int numero, char letra) {
		char letraNormalizada = Character.toUpperCase(letra);
		if (letraNormalizada != calcularLetra(numero)) {
			throw new IllegalArgumentException("Letra no compatible con el numero de DNI");
		}
		this.numero = numero;
		this.letra = letraNormalizada;
	}

	public DNI(String dniCompleto) {
		String texto = dniCompleto.trim().toUpperCase();
		int numeroTexto = Integer.parseInt(texto.substring(0, texto.length() - 1));
		char letraTexto = texto.charAt(texto.length() - 1);
		if (letraTexto != calcularLetra(numeroTexto)) {
			throw new IllegalArgumentException("Letra no compatible con el numero de DNI");
		}
		this.numero = numeroTexto;
		this.letra = letraTexto;
	}

	public DNI() {
		this.numero = new Random().nextInt(NUMERO_MAX + 1);
		this.letra = calcularLetra(numero);
	}

	// Formula oficial: letra = tabla fija de 23 letras indexada por numero % 23
	private static char calcularLetra(int numero) {
		return LETRAS.charAt(numero % MODULO);
	}

	@Override
	public String toString() {
		return String.format("%08d%c", numero, letra);
	}
}
