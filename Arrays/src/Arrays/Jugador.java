package Arrays;

import java.util.Random;

public class Jugador {

	private String nombre;

	private int numero1;
	private int numero2;
	private int numero3;

	private boolean acierto1;
	private boolean acierto2;
	private boolean acierto3;

	// CONSTRUCTOR
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}

	// GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getNumero3() {
		return numero3;
	}

	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}

	public boolean isAcierto1() {
		return acierto1;
	}

	public void setAcierto1(boolean acierto1) {
		this.acierto1 = acierto1;
	}

	public boolean isAcierto2() {
		return acierto2;
	}

	public void setAcierto2(boolean acierto2) {
		this.acierto2 = acierto2;
	}

	public boolean isAcierto3() {
		return acierto3;
	}

	public void setAcierto3(boolean acierto3) {
		this.acierto3 = acierto3;
	}

	public void asignarCarton() {

		Random r = new Random();

		this.numero1 = r.nextInt(1, 21);
		this.numero2 = r.nextInt(1, 21);
		this.numero3 = r.nextInt(1, 21);

		System.out.println(
				"Los números de " + this.nombre + " son " + this.numero1 + " " + this.numero2 + " " + this.numero3);

	}

}
