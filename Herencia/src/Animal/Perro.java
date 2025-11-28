package Animal;

public class Perro extends Animal{
	
	private boolean ladraFuerte; // true: ladra fuerte - false: no ladra fuerte

	
	//CONSTRUCTORES	

	public Perro(String nombre, int edad, double peso, boolean ladraFuerte) {
		super(nombre, edad, peso);
		this.ladraFuerte = ladraFuerte;
	}


	public Perro(boolean ladraFuerte) {
		super();
		this.ladraFuerte = ladraFuerte;
	}
	
	
	//GETTER Y SETTER
	
	public boolean isLadraFuerte() {
		return ladraFuerte;
	}


	public void setLadraFuerte(boolean ladraFuerte) {
		this.ladraFuerte = ladraFuerte;
	}
	
	//METODOS
	
	public double comerGalleta(double pesoGalleta) {		
		super.peso+=pesoGalleta;		
		return this.peso;
	}
	
	
	

}
