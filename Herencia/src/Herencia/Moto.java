package Herencia;

public class Moto extends Vehiculo{

	private boolean portaCascos;

	//CONSTRUCTORES
	
	public Moto(String matricula, String marca, int potencia, boolean portaCascos) {
		super(matricula, marca, potencia);
		this.portaCascos = portaCascos;
	}
	
	//GETTER Y SETTER

	public boolean isPortaCascos() {
		return portaCascos;
	}

	public void setPortaCascos(boolean portaCascos) {
		this.portaCascos = portaCascos;
	}
	
	
	
	
	
	
	
	
	
}
