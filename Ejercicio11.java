import java.util.Scanner;
public class Ejercicio11{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int numeros[] = new int[8];
	for (int i = 0; i < 8; i++){
		System.out.println("Ingresa el número " + (i + 1) + ": ");
		numeros[i] = sc.nextInt();
	}
	System.out.print("Ingresa el número a buscar: ");
	int buscar = sc.nextInt();
	boolean existe = false;
	for (int i = 0; i < 8; i++){
		if (numeros[i] == buscar){
		existe = true;
		}
	}
	if (existe){
	System.out.println("El número SÍ existe en el arreglo.");
	} else {
	System.out.println("El número NO existe en el arreglo.");
	}
	}
}
