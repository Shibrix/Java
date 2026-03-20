import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scLine = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
//		// El printf no tiene retorno de carro automático como el line (no tiene el \n).
//		// Hay que ponerlo y se pone como %n
//		// Para evitar problemas entre sistemas operativos
//		// Así para números enteros
//		int num = 4;
//		System.out.printf("El numero es: %d%n", num);
//
//		// Así para decimales
//		double pi = 3.1415;
//		System.out.printf("PI vale: %.1f%n", pi);
//
//		System.out.printf("El número vale %d y pi vale %.3f%n", num, pi);
//
//		// El orden de los argumentos es importante, los coge por orden
//		int num0 = 7;
//		System.out.printf("El número vale %d, el otro número vale %d y pi vale %f%n", num, num0, pi);
//		System.out.printf("El número vale %d, el otro número vale %d y pi vale %.2f%n", num, num0, pi);
//
//		// Si ponemos %.1f. lo que hacemos es que el decimal salga con 1 decimal.
//		// Podemos poner el número que queramos
//
//		// Ahora vemos cómo es con los Strings y los caracteres
//		String nombre = "Juan";
//		char caracter = 'J';
//		System.out.printf("Me llamo %s y tengo %d años y mi nombre empieza por %c%n", nombre, num0, caracter);
//
//		// Para booleanos
//		boolean estadoAlarma = true;
//		System.out.printf("El estado de la alarma es %b%n", estadoAlarma);
//
//		// MODIFICADORES DE FORMATO
//		// Podemos ponerle ancho de campo, tanto a la izquierda de la variable como a la
//		// derecha
//		// Ejmeplo con syso
//		System.out.println("Valor1: " + "   " + "Valor2: ");
//		int valor11 = 234;
//		int valor12 = 23455;
//		int valor21 = 4;
//		int valor22 = 234;
//		int valor31 = 12;
//		int valor32 = 45;
//
//		System.out.println(valor11 + "   " + valor12);
//		System.out.println(valor21 + "   " + valor22);
//		System.out.println(valor31 + "   " + valor32);
//
//		// Ejemplo con printf dejando huecos y alineado a la izquierda
//		System.out.printf("%-10s%-10s%n", "Valor1", "Valor2");
//		System.out.printf("%-10d%-10d%n", valor11, valor12);
//		System.out.printf("%-10d%-10d%n", valor21, valor22);
//		System.out.printf("%-10d%-10d%n", valor31, valor32);
//
//		// Si queremos poner ceros y qué cantidad total de números
//		System.out.printf("%05d%n", 23);// así saldrían tres ceros más el 23 (total, 5 dígitos)
//		int hora = 8;
//		int minutos = 15;
//		System.out.printf("Son las %02d:%02d%n",hora,minutos);
//		
//		//Para separar millares
//		int numeroAlto= 123412345;
//		System.out.printf("%,d%n", numeroAlto);

		// EJERCICIO 1
//		System.out.println("¿Cual es tu nombre?");
//		String nombre = scLine.nextLine();
//		System.out.println("¿Y tu ciudad?");
//		String ciudad = scLine.nextLine();
//
//		System.out.printf("Tu nombre es %s y tu ciudad %s%n", nombre, ciudad);

		// EJERCICIO 2
//		System.out.println("¿Cual es tu nombre?");
//		String nombre = scLine.nextLine();
//		System.out.println("¿Y tu edad?");
//		int edad = scLine.nextInt();
//		scLine.nextLine();
//		System.out.println("¿Qué año es?");
//		String fecha = scLine.nextLine();
//
//		System.out.printf("Tu nombre es %s, tu edad %d y hoy es %s%n", nombre, edad, fecha);

		// EJERCICIO 3
//		double pi= Math.PI;
//		System.out.printf("El valor de Pi es: %.4f%n",pi);

		// EJERCICIO 4

//		boolean variable= true;
//		System.out.printf("El resultado de la variable booleana es %b%n", variable);

		// EJERCICIO 5
//		char inicial= 'R';
//		System.out.printf("La inicial de mi nombre es %c%n", inicial);

		// EJERCICIO 6
//		int num1 = 12581;
//		int num2 = 56;
//		int num3 = 7737;
//		String cad1 = "hola";
//		String cad2 = "qué tal";
//		String cad3 = "hoy es martes";
//
//		System.out.printf("%-10s%-10s%n", "Columna 1", "Columna2");
//		System.out.printf("%-10d%10s%n", num1, cad1);
//		System.out.printf("%-10d%10s%n", num2, cad2);
//		System.out.printf("%-10d%10s%n", num3, cad3);

		// EJERCICIO 7

//		System.out.println("Introduzca un número entero");
//		int num = scInt.nextInt();
//		System.out.printf("El número con ceros es %05d", num);

		// EJERCICIO 8
//		System.out.println("Introduzca un número entero grande (entre 1000000 y 5000000)");
//		int num = scInt.nextInt();
//		System.out.printf("El número introducido separado por comas es %,d%n", num);

	}

}
