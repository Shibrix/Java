package AtraccionOpcional;

public class Feriante {

	// ATRIBUTOS
	private String nombreApellido;
	private int edad;

	// CONSTRUCTORES
	public Feriante(String nombreApellido, int edad) {
		super();
		this.nombreApellido = nombreApellido;

		this.edad = edad;
	}

	public Feriante() {
		super();
	}

	// GETTER Y SETTER
	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// MÉTODOS
	@Override
	public String toString() {
		return "Feriante [nombre=" + nombreApellido + ", edad=" + edad + "]";
	}

}
