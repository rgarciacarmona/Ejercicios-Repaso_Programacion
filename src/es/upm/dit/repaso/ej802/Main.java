package es.upm.dit.repaso.ej802;

/** Ejercicio 8.2: separa una línea CSV en sus componentes, validando el formato. */
public class Main {

	private static final String SEPARADOR = ",";

	public static void main(String[] args) {
		String lineaValida = "Ana,25,Madrid";
		String lineaInvalida = "Ana,,25,,,";

		procesar(lineaValida);
		procesar(lineaInvalida);
	}

	// Procesa una línea CSV mostrando sus componentes, o el error si el formato no es válido.
	private static void procesar(String linea) {
		try {
			String[] campos = dividir(linea);
			System.out.println("Línea \"" + linea + "\" -> " + campos.length + " campos");
		} catch (FormatoCsvInvalidoException e) {
			System.out.println("Error al procesar \"" + linea + "\": " + e.getMessage());
		}
	}

	// Divide la línea por comas. Se considera inválida si queda algún campo vacío,
	// ya que el formato esperado es "valor1,valor2,valor3,...".
	private static String[] dividir(String linea) throws FormatoCsvInvalidoException {
		String[] campos = linea.split(SEPARADOR);

		for (String campo : campos) {
			if (campo.trim().isEmpty()) {
				throw new FormatoCsvInvalidoException("campo vacío en la línea");
			}
		}
		return campos;
	}
}
