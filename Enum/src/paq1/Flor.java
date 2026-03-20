package paq1;

public enum Flor {
	
	//ENUM
	//Al crear el constructor obligatoriamente tenemos que instanciar cada enum con los atributos
	ROSA_BLANCA ("Rosa blanca","Blanco",true),
	ROSA_ROJA ("Rosa roja","Rojo",true),
	MARGARITA("Margarita","Blanco",false),
	PETUNIA("Petunia","Magenta", false),
	TULIPAN("Tulipán", "Naranja", false),
	GERANIO("Geranio", "Rojo", false);
	
	//ATRIBUTOS
	private String nombre;
	private String color;
	private boolean espinas;
	
	//CONSTRUCTOR
	private Flor(String nombre, String color, boolean espinas) {
		this.nombre = nombre;
		this.color = color;
		this.espinas = espinas;
	}

	
	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isEspinas() {
		return espinas;
	}

	public void setEspinas(boolean espinas) {
		this.espinas = espinas;
	}
	

}
