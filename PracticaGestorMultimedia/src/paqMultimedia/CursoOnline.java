package paqMultimedia;

public class CursoOnline extends Contenido implements Descargable {

	private String plataforma;
	private int horas;
	private double materialesMB;	
	
	//CONSTRUCTOR
	public CursoOnline(String id, String titulo, int anio, boolean premium, String plataforma, int horas,
			double materialesMB) {
		super(id, titulo, anio, premium);
		this.plataforma = plataforma;
		this.horas = horas;
		this.materialesMB = materialesMB;
	}	
	
	//GETTER Y SETTER
	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getMaterialesMB() {
		return materialesMB;
	}

	public void setMaterialesMB(double materialesMB) {
		this.materialesMB = materialesMB;
	}	
	
	//OVERRIDE
	@Override
	public double tamanioMB() {
		// TODO Auto-generated method stub
		return this.materialesMB;
	}

	@Override
	public void descargar() {
		// TODO Auto-generated method stub
		System.out.println("Descargando curso '"+this.titulo+"'");
	}

	@Override
	public double costeMensual() {
		// TODO Auto-generated method stub
		double coste;
		if(this.premium==true) {
			coste=9.99+(this.materialesMB/1024)*0.20;
			coste= Math.round(coste*100.0)/100.0;
		}
		else {
			coste=5.99+(this.materialesMB/1024)*0.20;
			coste= Math.round(coste*100.0)/100.0;
		}
		return coste;
	}

	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		System.out.println("[CURSO] " + this.id +"-" + this.titulo + "(" + this.anio + ") "
				+ "Premium=" + this.premium+"\nPlataforma:"+this.plataforma+"\nHora:"+this.horas
				+"\nMateriales MB:"+this.materialesMB);
	}
	
}
