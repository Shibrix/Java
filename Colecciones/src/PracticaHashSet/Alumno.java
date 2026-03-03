package PracticaHashSet;

import java.util.*;

public class Alumno implements Comparator<Alumno> {

	// ATRIBUTOS
	private int id;
	private String nombre;
	private String curso;

	// CONSTRUCTOR
	public Alumno(int id, String nombre, String curso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
	}

	// GETTER Y SETTER
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	// MÉTODOS
	@Override
	public String toString() {
		return "Alumno [id=" + this.id + ", nombre=" + this.nombre + ", curso=" + this.curso + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return id == other.id;
	}

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}

}
