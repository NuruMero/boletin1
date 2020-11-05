package boletintema1;

public class ExpAritmeticas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=3;
		
		System.out.println("Ejercicio 1");
		boolean ej1 = !(a>b&&2*a<=b);
		System.out.println(ej1);
		System.out.println( );
		
		System.out.println("Ejercicio 2");
		boolean ej2 = b++>3||a+b<=8&&!(a>b);
		System.out.println(ej2);
		System.out.println( );
		
		System.out.println("Ejercicio 3");
		boolean ej3 = a++<6&&(b+=2)<a;
		System.out.println(ej3);
		System.out.println( );
		
		System.out.println("Ejercicio 4");
		boolean ej4 = a++/2<b&&(a++/2>b||(a*2<b*4));
		System.out.println(ej4);
		System.out.println( );
		
	}

}
