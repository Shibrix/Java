package Clases;

public class Coche {

	//Las clases siempre se generan con la primera letra en Mayúsculas y en singular
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
	
	//Este atributo lo estamos creando a pelo, sin get ni set
	
//	public int aumentarPotencia() {
//		int nuevaPotencia=0;
//		nuevaPotencia = this.potencia + 10;
//		return nuevaPotencia;
//	}
	
	//Si queremos cambiar el valor de atributo potencia, haríamos esto:
	
//	public int aumentarPotencia() {
//		this.potencia = this.potencia + 10;
//		return this.potencia;
//	}
	
	//El public void no devuelve nada, el return sobra. Pero sí que tiene efecto allí donde estemos llamando al método
	//Si en la clase main lo llamo 3 veces, aumentará la potencia del coche 3 veces
	
	public void aumentarPotencia() {
		this.potencia = this.potencia + 10;
		System.out.println("La potencia del coche ha aumentado a "+this.potencia);
	}
	
	//Aquí le pasamos el parámeto int aumentoPotencia al método aumentarPotenciaFija
	
	public void aumentarPotenciaFijada(int aumentoPotencia) {//esta variable equivale a la de potenciaExtra en el Main
		System.out.println("Esto es lo que vale aumentoPotencia dentro del método "+aumentoPotencia);
		this.potencia=this.potencia+aumentoPotencia;
		System.out.println("La potencia del coche ha aumentado a "+this.potencia);
		//aumentoPotencia+=5; //esto sólo hace efecto dentro del método, no a la llamada que hagamos del método fuera de este
	}
	
	
	
	public void aumentarPotenciaFijadaConNombre(int aumentoPotencia, String nombre) {
		
		System.out.println("Esto es lo que vale aumentoPotencia dentro del método "+aumentoPotencia);
		
		this.potencia=this.potencia+aumentoPotencia;
		
		System.out.println("La potencia del coche de "+nombre+" ha aumentado a "+this.potencia);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
