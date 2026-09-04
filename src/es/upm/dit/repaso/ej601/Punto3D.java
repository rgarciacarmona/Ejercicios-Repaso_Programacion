package es.upm.dit.repaso.ej601;

/** Ejercicio 6.1: punto en el espacio tridimensional. */
public class Punto3D {

	private double x;
	private double y;
	private double z;

	public Punto3D() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}

	public Punto3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
}
