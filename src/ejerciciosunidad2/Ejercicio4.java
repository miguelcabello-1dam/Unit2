package ejerciciosunidad2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Escribir una aplicación que indique cuántas cifras tiene un número introducido por teclado, que está comprendido entre 0 y 99999. 
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable para almacenar el numero introducido como int
		int num;
		
		// se pide que se introduzca un num 
		System.out.println("Introduce num entre 0 y 99999: ");
		// se guarda en la variable num
		num = sc.nextInt();
		
		// Si el numero tiene una cifra
		if (num >= 0 && num < 10) {
			System.out.println("El número tiene 1 cifra");
		// Si el numero tiene 2 cifras
		} else if (num >= 10 && num < 100) {
			System.out.println("El número tiene 2 cifras");
		// Si el numero tiene 3 cifras
		} else if (num >= 100 && num < 1000) {
			System.out.println("El número tiene 3 cifras");
		// Si el numero tiene 4 cifras
		} else if (num >= 1000 && num < 10000) {
			System.out.println("El número tiene 4 cifras");
		// Si el numero tiene 5 cifras
		} else if (num >= 10000 && num < 100000) {
			System.out.println("El número tiene 5 cifras");
		// si no, esta fuera del rango
		} else {
			System.out.println("El número no está dentro del rango");
		}
		
		// se cierra el scanner
		sc.close();

	}

}

