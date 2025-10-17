package ejerciciosu2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena el numero como entero
		int num;
		
		// se pide que se introduzca el numero
		System.out.println("Introduce numero");
		// se guarda en la variable num
		num = sc.nextInt();
		
		// comprobacion si el numero es par cogiendo el resto de dividirlo entre 2
		if (num%2 == 0) {
			// si es par se imprimira esto
			System.out.println("El numero " + num + " es par");
		} else {
			// de lo contrario es impar y se imprimira esto
			System.out.println("El numero " + num + " es impar");
		}
		
		// se cierra el scanner
		sc.close();

	}

}
