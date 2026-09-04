package es.upm.dit.repaso.ej707;

/** Ejercicio 7.7: cuenta VIP, permite saldo negativo hasta un limite. */
public class CuentaVIP extends CuentaBancaria {

	private float saldoNegativoMax;

	public CuentaVIP(String titular, String numeroCuenta, float saldoInicial, float saldoNegativoMax) {
		super(titular, numeroCuenta, saldoInicial);
		this.saldoNegativoMax = saldoNegativoMax;
	}

	@Override
	public boolean retirar(float cantidad) {
		if (!esCantidadValida(cantidad)) {
			return false;
		}

		float saldoResultante = saldo - cantidad;
		if (saldoResultante < -saldoNegativoMax) {
			System.out.println("Se supera el limite de descubierto permitido");
			return false;
		}
		saldo = saldoResultante;
		return true;
	}
}
