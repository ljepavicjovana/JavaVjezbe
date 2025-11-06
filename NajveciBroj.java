import java.util.Scanner;
import java.util.ArrayList;
public class NajveciBroj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Znaci prvo kreiramo praznu listu
		ArrayList<Integer> brojevi = new ArrayList<>();
		
		System.out.println("Koliko brojeva zelite da unesete ");
		int n = sc.nextInt();
		//kao sto sam prije radila kada kroisnik unosi pitam prvo koju ce duzinu i duzinu preko skenera unosim tako i kod ArrayList
		
		// sada unos elemenata
		for(int i=0; i<n;i++) {
			System.out.println("Unesite broj " + (i+1) + ":");
			int broj = sc.nextInt();
			brojevi.add(broj);
		}
		int max = brojevi.get(0);
		for(int broj: brojevi) {
			if(broj>max) {
				max=broj;
			}
		}
		System.out.println("Najveci broj u listi je " +max);
		sc.close();
	}

}
