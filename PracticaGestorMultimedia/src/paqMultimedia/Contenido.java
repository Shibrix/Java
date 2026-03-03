package paqMultimedia;

public abstract class Contenido {
	
	protected String id;
	protected String titulo;
	protected int anio;
	protected boolean premium; // true: sí premium - false: no premium
	
	//CONSTRUCTOR
	public Contenido(String id, String titulo, int anio, boolean premium) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.anio = anio;
		this.premium = premium;
	}
	
	public Contenido() {
		super();
	}
	
	//GETTER Y SETTER
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	
	//MÉTODOS
	
	public String ficha() {
		return "Contenido [id=" + this.id + ", titulo=" + this.titulo + ", anio=" + this.anio + ", premium=" + this.premium + "]";
	}


	public abstract double costeMensual();
	public abstract void mostrarDetalle();



	
	
}
