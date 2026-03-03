package Animales;
import java.util.Random;

public class Vaca extends Animal implements LecheProducida {
	private String uso;
	private double totalLeche;

	//CONSTRUCTOR
	
	public Vaca(String nombre, double peso, int edad, String uso) {
		super(nombre, peso, edad);
		this.uso = uso;
	}
	
	//GETTER Y SETTER
	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}
	
	public double getTotalLeche() {
		return totalLeche;
	}

	public void setTotalLeche(double totalLeche) {
		this.totalLeche = totalLeche;
	}	
	
	
	//MÉTODOS	

	@Override
	public double ordeniar() {
		// TODO Auto-generated method stub
		Random r= new Random();
		double lecheProducida= r.nextDouble(3.0,8.0);
		lecheProducida= Math.round(lecheProducida*100.0)/100.0;
		this.totalLeche += lecheProducida;
		return lecheProducida;
		
	}	

	@Override
	public void tipoAnimal() {
		// TODO Auto-generated method stub
		System.out.println(super.nombre+" es vaca");
		
	}

	@Override
	public String toString() {
		return "Vaca: " + super.nombre + ", peso: " + super.peso + "Kg, edad: " + super.edad + "años, uso: "+this.uso;
	}

	
	
	

}
