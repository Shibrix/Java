package FigurasGeometricas;

import java.util.Random;

public class Cilindro {

	private String tamanio;
	private int radio;
	private int altura;
	private String color;

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double Superficie() {
		int radio = this.radio;
		int altura = this.altura;
		double superficie = (2 * Math.PI * radio * altura) + (2 * Math.PI * Math.pow(radio, 2));
		superficie = Math.round(superficie * 100.0) / 100.0;
		return superficie;
	}

	public double Volumen() {
		int radio = this.radio;
		int altura = this.altura;
		double volumen = Math.PI * Math.pow(radio, 2) * altura;
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

	public Cilindro() {
		super();
	}

}
