package Animales;

public class Oveja extends Animal{
	//ATRIBUTOS
	private String tipoPelo;

	//CONSTRUCTOR	
	public Oveja(String nombre, double peso, int edad, String tipoPelo) {
		super(nombre, peso, edad);
		this.tipoPelo = tipoPelo;
	}
	
	//GETTER Y SETTER
	public String getTipoPelo() {
		return tipoPelo;
	}

	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}
	
	//MÉTODOS	
	@Override
	public void tipoAnimal() {
		// TODO Auto-generated method stub
		System.out.println(super.nombre+" es oveja");
		
	}

	@Override
	public String toString() {
		return "Oveja: " + super.nombre + ", peso: " + super.peso + "Kg, edad: " + super.edad + "años, tipo de pelo: "+this.tipoPelo;
	}


	

	
}
