package boletintema1;

import java.util.Scanner;

public class LecturaDeDatos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner texto = new Scanner(System.in);
		
		System.out.println("Escribe tres numeros:");
		int a = texto.nextInt();
		int b = texto.nextInt();
		int c = texto.nextInt();
		
		int suma = a+b+c;
		int media = suma/3;
		System.out.println("La media de los numeros es: " +media);
	}

}
