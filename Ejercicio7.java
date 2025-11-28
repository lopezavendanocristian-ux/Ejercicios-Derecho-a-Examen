import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int resul;
	System.out.print("Numero que desea: ");
	int num = sc.nextInt();
	System.out.println("\t tabla de multiplicar del" + num);
	for (int i = 1; i < 11; i++) {
		resul = num * i;
		System.out.println(num + " x " + i + " = " + resul);
	}
	}
}