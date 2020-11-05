package boletintema1;

import java.util.Scanner;

public class LecturaDeDatos7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce los Mb a traducir: ");
		double mb = texto.nextDouble();
		
		System.out.printf("Son %.2f Kb. %n", mb*1024);

	}

}
