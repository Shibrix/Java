package paqVehiculo;

public class Furgoneta extends Vehiculo {

	// ATRIBUTOS
	private double capacidadCarga;

	// CONSTRUCTOR
	public Furgoneta(String matricula, String marca, int anio, double capacidadCarga) {
		super(matricula, marca, anio);
		this.capacidadCarga = capacidadCarga;
	}

	// GETTER Y SETTER
	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	//MÉTODOS
	@Override
	public String toString() {
		return "Furgoneta [capacidadCarga=" + capacidadCarga + "]";
	}
	
	

}
