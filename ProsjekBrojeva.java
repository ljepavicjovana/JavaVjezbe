/*Korisnik unosi koliko god želi brojeva u ArrayList.
Program treba na kraju da izračuna prosječnu vrijednost tih brojeva.*/
import java.util.Scanner;
import java.util.ArrayList;
public class ProsjekBrojeva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> brojevi = new ArrayList<>();
		
		System.out.println("Koliko brojeva zelite da unesete");
		int n = sc.nextInt();
		//unosimo brojeve
		for(int i=0;i<n;i++) {
			System.out.println("Unesite broj" + (i+1)+":");
			int broj=sc.nextInt();
			brojevi.add(broj);
			
		}
		//izrada ovoga sto se trazi u zadatku preko skracene for petlje
		double suma=0;
		for(int broj: brojevi) {
			suma+=broj;
		}
		double prosjek = suma/brojevi.size();
		 System.out.println("Prosjek unesenih brojeva je: " + prosjek);

	        sc.close();
		
		

	}

}
