package es.upm.dit.repaso.ej707;

import java.time.LocalDate;

/** Ejercicio 7.7: cuenta a plazo fijo, penaliza retiradas antes del vencimiento. */
public class CuentaPlazoFijo extends CuentaBancaria {

	private static final float PENALIZACION = 0.05f;

	private LocalDate fechaVencimiento;

	public CuentaPlazoFijo(String titular, String numeroCuenta, float saldoInicial, LocalDate fechaVencimiento) {
		super(titular, numeroCuenta, saldoInicial);
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public boolean retirar(float cantidad) {
		float total = cantidad;
		if (LocalDate.now().isBefore(fechaVencimiento)) {
			total = cantidad * (1 + PENALIZACION);
		}
		if (total > saldo) {
			System.out.println("Fondos insuficientes (incluida penalizacion)");
			return false;
		}
		saldo -= total;
		return true;
	}
}
