package es.upm.dit.repaso.ej805;

/** Ejercicio 8.5: captura cualquier fallo con un mensaje amable en vez de la traza. */
public class Main {

	public static void main(String[] args) {
		try {
			int[] numeros = { 10, 20, 30 };
			int divisor = Integer.parseInt("0");
			int resultado = numeros[5] / divisor;
			System.out.println("Resultado: " + resultado);
		} catch (Exception e) {
			System.out.println("Lo sentimos mucho, algo ha fallado inesperadamente.");
		} finally {
			System.out.println("Fin de la ejecución.");
		}
	}
}
