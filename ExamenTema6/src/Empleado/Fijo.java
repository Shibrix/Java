package Empleado;

public class Fijo extends Empleado implements SalarioMensual {
	// ATRIBUTOS
	private double complemento;

	// CONSTRUCTORES
	public Fijo(String nombre, double salarioBase, double complemento) {
		super(nombre, salarioBase);
		this.complemento = complemento;
	}

	public Fijo(String nombre, double salarioBase) {
		super(nombre, salarioBase);
	}

	// GETTER Y SETTER
	public double getComplemento() {
		return complemento;
	}

	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}

	// MÉTODOS
	@Override
	public void tipoEmpleado() {
		// TODO Auto-generated method stub
		System.out.println(this.nombre + " es un empleado fijo");
	}

	@Override
	public double calcularSalarioMensual() {
		// TODO Auto-generated method stub
		double salarioFijo = this.salarioBase + this.complemento;
		salarioFijo = Math.round(salarioFijo * 100.0) / 100.0;
		return salarioFijo;
	}

}
