import java.util.Scanner;
public class Ejercicio9{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double[] calificaciones = new double[6];
	double suma = 0;
	int e=1;
	for (int i = 0; i < 6; i++) {
		System.out.print("Calificación del estudiante " + (e) + ": ");
		calificaciones[i] = sc.nextDouble();
		suma = suma + calificaciones[i];
		e++;
	}
	for (int i = 0; i < 6; i++) {
		System.out.println("Estudiante " + (i+1) + ": " + calificaciones[i]);
	}
	System.out.println("Promedio General: " + (suma / 6));
	}
}