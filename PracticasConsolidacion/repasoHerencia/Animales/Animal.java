package Animales;

public class Animal {
	
	protected String nombre;
	protected int edad;
	protected double peso;
	
	
	public Animal(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso= peso;
	}

	
	public Animal() {
		super();
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
	
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void aumentarEdad() {
		this.edad++;
		System.out.println("Ahora " + this.nombre + " tiene " + this.edad+" años");

	}
	
	public void sumarPeso(double kilos) {
		System.out.println();
	}//Aquí uso polimorfismo. Este método ya existe en la clase Perro, pero si queremos sumar peso a un objeto Animal
	//ahora también podemos hacerlo

}
