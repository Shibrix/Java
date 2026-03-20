package Videoclub;

public enum CategoriaPeli {

	// ENUMS
	NOVEDADES("novedades", 3.0, 1), SEMI_NOVEDADES("semi-novedades", 2.0, 2), ANTIGUAS("antiguas", 1.0, 4);

	// ATRIBUTOS
	private String categoria;
	private double precio;
	private int diasAlquiler;

	// CONSTRUCTOR
	private CategoriaPeli(String categoria, double precio, int diasAlquiler) {
		this.categoria = categoria;
		this.precio = precio;
		this.diasAlquiler = diasAlquiler;
	}

	// GETTER Y SETTER
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDiasAlquiler() {
		return diasAlquiler;
	}

	public void setDiasAlquiler(int diasAlquiler) {
		this.diasAlquiler = diasAlquiler;
	}

}
