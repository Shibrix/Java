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

		boolean empiecePartida = true;
		

		while (empiecePartida) {
			
			System.out.println("Pulse ENTER para iniciar la partida");			
			scLine.nextLine();			
			
			jugador1.resetearAciertos();
			jugador2.resetearAciertos();
			jugador3.resetearAciertos();
			jugador4.resetearAciertos();
			jugador5.resetearAciertos();
			
			jugador1.asignarCarton();
			jugador2.asignarCarton();
			jugador3.asignarCarton();
			jugador4.asignarCarton();
			jugador5.asignarCarton();
			
			
			Bombo bola = new Bombo();
			boolean control = true;
			String ganadores = "";
			int contador = 0;
			double bote= 25;
			
			
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
					System.out.println("La partida ha sido ganada por " + ganadores+"\n");
					double premioGanador= bote/contador;
					premioGanador= Math.round(premioGanador*100.0)/100.0;
					
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
		}

	}
}
