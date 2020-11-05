package boletintema1;

import java.util.Scanner;

public class ExpAritmeticas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un dato para hacer true o false:");
		System.out.println("Ejercicio 1");
		int a = teclado.nextInt();
		boolean respuesta1 = (a>0);
		System.out.println(respuesta1);
		System.out.println(" ");
		
		System.out.println("Introduce un dato para hacer true o false:");
		System.out.println("Ejercicio 2");
		int b = teclado.nextInt();
		boolean respuesta2 = (b%2==0);
		System.out.println(respuesta2);
		System.out.println(" ");
		
		System.out.println("Introduce un dato para hacer true o false:");
		System.out.println("Ejercicio 3");
		int c = teclado.nextInt();
		boolean respuesta3 = (!(c%2==0));
		System.out.println(respuesta3);
		System.out.println(" ");
		
		System.out.println("Introduce un dato para hacer true o false:");
		System.out.println("Ejercicio 4");
		int d = teclado.nextInt();
		boolean respuesta4 = ((d%5==0));
		System.out.println(respuesta4);
		System.out.println(" ");
		
		System.out.println("Introduce para hacer true o false:");
		System.out.println("Ejercicio 5");
		System.out.println("Introduce rango inferior:");
		int RANGOINFERIOR = teclado.nextInt();
		System.out.println("Introduce rango superior:");
		int RANGOSUPERIOR = teclado.nextInt();
		System.out.println("Introduce dato a analizar:");
		int n = teclado.nextInt();
		boolean respuesta5 = (n>RANGOINFERIOR && n<RANGOSUPERIOR);
		System.out.println(respuesta5);
		System.out.println(" ");
		
		System.out.println("Introduce un dato para hacer true o false:");
		System.out.println("Ejercicio 6");
		
		System.out.println("Introduce dia de nacimiento");
		int dia_nac = teclado.nextInt();
		System.out.println("Introduce mes de nacimiento en numero");
		int mes_nac = teclado.nextInt();
		System.out.println("Introduce año de nacimiento");
		int año_nac = teclado.nextInt();
		
		System.out.println("Introduce dia actual");
		int dia_act = teclado.nextInt();
		System.out.println("Introduce mes actual en numero");
		int mes_act = teclado.nextInt();
		System.out.println("Introduce año actual");
		int año_act = teclado.nextInt();
		
		if (año_act < año_nac + 18) {
			System.out.println("Es menor de edad");
		}
		else
			{
				if (mes_act < mes_nac) {
					System.out.println("Es menor de edad");
				}
				else {
					if (dia_act < dia_nac) {
						System.out.println("Es menor de edad");
					}
					else {
						System.out.println("Es mayor de edad");
					}
				}
			}
		System.out.println(" ");
	}

}
