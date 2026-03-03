package paq1;

import java.util.*;
import Empleado.*;

public class Main {

	static Scanner scInt = new Scanner(System.in);
	static Scanner scLine = new Scanner(System.in);
	static Scanner scDouble = new Scanner(System.in);

	static Empleado fijo = null;
	static Empleado temporal = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;

		do {
			System.out
					.println("MENU\n" + "1.- Introducir empleados\n" + "2.- Tipo empleados\n" + "3.- Sueldo empleados\n"
							+ "4.- Aumentar sueldo empleado fijo\n" + "5.- Comparar sueldos\n" + "0.- Salir\n");
			System.out.println("Elige una opción");
			opcion = scInt.nextInt();

			switch (opcion) {
			case 1:
				introducirEmpleado();
				break;
			case 2:
				tipoEmpleado();
				break;
			case 3:
				sueldoEmpleados();
				break;
			case 4:
				aumentarSueldo();
				break;
			case 5:
				compararSueldos();
				break;
			case 0:
				salirDelPrograma();
				break;
			}
		} while (opcion != 0);
	}

	private static void introducirEmpleado() {
		// TODO Auto-generated method stub
		
		System.out.println("Introducir empleado fijo");
		System.out.println("Nombre");
		String nombre = scLine.nextLine();
		System.out.println("Sueldo base");
		double salarioBase = scDouble.nextDouble();
		System.out.println("Complemento\n");
		double complemento = scDouble.nextDouble();

		fijo = new Fijo(nombre, salarioBase, complemento);

		System.out.println("Introducir empleado temporal");
		System.out.println("Nombre");
		String nombre1 = scLine.nextLine();
		System.out.println("Sueldo base");
		double salarioBase1 = scDouble.nextDouble();
		System.out.println("Meses contrato");
		int contrato = scInt.nextInt();

		temporal = new Temporal(nombre1, salarioBase1, contrato);

		System.out.println("\nEmpleados registrados\n");
		System.out.println("Pulse ENTER para volver al menú");

		scLine.nextLine();
	}

	private static void tipoEmpleado() {
		// TODO Auto-generated method stub

		if (fijo == null || temporal == null) {
			System.out.println("Todavía no hay empleados creados\n");
		} else {
			fijo.tipoEmpleado();
			temporal.tipoEmpleado();
		}

		System.out.println("\nPulse ENTER para volver al menú");
		scLine.nextLine();
	}

	private static void sueldoEmpleados() {
		// TODO Auto-generated method stub

		if (fijo == null || temporal == null) {
			System.out.println("Todavía no hay empleados creados\n");

		} else {
			Fijo f1 = (Fijo) fijo;
			Temporal t1 = (Temporal) temporal;
			System.out.println(fijo.getNombre() + " tiene un salario mensual de " + f1.calcularSalarioMensual() + "€");
			System.out.println(temporal.getNombre() + " tiene un salario total de " + t1.calcularSalarioTotal() + "€");
		}

		System.out.println("\nPulse ENTER para volver al menú");
		scLine.nextLine();
	}

	private static void aumentarSueldo() {
		// TODO Auto-generated method stub
		
		if (fijo == null || temporal == null) {
			System.out.println("Todavía no hay empleados creados\n");

		} else {
			System.out.println("¿Cuánto quiere aumentar el sueldo?");
			double aumento = scDouble.nextDouble();
			double salario = fijo.getSalarioBase();
			double salarioAumentado = salario + aumento;
			fijo.setSalarioBase(salarioAumentado);
			System.out.println("El salario base actual de " + fijo.getNombre() + " es de " + fijo.getSalarioBase());
		}

		System.out.println("\nPulse ENTER para volver al menú");
		scLine.nextLine();

	}

	private static void compararSueldos() {
		// TODO Auto-generated method stub
		
		if (fijo == null || temporal == null) {
			System.out.println("Todavía no hay empleados creados\n");

		} else {
			Fijo f1 = (Fijo) fijo;
			Temporal t1 = (Temporal) temporal;
			double salarioFijo = f1.calcularSalarioMensual();
			double salarioTemporal = t1.calcularSalarioTotal();

			if (salarioFijo > salarioTemporal) {

				System.out.println("El salario mayor es el de " + fijo.getNombre());
			}
			if (salarioTemporal > salarioFijo) {

				System.out.println("El salario mayor es el de " + temporal.getNombre());
			}
			if (salarioFijo == salarioTemporal) {
				System.out.println(
						"Los salarios de " + fijo.getNombre() + " y de " + temporal.getNombre() + " son iguales");
			}
		}

		System.out.println("\nPulse ENTER para volver al menú");
		scLine.nextLine();
	}

	private static void salirDelPrograma() {
		// TODO Auto-generated method stub
		System.out.println("El programa ha finalizado");

	}
}
