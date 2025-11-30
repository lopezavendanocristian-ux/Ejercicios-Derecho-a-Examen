import java.util.Scanner;
public class Ejercicio17{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.print("¿Cuántos atletas deseas registrar? ");
	n = sc.nextInt();
	sc.nextLine();
	String datos[][] = new String[n][3]; 
	double tiempos[] = new double[n];
	for (int i = 0; i < n; i++){
		System.out.println("\nAtleta " + (i + 1) + ":");
		System.out.print("Nombre: ");
		datos[i][0] = sc.nextLine();
		System.out.print("Apellido: ");
		datos[i][1] = sc.nextLine();
		System.out.print("Especialidad (100m, 200m, 400m, etc.): ");
		datos[i][2] = sc.nextLine();
		System.out.print("Tiempo registrado (segundos): ");
		tiempos[i] = sc.nextDouble();
		sc.nextLine(); 
	}
	double mejorTiempo = tiempos[0];
	int indiceMejor = 0;
	for (int i = 1; i < n; i++){
		if (tiempos[i] < mejorTiempo){
			mejorTiempo = tiempos[i];
			indiceMejor = i;
		}
	}
	for (int i = 0; i < n; i++){
		if (i == indiceMejor){
			System.out.print(datos[i][0] + datos[i][1] + datos[i][2] + tiempos[i]);
		} else {
			System.out.print(datos[i][0] + datos[i][1] + datos[i][2] + tiempos[i]);
		}
	}
	System.out.println("\nEl atleta con mejor tiempo es: " + datos[indiceMejor][0] + " " + datos[indiceMejor][1] + " con " + mejorTiempo + " segundos.");
	}
}

