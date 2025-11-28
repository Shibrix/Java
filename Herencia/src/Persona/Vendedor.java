package Persona;

public class Vendedor extends Persona{
	
	private int idVendedor;

	public Vendedor(String nombre, String apellidos, String dni, int idVendedor) {
		super(nombre, apellidos, dni);
		this.idVendedor = idVendedor;
	}

	public Vendedor(int idVendedor) {
		super();
		this.idVendedor = idVendedor;
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	
	
	
	
	
	

}
