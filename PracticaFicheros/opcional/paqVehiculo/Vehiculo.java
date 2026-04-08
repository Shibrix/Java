package paqVehiculo;

public class Vehiculo {

	// ATRIBUTOS
	protected String matricula;
	protected String marca;
	protected int anio;

	// CONSTRUCTOR
	public Vehiculo(String matricula, String marca, int anio) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.anio = anio;
	}
	
	public Vehiculo() {
		super();
	}

	// GETTER Y SETTER
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	// MÉTODOS
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", anio=" + anio + "]";
	}



	

}
