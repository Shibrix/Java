package Videoclub;

public class Cd {

	// ATRIBUTOS
	private int codigo;
	private String cantante;
	private String titulo;
	private double precio;

	// CONSTRUCTOR
	public Cd(int codigo, String cantante, String titulo, double precio) {
		super();
		this.codigo = codigo;
		this.cantante = cantante;
		this.titulo = titulo;
		this.precio = precio;
	}

	public Cd() {
		super();
	}

	// GETTER Y SETTER
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
