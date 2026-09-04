package es.upm.dit.repaso.ej707;

/** Ejercicio 7.7: persona con datos personales, IMC y DNI. */
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

	// Unico constructor que no recibe DNI: genera uno al azar. El resto lo pide,
	// porque la clase no ofrece setDni y despues ya no se podria asignar
	public Person() {
		this("", 0, new DNI(), Sexo.MUJER);
	}

	// Peso y altura se quedan en 0, el valor por defecto de un double, hasta que
	// se asignen con sus setters
	public Person(String nombre, int edad, DNI dni, Sexo sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
	}

	// El peso y la altura entran por los setters para comprobarlos en un unico
	// sitio, sea cual sea el constructor por el que llegue la persona
	public Person(String nombre, int edad, DNI dni, Sexo sexo, double peso, double altura) {
		this(nombre, edad, dni, sexo);
		setPeso(peso);
		setAltura(altura);
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

	// Un peso de 0 o negativo no existe, y ademas falsearia el IMC
	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("El peso debe ser mayor que 0");
		}
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	// Una altura de 0 o negativa no existe, y ademas falsearia el IMC
	public void setAltura(double altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("La altura debe ser mayor que 0");
		}
		this.altura = altura;
	}

	// IMC = peso (kg) / altura al cuadrado (m).
	//
	// Con el peso o la altura todavia a 0 la division no da un numero, sino NaN o
	// infinito, y evaluateWeight() clasificaria a la persona sin sentido. Como no
	// es culpa de quien llama, sino de una persona a medio rellenar, la excepcion
	// es IllegalStateException y no IllegalArgumentException
	public double computeBMI() {
		if (peso <= 0 || altura <= 0) {
			throw new IllegalStateException("Falta el peso o la altura de " + nombre);
		}
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
