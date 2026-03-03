package Abstraccion;
import paqPersona.*;
import paqVehiculos.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p0= new Persona("Pepe","Ruiz","111111A", 45);
		
		double pension= p0.obtenerCuantiaJubilacion(20);
		
		System.out.println(pension);
		
		Excavadora e0= new Excavadora(8);
		
		if(e0 instanceof MaquinaPesada) {
			System.out.println("e0 tiene los métodos de MaquinaPesada");
		}
		
		
		
		
		
		
		
		

	}

}
