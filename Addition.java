
import java.util.Scanner;

public class Addition {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Entrez un entier : ");
		int nb1 = sc.nextInt();
		
		System.out.println("Entrez un deuxième entier : ");
		int nb2=sc.nextInt();
		
		int t=nb1+nb2;
	System.out.println("Le résultat est :"+t);
	}
}
