import java.util.Scanner;
public class Zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int velicinaNiza = sc.nextInt();
		
		int[] bodovi = new int[velicinaNiza];
		
		for(int i = 0; i < bodovi.length;i++) {
			System.out.println("Unesite " + (i + 1) + ".element niza:");
			bodovi[i] = sc.nextInt();
			
		}
		double prosjek = 0;
		for(int x:bodovi) {
			//radi isto kao prethodni ali uzima svaki element iz niza bodovi i ucita ga u varijablu x
			prosjek +=x;
		}
		System.out.println("Prosjek je: " + prosjek/velicinaNiza);
		sc.close();
		int min = 100;
		//uvijek na min postavi najvecu mogucu vrijednost 
		for(int x:bodovi) {
			if(x<min) {
				min = x;
				//prolazim kroz sve elemente niza i provjeravam da li je prvi element manji od minumuma i tako redom..
			}
			//kod skracene for petlje moze biti problem indeks, u tom slucaju da se koristi prosirena for petlja.
		}
		System.out.println("Minimum je: " +min);
	}
	

}
