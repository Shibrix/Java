package Repaso;

import java.util.Objects;

public class Profesor {
	
	private String identidad;
	private String nombre;
	private int calificacion;
	
	
	public Profesor(String identidad, String nombre, int calificacion) {
		super();
		this.identidad = identidad;
		this.nombre = nombre;
		this.calificacion = calificacion;
	}	
	
	
	public String getIdentidad() {
		return identidad;
	}
	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}


	@Override
	public String toString() {
		return "Profesor [identidad=" + identidad + ", nombre=" + nombre + ", calificacion=" + calificacion + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(identidad);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return Objects.equals(identidad, other.identidad);
	}
	
	
	
	
	
	
	
	
	
	

}
