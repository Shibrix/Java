package Animales;

public abstract class Animal {
	
	//ATRIBUTOS
	protected String nombre;
	protected double peso;
	protected int edad;	
	protected boolean vivo=true; //true= vivo | false = muerto
	
	//CONSTRUCTOR
	public Animal(String nombre, double peso, int edad) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
	}

	public Animal() {
		super();
	}
	
	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}	
	
	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	//MÉTODOS
	public abstract void tipoAnimal();

	@Override
	public String toString() {
		return this.nombre + " : peso: " + this.peso + " Kg, edad: " + this.edad + " años";
	}

	public String listaSimple() {
		return this.nombre + " : peso: " + this.peso + " Kg, edad: " + this.edad + " años";
	}
	
	

	

}
