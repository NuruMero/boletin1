package boletintema1;

public class Enumerados1{
public enum DiasSemana {LUNES, MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO}
public static void main(String[] args){
	DiasSemana un_dia=DiasSemana.MARTES;

	String un_Dia = "MARTES";

	System.out.println("El primer d�a de la semana es: "+DiasSemana.LUNES);
	System.out.println("El �ltimo d�a de la semana es: "+DiasSemana.DOMINGO);
	System.out.println("El d�a de la semana elegido es: "+un_Dia);
	}
}
