package MiniBingo;

import java.util.*;

public class Jugador {

	private String nombre;
	private int numero1;
	private int numero2;
	private int numero3;
	private boolean aciertoNum1;
	private boolean aciertoNum2;
	private boolean aciertoNum3;

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

	public boolean isAciertoNum1() {
		return aciertoNum1;
	}

	public void setAciertoNum1(boolean aciertoNum1) {
		this.aciertoNum1 = aciertoNum1;
	}

	public boolean isAciertoNum2() {
		return aciertoNum2;
	}

	public void setAciertoNum2(boolean aciertoNum2) {
		this.aciertoNum2 = aciertoNum2;
	}

	public boolean isAciertoNum3() {
		return aciertoNum3;
	}

	public void setAciertoNum3(boolean aciertoNum3) {
		this.aciertoNum3 = aciertoNum3;
	}

	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void asignarCarton() {

		Random r = new Random();
		this.numero1 = r.nextInt(1, 21);
		this.numero2 = r.nextInt(1, 21);
		this.numero3 = r.nextInt(1, 21);

		while (this.numero1 == this.numero2 || this.numero1 == this.numero3 || this.numero2 == this.numero3) {
			this.numero1 = r.nextInt(1, 21);
			this.numero2 = r.nextInt(1, 21);
			this.numero3 = r.nextInt(1, 21);
		}

		System.out.println("Los números de " + this.nombre + " son " + this.numero1 + "," + this.numero2 + " y " + this.numero3);
	}

	public void comprobarBola(int bolaSacada) {

		if (bolaSacada == this.numero1) {
			this.aciertoNum1 = true;
			System.out.println("El jugador " + this.nombre + " tiene el número " + bolaSacada);
		}
		if (bolaSacada == this.numero2) {
			this.aciertoNum2 = true;
			System.out.println("El jugador " + this.nombre + " tiene el número " + bolaSacada);
		}
		if (bolaSacada == this.numero3) {
			this.aciertoNum3 = true;
			System.out.println("El jugador " + this.nombre + " tiene el número " + bolaSacada);
		}
	}
	
	public boolean esGanador() {
		boolean ganador= false;		
		if(this.aciertoNum1 == true && this.aciertoNum2 == true && this.aciertoNum3 == true) {
			ganador= true;						
		}
		return ganador;		
		
		
	}

}
