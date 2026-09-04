package es.upm.dit.repaso.ej610;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Ejercicio 6.10: Combina el contenido de dos archivos en un tercero,
 * concatenándolos (primero el contenido del primero, luego el del segundo).
 */
public class Main {

	private static final String RUTA_ARCHIVO1 = "archivo1.txt";
	private static final String RUTA_ARCHIVO2 = "archivo2.txt";
	private static final String RUTA_DESTINO = "combinado.txt";

	public static void main(String[] args) {
		try {
			String contenido1 = Files.readString(Path.of(RUTA_ARCHIVO1));
			String contenido2 = Files.readString(Path.of(RUTA_ARCHIVO2));
			String contenidoCombinado = contenido1 + contenido2;
			Files.writeString(Path.of(RUTA_DESTINO), contenidoCombinado);
			System.out.println("Archivos combinados en " + RUTA_DESTINO);
		} catch (IOException e) {
			System.out.println("Error al combinar los archivos: " + e.getMessage());
		}
	}
}
