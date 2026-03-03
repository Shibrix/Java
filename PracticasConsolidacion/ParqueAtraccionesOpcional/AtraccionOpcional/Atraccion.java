package AtraccionOpcional;

public abstract class Atraccion implements Abono {

//ATRIBUTOS

	protected String nombre;
	protected double precio;

//CONSTRUCTORES

	public Atraccion(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public Atraccion() {
		super();
	}

//GETTER Y SETTER

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

//MÉTODOS

	@Override
	public String toString() {
		return "Atraccion [nombre=" + nombre + ", precio=" + precio + "]";
	}

}
