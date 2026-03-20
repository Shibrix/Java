package Main;

import java.util.*;
import Animales.*;

public class Main1 {
	
	static List<Animal> animales= new ArrayList<>();	
	static Perro a0= new Perro("Tobi", 3, 32.0, "Dálmata");
	static Animal a1= new Canario("Silbiditos", 2, 0.4, "amarillo");
	static Animal a2= new Perro("Camote", 4, 5.0,"Chihuahua");
	static Animal a3= new Perro("Cefe", 5,40.0, "Pastor Alemán");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animales.add(a0);
		animales.add(a1);
		animales.add(a2);
		animales.add(a3);
		
		a2= new Canario("Fili", 1, 0.3, "blanco");//Sólo podemos acceder a los atributos y métodos del padre, porque está
		//declarado como animal
		
		Canario c1= (Canario)a2;//Lo casteamos para que sea de clase Canario y así poder acceder a todo, tanto de la
		//clase canario como de la clase animal
		
		a3.aumentarEdad();
		//Hacer un método en la clase perro que pida por parámetros un double y que le sime esas cantidad de kilos al perro
		//El método al ejecutarse ha de indicar el nuevo peso del perro.
		a0.sumarPeso(4);
		a0.sumarPeso(18);
		a3.sumarPeso(25);
		
		
		
		
		
		
		
	}

}
