package Colecciones2;

import java.util.Objects;

public class Persona {
	//ATRIBUTOS
	private String nombre;
	private int edad;
	private String dni;

	//CONSTRUCTORES
	public Persona(String nombre, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	//GETTER Y SETTER
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	//MÉTODO HASH Y EQUALS
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	//Aquí va a comparar el dni de un objeto con el dni de otro objeto
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
	
	
	
	
	

}
