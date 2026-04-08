package paq1;

public class Contacto {
	// ATRIBUTOS
	private String nombre;
	private String apellidos;
	private int telefono;
	private String email;

	// CONSTRUCTOR
	public Contacto(String nombre, String apellidos, int telefono, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
	}

	public Contacto() {
		super();
	}

	// GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return this.nombre+", "+this.apellidos+", "+this.telefono+", "+this.email;
	}
	
	

}
