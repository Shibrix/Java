package OpcionalMiniBingo;

import java.util.*;

public class Jugador {

	private String nombre;
	private int numero1;
	private int numero2;
	private int numero3;
	private boolean aciertoNum1; //true: acertado - false: fallado
	private boolean aciertoNum2;//true: acertado - false: fallado
	private boolean aciertoNum3;//true: acertado - false: fallado
	private double dinero;
	private boolean sigueJugando; // true: sigue jugando - false: ha sido eliminado

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

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}	

	public boolean isSigueJugando() {
		return sigueJugando;
	}

	public void setSigueJugando(boolean sigueJugando) {
		this.sigueJugando = sigueJugando;
	}

	public void asignarCarton() {

		Random r = new Random();
		int numero1 = r.nextInt(1, 21);
		int numero2 = r.nextInt(1, 21);
		int numero3 = r.nextInt(1, 21);
		
		this.dinero-=5;	
		seguirJugando();
		
		while (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
			numero1 = r.nextInt(1, 21);
			numero2 = r.nextInt(1, 21);
			numero3 = r.nextInt(1, 21);
		}
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
		System.out.println("Los números de " + this.nombre + " son " + numero1 + "," + numero2 + " y " + numero3);
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
		boolean ganador = false;
		if (aciertoNum1 == true && aciertoNum2 == true && aciertoNum3 == true) {
			ganador = true;
		}
		return ganador;

	}
	
	public void mostrarDinero() {		
		System.out.println("Al jugador " + this.nombre + " le quedan " + this.dinero + "€");		
		
	}
	
	public void darDinero(boolean ganador, double bote) {
	
		if(ganador==true) {
			this.dinero= this.dinero+bote;
		}
		else {
		
		}		
		
	}
	public void seguirJugando() {
		if(this.dinero<=0) {
			this.sigueJugando= false;
			System.out.println("El jugador "+this.nombre+" ha sido eliminado, se ha quedado sin dinero");
		}
		else {
			this.sigueJugando= true;
		}
	}
	
	public void resetearAciertos() {
		this.aciertoNum1=false;
		this.aciertoNum2=false;
		this.aciertoNum3= false;
	}

}
