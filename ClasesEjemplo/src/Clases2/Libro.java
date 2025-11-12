package Clases2;

public class Libro {	
	
	private String isbn;
	private String titulo;
	private String autor;
	private int numPaginas;
	private boolean precio;
	private boolean tapa; //tapa true= dura || tapa false= blanda
	
	

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
		
	}
	public boolean isPrecio() {
		return precio;
	}
	public void setPrecio(boolean precio) {
		this.precio = precio;
	}
	public boolean isTapa() {
		return tapa;
	}
	public void setTapa(boolean tapa) {
		this.tapa = tapa;	
	}


	//Método para calcular el peso
	
	public void pesoLibro(boolean tapa, int numPaginas) {
		if(this.tapa==true) {
			double pesoLibro=(this.numPaginas*2.5)+140;
			System.out.println("El peso del libro con tapa dura es de "+pesoLibro);
		}
		else {
			double pesoLibro=(this.numPaginas*2.5)+35;
			System.out.println("El peso del libro con tapa blanda es de "+pesoLibro);
		}
	}

	//Otra manera de hacerlo. Esta es más sencilla y mejor
	
	public double calcularPeso() {
		double peso=0;
		if(this.tapa==true) {
			peso=(this.numPaginas*2.5)+140;
		}else{
			peso=(this.numPaginas*2.5)+35;
		}
		return peso;
	}
	
	//Este método reutiliza el método anterior, pero le metemos los parámetros para calcular el peso en función de arrancar hojas
	public double calcularPeso(int arrancadas, boolean forro) {
		double peso=0;
		this.numPaginas-=arrancadas;
		
		if(this.tapa==true) {
			peso=(this.numPaginas*2.5)+140;
		}else{
			peso=(this.numPaginas*2.5)+35;
		}
		if(forro) {
			peso+=25;
		}
		return peso;
			
		
	}
	
	
	
	
	
	
	
	
	
}
