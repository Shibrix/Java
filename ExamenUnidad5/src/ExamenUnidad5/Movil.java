package ExamenUnidad5;

import java.util.*;

public class Movil {

	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	private String marca;
	private double peso;
	private int numMovil;
	private boolean encendido; // true: encendido - false: apagado

	// CONSTRUCTOR
	public Movil(String marca, double peso, int numMovil, boolean encendido) {
		super();
		this.marca = marca;
		this.peso = peso;
		this.numMovil = numMovil;
		this.encendido = encendido;
	}

	// GETTER Y SETTER
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getNumMovil() {
		return numMovil;
	}

	public void setNumMovil(int numMovil) {
		this.numMovil = numMovil;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", peso=" + peso + ", numMovil=" + numMovil + ", encendido=" + encendido + "]";
	}

	// MÉTODOS
	public void cambiarNumero() {

		System.out.println("Dime el nuevo numero del móvil Oppo");
		int nuevoNumero = sc.nextInt();
		this.numMovil = nuevoNumero;
		System.out.println("El móvil Oppo ha cambiado de número \n");
		sc.nextLine();
		System.out.println("Pulse Enter para continuar");
		sc.nextLine();

	}

	public void apagarEncender() {

		if (this.encendido == true) {
			this.encendido = false;
			System.out.println("El movil Xiaomi está apagado \n");
			System.out.println("Pulse Enter para continuar");
			sc.nextLine();

		} else {
			this.encendido = true;
			System.out.println("El móvil Xiaomi está encendido \n");
			System.out.println("Pulse Enter para continuar");
			sc.nextLine();
		}

	}

	public int recibirLlamada() {

		int aleatorio = r.nextInt(600111111, 700000000);

		if (this.encendido == true) {
			System.out.println("Ha llamado el número " + aleatorio + "\n");
			System.out.println("Pulse Enter para continuar");
			sc.nextLine();
		} else {
			System.out.println("El móvil no puede recibir llamadas porque está apagado \n");
			System.out.println("Pulse Enter para continuar");
			sc.nextLine();
		}
		return aleatorio;
	}

}
