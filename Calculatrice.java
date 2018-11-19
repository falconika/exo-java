import java.util.Scanner;

public class Calculatrice {





	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Entrez un entier : ");
		int nb1 = sc.nextInt();
		System.out.println("Entrez un opérateur : ");
		String operateur = sc.next();
		sc.nextLine();
		System.out.println("Entrez un entier : ");
		int nb2 = sc.nextInt();
	
		switch (operateur) {
		case "+":
			System.out.println((nb1+nb2));
			break;
		case "-":
			System.out.println((nb1-nb2));

			break;
		case "*":
			System.out.println((nb1*nb2));

			break;
		case "/":
			System.out.println((nb1/nb2));

			break;
		default:
			System.out.println("error");
			break;
		}
		sc.close();
		
	}

}
