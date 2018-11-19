import java.util.Scanner;

public class Signe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	

		System.out.println("Entrez un entier : ");
		int nb1 = sc.nextInt();
		if(nb1>=0)
			System.out.println("Le signe est +");
		if(nb1<0)
			System.out.println("Le signe est -");
	}

}
