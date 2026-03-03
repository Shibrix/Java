package paq1;
import java.util.*;
import Animales.*;
public class Main {	
	
	static Animal vaca1 = new Vaca("Romera", 230.5, 3, "leche");
	static Animal vaca2 = new Vaca("Facunda", 205.2, 3, "carne");
	static Animal vaca3 = new Vaca("Fina", 245.4, 4, "leche");
	static Animal cerdo = new Cerdo("Petro", 90.2, 2, "rosado");
	static Animal oveja1 = new Oveja("Mota", 40.0, 3, "rizado");
	static Animal oveja2 = new Oveja("Coral", 50.0, 4, "liso");
	static Animal oveja3 = new Oveja("Cebra", 37.6, 1, "rizado");

	static Animal animales[] = { vaca1, vaca2, vaca3, cerdo, oveja1, oveja2, oveja3 };	
	static Scanner scInt= new Scanner (System.in);
	static Scanner scLine= new Scanner (System.in);
	static Scanner scDouble= new Scanner (System.in);

	static double gananciasTotales;
	static double lecheTotal=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		
		do {
			System.out.println("MENU PRINCIPAL\n"
					+ "1.- Marcar animal como muerto\n"
					+ "2.- Listado de animales\n"
					+ "3.- Listado de animales completo\n"
					+ "4.- Mostrar tipo de animal\n"
					+ "5.- Sumar anyo a un animal\n"
					+ "6.- Cambiar peso animal\n"
					+ "7.- Adquirir nuevo cerdo\n"
					+ "8.- Obtencion de leche\n"
					+ "9.- Venta de leche");
			opcion= scInt.nextInt();
			switch(opcion) {
				case 1:					
					marcarMuerto();
					break;
				case 2:
					listaAnimales();
					break;
				case 3:
					listaAnimalesDetallada();
					break;
				case 4:
					tipoAnimal();
					break;
				case 5:
					sumarEdad();
					break;
				case 6:
					cambiarPeso();
					break;
				case 7:
					comprarCerdo();
					break;
				case 8:
					obtenerLeche();
					break;
				case 9:
					ventaLeche();
					break;
				
			}
			
		}while(true);
		
		
	}


	private static void marcarMuerto() {
		// TODO Auto-generated method stub

		int opcion;
		System.out.println("\nMARCAR ANIMAL COMO MUERTO");
		for (int i = 0; i < animales.length; i++) {
			if (animales[i].isVivo()) {
				System.out.println(i + 1 + ".- " + animales[i].getNombre());
			}
		}
		System.out.println("Elija al animal");
		opcion = scInt.nextInt();
		if (animales[opcion - 1].isVivo() == false) {
			System.out.println("El animal ya está muerto");
		} else {
			System.out.println("El animal " + animales[opcion - 1].getNombre() + " ha muerto");
			animales[opcion - 1].setVivo(false);
		}

		System.out.println("\nPulse INTRO para volver al menú");
		scLine.nextLine();
		
	}
	
	private static void listaAnimales() {
		// TODO Auto-generated method stub
		
			System.out.println("\nLISTADO DE ANIMALES");			
			for(int i=0; i<animales.length; i++) {
				if(animales[i].isVivo()) {
				System.out.println(animales[i].listaSimple());
				}
			}
			System.out.println("\nPulse INTRO para volver al menú");
			scLine.nextLine();
		
	}
	
	private static void listaAnimalesDetallada() {
		// TODO Auto-generated method stub
		System.out.println("LISTADO DE ANIMALES COMPLETO");
		for(int i=0; i<animales.length; i++) {
			if(animales[i].isVivo()) {
				System.out.println(animales[i].toString());
			}
		}
		System.out.println("\nPulse INTRO para volver al menú");
		scLine.nextLine();
	}
	
	private static void tipoAnimal() {
		// TODO Auto-generated method stub
		
		int opcion;
		System.out.println("MOSTRAR TIPO DE ANIMAL");
		
		for(int i=0; i<animales.length; i++) {
			if(animales[i].isVivo()) {
				System.out.println(i + 1 + ".- " + animales[i].getNombre());
			}
		}
		System.out.println("Elija el animal");
		opcion= scInt.nextInt();
		if(animales[opcion-1].isVivo()) {
			animales[opcion-1].tipoAnimal();
		}
		System.out.println("\nPulse INTRO para volver al menú");
		scLine.nextLine();
		
	}
	

	private static void sumarEdad() {
		// TODO Auto-generated method stub
		int opcion;
		System.out.println("SUMAR AÑO A ANIMAL");
		
		for(int i=0; i<animales.length; i++) {
			if(animales[i].isVivo()) {
				System.out.println(i + 1 + ".- " + animales[i].getNombre()+" edad: "+animales[i].getEdad());
			}
		}
		
		System.out.println("Elija el animal");
		opcion= scInt.nextInt();
		if(animales[opcion-1].isVivo()) {
			int edad= animales[opcion-1].getEdad();
			animales[opcion-1].setEdad(edad+1);
			System.out.println(animales[opcion-1].getNombre()+" ahora tiene "+animales[opcion-1].getEdad()+" años");
		}
		
		System.out.println("\nPulse INTRO para volver al menú");
		scLine.nextLine();
	}
	

	private static void cambiarPeso() {
		// TODO Auto-generated method stub
		int opcion;
		double nuevoPeso;
		System.out.println("\nCAMBIAR PESO A ANIMAL");
		
		for(int i=0; i<animales.length; i++) {
			if(animales[i].isVivo()) {
				System.out.println(i + 1 + ".- " +animales[i].getNombre()+" peso: "+ animales[i].getPeso()+" Kg");
			}
		}
		
		System.out.println("Elija el animal");
		opcion= scInt.nextInt();
		if(animales[opcion-1].isVivo()) {
			double peso= animales[opcion-1].getPeso();
			System.out.println("Introduzca el nuevo peso");
			nuevoPeso= scDouble.nextDouble();
			nuevoPeso= Math.round(nuevoPeso*100.0)/100.0;
			animales[opcion-1].setPeso(nuevoPeso);
			if(nuevoPeso<peso) {
				double perdida= peso-nuevoPeso;
				System.out.println(animales[opcion-1].getNombre()+" ha perdido "+Math.round(perdida*100.0)/100.0+ " Kg");
			}
			else {
				double ganancia= nuevoPeso-peso;
				System.out.println(animales[opcion-1].getNombre()+" ha ganado "+Math.round(ganancia*100.0)/100.0+ " Kg");
			}
			
		}
		
		System.out.println("\nPulse INTRO para volver al menú");
		scLine.nextLine();
	}
	
	private static void comprarCerdo() {
		// TODO Auto-generated method stub
		String nombre;
		double peso;
		int edad;
		String colorPiel;

		if (animales[3].isVivo()) {
			System.out.println("Ya hay un cerdo en la granja");
		} else {
			System.out.println("Introduzca el nuevo nombre");
			nombre = scLine.nextLine();
			System.out.println("Introduzca el peso");
			peso = scDouble.nextDouble();
			System.out.println("Introduzca la edad");
			edad = scInt.nextInt();
			System.out.println("Introduzca el color de piel");
			colorPiel = scLine.nextLine();
			animales[3] = new Cerdo(nombre, peso, edad, colorPiel);
			System.out.println("El nuevo cerdo ha quedado registrado");
		}

		System.out.println("\nPulse INTRO para volver al menú");
		scLine.nextLine();

	}
	

	private static void obtenerLeche() {
		// TODO Auto-generated method stub
		for(int i=0; i<animales.length; i++) {
			if(animales[i] instanceof Vaca v && animales[i].isVivo()) {
				if(v.getUso().equalsIgnoreCase("leche")) {
					double leche= v.ordeniar();
					System.out.println("Leche obtenida por "+animales[i].getNombre()+": "+leche+" l");
					lecheTotal+=leche;
				}
			}
			if(animales[i] instanceof Vaca v && animales[i].isVivo()==false){
				System.out.println("La vaca "+animales[i].getNombre()+" está muerta");
			}
		}
		System.out.println("\nPulse INTRO para volver al menú");
		scLine.nextLine();
		
	}
	

	private static void ventaLeche() {
		// TODO Auto-generated method stub			
		double cantidad;		
		System.out.println("Leche total producida: "+Math.round(lecheTotal*100.0)/100.0);
		if(lecheTotal==0) {
			System.out.println("No hay leche para vender");
			System.out.println("\nPulse INTRO para volver al menú");
			scLine.nextLine();
		}
		else {
		System.out.println("¿Cuánta leche se quiere vender?");	
		cantidad= scDouble.nextDouble();
		double gananciasVenta= cantidad*0.5;
		lecheTotal-=cantidad;
		System.out.println("Ganancias por esta venta: "+gananciasVenta);		
		gananciasTotales+= gananciasVenta;
		System.out.println("Ganancias totales acumuladas: "+Math.round(gananciasTotales*100.0)/100.0);
		}
	}

}
