import java.util.Scanner;
public class Ejercicio16{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String articulos[][] = new String[3][3];
	for (int i = 0; i < 3; i++) {
		System.out.print("Ingrese el nombre del artículo (Camisa, Zapato, Pantalón): ");
		articulos[i][0] = sc.nextLine();
		System.out.print("Ingrese la talla: ");
		articulos[i][1] = sc.nextLine();
		System.out.print("Ingrese el color: ");
		articulos[i][2] = sc.nextLine();
	}
	System.out.println("Artículo \t Talla \t Color");
	for (int i = 0; i < 3; i++) {
		System.out.println(articulos[i][0] + "\t" + articulos[i][1] + "\t" + articulos[i][2]);
	}
	}
}
