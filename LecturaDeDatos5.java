package boletintema1;

import java.util.Scanner;

public class LecturaDeDatos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce el lado de un triangulo equilatero en cm: ");

		double lado = texto.nextDouble();
		
		System.out.printf("El perimetro sera de %.2f cm", lado*3);
		
	}

}
