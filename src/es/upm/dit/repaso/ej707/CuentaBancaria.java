package es.upm.dit.repaso.ej707;

import java.time.LocalDate;

/** Ejercicio 7.7: cuenta bancaria con ingreso, retirada y transferencia. */
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
		saldo += cantidad;
	}

	// Devuelve false y no retira nada si no hay saldo suficiente
	public boolean retirar(float cantidad) {
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

	@Override
	public String toString() {
		return titular + " (" + numeroCuenta + "), apertura " + fechaApertura + ": " + saldo + " €";
	}
}
