package boletintema1;

import java.util.Scanner;

public class LecturaDeDatos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce las horas trabajadas: ");
		int horas = texto.nextInt();
		
		System.out.printf("Le corresponden %d euros esta semana. %n", horas*12);

	}

}
