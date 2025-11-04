package opcionales;
import java.util.*;
public class opcionalesObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EJERCICIO 1
		
//		Scanner scLine = new Scanner(System.in);
//
//		System.out.println("Por favor, introduzca su nombre completo");
//		String nombreCompleto = scLine.nextLine();
//		int primerEspacio = nombreCompleto.indexOf(' ');
//		String nombre = nombreCompleto.substring(0, primerEspacio);
//		int segundoEspacio = nombreCompleto.indexOf(' ', primerEspacio + 1);
//		String ape1 = nombreCompleto.substring(primerEspacio, segundoEspacio);
//		String ape2 = nombreCompleto.substring(segundoEspacio);
//		ape1 = ape1.trim();
//		ape2 = ape2.trim();
//		System.out.println("Formato: " + ape1.toUpperCase() + " " + ape2.toUpperCase() + ", " + nombre);
//		int longitud = nombreCompleto.length();
//		nombreCompleto = nombreCompleto.replace("a", "");
//		int cantidadA = longitud - nombreCompleto.length();
//		System.out.println("Caracteres a: " + cantidadA);
//		String letrasNom = nombre.substring(0, 3);
//		int longApe = ape2.length();
//		String letrasApe = ape2.substring(longApe - 2);
//		System.out.println("Código: " + letrasNom + letrasApe.toLowerCase());
//
//		scLine.close();
		
		//EJERCICIO 2
		
		Scanner scLine = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		Scanner scDouble = new Scanner(System.in);
		//Random r = new Random();

//		System.out.println("Nombre");
//		String nombre = scLine.nextLine();
//
//		System.out.println("Apellido");
//		String apellido = scLine.nextLine();
//
//		String letrasNombre = nombre.substring(0, 3);
//		int longitudApe = apellido.length();
//		String letrasApe = apellido.substring(longitudApe - 3);
//		String usuario = letrasNombre.toLowerCase() + letrasApe.toLowerCase();
//
//		int numero = r.nextInt(1000, 10000);
//
//		String caracteres = "_-.@";
//		int aleatorio = r.nextInt(caracteres.length());
//		char ale = caracteres.charAt(aleatorio);
//		System.out.println("Usuario: " + usuario + ale + numero);
		
		//EJERCICIO 3
//		
//		System.out.println("Email");
//		String email = scLine.nextLine();
//		int arroba = email.indexOf('@');
//		String usuario = email.substring(0, arroba);
//		System.out.println("Usuario: " + usuario);
//		int punto = email.indexOf('.', arroba);
//		int ultimoPunto = email.lastIndexOf(".");
//		String subdominio = email.substring(arroba + 1, ultimoPunto);
//		System.out.println("Dominio: " + subdominio);
//		String tld = email.substring(ultimoPunto + 1);
//		System.out.println("TLD: " + tld);
//		int antePunto = email.lastIndexOf(".", ultimoPunto - 1);
//		String segundoNivel = email.substring(antePunto + 1, ultimoPunto);
//		System.out.println("Segundo nivel: " + segundoNivel);
		
		//EJERCICIO 4
		
//		int dado1 = r.nextInt(1, 7);
//		int dado2 = r.nextInt(1, 7);
//		int dado3 = r.nextInt(1, 7);
//		int dado4 = r.nextInt(1, 7);
//		int dado5 = r.nextInt(1, 7);
//
//		String tiradas = dado1 + "," + dado2 + "," + dado3 + "," + dado4 + "," + dado5;
//		System.out.println("Tiradas: " + tiradas.trim());
//
//		int suma = dado1 + dado2 + dado3 + dado4 + dado5;
//		double media = suma / 5.0;
//		System.out.println("Media: " + (media * 100.0) / 100.0);
//
//		int minimo = Math.min(dado1, Math.min(dado2, Math.min(dado3, Math.min(dado4, dado5))));
//		int maximo = Math.max(dado1, Math.max(dado2, Math.max(dado3, Math.max(dado4, dado5))));
//
//		System.out.println("Máximo: " + maximo);
//		System.out.println("Mínimo: " + minimo);
		
		
		//EJERCICIO 5
		
//		System.out.println("Peso");
//		double peso = scDouble.nextDouble();
//		System.out.println("Altura");
//		double altura = scDouble.nextDouble();
//		double imc = peso / (Math.pow(altura, 2));
//		System.out.println("IMC: " + Math.round(imc * 100) / 100.0);
//		double luna = peso * 0.165;
//		System.out.println("Luna: " + Math.round(luna * 100) / 100.0);
//		double marte = peso * 0.38;
//		System.out.println("Marte: " + Math.round(marte * 100) / 100.0);
//		double h = 1.20;
//		double g = 9.80665;
//		double potencial = peso * h * g;
//		System.out.println("Potencial: " + Math.round(potencial * 100) / 100.0);
		
		//EJERCICIO 6
		
//		System.out.println("Introduzca una frase");
//		String frase = scLine.nextLine();
//		String fraseEspacios = frase.replace(" ", "");
//		System.out.println("Frase sin espacios: " + fraseEspacios);
//		String letrasInicio = frase.substring(0, 5);
//		int longitud = frase.length();
//		String letrasFinal = frase.substring(longitud - 5);
//		System.out.println("Inicio+fin: " + letrasInicio + "+" + letrasFinal + "= " + letrasInicio + letrasFinal);
//		String ocurrencias = frase.replace("Java", "");
//		int contadorLetras = longitud - ocurrencias.length();
//		int contadorPalabras = contadorLetras / "Java".length();
//		System.out.println("Ocurrencias: " + contadorPalabras);
		
		//EJERCICIO 7
//		System.out.println("Introduzca un número largo");
//		long semilla = scInt.nextLong();
//		Random r = new Random(semilla);
//
//		double decimal = r.nextDouble();
//		int entero = r.nextInt(50, 101);
//		double precio = r.nextDouble() * 100;
//
//		System.out.println("Decimal: " + decimal);
//		System.out.println("Entero: " + entero);
//		System.out.println("Precio: " + Math.round(precio * 100.0) / 100.0 + "€");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
