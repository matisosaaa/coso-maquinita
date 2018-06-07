import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Maquinita {

	public static void main(String[] args) {

		ejecutarMenu();

		System.out.println("GRACIAS");

	}// aca termina el método main

	public static void ejecutarMenu() {

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		int num1, num2, option;
		boolean flag = true;
		boolean flag2 = false;
		String orden;

		int[] vec = new int[10];
		int[] vec2 = { 0, 1, 2, 3 };

		do {
			do {
				System.out.println("Ingrese la opción deseada:");
				System.out.println("1) Ver cosas de la maquinita");
				System.out.println("2) Ver stock de las cosas de la maquinita");
				System.out.println("3) Ver la fecha de vencimiento de las cosas de la maquinita");
				System.out.println("4) Ver las proximas cosas de las maquinitas");

				option = sc3.nextInt();

				if (option < 1 || option > 4) {
					System.out.println("ERROR, opción no válida.");
					flag2 = true;
				} else {
					flag2 = false;
				}

			} while (flag2);

		

			switch (option) {
			case 1:
				System.out.println("Las cosas de la maquina son: 1) Alfajor oreo  2) Bizcochitos Don Satur   3) Cepita de manzana  4) Cepita de durazno  5) Cepita de naranja  6) Baggio de manzana  7) Baggio de durazno  8) Baggio de durazno  9) Coca-Cola  10) Huevo Kinder  ");
				break;
			case 2:
				System.out.println("El stock de las cosas son: 1)  0 / 2) 16 / 3) 9 / 4) 7 / 5) 3 / 6) 9 / 7) 7 / 8) 3 / 9) 35 / 10) 0 MUY CARO");
				break;
			case 3:
				System.out.println("El vencimiento de las cosas son: 1) 05-09-19  / 2) 25-03-21  / 3) 15-07-18  / 4) 06-01-19  / 5) 15-11-47  / 6) 28-02-22  / 7) 24-06-24 / 8) 14-02-19 / 9) 17-05-21 / 10) 30-05-17");
				break;
			case 4:
				System.out.println("Las proximas cosas de la maquina son: 1) Ensalada Cesar 2) McCombo 3) Sprite 4) Fanta 5) Manaos  6) Vodka  7)  Conejo a la parrila 8) Galletitas Pepitos  9) iMac 2019  10) i9 Gold Edition ");
				break;
			default:
				System.err.println("ERROR, opción no válida.");
				break;
			}// termino el switch

			System.out.println("¿Desea realizar otra operación? SI/NO");
			orden = sc4.nextLine();
			if (orden.equalsIgnoreCase("si")) {
				flag = true;
			} else {
				flag = false;
			}

		} while (flag);

	}// aca termina el método ejecutarMenu();

}// aca termina la clase menu1
