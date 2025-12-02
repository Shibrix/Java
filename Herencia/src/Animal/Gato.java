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
	
	//MÉTODOS
	
		public void hacerSonido() {
			System.out.println("rnnnnnnnrnnn Miau");
		}


		@Override
		//Para crear este método con los atributos del padre, le damos a source>generate to string y marcamos también el segundo
		//campo (inherit fields)
		public String toString() {
			return "Gato [intensidadRonroneo=" + intensidadRonroneo + ", nombre=" + nombre + ", edad=" + edad
					+ ", peso=" + peso + ", duenio=" + duenio + "]";
		}



	
	
	
	
	
	
	
}
