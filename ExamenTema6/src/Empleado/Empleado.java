package Empleado;

public abstract class Empleado {

	// ATRIBUTOS
	protected String nombre;
	protected double salarioBase;

	// CONSTRUCTOR
	public Empleado(String nombre, double salarioBase) {
		super();
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}

	public Empleado() {
		super();
	}

	// GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	// MÉTODOS
	public abstract void tipoEmpleado();

}
