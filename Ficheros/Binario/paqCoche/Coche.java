package paqCoche;
import java.io.Serializable;

public class Coche implements Serializable{

	//ATRIBUTOS
	private String matricula;
	private String marca;
	private int potencia;

	//CONSTRUCTOR
	public Coche(String matricula, String marca, int potencia) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.potencia = potencia;
	}

	//GETTER Y SETTER
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

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", potencia=" + potencia + "]";
	}

}
