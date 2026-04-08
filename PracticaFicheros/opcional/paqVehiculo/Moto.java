package paqVehiculo;

public class Moto extends Vehiculo {

	// ATRIBUTOS
	private int cilindrada;

	// CONSTRUCTOR
	public Moto(String matricula, String marca, int anio, int cilindrada) {
		super(matricula, marca, anio);
		this.cilindrada = cilindrada;
	}
	

	// GETTER Y SETTER
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	//MÉTODOS
	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + "]";
	}
	
	

}
