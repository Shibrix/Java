package Animal;

public class Gato extends Animal{

	private int intensidadRonroneo;
	
	//CONSTRUCTOR
	
	public Gato(String nombre, int edad, double peso, int intensidadRonroneo) {
		super(nombre, edad, peso);
		this.intensidadRonroneo = intensidadRonroneo;
	}

	
	public Gato(int intensidadRonroneo) {
		super();
		this.intensidadRonroneo = intensidadRonroneo;
	}


	//GETTER Y SETTER
	public int getIntensidadRonroneo() {
		return intensidadRonroneo;
	}

	public void setIntensidadRonroneo(int intensidadRonroneo) {
		this.intensidadRonroneo = intensidadRonroneo;
	}
	
	
	
	
	
	
	
	
	
	
}
