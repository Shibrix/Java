
public class Restaurante {

	private String nombre;
	private String especialidad;
	private int estrellas;
	private boolean abierto; //true: sí abierto - false: no, cerrado
	
	
	public Restaurante(String nombre, String especialidad, int estrellas, boolean abierto) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.estrellas = estrellas;
		this.abierto = abierto;
	}


	public Restaurante() {
		super();
	}


	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public int getEstrellas() {
		return estrellas;
	}


	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}


	public boolean isAbierto() {
		return abierto;
	}


	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}


	@Override
	public String toString() {
		String mensaje= "Restaurante [nombre=" + nombre + ", especialidad=" + especialidad + ", estrellas=" + estrellas
				+ ", abierto=";
		
		if(this.abierto==true) {
			mensaje= mensaje+" sí";
		}
		else {
			mensaje= mensaje+" no";
		}	
		
		return mensaje;
	}
	
	
	public void ganarEstrella() {
		
		this.estrellas+=1;		
		
	}
	
	
	
	
	
	
	
}
