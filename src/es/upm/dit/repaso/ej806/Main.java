package es.upm.dit.repaso.ej806;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Ejercicio 8.6: Comprueba si un archivo existe antes de leerlo;
 * si no existe, muestra un mensaje en vez de fallar.
 */
public class Main {

	private static final String RUTA_ARCHIVO = "datos.txt";

	public static void main(String[] args) {
		Path ruta = Path.of(RUTA_ARCHIVO);

		if (!Files.exists(ruta)) {
			System.out.println("El archivo " + RUTA_ARCHIVO + " no existe.");
			return;
		}

		try {
			String contenido = Files.readString(ruta);
			System.out.println(contenido);
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}
}
