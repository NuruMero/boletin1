package boletintema1;

import java.util.Scanner;

public class LecturaDeDatos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce dos numeros: ");

		double a = texto.nextDouble();
		double b = texto.nextDouble();
		
		System.out.printf("Suma: %f %n", a+b);
		System.out.printf("Resta: %f %n", a-b);
		System.out.printf("Multiplicacion: %f %n", a*b);
		System.out.printf("Division: %f %n", a/b);
		
	}

}
