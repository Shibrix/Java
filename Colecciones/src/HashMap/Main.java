package HashMap;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(Double.MIN_VALUE);
		// System.out.println(Integer.MAX_VALUE);

		Scanner scLine = new Scanner(System.in);

		String palabra = "2";
		int d = Integer.parseInt(palabra);
		System.out.println(d);

		// EJERCICIO: Meter en un arrayList los números: 4,7,2,6,1,10,3,7,2
		// Primero tiene que mostrarlos, después ordenarlos de menor a mayor
		// Y luego de mayor a menor

		List<Integer> numeros = Arrays.asList(4, 7, 2, 6, 1, 10, 3, 7, 2);

		Collections.sort(numeros);
		System.out.println("Orden de menor a mayor");
		System.out.println(numeros);

		Collections.sort(numeros, Collections.reverseOrder());
		System.out.println("\nOrden de mayor a mayor");
		System.out.println(numeros);

//HASHMAP
		// El primer valor que ponemos en los <> del hashmap actúa como clave primaria,
		// NO SE PUEDE REPETIR
		// El segundo valor sí se puede repetir. Además los valores se guardan a pares
		HashMap<String, Integer> curso = new HashMap();

		// Para meter datos en el array, lo hacemos así

		curso.put("1ºDAM", 15);
		curso.put("1ºDAW", 18);
		curso.put("2ºDAM", 15);
		curso.put("2ºDAW", 11);
		curso.put("1ºSMR", 15);
		curso.put("2ºSMR", 17);

		// Para ver si el array contiene en el primer campo un dato concreto, lo hacemoa
		// así

		System.out.println("\n");
		System.out.println(curso.containsKey("1ºDAM"));
		System.out.println(curso.containsKey("3ºDAM"));

		// Para ver si el array contiene en el segundo campo un dato concreto, lo
		// hacemoa así

		System.out.println(curso.containsValue(15));
		System.out.println(curso.containsValue(14));

		System.out.println("\n");
		// Para recorrer el array, debemos especificar si lo hacemos por la clave o por
		// el segundo valor
		// Es mejor buscar por la clave, porque así podemos obtener el valor

		for (String s : curso.keySet()) {
			System.out.println(s + " " + curso.get(s));
		}

		System.out.println("\n");

		for (Integer i : curso.values()) {
			System.out.println(i);
		}

		// EJERCICIO: que pregunte por un curso y responda el número de alumnos

//		System.out.println("¿De qué curso quiere ver los alumnos?");
//
//		for (String s : curso.keySet()) {
//			System.out.println(s);
//		}
//
//		String elegido = scLine.nextLine();
//
//		if (curso.containsKey(elegido)) {
//			System.out.println("Este curso tiene " + curso.get(elegido) + " alumnos");
//		}
//		else {
//			System.out.println("Este curso no está registrado\n");
//		}

		// EJERCICIO: hacer un hashmap con provincias y comunidades autónomas
		// Cuenca - Castilla la Mancha, Albacete - Castilla la Mancha, Valencia -
		// Comunidad Valenciana,
		// Alicante - Comunidad Valenciana, Madrid - Comunidad de Madrid
		// Muestre cada provincia con su comunidad
		// Pregunte por una provincia y diga la comunidad
		// Elimine a Alicante

		HashMap<String, String> espania = new HashMap();

		espania.put("Cuenca", "Castilla la Mancha");
		espania.put("Albacete", "Región de Murcia");
		espania.put("Valencia", "Comunidad Valenciana");
		espania.put("Alicante", "Comunidad Valenciana");
		espania.put("Madrid", "Comunidad de Madrid");

		for (String c : espania.keySet()) {
			System.out.println(c + ", " + espania.get(c));
		}

		System.out.println("\nDígame una provincia");
		String provincia = scLine.nextLine();

		System.out.println("La comunidad de " + provincia + " es " + espania.get(provincia)+"\n");
		
		espania.remove("Alicante");
		espania.put("Albacete","Castilla la Mancha"); //No da error, sobreescribe el valor del original
		
		
		for (String c : espania.keySet()) {
			System.out.println(c + ", " + espania.get(c));
		
		}
		
		//De estas pronvincias, que diga cuáles son de Castilla la Macha
		
		System.out.println("\nTodas las provincias de Castilla la Mancha son: ");
		for(String c : espania.keySet()) {
			if(espania.get(c).equalsIgnoreCase("Castilla la Mancha")){
				System.out.println(c);
			}
		}

	}

}
