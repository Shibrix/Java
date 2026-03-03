package Arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Los arrays sólo pueden ser de un tipo

		int a[] = { 3, -1, 0, 3 };

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);

		String b[] = { "hola", "qué", "tal" };
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);

		double c[] = { 1.2, 3.8, 2, 2.6, 11.5, 0.7, 9.3, 10.3 };

		int lon = c.length;// Con esto averiguamos la longitud del array

		System.out.println(lon);

		for (int i = 0; i < lon; i++) {
			System.out.println(c[i]);// Recorremos el array para pintar todos los datos
		}

		int d[] = new int[20]; // Aquí creamos un array de 20 posiciones. Si no definimos los valores, por
								// defecto salen a 0

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

		char e[] = new char[4];

		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}

		// Hemos creado la clase jugador y hemos definido el método asignarCarton
		// Esta es la forma 1
//		Jugador jugadores[]= new Jugador[5];
//		jugadores[0]= new Jugador("Pepe");
//		jugadores[1]= new Jugador("María");
//		jugadores[2]= new Jugador("Luis");
//		jugadores[3]= new Jugador("Rosa");
//		jugadores[4]= new Jugador("Andrés");
//		
//		
//		for(int i=0; i<jugadores.length; i++) {
//			jugadores[i].asignarCarton();
//		}

		// Esta es la forma 2
		Jugador j1 = new Jugador("Pepe");
		Jugador j2 = new Jugador("María");
		Jugador j3 = new Jugador("Luis");
		Jugador j4 = new Jugador("Rosa");
		Jugador j5 = new Jugador("Andrés");

		Jugador jugadores[] = { j1, j2, j3, j4, j5 };

		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i].asignarCarton();
		}

		// EJERCICIO: CREAR EL ARRAY DE ENTEROS Z DONDE ESTÉN INCLUÍDOS LOS DOS ARRAYS
		// ABAJO ESCRITOS.
		// EN PRIMER LUGAR EL X Y EN SEGUNDO EL Y, SEA CUAL SEA EL TAMAÑO DE X O Y

		int x[] = { 2, 6, 2, 7 };
		int y[] = { 6, 3, 8 };

		int z[] = new int[x.length + y.length];// Creamos el array con la longitud de x y la longitud de y

		for (int i = 0; i < x.length; i++) {
			z[i] = x[i];
		}
		for (int i = 0; i < y.length; i++) {
			z[i + x.length] = y[i];
		}
		for (int i = 0; i < z.length; i++) {
			System.out.println(z[i]);
		}

		System.out.println(Arrays.toString(z));// Así lo imprimimos en la misma fila
		Arrays.sort(z);// Así ordenamos de menor a mayor
		System.out.println(Arrays.toString(z));

		// Dados estos dos arrays, obtener otro array suma de los 2 posición a posición
		
		System.out.println("****************");
		int num1[] = { 1, 7, 3, 8, 12 };
		int num2[] = { 3, 2, -3, 2, -1 };

		int num3[] = new int[num1.length];

		for (int i = 0; i < num3.length; i++) {
			num3[i] = num1[i]+num2[i];
		}
		System.out.println(Arrays.toString(num3));
		
		//Hacer lo mismo de antes pero que sólo sume las posiciones pares. En las impares ha de dejar un 0
		
//		System.out.println("****************");
//		int aa[] = { 1, 7, 3, 8, 12 };
//		int bb[] = { 3, 2, -3, 2, -1 };
//
//		int cc[] = new int[aa.length];
//
//		for (int i = 0; i < cc.length; i++) {
//			if(i%2==0) {
//				cc[i]= aa[i]+bb[i];				
//			}			
//		}
//		System.out.println(Arrays.toString(cc));
		
		//Sumar los valores cuyo valor en el array aa sea par
		
		System.out.println("****************");
		int aa[] = { 1, 7, 3, 8, 12 };
		int bb[] = { 3, 2, -3, 2, -1 };

		int cc[] = new int[aa.length];

		for (int i = 0; i < aa.length; i++) {
			if(aa[i]%2==0) {
				cc[i]= aa[i]+bb[i];				
			}			
		}
		System.out.println(Arrays.toString(cc));
		
		//Dado este array, obtener otro donde estén las longitudes de cada palabra
		String s[]= {"coche", "moto", "furgoneta", "camión"};
		int o[]= new int[s.length];
	
		for(int i=0; i<s.length; i++) {
			o[i]= s[i].length();
		}
		System.out.println("*************************");
		System.out.println(Arrays.toString(o));
		
		//Dado este array, obtener la suma de todos los valores del array
		
		int numeros[]={1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
		int suma=0;
		
		for(int i=0; i<numeros.length; i++) {
			suma= suma+numeros[i];
		}
		System.out.println("*************************");
		System.out.println(suma);
		
		//Dada esta frase, obtener un array donde en cada posición del array haya una palabra de la frase
		
		String frase= "Es viernes y me quiero ir a casa";
		
		String palabras[]= frase.split(" ");
		
		System.out.println("*************************");
		System.out.println(Arrays.toString(palabras));
		
		//Dada esta frase, sacar una lista en vertical de las palabras que contengan la letra e minúscula
		
		for(int i=0; i<palabras.length; i++) {
			if(palabras[i].indexOf('e')!= -1) { //también valdría si ponemos contains
				System.out.println(palabras[i]);
			}
		}
		
		
		
	}

}
