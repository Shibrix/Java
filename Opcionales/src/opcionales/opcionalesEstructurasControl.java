package opcionales;
import java.util.*;
public class opcionalesEstructurasControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		
		Scanner scLine = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		Scanner scDouble = new Scanner(System.in);
		Random r = new Random();	
		
		//EJERCICIO 1
//		int aleatorio1;
//		int aleatorio2;
//		int aleatorio3;
//		boolean activo=true;
//		
//		do {
//		scLine.nextLine();	
//		aleatorio1= r.nextInt(0,31);
//		aleatorio2= r.nextInt(0,31);
//		aleatorio3= r.nextInt(0,31);
//		
//		String cadena="";		
//		
//		while(aleatorio1==aleatorio2 || aleatorio1==aleatorio3 || aleatorio2==aleatorio3) {
//			aleatorio1=r.nextInt(0,31);
//			aleatorio2= r.nextInt(0,31);
//			aleatorio3= r.nextInt(0,31);
//		}
//		cadena=aleatorio1+","+aleatorio2+","+aleatorio3+cadena;
//		System.out.println(cadena);
//		}while(activo);
		
		//EJERCICIO 2
		
//		System.out.println("Introduce un número");
//		int numero1 = scInt.nextInt();
//		System.out.println("Introduce otro número");
//		int numero2 = scInt.nextInt();
//		System.out.println("Pulse enter cada vez para obtener resultados");
//		double numeroCuadrado = Math.pow(numero1, numero2);
//		scLine.nextLine();
//		System.out.println(numeroCuadrado);
//		while (numeroCuadrado <= 1000000) {
//			scLine.nextLine();
//			numeroCuadrado = Math.pow(numeroCuadrado, numero2);
//			System.out.println(numeroCuadrado);
//		}
//		System.out.println("El programa ha terminado");
		
		//EJERCICIO 3
//		
//		boolean control = true;
//		while (control) {
//			System.out.println("Introduce una frase");
//			String frase = scLine.nextLine();
//			if (frase.equalsIgnoreCase("fin")) {
//				control = false;
//				System.out.println("El programa ha terminado");
//				break;
//			} else {
//				int longitud = frase.length();
//				int random1 = r.nextInt(longitud-1);
//				int random2 = r.nextInt(longitud-1);
//
//				int minimo = Math.min(random1, random2);
//				int maximo = Math.max(random1, random2);
//
//				String trozoFrase1 = frase.substring(0, minimo);
//				String trozoFrase2 = frase.substring(minimo, maximo);
//				String trozoFrase3 = frase.substring(maximo);
//				System.out.println(
//						"Los trozos de frase son : " + trozoFrase1 + " | " + trozoFrase2 + " | " + trozoFrase3);
//			}
//		}
		
		//EJERCICIO 4
		
//		boolean control = true;
//		String letrasAleatorias = "";
//		while (control) {
//			System.out.println("Introduzca un número entero");
//			int numero = scInt.nextInt();
//			if (numero == -1) {
//				control = false;
//				System.out.println("La ejecución ha terminado");
//				break;
//			} else {
//				String letras = "abcdefghijklmnñopqrstuvwxyz";
//				int longitudLetras = letras.length();
//				for (int i = 0; i < numero; i++) {
//					int aleatorio = r.nextInt(longitudLetras);
//					System.out.println("El aleatorio de la longitud es " + aleatorio);
//					char c = letras.charAt(aleatorio);
//					letrasAleatorias = letrasAleatorias + c + ",";
//
//				}
//
//				System.out.println(
//						"Las letras aleatorias son " + letrasAleatorias.substring(0, letrasAleatorias.length() - 1));
//			}
//		}
		
		//EJERCICIO 5
		
//		System.out.println("Introduzca un número");
//		int numero1 = scInt.nextInt();
//		int numero2 = 0;
//		double multiplicacion = 0;
//		int dividendo = 0;
//		double division = 0;
//		System.out.println("¿Multiplicar por?");
//		numero2 = scInt.nextInt();
//		multiplicacion = numero1 * numero2;
//		System.out.println("El resultado de multiplicar " + numero1 + "x" + numero2 + " es " + multiplicacion);
//		System.out.println("¿Dividir por?");
//		dividendo = scInt.nextInt();
//		division = multiplicacion / dividendo;
//		System.out.println("El resultado de dividir " + multiplicacion + "/" + dividendo + " es " + division);
//
//		while (true) {
//			System.out.println("¿Multiplicar por?");
//			numero2 = scInt.nextInt();
//			if (numero2 == 0) {
//				System.out.println("La ejecución ha terminado");
//				break;
//			} else {
//				multiplicacion = division * numero2;
//				System.out.println("El resultado de multiplicar " + division + "x" + numero2 + " es " + multiplicacion);
//				System.out.println("¿Dividir por?");
//				dividendo = scInt.nextInt();
//				if (dividendo == 0) {
//					System.out.println("La ejecución ha terminado");
//					break;
//				} else {
//					division = multiplicacion / dividendo;
//					System.out
//							.println("El resultado de dividir " + multiplicacion + "/" + dividendo + " es " + division);
//				}
//			}
//		}
		
		//EJERCICIO 6
		
		System.out.println("Introduzca un número con muchos decimales");
		double numero = scDouble.nextDouble();

		boolean control = true;

		while (control) {
			System.out.println("¿Quiere redondearlo con 1, 2 o 3 decimales?");
			int opcion = scInt.nextInt();

			switch (opcion) {
			case 1:
				numero = Math.round(numero * 10.0) / 10.0;
				System.out.println("El número redondeado a 1 decimal: " + numero);
				control = false;
				break;
			case 2:
				numero = Math.round(numero * 100.0) / 100.0;
				System.out.println("El número redondeado a 2 decimales: " + numero);
				control = false;
				break;
			case 3:
				numero = Math.round(numero * 1000.0) / 1000.0;
				System.out.println("El número redondeado a 3 decimales: " + numero);
				control = false;
				break;
			default:
				System.out.println("El número introducido no es válido");
			}
		}
		
		
		
		
		
		
		
		
}
}
