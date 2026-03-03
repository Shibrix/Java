package paqVehiculos;

public interface Vehiculo {
	
	int PESOMAX = 2000;
	
	public void calcularPrecio(int anio);
	
	public boolean itvCorrecta();

}
