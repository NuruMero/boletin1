package boletintema1;

import java.util.Scanner;

public class LecturaDeDatos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);
		
		System.out.println("Escribe los euros a convertir:");
		double euro = texto.nextDouble();
		double peseta = euro * 166.3860;
		
		System.out.printf("Son %.4f pesetas", peseta);
		
	}

}
