package Colecciones2;

import java.util.*;

public class Main {

	static Scanner scLine = new Scanner(System.in);
	static String marca;
	static String matricula;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El array list de HashSet sirve para evitar que se introduzcan 2 objetos con
		// los mismos datos. Para eso
		// Creamos en la clase Persona los métodos Hash y Equals y le indicamos qué
		// campo de los objetos tiene que comparar.
		// En este caso le hemos indicado que lo compare por el campo dni

//		Scanner scLine = new Scanner(System.in);
//
//		Set<Persona> personas = new HashSet();
//
//		Persona p1 = new Persona("Pepe", 21, "1111A");
//		Persona p2 = new Persona("Manuel", 22, "2222B");
//		Persona p3 = new Persona("Eva", 25, "3333C");
//		Persona p4 = new Persona("Eva", 25, "3333C");
//
//		personas.add(p1);
//		personas.add(p2);
//		personas.add(p3);
//		personas.add(p4);
//
//		for (Persona p : personas) {
//			System.out.println(p.getNombre() + " " + p.getEdad() + " " + p.getDni());
//		}
//
//		Persona p5 = new Persona("Heva", 100, "3333C");
//		boolean contiene = personas.contains(p5);// Aquí estamos generando un booleano para comprobar si en el array
//													// existe
//		// un objeto que ya tenga esos datos (en este caso compara el dni porque es lo
//		// que le hemos pedido)
//
//		System.out.println(contiene);
//
//		personas.remove(p5);
//
//		for (Persona p : personas) {
//			System.out.println(p.getNombre() + " " + p.getEdad() + " " + p.getDni());
//		}
//
//		System.out.println("Dime el dni de la persona a buscar: ");
//
//		String dni = scLine.nextLine();
//
//		Persona px = new Persona("", 0, dni);
//
//		if (personas.contains(px)) { // Esto devuelve un true o false, si lo encuentra o no
//			for (Persona p : personas) {
//				if (p.getDni().equalsIgnoreCase(dni)) {
//					System.out.println("Por ese dni nos aparece esta persona: " + p.getNombre() + " " + p.getEdad()
//							+ " " + p.getDni());
//					break;
//				}
//
//			}
//		} else {
//			System.out.println("No se ha encontrado ninguna persona con ese dni");
//
//		}
//		

		// EJERCICIO
		// Hacer un hashet con coches que se identifiquen por la matrícula.
		// Atributos: marca y matrícula
		// Preguntará por 4 coches y los irá añadiendo al Set
		// Mostrará el conjunto
		// Al final pedirá una matrícula y si hay un coche con esa marca, dirá la marca

		Set<Coche> coches = new HashSet();

//		System.out.println("Introduzca el primer coche");
//		System.out.println("Marca: ");
//		marca= scLine.nextLine();
//		System.out.println("Matrícula: ");
//		matricula= scLine.nextLine();
//		
//		Coche c0= new Coche(marca,matricula);
//		coches.add(c0);
//		
//		System.out.println("Introduzca el segundo coche");
//		System.out.println("Marca: ");
//		marca= scLine.nextLine();
//		System.out.println("Matrícula: ");
//		matricula= scLine.nextLine();
//		
//		Coche c1= new Coche(marca,matricula);
//		coches.add(c1);
//		
//		System.out.println("Introduzca el tercer coche");
//		System.out.println("Marca: ");
//		marca= scLine.nextLine();
//		System.out.println("Matrícula: ");
//		matricula= scLine.nextLine();
//		
//		Coche c2= new Coche(marca,matricula);
//		coches.add(c2);
//		
//		System.out.println("Introduzca el cuarto coche");
//		System.out.println("Marca: ");
//		marca= scLine.nextLine();
//		System.out.println("Matrícula: ");
//		matricula= scLine.nextLine();
//		
//		Coche c3= new Coche(marca,matricula);
//		coches.add(c3);
//		
//		System.out.println("Listado de coches: ");
//		for(Coche c : coches) {			
//			System.out.println(c.getMarca()+" "+c.getMatricula());
//		}
//		
//		System.out.println("Introduzca la matrícula que quiere buscar: ");
//		matricula= scLine.nextLine();
//		
//		Coche cx= new Coche("",matricula);
//		
//		if(coches.contains(cx)) {
//			for(Coche c : coches) {
//				if(c.getMatricula().equals(matricula)) {
//					System.out.println("Por esa matrícula nos aparece esta coche: " + c.getMarca() );
//					break;
//				}
//			}
//		}
//		else {
//			System.out.println("Por esa matrícula no hemos encontrado ningún coche");
//		}
//		
		// OTRA MANERA DE HACERLO

		for (int i = 0; i < 4; i++) {
			System.out.println("Introduzca la marca del vehículo " + i);
			marca = scLine.nextLine();

			System.out.println("Introduzca la matrícula del vehículo " + i);
			matricula = scLine.nextLine();

			Coche cx = new Coche(marca, matricula);
			coches.add(cx);
		}

		for (Coche c : coches) {
			System.out.println(c.getMarca() + " " + c.getMatricula());
		}

		System.out.println("\nDime la matricula a buscar: ");
		matricula = scLine.nextLine();
		Coche cx = new Coche("", matricula);
		if (coches.contains(cx)) {
			for (Coche c : coches) {
				if (c.getMatricula().equalsIgnoreCase(matricula)) {
					System.out.println("Por esa matrícula nos aparece esta coche: " + c.getMarca());
					break;
				}
			}
		} else {
			System.out.println("Por esa matrícula no hemos encontrado ningún coche");
		}

	}

}
