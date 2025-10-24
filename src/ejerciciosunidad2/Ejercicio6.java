package ejerciciosunidad2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Escribir un programa que pida al usuario tres números enteros, y que muestre por pantalla si la suma de dos de esos números da como resultado el otro número.
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena el primer numero como int
		int num1;
		// variable donde se almacena el segundo numero como int
		int num2;
		// variable donde se almacena el tercer numero como int
		int num3;
		
		// se pide que se introduzca el primer num
		System.out.println("Introduce el primer numero: ");
		// se guarda en la variable num1
		num1 = sc.nextInt();
		// se pide que se introduzca el segundo num
		System.out.println("Introduce el segundo numero: ");
		// se guarda en la variable num2
		num2 = sc.nextInt();
		// se pide que se introduzca el tercer num
		System.out.println("Introduce el tercer numero: ");
		// se guarda en la variable num3
		num3 = sc.nextInt();
		
		// si la suma del primer y segundo numero da el tercero
		if (num1 + num2 == num3) {
			System.out.println("La suma de " + num1 + " + " + num2 + " da " + num3);
		// si la suma del segundo y tercer numero da el primero
		} else if (num2 + num3 == num1) {
			System.out.println("La suma de " + num2 + " + " + num3 + " da " + num1);
		// si la suma del tercer y primer numero da el segundo
		} else if (num3 + num1 == num2) {
			System.out.println("La suma de " + num3 + " + " + num1 + " da " + num2);
		// si no se cumple ninguna de las anteriores, ningun numero sumado a otro de ellos da alguno de los introducidos
		} else {
			System.out.println("Ninguno de los numeros introducidos sumado con otro de ellos da uno de ellos como resultado");
		}
		
		// se cierra el scanner
		sc.close();

	}

}

