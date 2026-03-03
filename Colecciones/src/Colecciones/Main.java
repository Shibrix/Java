package Colecciones;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sólo admite objetos, nada de variables primitivas

		Scanner scLine = new Scanner(System.in);

		Persona p0 = new Persona("Pepe", 28);
		Persona p1 = new Persona("Paco", 32);
		Persona p2 = new Persona("Sonia", 27);

		Coche1 c0 = new Coche1("Seat", 110);
		Coche1 c1 = new Coche1("Peugeot", 120);
		Coche1 c2 = new Coche1("Citroen", 90);
		Coche1 c3 = new Coche1("Opel", 110);

		List<Coche1> coches = new ArrayList();
		coches.add(c0);
		coches.add(c1);
		coches.add(c2);
		coches.add(c3);

		// Se puede crear como ArrayList o como List. Se declara seguido de
		// <nombreObjeto> nombreVariable= new ArrayList(); El modo más usado es List

		List<Persona> lista1 = new ArrayList();// Los List pueden cambiar a otros tipos, como LinkedList, AbstractList,
												// etc
		ArrayList<Persona> lista2 = new ArrayList();// Los ArraysList son ArraysList siempre, nunca cambian

		System.out.println(lista1.size());

		lista1.add(p0); // Añadimos un objeto a la lista
		System.out.println(lista1.size());

		lista1.add(p1); // Añadimos otro
		System.out.println(lista1.size());

		lista1.add(p2); // Y otro
		System.out.println(lista1.size());

		// Otra manera más práctica de meter objetos a la lista es la siguiente:
		List<Persona> lista3 = Arrays.asList(p0, p1, p2);

		lista1.add(p0);// Podemos meter el mismo elemento varias veces
		System.out.println(lista1.size());

		System.out.println("--------------------------------------------------------");

		System.out.println(lista1.get(2).getNombre());// Así obtenemos el nombre del objeto que está en la posición 2

		System.out.println("--------------------------------------------------------");

		for (int i = 0; i < lista1.size(); i++) {
			System.out.println(i + " " + lista1.get(i).getNombre() + " " + lista1.get(i).getEdad());// Así obtenemos
																									// todos los nombres
																									// de los objetos
																									// que están en el
																									// array
		}

		// Ahora queremos borrar un Pepe, porque lo hemos metido 2 veces

		lista1.remove(0);

		System.out.println("--------------------------------------------------------");
		for (int i = 0; i < lista1.size(); i++) {
			System.out.println(i + " " + lista1.get(i).getNombre() + " " + lista1.get(i).getEdad());// Así obtenemos
																									// todos los nombres
																									// de los objetos
																									// que están en el
																									// array
		}
		// En los Arrays, la longitud es fija. Pero en las listas pueden tener longitud
		// variable

		// También se puede borrar por objetos en vez de por posiciones. Borra el
		// primero que encuentre, nada más
//		lista1.remove(p0);
//		for(int i=0; i<lista1.size(); i++) {
//			System.out.println(i+" "+lista1.get(i).getNombre()+" "+lista1.get(i).getEdad());// Así obtenemos todos los nombres de los objetos que están en el array
//		}
		// Para eliminar todo usamos lista1.clear();
		System.out.println("-------------------------------------------------");
		// Esto es un foreach, otra forma de hacer un for, especifica para los objetos y
		// que queda más limpia
//		for(Persona p : lista1) {
//			System.out.println(p.getNombre()+" "+p.getEdad());
//		}
//		
		// EJERCICIO:
		// CON FOR TRADICIONAL
		System.out.println("¿A qué nombre borro de la lista?");
		String borrar = scLine.nextLine();
		for (int i = 0; i < lista1.size(); i++) {
			if (lista1.get(i).getNombre().equalsIgnoreCase(borrar)) {
				lista1.remove(i);
			}
			System.out.println(i + " " + lista1.get(i).getNombre() + " " + lista1.get(i).getEdad());
		}

		// CON FOREACH
		for (Persona p : lista1) {
			if (p.getNombre().equalsIgnoreCase(borrar)) {
				lista1.remove(p);
			}
			System.out.println(p.getNombre());
		}
//--------------------------------------------------------------------------------------
		// WRAPPED CLASS
		// Son los tipos de variables que están admitidas por las colecciones
		Integer a = 3;// Es lo mismo que poner int a=3;
		// También ayudan a hacer cambios de formato
		String aS = a.toString();
		// Con Collections.sort(array) ordeno de menor a mayor
		// Si hago Collections.sort(array, Collections.reverseOrder()); ordenamos de
		// mayor a menor

		// Así los imprime tal cual los hemos metido en el array
		for (Coche1 c : coches) {
			System.out.println(c.getMarca() + " " + c.getPotencia());
		}
		System.out.println("******************");
		// Así los vamos a ordenar según la marca
		Collections.sort(coches, new OrdenarPorNombre());
		for (Coche1 c : coches) {
			System.out.println(c.getMarca() + " " + c.getPotencia());
		}
		System.out.println("******************");
		//Ahora vamos a comparar las potencias
		
		Collections.sort(coches, new OrdenarPorPotencia());
		for (Coche1 c : coches) {
			System.out.println(c.getMarca() + " " + c.getPotencia());
		}
		
		
		
		
		
		
	}

}
