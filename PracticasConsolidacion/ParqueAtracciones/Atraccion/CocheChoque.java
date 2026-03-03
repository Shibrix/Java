package Atraccion;

public class CocheChoque extends Atraccion {

// CONSTRUCTORES
	public CocheChoque(String nombre, double precio) {
		super(nombre, precio);
	}

	public CocheChoque() {
		super();
	}

// MÉTODOS
	@Override
	public double precioAbono() {
		// TODO Auto-generated method stub
		double precio = super.precio;
		double precioAbono = precio * 10 * 0.6;
		return precioAbono;
	}

	@Override
	public String toString() {
		return "Ticket " + nombre + ": " + precio + " euros";
	}

}
