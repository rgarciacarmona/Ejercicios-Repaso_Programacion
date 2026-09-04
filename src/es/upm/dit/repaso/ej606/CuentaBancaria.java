package es.upm.dit.repaso.ej606;

import java.time.LocalDate;

/** Ejercicio 6.6: cuenta bancaria con ingreso, retirada y transferencia. */
public class CuentaBancaria {

	private String titular;
	private LocalDate fechaApertura;
	private String numeroCuenta;

	// Accesible a las subclases: cada tipo de cuenta ajusta el saldo con sus
	// propias reglas al sobrescribir retirar()
	protected float saldo;

	public CuentaBancaria(String titular, String numeroCuenta, float saldoInicial) {
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldoInicial;
		this.fechaApertura = LocalDate.now();
	}

	public void ingresar(float cantidad) {
		if (!esCantidadValida(cantidad)) {
			return;
		}
		saldo += cantidad;
	}

	// Devuelve false y no retira nada si no hay saldo suficiente
	public boolean retirar(float cantidad) {
		if (!esCantidadValida(cantidad)) {
			return false;
		}
		if (cantidad > saldo) {
			System.out.println("Fondos insuficientes en la cuenta " + numeroCuenta);
			return false;
		}
		saldo -= cantidad;
		return true;
	}

	public void transferir(float cantidad, CuentaBancaria destino) {
		if (!retirar(cantidad)) {
			return;
		}
		destino.ingresar(cantidad);
	}

	// Sin esta comprobación, retirar(-500) aumentaría el saldo en vez de bajarlo, y
	// transferir(-500, otra) sacaría 500 del destino en lugar de ingresarlos.
	// Es protected porque cada subclase reescribe retirar() y debe reutilizarla
	protected boolean esCantidadValida(float cantidad) {
		if (cantidad <= 0) {
			System.out.println("La cantidad debe ser mayor que 0");
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return titular + " (" + numeroCuenta + "), apertura " + fechaApertura + ": " + saldo + " €";
	}
}
