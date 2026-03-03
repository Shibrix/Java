package paqMultimedia;

public class Pelicula extends Contenido implements Reproducible,Descargable{
	private String director;
	private int duracionMin;
	private double cantidadGB;	
	
	//CONSTRUCTOR
	public Pelicula(String id, String titulo, int anio, boolean premium, String director, int duracionMin,
			double cantidadGB) {
		super(id, titulo, anio, premium);
		this.director = director;
		this.duracionMin = duracionMin;
		this.cantidadGB = cantidadGB;
	}
	
	public Pelicula() {
		super();
	}
	
	//GETTER Y SETTER	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(int duracionMin) {
		this.duracionMin = duracionMin;
	}

	public double getCantidadGB() {
		return cantidadGB;
	}

	public void setCantidadGB(double cantidadGB) {
		this.cantidadGB = cantidadGB;
	}

//OVERRIDE
	@Override
	public double tamanioMB() {
		// TODO Auto-generated method stub
		return this.cantidadGB*1024;
	}


	@Override
	public void descargar() {
		// TODO Auto-generated method stub
		System.out.println("Descargando película '"+this.titulo+"'");
	}


	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		System.out.println("Reproduciendo película "+this.titulo+"...");
	}


	@Override
	public int duracionSegundos() {
		// TODO Auto-generated method stub
		return this.duracionMin*60;
	}


	@Override
	public double costeMensual() {
		// TODO Auto-generated method stub
		double coste;
		if(this.premium==true) {
			coste= 6.99+(this.cantidadGB*0.25);
			coste= Math.round(coste*100.0)/100.0;
		}
		else {
			coste= 3.99+(this.cantidadGB*0.25);
			coste= Math.round(coste*100.0)/100.0;
		}
		return coste;
	}


	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub	
			System.out.println("[PELÍCULA] " + this.id +"-" + this.titulo + "(" + this.anio + ") "
					+ "Premium=" + this.premium+",\nDirector: "+this.director+"\nDuracion (min):"+this.duracionMin
					+"\nCantidad GB:"+this.cantidadGB);
		
		
	}
	


}
