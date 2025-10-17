package ejerciciosu2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero, que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero. Es decir, un número casi-cero es el que se encuentra en el intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.
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
