/*Napisati program koji za unijeti niz elemenata (cijeli brojevi, bez nule) a vraća
broj elemenata koji imaju suprotnu vrijednost. Broju x, suprotan broj je -x.
Smatrati da se broj pojavljuje jednom i da nekad ima svoju suprotnu
vrijednost, a nekad nema.
Input 1: {1, 2, -1, 3, -3} Output: 2
Input 2: {20, 10, -10, 100} Output: 1
*/
import java.util.ArrayList;
import java.util.Scanner;
public class SuprotnaVrijednost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//napravila niz i dodala mu da se unose elementi itd...
		ArrayList<Integer> brojevi=new ArrayList<>();
		
		System.out.println("Koliko zelite da ima elemenata");
		int n=sc.nextInt();
		
		for(int i=0; i< n; i++) {
			System.out.println("Element" + (i+1) +":");
			int element=sc.nextInt();
			brojevi.add(element);
		}
		//posto vraca broj elemenata onda da napravim novu listu koja ce da sadrzi sve to
		ArrayList<Integer> nova = new ArrayList<>();
		int brojac=0;
		for(int element: brojevi) {
			if(brojevi.contains(-element) && !brojevi.contains(element)){
				//ovaj dio !provjerava da jos nismo obradili jer dok ga nisam stavila duplirao mi se rezultat
				brojac++;
				nova.add(element);
				nova.add(-element);
				
			}
		}
		System.out.println("Niz koji sadrzi ponovljene vrijednosti,odnosno pozitivnu i negativnu vrijednost iznosi: " +nova);
		sc.close();
	}

}
