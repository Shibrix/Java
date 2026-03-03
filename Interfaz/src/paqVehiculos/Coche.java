package paqVehiculos;

public class Coche implements Vehiculo, MaquinaPesada{
	private String marca;
	private String matricula;
	private int potencia;
	private int numeroPuertas;
	
	
	public Coche(String marca, String matricula, int potencia, int numeroPuertas) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.potencia = potencia;
		this.numeroPuertas = numeroPuertas;
	}
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	@Override
	public void calcularPrecio(int anio) {
		// TODO Auto-generated method stub
		
		int peso= Vehiculo.PESOMAX;
		
	}


	@Override
	public boolean itvCorrecta() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public double cantidadChatarra() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
