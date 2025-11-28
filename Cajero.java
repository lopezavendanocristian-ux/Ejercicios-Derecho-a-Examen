import java.util.Scanner;
public class Cajero {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int op;
	char respuesta = 's';
	double adeudo = 1000.00;
	do {
		System.out.println("\t Seleccione una opción:");
		System.out.println("1. Consulta");
		System.out.println("2. Pago del mes");
		System.out.println("3. Pago de adeudo");
		System.out.println("4. Salir");
		System.out.print("Ingrese su opción: ");
		op = sc.nextInt();
	switch (op) {
                case 1:
			System.out.println("\t Consulta de Saldo:");
			System.out.println("Su adeudo actual es de: $" + adeudo);
			break;
		case 2:
			System.out.println("\t Pago del mes:");
			System.out.println("El monto a pagar del mes incluyendo adeudos es de: " + adeudo);
			System.out.println("\t ¡Pago realizado!");
			break;
		case 3:
			System.out.println("\t Pago de adeudo total:");
			System.out.println("Usted tiene un adeudo vencido de: $" + adeudo);
			System.out.println("\t ¡Su cuenta ha quedado en ceros!");
			break;
		case 4:
			System.out.println("Gracias por su preferencia");
			break; 
		default:
			System.out.println("¡lea bien por favor!. Solo del 1 al 4");
		}
	System.out.print("¿Desea hacer otra operación?: ");
	respuesta = sc.next().charAt(0);
	} 
	while (respuesta == 's' || respuesta == 'S');
	System.out.println("Sesión finalizada");
	}
}