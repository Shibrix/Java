package paqVehiculo;

public class Coche extends Vehiculo {

	// ATRIBUTOS
	private int numeroPuertas;
	private boolean automatico;

	// CONSTRUCTORES
	
	public Coche(int numeroPuertas, boolean automatico) {
		super();
		this.numeroPuertas = numeroPuertas;
		this.automatico = automatico;
	}
	
	public Coche(String matricula, String marca, int anio, int numeroPuertas, boolean automatico) {
		super(matricula, marca, anio);
		this.numeroPuertas = numeroPuertas;
		this.automatico = automatico;
	}
	

	// GETTER Y SETTER
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	@Override
	public String toString() {
		return "Coche [numeroPuertas=" + numeroPuertas + ", automatico=" + automatico + "]";
	}

}
