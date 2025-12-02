package Animal;
import Persona.*;
public class Animal {
	
	protected String nombre;
	protected int edad;
	protected double peso;
	protected Persona duenio;
	
	//CONSTRUCTORES
	
	public Animal(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}	
	
	public Animal() {
		super();
	}
	
	// GETTERS Y SETTERS
	

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
	
	
	//MÉTODOS
	
	public double calcularPrecio() {
		return this.peso*15.0;
	}
	
	public void hacerSonido() {
		System.out.println("El animal hace ruido");
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", duenio=" + duenio + "]";
	}

	
	
}
