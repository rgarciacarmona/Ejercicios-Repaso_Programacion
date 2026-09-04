package es.upm.dit.repaso.ej803;

/** Ejercicio 8.3: fecha (día, mes, año) que valida ser una fecha real posible. */
public class MyDate {

	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day < 1 || day > diasDelMes(month, year)) {
			throw new IllegalArgumentException("Día no válido: " + day);
		}
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("Mes no válido: " + month);
		}
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Número de días del mes dado, teniendo en cuenta los años bisiestos.
	private int diasDelMes(int mes, int anio) {
		int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (mes == 2 && esBisiesto(anio)) {
			return 29;
		}
		return diasPorMes[mes - 1];
	}

	private boolean esBisiesto(int anio) {
		return (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
}
