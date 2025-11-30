import java.util.Scanner;
public class Ejercicio15{
	public static void main(String args[]){
 	Scanner sc = new Scanner(System.in);
	String paises[] = new String[4];
	double temperaturas[][] = new double[4][3];
	double medias[] = new double[4];
	for (int i = 0; i < 4; i++){
		System.out.print("Ingrese el nombre del país " + (i + 1) + ": ");
		paises[i] = sc.nextLine();
		System.out.println("Ingrese las 3 temperaturas mensuales del trimestre:");
		for (int j = 0; j < 3; j++){
			System.out.print("Temperatura " + (j + 1) + ": ");
			temperaturas[i][j] = sc.nextDouble();
		}
	sc.nextLine();
	System.out.println();
	}
	System.out.println("Temperaturas registradas:");
	for (int i = 0; i < 4; i++){
		System.out.print(paises[i] + ": ");
		for (int j = 0; j < 3; j++){
		System.out.print(temperaturas[i][j] + "  ");
		}
	System.out.println();
	}
	for (int i = 0; i < 4; i++){
		double suma = 0;
		for (int j = 0; j < 3; j++){
			  suma = suma+temperaturas[i][j];
	}
	medias[i] = suma / 3;
	}
	System.out.println("\nTemperatura media trimestral de cada país:");
	for (int i = 0; i < 4; i++){
		System.out.println(paises[i] + ": " + medias[i]);
	}
	double mayor = medias[0];
	int indiceMayor = 0;
	for (int i = 1; i < 4; i++){
		if (medias[i] > mayor){
		mayor = medias[i];
		indiceMayor = i;
		}
	}
	System.out.println("El país con la temperatura media trimestral más alta es: "+ paises[indiceMayor] + " con " + mayor + " grados.");
	}
}

