package es.upm.dit.repaso.ej703;

/** Ejercicio 7.3: fecha (día, mes, año) que valida ser una fecha real posible. */
public class MyDate {

	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		validar(day, month, year);
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		validar(day, month, year);
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	// Cambiar solo el mes puede dejar una fecha imposible: 31/1 pasaría a 31/2.
	// Por eso el orden importa: para ir de 31/1 a 15/2 hay que bajar antes el día
	public void setMonth(int month) {
		validar(day, month, year);
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	// Cambiar solo el año también puede dejar una fecha imposible:
	// 29/2/2024 (bisiesto) pasaría a 29/2/2025
	public void setYear(int year) {
		validar(day, month, year);
		this.year = year;
	}

	// Comprueba que los tres valores juntos forman una fecha real. Todos los
	// setters pasan por aquí, no solo el constructor.
	private static void validar(int day, int month, int year) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("Mes no válido: " + month);
		}
		if (day < 1 || day > diasDelMes(month, year)) {
			throw new IllegalArgumentException(
					"Día no válido: " + day + "/" + month + "/" + year);
		}
	}

	// Número de días del mes dado, teniendo en cuenta los años bisiestos.
	private static int diasDelMes(int mes, int anio) {
		int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (mes == 2 && esBisiesto(anio)) {
			return 29;
		}
		return diasPorMes[mes - 1];
	}

	private static boolean esBisiesto(int anio) {
		return (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
}
