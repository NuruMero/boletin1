package boletintema1;

public class Enumerados2 {
public enum MesesAño {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
public enum NotasMusicales {DO, RE, MI, FA, SOL, LA, SI}
public enum ColoresPrimarios {ROJO, VERDE, AZUL, BLANCO}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (MesesAño mes : MesesAño.values()) {
			System.out.println("Meses del año: " +mes);	
		}
		
		for (NotasMusicales nota : NotasMusicales.values()) {
			System.out.println("Notas musicales: " +nota);	
		}
		
		for (ColoresPrimarios color : ColoresPrimarios.values()) {
			System.out.println("Colores primarios: " +color);	
		}
		
	}

}
