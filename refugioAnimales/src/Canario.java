package refugioAnimales;

public class Canario extends Animal{	
	
	private String colorPluma;
	
	//CONSTRUCTOR
	
	public Canario(String nombre, int edad, String colorPluma) {
		super(nombre, edad);
		this.colorPluma = colorPluma;
	}


	
	//GETTER Y SETTER
	
	public String getColorPluma() {
		return colorPluma;
	}	

	public void setColorPluma(String colorPluma) {
		this.colorPluma = colorPluma;
	}
	
	//MÉTODOS
	
	public void emitirSonido() {
		System.out.println("¡Pío pío! Soy un canario llamado "+this.nombre);
	}

	public String getTipo() {
		return "Canario";
	}



	@Override
	public String toString() {
		return "Tipo: "+getTipo()+ ", nombre: " + super.nombre + ", edad: " + super.edad+", color de pluma: "+this.colorPluma;
	}
	
	
	
	
	
	
}
