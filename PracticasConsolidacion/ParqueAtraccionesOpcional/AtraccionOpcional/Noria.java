package AtraccionOpcional;

public class Noria extends Atraccion {

//CONSTRUCTORES

	public Noria(String nombre, double precio) {
		super(nombre, precio);
	}

	public Noria() {
		super();
	}

//MÉTODOS
	@Override
	public double precioAbono() {
		// TODO Auto-generated method stub
		double precio = super.precio;
		double precioAbono = precio * 5 * 0.9;
		return precioAbono;
	}

	@Override
	public String toString() {
		return "Ticket " + nombre + ": " + precio + " euros";
	}

}
