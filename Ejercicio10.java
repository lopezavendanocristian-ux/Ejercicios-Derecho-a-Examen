import java.util.Scanner;
public class Ejercicio10{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int[] numeros = new int[10];
	int pos=1;
	for (int i = 0; i < 10; i++){
		System.out.print("Ingrese el número " + pos + ": ");
		numeros[i] = sc.nextInt();
		pos++;
	}
	for (int i = 9; i >= 0; i--){
		System.out.println(numeros[i]);
	}
	}
}