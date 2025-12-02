package Persona;

public class Cliente extends Persona {

	private int tarjetaCliente;
	private double dineroGastado;
	
	public Cliente(String nombre, String apellidos, String dni, int tarjetaCliente, double dineroGastado) {
		super(nombre, apellidos, dni);
		this.tarjetaCliente = tarjetaCliente;
		this.dineroGastado = dineroGastado;
	}

	public Cliente() {
		super();
	}
	

	public int getTarjetaCliente() {
		return tarjetaCliente;
	}

	public void setTarjetaCliente(int tarjetaCliente) {
		this.tarjetaCliente = tarjetaCliente;
	}

	public double getDineroGastado() {
		return dineroGastado;
	}

	public void setDineroGastado(double dineroGastado) {
		this.dineroGastado = dineroGastado;
	}


	
	
	
	
}
