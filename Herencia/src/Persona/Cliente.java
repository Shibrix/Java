package Persona;

public class Cliente extends Persona {

	private int tarjetaCliente;

	public Cliente(String nombre, String apellidos, String dni, int tarjetaCliente) {
		super(nombre, apellidos, dni);
		this.tarjetaCliente = tarjetaCliente;
	}

	public Cliente(int tarjetaCliente) {
		super();
		this.tarjetaCliente = tarjetaCliente;
	}

	public int getTarjetaCliente() {
		return tarjetaCliente;
	}

	public void setTarjetaCliente(int tarjetaCliente) {
		this.tarjetaCliente = tarjetaCliente;
	}
	
	
	
	
}
