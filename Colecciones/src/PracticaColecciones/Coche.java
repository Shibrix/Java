package PracticaColecciones;

public class Coche {

	// ATRIBUTOS
	private String matricula;
	private String marca;
	private String modelo;
	private int potencia;
	private int diasAlquilados;

	// CONSTRUCTORES
	public Coche(String matricula, String marca, String modelo, int potencia, int diasAlquilados) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.diasAlquilados = diasAlquilados;
	}

	// GETTER Y SETTER
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getDiasAlquilados() {
		return diasAlquilados;
	}

	public void setDiasAlquilados(int diasAlquilados) {
		this.diasAlquilados = diasAlquilados;
	}

	// MÉTODOS
	@Override
	public String toString() {
		return "Matricula=" + this.matricula + ", Marca=" + this.marca + ", Modelo=" + this.modelo + ", Potencia="
				+ this.potencia;
	}

	public String alquilados() {
		return "Matricula=" + this.matricula + ", Marca=" + this.marca + ", Modelo=" + this.modelo + ", Potencia="
				+ this.potencia + ", Dias alquilado=" + this.diasAlquilados;
	}

}
