package es.upm.dit.repaso.ej704;

/** Ejercicio 7.4: persona con datos personales, IMC y DNI. */
public class Person {

	/** Sexo de la persona. */
	public enum Sexo {
		HOMBRE, MUJER
	}

	/** Categoria de peso segun el IMC. */
	public enum EstadoPeso {
		BAJO_PESO, NORMAL, SOBREPESO
	}

	private static final double LIMITE_BAJO_PESO = 18;
	private static final double LIMITE_SOBREPESO = 25;
	private static final int EDAD_ADULTO = 18;

	private String nombre;
	private int edad;
	private DNI dni;
	private Sexo sexo;
	private double peso;
	private double altura;

	public Person() {
		this("", 0, Sexo.MUJER);
	}

	public Person(String nombre, int edad, Sexo sexo) {
		this(nombre, edad, sexo, 0, 0);
	}

	// El DNI no se recibe: se autogenera porque la clase no ofrece setDni
	public Person(String nombre, int edad, Sexo sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.dni = new DNI();
	}

	public Person(String nombre, int edad, DNI dni, Sexo sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public DNI getDni() {
		return dni;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// IMC = peso (kg) / altura al cuadrado (m)
	public double computeBMI() {
		return peso / (altura * altura);
	}

	public EstadoPeso evaluateWeight() {
		double imc = computeBMI();
		if (imc < LIMITE_BAJO_PESO) {
			return EstadoPeso.BAJO_PESO;
		}
		if (imc > LIMITE_SOBREPESO) {
			return EstadoPeso.SOBREPESO;
		}
		return EstadoPeso.NORMAL;
	}

	public boolean isAdult() {
		return edad >= EDAD_ADULTO;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni
				+ ", Sexo: " + sexo + ", Peso: " + peso + " kg, Altura: " + altura + " m";
	}
}
