package boletintema1;

import java.util.Scanner;

public class LecturaDeDatos8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);

		System.out.println("Introduce los segundos: ");
		int segundos = texto.nextInt();
		
		int horas = (segundos/60)/60;
		int minutos = (segundos/60)%60;
		int segundosres = segundos%60;
		
		System.out.printf("Son %d horas, %d minutos y %d segundos", horas, minutos, segundosres);

	}

}
