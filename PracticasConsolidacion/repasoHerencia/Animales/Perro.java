package Animales;

public class Perro extends Animal {

	private String raza;

	public Perro(String nombre, int edad, double peso, String raza) {
		super(nombre, edad, peso);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void decirNombreyEdad() {
		System.out.println("El perro " + super.nombre + " tiene " + super.edad + " años");
	}

	public void sumarPeso(double kilos) {
		this.peso+=kilos;
		System.out.println("El nuevo peso de  "+super.nombre+" es de "+this.peso+" kilos");
	}
	



}
