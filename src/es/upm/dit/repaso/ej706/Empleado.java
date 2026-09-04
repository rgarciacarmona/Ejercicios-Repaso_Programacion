package es.upm.dit.repaso.ej706;

/** Ejercicio 7.6: empleado base con sueldo fijo. */
public class Empleado {

	protected static final double SUELDO_BASE = 1000;

	private String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public double calcularSueldo() {
		return SUELDO_BASE;
	}

	@Override
	public String toString() {
		return nombre + ": " + calcularSueldo() + " €";
	}
}
