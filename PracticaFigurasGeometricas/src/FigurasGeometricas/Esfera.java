package FigurasGeometricas;

import java.util.Random;

public class Esfera {

	private int radio;
	private String tamanio;
	private String color;

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double Superficie() {
		int radio = this.radio;
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		superficie = Math.round(superficie * 100.0) / 100.0;
		return superficie;
	}

	public double Volumen() {
		int radio = this.radio;
		double volumen = 4.0 / 3.0 * Math.PI * Math.pow(radio, 3);
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

	public Esfera() {
		super();
	}

}
