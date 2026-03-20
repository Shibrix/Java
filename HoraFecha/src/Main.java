import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ESTO PARA FECHAS
		LocalDate ld0 = LocalDate.now(); // Se genera como un objeto, con método estático

		System.out.println(ld0);

		LocalDate ld1 = LocalDate.of(2026, 03, 10);

		System.out.println(ld1);

		ld0 = ld0.plusDays(20);// Así le sumamos 20 días a la fecha

		System.out.println(ld0);

		ld0 = ld0.minusMonths(10);// Así le restamos 10 meses a la fecha

		System.out.println(ld0);

		System.out.println("\n------------------------------\n");

		// ESTO PARA HORAS
		LocalTime lt0 = LocalTime.now();

		LocalTime lt1 = LocalTime.of(13, 22, 34);

		System.out.println(lt0);// También se muestran los microsegundos

		System.out.println(lt1);

		lt0 = lt0.plusHours(2);// Así le sumamos 2 horas

		System.out.println(lt0);

		System.out.println("\n------------------------------\n");

		// ESTO PARA FECHA Y HORAS
		LocalDateTime ldt0 = LocalDateTime.now();

		LocalDateTime ldt1 = LocalDateTime.of(2026, 2, 27, 14, 20, 30);

		System.out.println(ldt0);

		System.out.println(ldt1);

		ldt0 = ldt0.plusHours(500);

		System.out.println(ldt0);

		System.out.println("\n------------------------------\n");

		// EJERCICIO: Buscar el siguiente año bisiesto y poner en un objeto tipo fecha
		// el 27 de
		// febrero de ese año
		// Sumar un día y mostrar
		// Sumar otro día y mostrar
		// Sumar otro día y mostrar

		LocalDate ld2 = LocalDate.of(2028, 02, 27);
		System.out.println(ld2);

		ld2 = ld2.plusDays(1);
		System.out.println(ld2);
		ld2 = ld2.plusDays(1);
		System.out.println(ld2);
		ld2 = ld2.plusDays(1);
		System.out.println(ld2);

		System.out.println("\n------------------------------\n");

		// EJERCICIO: Repetirlo con un LocalDateTime, poniendo el día 27 con una hora
		// cualquiera
		// y haciendo sumas de 20 horas en 20 horas hasta que llegue al 1 de Marzo

		LocalDateTime ldt2 = LocalDateTime.of(2028, 02, 27, 14, 00, 00);
		System.out.println(ldt2);

		ldt2 = ldt2.plusHours(20);
		System.out.println(ldt2);
		ldt2 = ldt2.plusHours(20);
		System.out.println(ldt2);
		ldt2 = ldt2.plusHours(20);
		System.out.println(ldt2);

		System.out.println("\n------------------------------\n");

		// EJERCICIO: Partiendo del 31 de Diciembre de 2025 a las 23:45 con
		// LocalDateTime
		// Sumarle 20 minutos
		// Observar que cambia de año

		LocalDateTime ldt3 = LocalDateTime.of(2025, 12, 31, 23, 45);
		System.out.println(ldt3);

		ldt3 = ldt3.plusMinutes(15);
		System.out.println(ldt3);

		ldt3 = ldt3.minusHours(1);
		System.out.println(ldt3);

		System.out.println("\n------------------------------\n");

		// FORMATEAR LAS FECHAS Y LAS HORAS

		DateTimeFormatter dtf0 = DateTimeFormatter.ofPattern("dd/MM/YY");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/YYYY");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm");

		LocalDate ld4 = LocalDate.now();

		System.out.println(ld4);

		System.out.println(ld4.format(dtf0));
		System.out.println(ld4.format(dtf1));

		LocalDateTime ldt4 = LocalDateTime.now();
		System.out.println(ldt4.format(dtf0));
		System.out.println(ldt4.format(dtf2));

		System.out.println("\n------------------------------\n");

		// EJERCICIO: Hacer un código que muestre "miércoles, 18 de Marzo de 2026" a
		// partir de un LocalDateTime
		LocalDateTime ldt5 = LocalDateTime.of(2026, 03, 18, 19, 10);
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE', 'dd' de 'MMMM' de 'YYYY");
		System.out.println(ldt5.format(dtf3));
		ldt5 = ldt5.plusDays(1);
		System.out.println(ldt5.format(dtf3));

		System.out.println("\n------------------------------\n");

		// CHRONO UNIT
		LocalDateTime ldt6 = LocalDateTime.of(2025, 10, 20, 14, 30);
		LocalDateTime ldt7 = LocalDateTime.of(2026, 1, 10, 13, 22);

		long dias = ChronoUnit.DAYS.between(ldt6, ldt7);// Aquí vemos la diferencia de días

		System.out.println(dias);

		long horas = ChronoUnit.HOURS.between(ldt6, ldt7);// Aquí vemos la diferencia de horas

		System.out.println(horas);

	}

}
