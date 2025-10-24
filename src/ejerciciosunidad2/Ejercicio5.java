package ejerciciosunidad2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a cada jugador que escriba PIEDRA, PAPEL o TIJERA. El juego debe mostrar por pantalla quién ha ganado el juego tras jugar una partida. Hay que contemplar el caso de que empaten.
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena la eleccion del primer jugador como string
		String jugador1;
		// variable donde se almacena la eleccion del segundo jugador como string
		String jugador2;
		
		// se pide al primer jugador que introduzca su eleccion
		System.out.println("Jugador 1, cuarzo, pergamino o tenazas? ");
		// se guarda en la variable jugador1
		jugador1 = sc.next();
		for (int i = 0; i < 50; ++i) System.out.println();
		// se pide al segundo jugador que introduzca su eleccion
		System.out.println("Jugador 2, cuarzo, pergamino o tenazas? ");
		jugador2 = sc.next();
		
		// comprobacion si el numero es par cogiendo el resto de dividirlo entre 2
		if (jugador1 == jugador2) {
			// si no gana nadie, se queda en empate
			System.out.println("Empate");
		}
		else if (jugador1.equals("cuarzo") && jugador2.equals("tenazas") || jugador1.equals("pergamino") && jugador2.equals("cuarzo") || jugador1.equals("tenazas") && jugador2.equals("pergamino")) {
			// si gana el jugador 1 y se imprime esto
			System.out.println("Es " + jugador1 + " contra " + jugador2 + " , el jugador 1 se ha ganado mi vieja butacona");
		} else {
			// de lo contrario gana el jugador 2 y se imprime esto
			System.out.println("Es " + jugador1 + " contra " + jugador2 + " , el jugador 2 se ha ganado mi vieja butacona");
		}
		
		// se cierra el scanner
		sc.close();

	}

}

