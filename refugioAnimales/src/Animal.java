package refugioAnimales;

public class Animal {

	protected String nombre;
	protected int edad;
	
	//CONSTRUCTOR
	
	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}	
	
	//GETTER Y SETTER
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//MÉTODOS
	
	public void emitirSonido() {
		System.out.println("Los animales hacen diferentes sonidos");
	}
	
	public String getTipo() {
		return "No sabemos de qué tipo es";
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + "]";
	}

	


	
	
	
	
}
