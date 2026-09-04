package es.upm.dit.repaso.ej707;

import java.util.Random;

/** Ejercicio 7.7: DNI español con calculo y validacion de letra. */
public class DNI {

	private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
	private static final int MODULO = 23;
	private static final int NUMERO_MAX = 99999999;

	// Hasta 8 digitos y, opcionalmente, la letra: "12345678" o "12345678Z"
	private static final String PATRON = "\\d{1,8}[A-Z]?";

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

	// Acepta el numero solo o el numero con su letra. Cualquier otra cosa se
	// rechaza aqui, con un mensaje que dice que pasa, en vez de dejar que reviente
	// Integer.parseInt con un "For input string" que no ayuda a nadie
	public DNI(String dniCompleto) {
		String texto = dniCompleto.trim().toUpperCase();
		if (!texto.matches(PATRON)) {
			throw new IllegalArgumentException("DNI mal escrito: " + dniCompleto);
		}

		boolean traeLetra = Character.isLetter(texto.charAt(texto.length() - 1));
		String digitos = texto;
		if (traeLetra) {
			digitos = texto.substring(0, texto.length() - 1);
		}

		int numeroTexto = Integer.parseInt(digitos);
		char letraCalculada = calcularLetra(numeroTexto);
		if (traeLetra && texto.charAt(texto.length() - 1) != letraCalculada) {
			throw new IllegalArgumentException("Letra no compatible con el numero de DNI");
		}

		this.numero = numeroTexto;
		this.letra = letraCalculada;
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
