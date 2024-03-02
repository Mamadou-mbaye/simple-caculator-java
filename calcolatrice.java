import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
		/* creare un programma che mi permette di fare semplici calcoli matematici */
		System.out.println("Inserisci un numero");
		try (Scanner scan = new Scanner(System.in)) {
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			scan.nextLine();
			System.out.println("Indicare l'operatore: + - * /");
			String operator = scan.nextLine().trim();
			switch (operator) {
			case "+":
				System.out.print("x + y: => ");
				System.out.println(x + y);
				break;
			case "-":
				System.out.print("x - y: => ");
				System.out.println(x - y);
				break;
			case "*":
				System.out.print("x * y: => ");
				System.out.println(x * y);
				break;
			case "/":
				System.out.print("x / y: => ");
				System.out.println(x / y);
				break;
			default:
				System.out.println("Operatore non valido");
			}
		}

	}

}
