package es.upm.dit.repaso.ej705;

/** Ejercicio 7.5: captura cualquier fallo con un mensaje amable en vez de la traza. */
public class Main {

	public static void main(String[] args) {
		try {
			// Fallo provocado: el array tiene 3 posiciones (0, 1 y 2), así que
			// leer la 5 lanza ArrayIndexOutOfBoundsException
			int[] numeros = { 10, 20, 30 };
			System.out.println("Valor: " + numeros[5]);
		} catch (Exception e) {
			System.out.println("Lo sentimos mucho, algo ha fallado inesperadamente.");
		} finally {
			System.out.println("Fin de la ejecución.");
		}
	}
}
