import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int cont = 1;
	while (cont <= 10) {
		System.out.print("Ingrese el nombre No. " + cont + ": ");
		String nom = sc.next();
		System.out.println("Nombre ingresado: " + nom);
		cont++;
		}
	}
}