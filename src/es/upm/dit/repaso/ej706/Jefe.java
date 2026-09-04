package es.upm.dit.repaso.ej706;

/** Ejercicio 7.6: jefe, cobra un suplemento por cada año de antigüedad. */
public class Jefe extends Empleado {

	private static final double SUPLEMENTO_ANIO = 500;

	private int antiguedad;

	public Jefe(String nombre, int antiguedad) {
		super(nombre);
		this.antiguedad = antiguedad;
	}

	@Override
	public double calcularSueldo() {
		return SUELDO_BASE + antiguedad * SUPLEMENTO_ANIO;
	}
}
