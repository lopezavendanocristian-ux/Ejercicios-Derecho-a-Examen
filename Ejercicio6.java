import java.util.Scanner;
public class Ejercicio6{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int aprob = 0, reprob = 0;
	double suma = 0, prom, cal;
	for (int i = 1; i <= 5; i++) {
		System.out.print("Ingrese calificación del alumno " + i + " del 1 al 10: ");
		cal = sc.nextDouble();
		if (cal < 1 || cal > 10) {
			System.out.println("Aqui solo es en un rango del 1 al 10. Ponga atencion");
		}
		suma = suma + cal;
		if (cal >= 6) {
			aprob++;
		} else {
			reprob++;
		}
	}
	prom = suma / 5;
	System.out.println("Total de aprobados: " + aprob);
	System.out.println("Total de reprobados: " + reprob);
	System.out.println("Promedio del grupo: " + prom);
	}
}