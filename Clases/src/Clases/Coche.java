package Clases;

public class Coche {

	//Las clases siempre se generan con la primera letra en Mayúsculas
	//Hay que enseñarle a Java lo que tiene un coche mediante atributos
	
	//Usamos private para proteger los atributos. Ahora en la clase Clases no podemos usar ningún atributo
	private String matricula;
	private String marca;
	private String modelo;
	private int potencia;
	
	//Para poder usar estos atributos privados, usamos los getter y los setter. Desde Source, generate getter y setter
	//Esto son métodos porque tienen paréntesis a su lado
	
	public String getMatricula() {//El método matrícula devuelve la matrícula del coche
		return matricula; 
	}
	public void setMatricula(String matricula) {
		//También podemos poner filtros de seguridad
		
		if(matricula.length()==7) {
			this.matricula = matricula;
		}else {
			System.out.println("Matrícula no válida");
		}
		
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
	
	
	
	
	
	
	
	
	
	
	
	
}
