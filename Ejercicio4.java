import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	double saldo = 5000.00;
	char respuesta;
	do {
		System.out.println("\n Saldo actual: " + saldo);
		System.out.print("Ingrese la cantidaad a retirar: ");
		double montoRetiro = sc.nextDouble();
		if (montoRetiro > saldo)
		System.out.println("Saldo insuficiente");
		else {
		saldo = saldo - montoRetiro;
		System.out.println("Retiro realizado \n Tome su dinero");
		System.out.println("Su saldo ahora es: " + saldo);
		}
		System.out.print("\n ¿Desea realizar otra operación?: ");
		respuesta = sc.next().charAt(0);
	} while (respuesta == 's' || respuesta == 'S');
	System.out.println("Gracias por su preferencia");
	}
}