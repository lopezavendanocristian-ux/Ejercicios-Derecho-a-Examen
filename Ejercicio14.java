import java.util.Scanner;
public class Ejercicio14{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String nombres[] = new String[4];
	int sueldos[][] = new int[4][3];
	int acumulado[] = new int[4];
	int pos = 0, total = 0;
	for (int i = 0; i < 4; i++){
		System.out.print("Nombre del empleado " + (i + 1) + ": ");
		nombres[i] = sc.next();
		for (int m = 0; m < 3; m++) {
			System.out.print("Sueldo del mes " + (m + 1) + ": ");
			sueldos[i][m] = sc.nextInt();
		}
	}
	for (int i = 0; i < 4; i++){
		acumulado[i] = sueldos[i][0] + sueldos[i][1] + sueldos[i][2];
	}
	for (int i = 0; i < 4; i++){
		total = total + acumulado[i];
	}
	System.out.println("Total pagado en sueldos durante 3 meses: " + total);
	int mayor = acumulado[0];
	for (int i = 1; i < 4; i++){
		if (acumulado[i] > mayor){
			mayor = acumulado[i];
			pos = i;
		}
	}
	System.out.println("Empleado con mayor ingreso acumulado: " + nombres[pos]);
	System.out.println("Ingreso acumulado: " + mayor);
    }
}
