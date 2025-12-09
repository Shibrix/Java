package refugioAnimales;

public class Gato extends Animal{
	
	private boolean esCazador; //true: sí es cazador - false: no es cazador
	
	
	//CONSTRUCTOR
	
	public Gato(String nombre, int edad, boolean esCazador) {
		super(nombre, edad);
		this.esCazador = esCazador;
	}
	
	//GETTER Y SETTER
	
	public boolean isEsCazador() {
		return esCazador;
	}

	public void setEsCazador(boolean esCazador) {
		this.esCazador = esCazador;
	}
	
	//MÉTODOS
	
	public void emitirSonido() {
		
		System.out.println("¡Miau miau! Soy un gato llamado "+this.nombre);
	}

	public String getTipo() {
		return "Gato";
	}

	@Override
	public String toString() {
		String cazador;
		if(this.esCazador) {
			cazador= "sí";
			return "Tipo: "+getTipo()+ ", nombre: " + super.nombre + ", edad: " + super.edad +", cazador: "+cazador ;
		}
		else {
			cazador="no";
			return "Tipo: "+getTipo()+ ", nombre: " + super.nombre + ", edad: " + super.edad +", cazador: "+cazador ;
		}
	}
	
	
	
	
	
	
	
	
	
}
