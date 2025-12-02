package Herencia;

import Animal.*;
import Persona.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//El polimorfismo estático es tener dos métodos con el mismo nombre pero diferentes atributos (le pasamos diferentes argumentos)
		//El polimorfismo dinámico es tener varios métodos con el mismo nombre en diferentes clases y que use el método de la clase
		//hija
		
		//INSTANCIO UN OBJETO CON SU PROPIA CLASE
		Coche c0= new Coche("1223CCC","Seat",100,5,80,false);
		
		//INSTANCIO UN OBJETO PADRE CON UNA CLASE HIJA. LA VENTAJA QUE TIENE ES QUE MÁS ADELANTE PODEMOS CAMBIAR SU CLASE
		Vehiculo v0= new Coche(4);
		
		v0= new Furgoneta("2234ZZZ", "Citroen",120, 1000, false);
		
		
//------------------------------------------------------------------------------------------------------------------------------------------
		
		
		Animal animal0= new Perro("Hook", 8, 36.5, true);
		
		Animal animal1= new Gato ("Ares", 4, 3.43, 100);
		//Esto es polimorfismo dinámico. Usamos el método hacerSonido de la clase animal e identifica el método de la clase perro y la
		//clase gato
		
		animal0.hacerSonido();
		animal1.hacerSonido();
		
		System.out.println(animal1);
		System.out.println(animal0);
	
		//Esto se hace para poder usar los métodos de Perro dentro de Animal y, a posterior, poder meterlo en un Array
		Perro p0= (Perro) animal0;
		
		Gato g0= (Gato) animal1;
		
		//Hemos tenido que crear otro paquete donde meter las clases Animal, Perro y Gato para poder usar los atributos del padre
		//sin que dé error. Ahora en vez de this.peso usamos super.peso
		
//-------------------------------------------------------------------------------------------------------------------------------------------
		
		Persona cliente0= new Cliente("Paco", " el porras", "11111111A", 1212314, 123.45);
		Persona vendedor0= new Vendedor("Emilio", " el garras" , "22222222B", 92389823);
		
		Cliente c= (Cliente) cliente0;
		Vendedor v = (Vendedor) vendedor0;
		
		System.out.println("El cliente se llama "+cliente0.getNombre()+cliente0.getApellidos());
		System.out.println("El vendedor se llama "+vendedor0.getNombre()+vendedor0.getApellidos());
		
//------------------------------------------------------------------------------------------------------------------------------------
		
		//Hacer un método que sea al mismo nivel del Main que tenga como parámetros de entrada 2 animales y que devuelva el animal
		//que más pesa
		quienPesaMas(animal0, animal1);
	}

	private static void quienPesaMas(Animal p0, Animal g0) {
		// TODO Auto-generated method stub		
		
		if(p0.calcularPrecio()>g0.calcularPrecio()) {
			System.out.println("El animal "+p0+" pesa más que el animal "+g0);
		}else {
			System.out.println("El animal "+g0+" pesa más que el animal "+p0);
		}
		
	}
	
}
