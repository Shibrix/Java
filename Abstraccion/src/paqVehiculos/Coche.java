package paqVehiculos;

public class Coche extends Vehiculo{
	
	private int numeroPuertas;

	//CONSTRUCTOR
	public Coche(int numeroPuertas) {
		super();
		this.numeroPuertas = numeroPuertas;
	}

	//GETTER Y SETTER
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}	
	
	//MÉTODOS
	public double calcularPrecio(int anio) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
