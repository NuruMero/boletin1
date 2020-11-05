package boletintema1;

import java.util.Scanner;

public class LecturaDeDatos1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Scanner texto = new Scanner(System.in);
		
		System.out.println("Nombre:");
		String nombre = texto.nextLine();
		
		System.out.println("Edad:");
		String edad = texto.nextLine();
		
		System.out.println("Tu nombre es " +nombre +" y tu edad es " +edad +".");
	}

}
