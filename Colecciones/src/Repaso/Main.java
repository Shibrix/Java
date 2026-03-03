package Repaso;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scLine = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);

		Profesor prof0 = new Profesor("1A", "Mateo", 8);
		Profesor prof1 = new Profesor("2B", "Eva", 6);
		Profesor prof2 = new Profesor("3C", "Sebas", 9);

		Set<Profesor> profesores = new HashSet();
		List<Profesor> profesores1 = new ArrayList();
		List<Profesor> baja = new ArrayList();

		profesores.add(prof0);
		profesores.add(prof1);
		profesores.add(prof2);

		profesores1.add(prof0);
		profesores1.add(prof1);
		profesores1.add(prof2);

		for (Profesor p : profesores) {
			System.out.println(p);
		}

		System.out.println("¿Qué profesor busco? (Introduce una Id)");
		String buscarId = scLine.nextLine();
		Profesor px = new Profesor(buscarId, "", 0);

		if (profesores.contains(px)) {
			for (Profesor p : profesores) {
				if (p.getIdentidad().equals(buscarId)) {
					System.out.println(p);
				}

			}

		} else {
			System.out.println("No hay ningún profesor con ese id");
		}
		
		
		for(int i=0; i<profesores1.size(); i++) {
			System.out.println(i+".-"+profesores1.get(i));
		}
		System.out.println("¿Qué profesor pasaría a estar de baja?");
		int eleccion= scInt.nextInt();		
		
		Profesor pb= profesores1.get(eleccion);		
		baja.add(pb);
		profesores1.remove(eleccion);
		
		System.out.println("Lista profesores 1");
		for(int i=0; i<profesores1.size(); i++) {
			System.out.println(i+".-"+profesores1.get(i));
		}
		
		System.out.println("Lista profesores baja");
		for(int i=0; i<baja.size(); i++) {
			System.out.println(i+".-"+baja.get(i));
		}
		
		
		
		
	}

}
