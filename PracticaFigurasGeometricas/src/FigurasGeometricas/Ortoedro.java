package FigurasGeometricas;

import java.util.Random;

public class Ortoedro {

	private String tamanio;
	private int longitud;
	private int ancho;
	private int alto;
	private String color;

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double Superficie() {
		int ancho = this.ancho;
		int largo = this.longitud;
		int alto = this.alto;
		double superficie = (2 * ((largo * ancho) + (largo * alto) + (ancho * alto)));
		superficie = Math.round(superficie * 100.0) / 100.0;
		return superficie;
	}

	public double Volumen() {
		int ancho = this.ancho;
		int largo = this.longitud;
		int alto = this.alto;
		double volumen = ancho * alto * largo;
		volumen = Math.round(volumen * 100.0) / 100.0;
		return volumen;
	}

	public void asignarColor() {
		Random r = new Random();
		int colorAleatorio = r.nextInt(0, 2);

		if (colorAleatorio == 0) {
			this.color = "azul";
		} else {
			this.color = "verde";
		}
	}

	public Ortoedro(String tamanio, int longitud, int ancho, int alto) {
		super();
		this.tamanio = tamanio;
		this.longitud = longitud;
		this.ancho = ancho;
		this.alto = alto;
	}

}
