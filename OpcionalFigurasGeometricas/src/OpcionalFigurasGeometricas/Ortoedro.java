package OpcionalFigurasGeometricas;

import java.util.Random;

public class Ortoedro {
	
	private String tamanio;
	private int longitud;
	private int ancho;
	private int alto;
	private String color;
	private String material;
	
	
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
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
	
	public double Superficie() {
		int ancho= this.ancho;
		int largo= this.longitud;
		int alto= this.alto;
		double superficie= (2*((largo*ancho)+(largo*alto)+(ancho*alto)));
		superficie= Math.round(superficie*100.0)/100.0;
		return superficie;
	}
	
	public double Volumen() {
		int ancho= this.ancho;
		int largo= this.longitud;
		int alto= this.alto;
		double volumen= ancho*alto*largo;
		volumen= Math.round(volumen*100.0)/100.0;
		return volumen;
	}
	
	
	
	public Ortoedro(String tamanio, int ancho, int alto, int longitud, String material) {
		super();
		this.tamanio = tamanio;
		this.ancho = ancho;
		this.alto = alto;
		this.longitud = longitud;
		this.material= material;
		
	}
	
	
	public void asignarColor() {
		Random r= new Random();
		int colorAleatorio= r.nextInt(0,2);
		
		if(colorAleatorio==0) {
			this.color= "azul";
		}else {
			this.color= "verde";
		}
	}
	
	public double Peso() {
		double volumen= Volumen();
		if(this.material.equalsIgnoreCase("hierro")) {
			double peso= volumen*7.87;
			peso= Math.round(peso*100.0)/100.0;
			return peso;
		}
		else if(this.material.equalsIgnoreCase("madera")) {
			double peso= volumen*0.7;
			peso= Math.round(peso*100.0)/100.0;
			return peso;
		}else {
			double peso= volumen*0.2;
			peso= Math.round(peso*100.0)/100.0;
			return peso;
		}
		
	}
	
	public double Pintura() {
		double superficie= Superficie();
		String color= this.color;
		String material= this.material;
		double pintura=0;
		
		switch(color) {
		
		case "azul":
			if(material.equalsIgnoreCase("corcho")) {
				pintura= superficie*0.06;
				pintura= Math.round(pintura*100.0)/100.0;
				return pintura;
			}
			else if(material.equalsIgnoreCase("madera")) {
				pintura= superficie*0.08;
				pintura= Math.round(pintura*100.0)/100.0;
				return pintura;
			}
			else {
				pintura= superficie*0.10;
				pintura= Math.round(pintura*100.0)/100.0;
				return pintura;
			}
		
		case "verde":
			if(material.equalsIgnoreCase("corcho")) {
				pintura= superficie*0.05;
				pintura= Math.round(pintura*100.0)/100.0;
				return pintura;
			}
			else if(material.equalsIgnoreCase("madera")) {
				pintura= superficie*0.07;
				pintura= Math.round(pintura*100.0)/100.0;
				return pintura;
			}
			else {
				pintura= superficie*0.09;
				pintura= Math.round(pintura*100.0)/100.0;
				return pintura;
			}
		default:
			
			return pintura;
	
		}
		
	}
	
}
