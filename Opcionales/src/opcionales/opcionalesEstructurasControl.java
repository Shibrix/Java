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
		
		System.out.println("Introduce un número");
		double numero1= scInt.nextInt();
		System.out.println("Introduce otro número");
		double numero2= scInt.nextInt();
		System.out.println("Pulse enter cada vez para obtener resultados");
		double elevado;
		double resultadoElevado;
		double nuevaPotencia;
		do{
			scLine.nextLine();
			elevado= Math.pow(numero1, numero2);
			System.out.println("Elevado "+elevado);
			resultadoElevado= (int)elevado;
			System.out.println("Resultado :"+resultadoElevado);
			nuevaPotencia= Math.pow(resultadoElevado,numero2);
			nuevaPotencia=nuevaPotencia;
			System.out.println(nuevaPotencia);

		}while(nuevaPotencia<1000000);

}
}
