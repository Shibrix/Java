package opcionales;

public class opcionalesExamenBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//HOJA 1	
		
		//EJERCICIO 1
		
//		for (int i = 2; i <= 20; i++) {
//			int pares = i % 2;
//			if (pares == 0) {
//				System.out.println(i);
//			}
//
//		}
		
		//EJERCICIO 2
//		
//		for (int i = 1; i < 11; i++) {
//
//			if (i == 5) {
//				System.out.println("CINCO");
//			} else {
//				System.out.println(i);
//			}
//		}
		
		//EJERCICIO 3
		
//		for (int i = -30; i < 31; i++) {
//			if (i > 0 && i < 8) {
//				int pares = i % 2;
//				if (pares == 0) {
//					System.out.println(i);
//				}
//			} else {
//				System.out.println(i);
//			}
//
//		}
		
		
		//EJERCICIO 4
		
//		int numero = 7;
//		do {
//			int impares = numero % 2;
//			if (impares == 1) {
//				System.out.println(numero);
//			}
//			numero++;
//		} while (numero <= 21);
		
		
		//EJERCICIO 5
		
//		for (int i = 1; i < 101; i++) {
//			if (i % 10 == 8) {
//				System.out.println(i);
//			}
//		}
		
		//EJERCICIO 6
		
//		for (int i = 4; i < 41; i++) {
//			if (i % 4 == 0) {
//				System.out.println(i);
//			}
//		}
		
		//EJERCICIO 7
		
//		int numero = 10;
//
//		while (numero >= -10) {
//			System.out.println(numero);
//			numero--;
//		}
//
//		numero = -10;
//
//		while (numero <= 10) {
//			System.out.println(numero);
//			numero++;
//		}
//		
//		//otra manera
//		
//		int num = 10;
//		int contador = -1;
//		while (true) {
//			if (num == -10 && contador == -1) {
//				System.out.println(num);
//				contador = +1;
//			}
//			if (num == 10 && contador == +1) {
//				System.out.println(num);
//			}
//		}
		
		//EJERCICIO 8
		
//		for (int i = -20; i < 1; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//			if (i == 0) {
//				for (i = 1; i < 22; i++) {
//					if (i % 2 == 1) {
//						System.out.println(i);
//					}
//				}
//
//			}
//		}
		
		//EJERCICIO 9
//		int suma = 0;
//		for (int i = 5; i < 16; i++) {
//			System.out.println(i + "+" + suma + "=" + (suma + i));
//			suma = suma + i;
//		}
//		System.out.println("La suma total de los números es de: " + suma);
		
		
		//EJERCICIO 10
		
//		for (int i = 3; i < 22; i++) {
//			int impares = i % 2;
//			if (impares == 1) {
//				if (i == 13 || i == 17) {
//
//				} else {
//					System.out.println(i);
//				}
//			}
//		}
		
		
	//HOJA 2
		
		//EJERCICIO 1
		
//		for (int i = 5; i < 51; i++) {
//			int multiplos = i % 5;
//			if (multiplos == 0) {
//				System.out.println(i);
//			}
//		}
		
		//EJERCICIO 2

//		int numero = -20;
//
//		while (numero < 22) {
//			if (numero >= -20 && numero <= 0) {
//				int pares = numero % 2;
//				if (pares == 0) {
//					System.out.println(numero);
//				}
//			}
//			if (numero >= 1 && numero <= 21) {
//				int impares = numero % 2;
//				if (impares == 1) {
//					System.out.println(numero);
//				}
//			}
//			numero++;
//		}
		
		//EJERCICIO 3
		
//		for (int i = 1; i < 21; i++) {
//			int multiplo = i % 3;
//			if (multiplo == 0) {
//				System.out.println(i + " es múltiplo de 3");
//			} else {
//				System.out.println(i);
//			}
//		}
		
		//EJERCICIO 4
		
//		int suma = 0;
//
//		for (int i = 3; i < 100; i++) {
//			int multiplos = i % 3;
//			if (multiplos == 0) {
//				System.out.println(i + "+" + suma + "=" + (suma + i));
//				suma = suma + i;
//			}
//		}
//
//		System.out.println("La suma total de los números es de: " + suma);
		
		//EJERCICIO 5
		
//		int numero = 0;
//
//		while (numero < 51) {
//			if (numero % 10 == 2 || numero % 10 == 3) {
//				System.out.println(numero);
//			}
//			numero++;
//		}
		
		//EJERCICIO 6
		
//		System.out.println("Listado del 1 al 10");
//
//		for (int i = 1; i < 11; i++) {
//			System.out.println(i);
//		}
//		System.out.println("\n");
//
//		System.out.println("Listado del 30 al 40");
//
//		for (int i = 30; i < 41; i++) {
//			System.out.println(i);
//		}
		
		
		//EJERCICIO 7
		
//		int suma1 = 0;
//		int i;
//		for (i = 0; i < 101; i++) {
//			int impares = i % 2;
//			if (impares == 1) {
//				suma1 = suma1 + i;
//			}
//		}
//
//		int suma2 = 0;
//		int j;
//		for (j = 0; j < 51; j++) {
//			int multiplos = j % 4;
//			if (multiplos == 0) {
//				suma2 = suma2 + j;
//			}
//		}
//		int minimo = Math.min(suma1, suma2);
//		int maximo = Math.max(suma1, suma2);
//		int resta = maximo - minimo;
//
//		System.out.println("El resultado de restar " + minimo + " a " + maximo + " es " + resta);
		
		//EJERCICIO 8
		
//		int suma = 0;
//
//		for (int i = -30; i < 36; i++) {
//			int impares = i % 2;
//			if (impares == 1) {
//				System.out.println(i + "+" + suma + "=" + (suma + i));
//				suma = suma + i;
//			}
//		}
//
//		System.out.println("La suma de todos los número es " + suma);
		
		//EJERCICIO 9
		
//		int suma = 0;
//		int contador = 0;
//		int num1 = 0;
//		int num2 = 1;
//		int num3 = 3;
//		System.out.print(num1 + ",");
//		System.out.print(num2 + ",");
//		System.out.print(num3 + ",");
//		do {
//			suma = num1 + num2 + num3;
//			num1 = num2;
//			num2 = num3;
//			num3 = suma;
//			System.out.print(suma + ",");
//			contador++;
//		} while (contador < 22);
		
		
		//EJERCICIO 10
		boolean primos = true;
		for (int i = 2; i <= 400; i++) {
			primos = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primos = false;
					break;
				}
			}
			if(primos) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
