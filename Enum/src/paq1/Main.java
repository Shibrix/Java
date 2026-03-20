package paq1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Son objetos como tal, pero no hace falta declararlo con new. Se declara de la
		// siguiente manera

		Scanner scInt = new Scanner(System.in);

		Tamanyo t0 = Tamanyo.MEDIANO;
		Tamanyo t1 = Tamanyo.GRANDE;
		Tamanyo t2 = Tamanyo.PEQUENIO; // En cualquier momento podemos cambiar la declaración del objeto (cambiar el
										// tamaño)

		t2 = Tamanyo.MEDIANO;

		Paquete p0 = new Paquete("1234AAAS", "Amazon", "Pedro López", t1);
		Paquete p1 = new Paquete("7652A", "AliExpress", "Susana García");
		Paquete p2 = new Paquete("8888H", "Amazon", "Luis Gómez", Tamanyo.PEQUENIO);

		List<Paquete> paquetes = new ArrayList<>();
		paquetes.add(p0);
		paquetes.add(p1);
		paquetes.add(p2);

		Flor f0 = Flor.PETUNIA;

		System.out.println(f0.getNombre());
		System.out.println(f0.getColor());
		System.out.println(f0.isEspinas());

		// Así recorremos un ENUM
		for (Flor f : Flor.values()) {

			System.out.println();
			System.out.println(f.getNombre());
			System.out.println("Es de color " + f.getColor());

			if (f.isEspinas()) {
				System.out.println("La flor tiene espinas");
			} else {
				System.out.println("La flor no tiene espinas");
			}
		}
		System.out.println();

		// recorrer el list y que diga si hay algún paquete que no tenga tamaño
		for (Paquete p : paquetes) {
			if (p.getTamanio() == null) {
				System.out.println("El paquete " + p.getCodigo() + " no tiene asignado ningún tamaño.");
				System.out.println("Asigne un tamaño por favor: ");
				System.out.println("1.- Pequeño\n" + "2.- Mediano\n" + "3.- Grande");

				int eleccion = scInt.nextInt();

				switch (eleccion) {
				case 1:
					p.setTamanio(Tamanyo.PEQUENIO);
					break;
				case 2:
					p.setTamanio(Tamanyo.MEDIANO);
					break;
				case 3:
					p.setTamanio(Tamanyo.GRANDE);
					break;
				}
				System.out.println("El paquete " + p.getCodigo() + " ahora tiene tamaño " + p.getTamanio());
			}

		}

	}

}
