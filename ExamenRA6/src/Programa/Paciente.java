package Programa;

import java.util.Objects;

public class Paciente {
	
	//ATRIBUTOS
	private String idClinico;
	private String nombre;
	private int edad;
	
	
	//CONSTRUCTORES
	public Paciente(String idClinico, String nombre, int edad) {
		super();
		this.idClinico = idClinico;
		this.nombre = nombre;
		this.edad = edad;
	}


	public Paciente() {
		super();
	}
	
	
	//GETTER Y SETTER
	public String getIdClinico() {
		return idClinico;
	}


	public void setIdClinico(String idClinico) {
		this.idClinico = idClinico;
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

	
	//MÉTODOS
	@Override
	public String toString() {
		return "Paciente [idClinico=" + idClinico + ", nombre=" + nombre + ", edad=" + edad + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(idClinico);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(idClinico, other.idClinico);
	}
	
	
	

}
