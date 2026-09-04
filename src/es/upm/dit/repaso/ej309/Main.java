package es.upm.dit.repaso.ej309;

/**
 * Ejercicio 3.9: invierte el orden de los elementos de un array de chars,
 * devolviendo el resultado en un array nuevo.
 */
public class Main {

	public static void main(String[] args) {
		char[] datos = { 'h', 'o', 'l', 'a' };
		char[] invertido = invertir(datos);
		System.out.println(new String(invertido));
	}

	// Devuelve un array nuevo con 'datos' en orden inverso. Array vacío si es null.
	private static char[] invertir(char[] datos) {
		if (datos == null) {
			return new char[0];
		}
		char[] invertido = new char[datos.length];
		for (int i = 0; i < datos.length; i++) {
			invertido[i] = datos[datos.length - 1 - i];
		}
		return invertido;
	}
}
