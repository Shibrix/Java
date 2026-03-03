package paqVehiculos;

public abstract class Vehiculo {

	private String marca;
	private String matricula;
	private int potencia;	
	
	// CONSTRUCTORES
	public Vehiculo(String marca, String matricula, int potencia) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.potencia = potencia;
	}
	
	
	public Vehiculo() {
		super();
	}

	//GETTER Y SETTER
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public abstract double calcularPrecio(int anio);
	
	
	
	
	
}
