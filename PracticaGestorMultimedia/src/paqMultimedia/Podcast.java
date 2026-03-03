package paqMultimedia;

public class Podcast extends Contenido implements Reproducible{
	
	private String anfitrion;
	private int episodios;
	private int duracionMinPorEpisodios;	
	
	//CONSTRUCTOR
	public Podcast(String id, String titulo, int anio, boolean premium, String anfitrion, int episodios,
			int duracionMinPorEpisodios) {
		super(id, titulo, anio, premium);
		this.anfitrion = anfitrion;
		this.episodios = episodios;
		this.duracionMinPorEpisodios = duracionMinPorEpisodios;
	}
	
	//GETTER Y SETTER
	public String getAnfitrion() {
		return anfitrion;
	}
	

	public void setAnfitrion(String anfitrion) {
		this.anfitrion = anfitrion;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public int getDuracionMinPorEpisodios() {
		return duracionMinPorEpisodios;
	}

	public void setDuracionMinPorEpisodios(int duracionMinPorEpisodios) {
		this.duracionMinPorEpisodios = duracionMinPorEpisodios;
	}

	
	
	//OVERRIDE
	
	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		System.out.println("Reproduciendo podcast "+this.titulo+"...");
	}

	@Override
	public int duracionSegundos() {
		// TODO Auto-generated method stub
		return this.duracionMinPorEpisodios*60;
	}

	@Override
	public double costeMensual() {
		// TODO Auto-generated method stub
		double coste;
		if(this.premium==true) {
			coste= 4.99+(this.episodios*0.05);
			coste= Math.round(coste*100.0)/100.0;
		}
		else {
			coste= (this.episodios*0.05);
			coste= Math.round(coste*100.0)/100.0;
		}
		return coste;
	}

	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		System.out.println("[PODCAST] " + this.id +"-" + this.titulo + "(" + this.anio + ") "
				+ "Premium=" + this.premium+",\nAnfitrión:"+this.anfitrion+"\nEpisodios:"+this.episodios
				+"\nDuración episodios (min):"+this.duracionMinPorEpisodios);
	}


}
