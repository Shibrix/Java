package Static;

public class Jugador {
	
	
	public static String equipo; //es la misma para todos los jugadores, para todos los objetos jugador
	private String nombre;
	private int numero;
	private String posicion;
	private double altura;
	private double peso;
	
	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Jugador(String nombre, int numero, String posicion, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.posicion = posicion;
		this.altura = altura;
		this.peso = peso;
	}

	//CONSTRUCTOR VACÍO
	
	public Jugador() {
		super();
	}

	
	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	//MÉTODOS
	public void aumentarPeso(double nuevoPeso) {

		this.peso = this.peso + nuevoPeso;

		System.out.println("El jugador " + this.nombre + " ahora pesa " + this.peso);

	}
	
	public double calculoIMC() {
		
		double imc;
		
		this.posicion= "portero";
		
		imc = this.peso / (this.altura * this.altura);
		imc= Math.round(imc*100.0)/100.0;
		return imc;
	}
	
	public boolean seConvoca() {

		boolean convocado = false;

		if (this.peso < 90)
			convocado = true;
		return convocado;

	}
	
	
	public String posicionSiConvocado(boolean convocado) {
		
		String pos="";
		
		if(convocado==true) {
			pos= this.posicion;
		}else {
			pos="no juega por gordo";
		}
		
		return pos;
	}	

	public static void cambiarEquipo(String nuevoEquipo) {
		equipo= nuevoEquipo;
		//this.nombre= "Manuel";
		//aquí dentro no puedo poner nada que no sea estático		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
