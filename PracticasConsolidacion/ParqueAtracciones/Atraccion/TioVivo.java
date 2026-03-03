package Atraccion;

public class TioVivo extends Atraccion {

	public TioVivo(String nombre, double precio) {
		super(nombre, precio);
	}

	public TioVivo() {
		super();
	}

//MÉTODOS

	@Override
	public double precioAbono() {
		// TODO Auto-generated method stub
		double precio = super.precio;
		double precioAbono = precio * 6 * 0.8;
		return precioAbono;
	}

	@Override
	public String toString() {
		return "Ticket " + nombre + ": " + precio + " euros";
	}

}
