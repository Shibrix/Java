package Animales;

public class Canario extends Animal{
	
	private String color;

	public Canario(String nombre, int edad, double peso, String color) {
		super(nombre, edad, peso);
		this.color = color;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
}
