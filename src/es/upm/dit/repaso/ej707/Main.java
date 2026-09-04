package es.upm.dit.repaso.ej707;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/** Ejercicio 7.7: crea cuentas de los 3 tipos y opera con ellas por polimorfismo. */
public class Main {

	public static void main(String[] args) {
		CuentaBancaria normal = new CuentaBancaria("Ana", "ES-001", 1000f);
		CuentaPlazoFijo plazoFijo = new CuentaPlazoFijo("Luis", "ES-002", 2000f, LocalDate.now().plusMonths(6));
		CuentaVIP vip = new CuentaVIP("Marta", "ES-003", 500f, 1000f);

		List<CuentaBancaria> cuentas = new ArrayList<>();
		cuentas.add(normal);
		cuentas.add(plazoFijo);
		cuentas.add(vip);

		normal.ingresar(200f);
		plazoFijo.retirar(300f); // antes del vencimiento: aplica un 5% de penalizacion
		vip.retirar(1200f); // deja la cuenta en descubierto, dentro del limite permitido
		normal.transferir(150f, vip);
		normal.retirar(-100f); // rechazada: retirar una cantidad negativa seria ingresar

		for (CuentaBancaria cuenta : cuentas) {
			System.out.println(cuenta);
		}
	}
}
