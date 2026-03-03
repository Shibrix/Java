package Animales;

public class Cerdo extends Animal{
	//ATRIBUTOS
	private String colorPiel;	
	
	//CONSTRUCTOR	
	public Cerdo(String nombre, double peso, int edad, String colorPiel) {
		super(nombre, peso, edad);
		this.colorPiel = colorPiel;
	}
	
	//GETTER Y SETTER
	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	//MÉTODOS
	@Override
	public void tipoAnimal() {
		// TODO Auto-generated method stub
		System.out.println(super.nombre+" es cerdo");
		
	}

	@Override
	public String toString() {
		return "Cerdo: " + super.nombre + ", peso: " + super.peso + "Kg, edad: " + super.edad + "años, color piel: "+this.colorPiel;
	}


	
	

	


}
