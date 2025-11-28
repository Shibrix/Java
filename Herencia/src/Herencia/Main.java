package Herencia;

import Animal.Animal;
import Animal.Gato;
import Animal.Perro;
import Persona.Persona;
import Persona.Cliente;
import Persona.Vendedor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//INSTANCIO UN OBJETO CON SU PROPIA CLASE
		Coche c0= new Coche("1223CCC","Seat",100,5,80,false);
		
		//INSTANCIO UN OBJETO PADRE CON UNA CLASE HIJA. LA VENTAJA QUE TIENE ES QUE MÁS ADELANTE PODEMOS CAMBIAR SU CLASE
		Vehiculo v0= new Coche(4);
		
		v0= new Furgoneta("2234ZZZ", "Citroen",120, 1000, false);
		
		
//------------------------------------------------------------------------------------------------------------------------------------------
		
		
		Animal animal0= new Perro("Hook", 8, 36.5, true);
		
		Animal animal1= new Gato(100);
		
		//Esto se hace para poder usar los métodos de Perro dentro de Animal y, a posterior, poder meterlo en un Array
		Perro p0= (Perro) animal0;
		
		Gato g0= (Gato) animal1;
		
		//Hemos tenido que crear otro paquete donde meter las clases Animal, PErro y Gato para poder usar los atributos del padre
		//sin que dé error. Ahora en vez de this.peso usamos super.peso
		
//-------------------------------------------------------------------------------------------------------------------------------------------
		
		Persona cliente0= new Cliente("Paco", " el porras", "11111111A", 1212314);
		Persona vendedor0= new Vendedor("Emilio", " el garras" , "22222222B", 92389823);
		
		Cliente c= (Cliente) cliente0;
		Vendedor v = (Vendedor) vendedor0;
		
		System.out.println("El cliente se llama "+cliente0.getNombre()+cliente0.getApellidos());
		System.out.println("El vendedor se llama "+vendedor0.getNombre()+vendedor0.getApellidos());
		
		

	}

}
