package Herencia;

public class Furgoneta extends Vehiculo {

	private double capacidadDeCarga;
	private boolean bodegaInterior; //true == sí tiene , false == sí tiene
	
	//CONSTRUCTORES
	
	public Furgoneta(String matricula, String marca, int potencia, double capacidadDeCarga, boolean bodegaInterior) {
		super(matricula, marca, potencia);
		this.capacidadDeCarga = capacidadDeCarga;
		this.bodegaInterior = bodegaInterior;
	}
	
	//GETTER Y SETTER

	public double getCapacidadDeCarga() {
		return capacidadDeCarga;
	}

	public void setCapacidadDeCarga(double capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}

	public boolean isBodegaInterior() {
		return bodegaInterior;
	}

	public void setBodegaInterior(boolean bodegaInterior) {
		this.bodegaInterior = bodegaInterior;
	}
	
	
	
	
	
	
	
	
}
