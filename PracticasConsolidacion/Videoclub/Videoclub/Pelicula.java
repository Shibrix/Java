package Videoclub;

public class Pelicula {

	// ATRIBUTOS
	private int codigo;
	private String titulo;
	private CategoriaPeli categoria;

	// CONSTRUCTOR
	public Pelicula(int codigo, String titulo, CategoriaPeli categoria) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.categoria = categoria;
	}

	public Pelicula() {
		super();
	}

	// GETTER Y SETTER
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public CategoriaPeli getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaPeli categoria) {
		this.categoria = categoria;
	}

}
