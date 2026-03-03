package Atraccion;

import AtraccionOpcional.Feriante;

public class Cuadrante {
	
	//ATRIBUTOS
	private int dia;
	private Feriante feriante;
	private Atraccion atraccion;
	
	//CONSTRUCTOR
	public Cuadrante(int dia, Feriante feriante, Atraccion atraccion) {
		super();
		this.dia = dia;
		this.feriante = feriante;
		this.atraccion = atraccion;
	}
	
	//GETTER Y SETTER
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public Feriante getFeriante() {
		return feriante;
	}

	public void setFeriante(Feriante feriante) {
		this.feriante = feriante;
	}

	public Atraccion getAtraccion() {
		return atraccion;
	}

	public void setAtraccion(Atraccion atraccion) {
		this.atraccion = atraccion;
	}

	//MÉTODOS
	@Override
	public String toString() {
		return "El día "+this.dia+" de feria, "+this.feriante.getNombreApellido()+" se encargó de la atracción "+this.atraccion.getNombre();
	}
	
	
	
	
	

}
