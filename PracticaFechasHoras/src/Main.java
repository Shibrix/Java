import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
	static Scanner scInt = new Scanner(System.in);
	static int opcion = 0;
	static LocalDateTime ldt1 = LocalDateTime.now();
	static LocalDateTime ldt2 = LocalDateTime.now();
	static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEEE dd/MM/YYYY HH:mm:ss");
	static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
	static int contador = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {
			System.out.println(ldt1);
			System.out.println(ldt1.format(dtf1));
			System.out.println();
			menu1();
		} while (true);

	}

	private static void menu1() {
		// TODO Auto-generated method stub
		System.out.println("1.- Sumar tiempo\r\n" + "2.- Restar tiempo\r\n" + "Elige una opción");
		opcion = scInt.nextInt();
		switch (opcion) {
		case 1:
			menu2();
			break;
		case 2:
			menu3();
			break;
		}
	}

	private static void menu2() {
		// TODO Auto-generated method stub
		System.out
				.println("1.-Minutos\n" + "2.-Horas\n" + "3.-Días\n" + "4.-Meses\n" + "5.-Años\n" + "Elige una opción");
		opcion = scInt.nextInt();
		switch (opcion) {
		case 1:
			sumarMinutos();
			break;
		case 2:
			sumarHoras();
			break;
		case 3:
			sumarDias();
			break;
		case 4:
			sumarMeses();
			break;
		case 5:
			sumarAnios();
			break;
		}
	}

	private static void sumarMinutos() {
		// TODO Auto-generated method stub
		System.out.println("¿Minutos a sumar?");
		opcion = scInt.nextInt();
		ldt1 = ldt1.now();
		System.out.println("Fecha y hora actual: " + ldt1.format(dtf2));
		ldt2 = ldt1;
		ldt2 = ldt2.plusMinutes(opcion);
		System.out.println("Fecha y hora modificada: " + ldt2.format(dtf2));
		long horas = ChronoUnit.HOURS.between(ldt1, ldt2);
		System.out.println("Horas de diferencia: " + horas);
		long minutos = ChronoUnit.MINUTES.between(ldt1, ldt2);
		System.out.println("Minutos de diferencia: " + minutos);
		long diferencia = minutos % 60;
		System.out.println("Tiempo de diferencia: " + horas + " horas + " + diferencia + " minutos");
		System.out.println();
	}

	private static void sumarHoras() {
		// TODO Auto-generated method stub
		System.out.println("¿Horas a sumar?");
		opcion = scInt.nextInt();
		ldt1 = ldt1.now();
		System.out.println("Fecha y hora actual: " + ldt1.format(dtf2));
		ldt2 = ldt1;
		ldt2 = ldt2.plusHours(opcion);
		System.out.println("Fecha y hora modificada: " + ldt2.format(dtf2));
		long horas = ChronoUnit.HOURS.between(ldt1, ldt2);
		System.out.println("Horas de diferencia: " + horas);
		long minutos = ChronoUnit.MINUTES.between(ldt1, ldt2);
		System.out.println("Minutos de diferencia: " + minutos);
		long diferencia = minutos % 60;
		System.out.println("Tiempo de diferencia: " + horas + " horas + " + diferencia + " minutos");
		System.out.println();
	}

	private static void sumarDias() {
		// TODO Auto-generated method stub
		System.out.println("¿Días a sumar?");
		opcion = scInt.nextInt();
		ldt1 = ldt1.now();
		System.out.println("Fecha y hora actual: " + ldt1.format(dtf2));
		ldt2 = ldt1;
		ldt2 = ldt2.plusDays(opcion);
		System.out.println("Fecha y hora modificada: " + ldt2.format(dtf2));
		long horas = ChronoUnit.HOURS.between(ldt1, ldt2);
		System.out.println("Horas de diferencia: " + horas);
		long minutos = ChronoUnit.MINUTES.between(ldt1, ldt2);
		System.out.println("Minutos de diferencia: " + minutos);
		long diferencia = minutos % 60;
		System.out.println("Tiempo de diferencia: " + horas + " horas + " + diferencia + " minutos");
		System.out.println();
	}

	private static void sumarMeses() {
		// TODO Auto-generated method stub
		System.out.println("¿Meses a sumar?");
		opcion = scInt.nextInt();
		ldt1 = ldt1.now();
		System.out.println("Fecha y hora actual: " + ldt1.format(dtf2));
		ldt2 = ldt1;
		ldt2 = ldt2.plusMonths(opcion);
		System.out.println("Fecha y hora modificada: " + ldt2.format(dtf2));
		long horas = ChronoUnit.HOURS.between(ldt1, ldt2);
		System.out.println("Horas de diferencia: " + horas);
		long minutos = ChronoUnit.MINUTES.between(ldt1, ldt2);
		System.out.println("Minutos de diferencia: " + minutos);
		long diferencia = minutos % 60;
		System.out.println("Tiempo de diferencia: " + horas + " horas + " + diferencia + " minutos");
		System.out.println();
	}

	private static void sumarAnios() {
		// TODO Auto-generated method stub
		System.out.println("¿Años a sumar?");
		opcion = scInt.nextInt();
		ldt1 = ldt1.now();
		System.out.println("Fecha y hora actual: " + ldt1.format(dtf2));
		ldt2 = ldt1;
		ldt2 = ldt2.plusYears(opcion);
		System.out.println("Fecha y hora modificada: " + ldt2.format(dtf2));
		long horas = ChronoUnit.HOURS.between(ldt1, ldt2);
		System.out.println("Horas de diferencia: " + horas);
		long minutos = ChronoUnit.MINUTES.between(ldt1, ldt2);
		System.out.println("Minutos de diferencia: " + minutos);
		long diferencia = minutos % 60;
		System.out.println("Tiempo de diferencia: " + horas + " horas + " + diferencia + " minutos");
		System.out.println();
	}

	private static void menu3() {
		// TODO Auto-generated method stub
		System.out
				.println("1.-Minutos\n" + "2.-Horas\n" + "3.-Días\n" + "4.-Meses\n" + "5.-Años\n" + "Elige una opción");
		opcion = scInt.nextInt();
		switch (opcion) {
		case 1:
			restarMinutos();
			break;
		case 2:
			restarHoras();
			break;
		case 3:
			restarDias();
			break;
		case 4:
			restarMeses();
			break;
		case 5:
			restarAnios();
			break;
		}
	}

	private static void restarMinutos() {
		// TODO Auto-generated method stub
		System.out.println("¿Minutos a restar?");
		opcion = scInt.nextInt();
		ldt1 = ldt1.now();
		System.out.println("Fecha y hora actual: " + ldt1.format(dtf2));
		ldt2 = ldt1;
		ldt2 = ldt2.minusMinutes(opcion);
		System.out.println("Fecha y hora modificada: " + ldt2.format(dtf2));
		long horas = ChronoUnit.HOURS.between(ldt1, ldt2);
		System.out.println("Horas de diferencia: " + horas);
		long minutos = ChronoUnit.MINUTES.between(ldt1, ldt2);
		System.out.println("Minutos de diferencia: " + minutos);
		long diferencia = minutos % 60;
		System.out.println("Tiempo de diferencia: " + horas + " horas + " + diferencia + " minutos");
		System.out.println();
	}
	
	private static void restarHoras() {
		// TODO Auto-generated method stub
		System.out.println("¿Horas a restar?");
		opcion = scInt.nextInt();
		ldt1 = ldt1.now();
		System.out.println("Fecha y hora actual: " + ldt1.format(dtf2));
		ldt2 = ldt1;
		ldt2 = ldt2.minusHours(opcion);
		System.out.println("Fecha y hora modificada: " + ldt2.format(dtf2));
		long horas = ChronoUnit.HOURS.between(ldt1, ldt2);
		System.out.println("Horas de diferencia: " + horas);
		long minutos = ChronoUnit.MINUTES.between(ldt1, ldt2);
		System.out.println("Minutos de diferencia: " + minutos);
		long diferencia = minutos % 60;
		System.out.println("Tiempo de diferencia: " + horas + " horas + " + diferencia + " minutos");
		System.out.println();
	}
	
	private static void restarDias() {
		// TODO Auto-generated method stub
		System.out.println("¿Días a restar?");
		opcion = scInt.nextInt();
		ldt1 = ldt1.now();
		System.out.println("Fecha y hora actual: " + ldt1.format(dtf2));
		ldt2 = ldt1;
		ldt2 = ldt2.minusDays(opcion);
		System.out.println("Fecha y hora modificada: " + ldt2.format(dtf2));
		long horas = ChronoUnit.HOURS.between(ldt1, ldt2);
		System.out.println("Horas de diferencia: " + horas);
		long minutos = ChronoUnit.MINUTES.between(ldt1, ldt2);
		System.out.println("Minutos de diferencia: " + minutos);
		long diferencia = minutos % 60;
		System.out.println("Tiempo de diferencia: " + horas + " horas + " + diferencia + " minutos");
		System.out.println();
	}
	

	private static void restarMeses() {
		// TODO Auto-generated method stub
		System.out.println("¿Meses a restar?");
		opcion = scInt.nextInt();
		ldt1 = ldt1.now();
		System.out.println("Fecha y hora actual: " + ldt1.format(dtf2));
		ldt2 = ldt1;
		ldt2 = ldt2.minusMonths(opcion);
		System.out.println("Fecha y hora modificada: " + ldt2.format(dtf2));
		long horas = ChronoUnit.HOURS.between(ldt1, ldt2);
		System.out.println("Horas de diferencia: " + horas);
		long minutos = ChronoUnit.MINUTES.between(ldt1, ldt2);
		System.out.println("Minutos de diferencia: " + minutos);
		long diferencia = minutos % 60;
		System.out.println("Tiempo de diferencia: " + horas + " horas + " + diferencia + " minutos");
		System.out.println();
	}
	
	private static void restarAnios() {
		// TODO Auto-generated method stub
		System.out.println("¿Años a restar?");
		opcion = scInt.nextInt();
		ldt1 = ldt1.now();
		System.out.println("Fecha y hora actual: " + ldt1.format(dtf2));
		ldt2 = ldt1;
		ldt2 = ldt2.minusYears(opcion);
		System.out.println("Fecha y hora modificada: " + ldt2.format(dtf2));
		long horas = ChronoUnit.HOURS.between(ldt1, ldt2);
		System.out.println("Horas de diferencia: " + horas);
		long minutos = ChronoUnit.MINUTES.between(ldt1, ldt2);
		System.out.println("Minutos de diferencia: " + minutos);
		long diferencia = minutos % 60;
		System.out.println("Tiempo de diferencia: " + horas + " horas + " + diferencia + " minutos");
		System.out.println();
	}


}
