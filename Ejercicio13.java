import java.util.Scanner;
public class Ejercicio13{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int matriz[][] = new int[3][4];
	for (int e = 1; e <= 12; e++){
		System.out.println("Estudiante " + e);
		System.out.print("Nivel (0,1,2): ");
		int n = sc.nextInt();
		System.out.print("Idioma (0,1,2,3): ");
		int i = sc.nextInt();
		matriz[n][i] = matriz[n][i] + 1;
	}
	System.out.println("Matriz final:");
	for (int f = 0; f < 3; f++){
		for (int c = 0; c < 4; c++){
		System.out.print(matriz[f][c] + " ");
	}
		System.out.println();
	}
	}
}
