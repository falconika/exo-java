import java.util.Scanner;

public class PlusPetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cr�er un programme qui demande � l'utilisateur la saisie de 2 nombres et affiche le plus petit nombre.
		
		
		
		
	Scanner sc = new Scanner(System.in);	
		
		System.out.println("Entrez un entier : ");
		int nb1 = sc.nextInt();
		
		System.out.println("Entrez un deuxi�me entier : ");
		int nb2=sc.nextInt();
		
	if (nb2<nb1)
		System.out.println("Le plus petit nombre est " + nb2 );
	if (nb2>nb1)
		System.out.println("Le plus petit nombre est " + nb1);
	if (nb2==nb1)
		System.out.println(nb2 +" et "+ nb1+" sont �gaux.");
	}

}
