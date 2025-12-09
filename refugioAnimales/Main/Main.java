import refugioAnimales.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("===ALTA INICIAL DE ANIMALES EN EL REFUGIO===\n");
		System.out.println("==Alta de PERRO==");
		System.out.println("Nombre del perro: ");
		String nombrePerro = sc.nextLine();
		System.out.println("Edad del perro: ");
		int edadPerro = sc.nextInt();
		sc.nextLine();
		System.out.println("Raza del perro: ");
		String raza = sc.nextLine();
		Animal animal0 = new Perro(nombrePerro, edadPerro, raza);
		Perro p0 = ((Perro) animal0);
		System.out.println("\n");

		System.out.println("==Alta de GATO==");
		System.out.println("Nombre del gato: ");
		String nombreGato = sc.nextLine();
		System.out.println("Edad del gato: ");
		int edadGato = sc.nextInt();
		sc.nextLine();
		System.out.println("¿Es cazador?: ");
		boolean cazador = sc.nextBoolean();
		sc.nextLine();
		Animal animal1 = new Gato(nombreGato, edadGato, cazador);
		Gato g0 = (Gato) animal1;
		System.out.println("\n");

		System.out.println("==Alta de CANARIO==");
		System.out.println("Nombre del canario: ");
		String nombreCanario = sc.nextLine();
		System.out.println("Edad del canario: ");
		int edadCanario = sc.nextInt();
		sc.nextLine();
		System.out.println("Color plumaje: ");
		String colorPlumaje = sc.nextLine();
		System.out.println("\n");
		Animal animal2 = new Canario(nombreCanario, edadCanario, colorPlumaje);
		Canario c0 = (Canario) animal2;

		boolean control = true;

		do {

			System.out.println("===MENÚ REFUGIO===");
			System.out.println("1.Escuchar a todos los animales");
			System.out.println("2.Ver fichas de los animales");
			System.out.println("3.Mostrar animal más viejo");
			System.out.println("4.Elegir un animal y mostrar su ficha");
			System.out.println("0.Salir");
			System.out.println("Elija una opción: ");

			int opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {

			case 1:
				escucharAnimales(p0, g0, c0);
				break;
			case 2:
				mostrarFicha(p0, g0, c0);
				System.out.println("\n");
				break;
			case 3:
				calcularMasViejo(p0, g0, c0);
				break;

			case 4:
				elegirAnimal(p0, g0, c0);
				break;
			case 0:
				System.out.println("Saliendo del refugio...");
				control = false;
			}

		} while (control == true);

	}

	private static void escucharAnimales(Animal p0, Animal g0, Animal c0) {
		// TODO Auto-generated method stub
		System.out.println("--Sonido de todos los animales--");
		p0.emitirSonido();
		g0.emitirSonido();
		c0.emitirSonido();
		System.out.println("\n");
	}

	private static void mostrarFicha(Animal animal0, Animal animal1, Animal animal2) {
		// TODO Auto-generated method stub
		System.out.println("\n--Fichas de los animales--");
		System.out.println(animal0.toString());
		animal0.emitirSonido();
		System.out.println(animal1.toString());
		animal1.emitirSonido();
		System.out.println(animal2.toString());
		animal2.emitirSonido();
	}

	private static void calcularMasViejo(Animal a0, Animal a1, Animal a2) {
		// TODO Auto-generated method stub
		int edadAnimal0 = a0.getEdad();
		int edadAnimal1 = a1.getEdad();
		int edadAnimal2 = a2.getEdad();

		if (edadAnimal0 > edadAnimal1 && edadAnimal0 > edadAnimal2) {
			System.out.println("\nEl animal más viejo es " + a0.toString());
			a0.emitirSonido();
			System.out.println("\n");
		}
		if (edadAnimal1 > edadAnimal0 && edadAnimal1 > edadAnimal2) {
			System.out.println("\nEl animal más viejo es " + a1.toString());
			a1.emitirSonido();
			System.out.println("\n");
		}
		if (edadAnimal2 > edadAnimal0 && edadAnimal2 > edadAnimal1) {
			System.out.println("\nEl animal más viejo es " + a2.toString());
			a2.emitirSonido();
			System.out.println("\n");
		}
	}

	private static void elegirAnimal(Animal a0, Animal a1, Animal a2) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("--Probar un animal concreto--");
		System.out.println("¿Qué animal quieres elegir?");
		System.out.println("1.Primero");
		System.out.println("2.Segundo");
		System.out.println("3.Tercero");

		int elegir = sc.nextInt();
		switch (elegir) {
		case 1:
			System.out.println(a0.toString());
			a0.emitirSonido();
			System.out.println("\n");
			break;

		case 2:
			System.out.println(a1.toString());
			a1.emitirSonido();
			System.out.println("\n");
			break;

		case 3:
			System.out.println(a2.toString());
			a2.emitirSonido();
			System.out.println("\n");
			break;
		}

	}

}
