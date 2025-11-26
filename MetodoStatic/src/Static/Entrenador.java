package Static;

public class Entrenador {

	private String nombre;
	private int edad;
	private Jugador jugadorFavorito; //estoy creando el objeto jugador dentro de entrenador para poder usar sus métodos aquí

	public Entrenador(String nombre, int edad, Jugador jugadorFavorito) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.jugadorFavorito = jugadorFavorito;
	}

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

	public Jugador getJugadorFavorito() {
		return jugadorFavorito;
	}

	public void setJugadorFavorito(Jugador jugadorFavorito) {
		this.jugadorFavorito = jugadorFavorito;
	}

	public void opinionEntrenador() {
		this.jugadorFavorito.aumentarPeso(4);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
