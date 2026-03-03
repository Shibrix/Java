package Multidimensionales;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[4]; // Array unidimensional

		int b[] = { 1, 2, 3, 4, 5, 6 };

		int c[][] = new int[8][8]; // Array multidimensional: este tendría 64 huecos (8x8). Sería como una
									// cuadrícula con 64
		// cuadraditos. Este es de 2 dimensiones

		c[0][0] = 2;
		c[0][1] = 4;
		c[0][2] = 6;
		c[0][3] = 8;

		c[1][0] = 4;
		c[1][1] = 6;

		int d[][][] = new int[3][3][3]; //Array multidimensional de 3 dimensiones. Aquí habría 27 huecos (3x3x3)
		
		//Para declarar un array ya inicializado
		int e [] []= {{1,2},{1,3},{5,6,2,5},{7,8}};//Este array tiene 2 dimensiones y 2 huecos de tamaño
				//i   { 0 } { 1 } {   2   } { 3 }
				//j   0,1  | 0,1 | 0,1,2,3 | 0,1 
		int longitudEnX = e.length;
		System.out.println(longitudEnX);
		
		int longitudEnY0= e[0].length;
		int longitudEnY1= e[1].length;
		
		System.out.println(longitudEnY0);
		System.out.println(longitudEnY1);
		
		for(int i=0; i<e.length; i++) {
			for(int j=0; j<e[i].length; j++) {
				System.out.println("i: "+i+"; j: "+j+" = "+e[i][j]);
			}
		}
		

	}

}
