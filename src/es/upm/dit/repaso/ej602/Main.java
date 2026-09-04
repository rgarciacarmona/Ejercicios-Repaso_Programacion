package es.upm.dit.repaso.ej602;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Ejercicio 6.2: Almacena un array de floats en un archivo,
 * sobrescribiéndolo si ya existe.
 */
public class Main {

	private static final String RUTA_ARCHIVO = "floats.txt";

	public static void main(String[] args) {
		float[] valores = { 1.5f, 2.3f, 4.7f, 8.1f, 9.9f };

		try {
			String contenido = Arrays.toString(valores);
			Files.writeString(Path.of(RUTA_ARCHIVO), contenido);
			System.out.println("Array guardado en " + RUTA_ARCHIVO);
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		}
	}
}
