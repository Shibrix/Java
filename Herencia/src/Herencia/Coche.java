package Herencia;

public class Coche extends Vehiculo{
	
	private int puertas;
	private double capacidadMaletero;
	private boolean aireAcondicionado; // true == sí tiene , false == no tiene
	
	
	
	//CONSTRUCTOR
	
	public Coche(String matricula, String marca, int potencia, int puertas, double capacidadMaletero,
			boolean aireAcondicionado) {
		super(matricula, marca, potencia);
		this.puertas = puertas;
		this.capacidadMaletero = capacidadMaletero;
		this.aireAcondicionado = aireAcondicionado;
	}

	public Coche(int puertas) {
		super();
		this.puertas = puertas;
	}

	//GETTER Y SETTER
	
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public double getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
