package refugioAnimales;

public class Perro extends Animal{

	private String raza;
	
	//CONSTRUCTOR

	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
	}
	
	
	//GETTER Y SETTER
	
	public String getRaza() {
		return raza;
	}	

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	//MÉTODOS
	
	public void emitirSonido() {
		System.out.println("¡Guau Guau! Soy un perro llamado "+this.nombre);
	}
	
	public String getTipo() {
		return "Perro";
	}


	@Override
	public String toString() {
		return "Tipo: "+getTipo()+ ", nombre: " + super.nombre + ", edad: " + super.edad +", raza: "+ this.raza;
	}
	
	
}
