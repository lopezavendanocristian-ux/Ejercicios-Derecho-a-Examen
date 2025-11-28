public class Ejercicio8 {
	public static void main(String args[]) {
	double salAcum = 0, depoMen = 500, interes = 0.09, interesGan;
	for (int mes = 1; mes <= 12; mes++) {
		salAcum = salAcum + depoMen;
		interesGan = salAcum * interes;
		salAcum = salAcum + interesGan;
		System.out.print("Mes " + mes);
		System.out.printf(" ahorro acumulado: $%.2f\n", salAcum);
	}
	System.out.printf("Total ahorrado: $%.2f\n", salAcum);
    }
}