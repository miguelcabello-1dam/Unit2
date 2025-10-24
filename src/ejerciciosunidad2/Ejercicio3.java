package ejerciciosunidad2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. Si no existen, habrá que indicarlo.
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena el primer coeficiente a como double
		double a;
		// variable donde se almacena el segundo coeficiente b como double
		double b;
		// variable donde se almacena el tercer coeficiente c como double
		double c;
		// variable donde se almacena la primera solucion como double
		double x1;
		// variable donde se almacena la segunda solucion como double
		double x2;
		// variable donde se almacena la operacion de dentro de la raiz cuadrada como double
		double raiz;
		
		// se pide que se introduzca el coeficiente a
		System.out.println("Introduce coeficiente a");
		// se guarda en la variable a
		a = sc.nextDouble();
		// se pide que se introduzca el coeficiente b
		System.out.println("Introduce coeficiente b");
		// se guarda en la variable b
		b = sc.nextDouble();
		// se pide que se introduzca el coeficiente c
		System.out.println("Introduce coeficiente c");
		// se guarda en la variable c
		c = sc.nextDouble();
		
		// se realiza la operacion de dentro de la raiz cuadrada
		raiz = b*b - 4 * a * c;
		
		// Si la operacion de dentro de la raiz es mayor que 0 (Tiene soluciones)
		if (raiz > 0) {
			// Se calcula la primera solucicon
			x1 = (-b + Math.sqrt(raiz))/(2*a);
			// Y la segunda solucion
			x2 = (-b - Math.sqrt(raiz))/(2*a);
			// Se imprimen ambas soluciones
			System.out.println("Las soluciones son: " + x1 + " y " + x2);
		// En cambio, si la operacion de la raiz es 0 (Solo tiene una solucion)
		} else if (raiz == 0) {
			// Se calcula la unica solucion (da igual si se suma o se resta)
			x1 = (-b + Math.sqrt(raiz))/(2*a);
			// Y se imprime la solucion
			System.out.println("Solo existen una solucion: " +  x1);
		// Si es menor que 0 
		} else {
			// No existen soluciones
			System.out.println("No existen soluciones");
		}
		
		
		// se cierra el scanner
		sc.close();

	}

}
