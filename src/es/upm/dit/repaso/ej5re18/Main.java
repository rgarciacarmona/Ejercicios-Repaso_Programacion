package es.upm.dit.repaso.ej5re18;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 5.re18: calcula la media móvil de una List de Floats con ventana deslizante.
 */
public class Main {

	public static void main(String[] args) {
		List<Float> datos = List.of(1f, 2f, 3f, 4f, 5f, 6f);
		List<Float> medias = mediaMovil(datos, 3);
		System.out.println(medias);
	}

	// Media de cada elemento junto a los (ventana - 1) anteriores.
	// El resultado tiene tamaño = datos.size() - (ventana - 1).
	private static List<Float> mediaMovil(List<Float> datos, int ventana) {
		List<Float> medias = new ArrayList<>();
		if (datos == null || ventana <= 0 || datos.size() < ventana) {
			return medias;
		}

		for (int i = 0; i <= datos.size() - ventana; i++) {
			float suma = 0f;
			for (int j = i; j < i + ventana; j++) {
				suma += datos.get(j);
			}
			medias.add(suma / ventana);
		}
		return medias;
	}
}
