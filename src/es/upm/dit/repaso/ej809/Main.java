package es.upm.dit.repaso.ej809;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Ejercicio 8.9: Obtiene el tamaño de un archivo en bytes y lo muestra.
 */
public class Main {

	private static final String RUTA_ARCHIVO = "datos.txt";

	public static void main(String[] args) {
		try {
			long tamaño = Files.size(Path.of(RUTA_ARCHIVO));
			System.out.println("El archivo " + RUTA_ARCHIVO + " tiene " + tamaño + " bytes.");
		} catch (IOException e) {
			System.out.println("Error al obtener el tamaño del archivo: " + e.getMessage());
		}
	}
}
