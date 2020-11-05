package boletintema1;

import java.util.Scanner;

public class LecturaDeDatos9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("CALCULO DE VOLUMEN DE UN CONO");
		
		System.out.println("Introduce el radio en cm: ");
		double r = texto.nextDouble();
		
		System.out.println("Introduce la altura en cm: ");
		double h = texto.nextDouble();
		
		double pi = Math.PI;
		double v = (((pi*(r*r))*h)/3);
		System.out.printf("El volumen del cono es: %.2f cm. %n", v);

	}

}
