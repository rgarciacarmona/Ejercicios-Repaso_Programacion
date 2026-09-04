package es.upm.dit.repaso.ej604;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Ejercicio 6.4: Copia el contenido de un archivo a otro
 * (rutas de ejemplo fijas en constantes).
 */
public class Main {

	private static final String RUTA_ORIGEN = "origen.txt";
	private static final String RUTA_DESTINO = "destino.txt";

	public static void main(String[] args) {
		try {
			String contenido = Files.readString(Path.of(RUTA_ORIGEN));
			Files.writeString(Path.of(RUTA_DESTINO), contenido);
			System.out.println("Archivo copiado de " + RUTA_ORIGEN + " a " + RUTA_DESTINO);
		} catch (IOException e) {
			System.out.println("Error al copiar el archivo: " + e.getMessage());
		}
	}
}
