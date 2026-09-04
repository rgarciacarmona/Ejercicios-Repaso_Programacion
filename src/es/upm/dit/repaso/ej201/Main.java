package es.upm.dit.repaso.ej201;

/**
 * Ejercicio 201: Conversión de unidades de tiempo a segundos.
 * Calcula el número de segundos que tiene un año usando tipos
 * primitivos de tamaño mínimo.
 */
public class Main {

	public static void main(String[] args) {
		// El tipo más pequeño que admite cada valor: 365 no cabe en un byte
		// (rango -128..127), los demás sí
		short diasPorAnio = 365;
		byte horasPorDia = 24;
		byte minutosPorHora = 60;
		byte segundosPorMinuto = 60;

		// Calcular segundos totales (necesita long por la magnitud)
		long segundosPorAnio = (long) diasPorAnio * horasPorDia
				* minutosPorHora * segundosPorMinuto;

		System.out.println("Un año tiene: " + segundosPorAnio + " segundos");
	}
}
