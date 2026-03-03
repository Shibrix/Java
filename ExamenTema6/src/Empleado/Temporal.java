package Empleado;

public class Temporal extends Empleado implements SalarioTotal {
	// ATRIBUTOS
	private int mesesContrato;

	// CONSTRUCTORES
	public Temporal(String nombre, double salarioBase, int mesesContrato) {
		super(nombre, salarioBase);
		this.mesesContrato = mesesContrato;
	}

	public Temporal(String nombre, double salarioBase) {
		super(nombre, salarioBase);
	}

	// GETTER Y SETTER

	public int getMesesContrato() {
		return mesesContrato;
	}

	public void setMesesContrato(int mesesContrato) {
		this.mesesContrato = mesesContrato;
	}

	// MÉTODOS

	@Override
	public void tipoEmpleado() {
		// TODO Auto-generated method stub
		System.out.println(this.nombre + " es un empleado temporal");
	}

	@Override
	public double calcularSalarioTotal() {
		// TODO Auto-generated method stub
		double salarioTemporal = this.salarioBase * this.mesesContrato;
		salarioTemporal = Math.round(salarioTemporal * 100.0) / 100.0;
		return salarioTemporal;
	}

}
