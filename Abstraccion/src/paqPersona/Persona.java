package paqPersona;

public class Persona implements Policia {

	// Hacer la clase Persona que sea una clase que implemente la interfaz Policía.
	// Esta interfaz tiene que tener
	// dos métodos. Un método puede ser public double comisionMultas(int
	// numeroMultas)
	// Otro método puede ser public double obtenerCuantiaJubilacion(int
	// aniosTrabajados)

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;

	// CONSTRUCTOR
	public Persona(String nombre, String apellidos, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// MÉTODOS

	@Override
	public double comisionMultas(int numeroMultas) {
		// TODO Auto-generated method stub
		int comision = numeroMultas * 10;
		return comision;
	}

	@Override
	public double obtenerCuantiaJubilacion(int aniosTrabajados) {
		// TODO Auto-generated method stub
		int salario = 1500;
		double cuantia = (salario * 5.34) / aniosTrabajados*this.edad;
		return cuantia;
	}

}
