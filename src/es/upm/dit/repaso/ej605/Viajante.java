package es.upm.dit.repaso.ej605;

/** Ejercicio 6.5: viajante, cobra un extra por cada viaje realizado. */
public class Viajante extends Empleado {

	private static final double TARIFA_VIAJE = 300;

	private int viajes;

	public Viajante(String nombre, int viajes) {
		super(nombre);
		this.viajes = viajes;
	}

	@Override
	public double calcularSueldo() {
		return SUELDO_BASE + viajes * TARIFA_VIAJE;
	}
}
