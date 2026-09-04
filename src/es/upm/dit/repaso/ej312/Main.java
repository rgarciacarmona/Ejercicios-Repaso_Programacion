package es.upm.dit.repaso.ej312;

/**
 * Ejercicio 3.12: concatena dos arrays de chars en uno nuevo.
 */
public class Main {

	public static void main(String[] args) {
		char[] primero = { 'h', 'o', 'l', 'a' };
		char[] segundo = { 'm', 'u', 'n', 'd', 'o' };
		char[] resultado = concatenar(primero, segundo);
		System.out.println(new String(resultado));
	}

	// Concatena 'primero' y 'segundo'. Trata null como array vacío.
	private static char[] concatenar(char[] primero, char[] segundo) {
		int tamPrimero = primero == null ? 0 : primero.length;
		int tamSegundo = segundo == null ? 0 : segundo.length;
		char[] resultado = new char[tamPrimero + tamSegundo];

		for (int i = 0; i < tamPrimero; i++) {
			resultado[i] = primero[i];
		}
		for (int i = 0; i < tamSegundo; i++) {
			resultado[tamPrimero + i] = segundo[i];
		}
		return resultado;
	}
}
