package es.upm.dit.repaso.ej705;

/** Ejercicio 7.5: contraseña con longitud configurable y comprobacion de fortaleza. */
public class Password {

	private static final int LONGITUD_DEFECTO = 8;
	private static final String CONTRASENA_DEFECTO = "password";
	private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final int MAYUSCULAS_MIN = 2;
	private static final int MINUSCULAS_MIN = 1;
	private static final int NUMEROS_MIN = 5;

	private int longitud;
	private String password;

	public Password() {
		this.longitud = LONGITUD_DEFECTO;
		this.password = CONTRASENA_DEFECTO;
	}

	public Password(int longitud) {
		this.longitud = longitud;
		generatePassword();
	}

	// Regenera la contraseña con la longitud ya fijada
	public void generatePassword() {
		StringBuilder texto = new StringBuilder();
		for (int i = 0; i < longitud; i++) {
			int indice = (int) (Math.random() * CARACTERES.length());
			texto.append(CARACTERES.charAt(indice));
		}
		this.password = texto.toString();
	}

	public boolean isStrong() {
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				mayusculas++;
			} else if (Character.isLowerCase(c)) {
				minusculas++;
			} else if (Character.isDigit(c)) {
				numeros++;
			}
		}
		return mayusculas > MAYUSCULAS_MIN && minusculas > MINUSCULAS_MIN && numeros > NUMEROS_MIN;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return password;
	}
}
