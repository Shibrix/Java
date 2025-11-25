package OpcionalMiniBingo;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scLine = new Scanner(System.in);

		Jugador jugador1 = new Jugador("Pedro");
		Jugador jugador2 = new Jugador("María");
		Jugador jugador3 = new Jugador("Luis");
		Jugador jugador4 = new Jugador("Sonia");
		Jugador jugador5 = new Jugador("Pablo");

		jugador1.setDinero(20);
		jugador2.setDinero(20);
		jugador3.setDinero(20);
		jugador4.setDinero(20);
		jugador5.setDinero(20);
		String ganadores = "";
		String ganadorAbsoluto = "";
		boolean empiecePartida = true;

		while (empiecePartida) {

			System.out.println("Pulse ENTER para iniciar la partida");
			int contadorVivos = 0;
			scLine.nextLine();
			ganadores = "";

			if (jugador1.seguirJugando()) {
				jugador1.resetearAciertos();
				jugador1.asignarCarton();
				contadorVivos++;
			}
			if (jugador2.seguirJugando()) {
				jugador2.resetearAciertos();
				jugador2.asignarCarton();
				contadorVivos++;
			}
			if (jugador3.seguirJugando()) {
				jugador3.resetearAciertos();
				jugador3.asignarCarton();
				contadorVivos++;
			}
			if (jugador4.seguirJugando()) {
				jugador4.resetearAciertos();
				jugador4.asignarCarton();
				contadorVivos++;
			}
			if (jugador5.seguirJugando()) {
				jugador5.resetearAciertos();
				jugador5.asignarCarton();
				contadorVivos++;
			}

			Bombo bola = new Bombo();
			boolean control = true;

			int contador = 0;
			double bote = 5 * contadorVivos;

			if (contadorVivos != 1) {
				while (control) {

					int sacarBola = bola.sacarBola();

					jugador1.comprobarBola(sacarBola);
					jugador2.comprobarBola(sacarBola);
					jugador3.comprobarBola(sacarBola);
					jugador4.comprobarBola(sacarBola);
					jugador5.comprobarBola(sacarBola);

					if (jugador1.esGanador() || jugador2.esGanador() || jugador3.esGanador() || jugador4.esGanador()
							|| jugador5.esGanador()) {
						if (jugador1.esGanador() == true) {
							ganadores = jugador1.getNombre();
							contador++;

						}
						if (jugador2.esGanador() == true) {
							if (contador > 0) {
								ganadores = ganadores + " y ";
							}
							ganadores = (ganadores + jugador2.getNombre());
							contador++;
						}
						if (jugador3.esGanador() == true) {
							if (contador > 0) {
								ganadores = ganadores + " y ";
							}
							ganadores = (ganadores + jugador3.getNombre());
							contador++;
						}
						if (jugador4.esGanador() == true) {
							if (contador > 0) {
								ganadores = ganadores + " y ";
							}
							ganadores = (ganadores + jugador4.getNombre());
							contador++;
						}
						if (jugador5.esGanador() == true) {
							if (contador > 0) {
								ganadores = ganadores + " y ";
							}
							ganadores = (ganadores + jugador5.getNombre());
							contador++;
						}
						System.out.println("La partida ha sido ganada por " + ganadores + "\n");
						double premioGanador = bote / contador;
						premioGanador = Math.round(premioGanador * 100.0) / 100.0;

						jugador1.darDinero(jugador1.esGanador(), premioGanador);
						jugador2.darDinero(jugador2.esGanador(), premioGanador);
						jugador3.darDinero(jugador3.esGanador(), premioGanador);
						jugador4.darDinero(jugador4.esGanador(), premioGanador);
						jugador5.darDinero(jugador5.esGanador(), premioGanador);

						jugador1.mostrarDinero();
						jugador2.mostrarDinero();
						jugador3.mostrarDinero();
						jugador4.mostrarDinero();
						jugador5.mostrarDinero();
						control = false;
					}

				}

			} else {
				empiecePartida = false;
			}

		}

		if (jugador1.getDinero() > 5)
			ganadorAbsoluto = jugador1.getNombre();
		if (jugador2.getDinero() > 5)
			ganadorAbsoluto = jugador2.getNombre();
		if (jugador3.getDinero() > 5)
			ganadorAbsoluto = jugador3.getNombre();
		if (jugador4.getDinero() > 5)
			ganadorAbsoluto = jugador4.getNombre();
		if (jugador5.getDinero() > 5)
			ganadorAbsoluto = jugador5.getNombre();

		System.out.println("\nYa no se pueden jugar más partidas. El ganador absoluto es " + ganadorAbsoluto);
		scLine.close();
	}
}
