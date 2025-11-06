/*Napisati program koji za unijeti niz a i vrijednost max vraća broj elemenata
koji su manji od max iz tog niza. Napomena: lista sadrži samo cijele brojeve
Input: a = {1,2,3}, max = 3; Output: 2
Input: a = {-1, 0, 5}, max = -2; Output: 0
*/
public class ManjiOdMax {

	public static void main(String[] args) {
	/*	int niz[] = {1, 2 , 3};
		
		int maxElem=niz[2];
		for(int broj:niz) {
			if(broj<maxElem) {
				System.out.println("Brojevi koji su manji od max:" +broj);
			}
		}
		

}*/
		int niz[] = {1, 2 , 3};
		
		int maxElement=niz[0];
		for(int broj:niz) {
			if(broj>maxElement) {
				maxElement=broj;
			}
		}
		//Sada kada znamo kako se nalazi maksimalni element u nizu onda pravimo drugu for petlju dje trazimo koliko je brojeva manjih od max
		int brojac=0;
		//brojac nam treba da izbrojimo sve koliko ih je manjih od maksimalnog elementa
		for(int broj:niz) {
			if(broj<maxElement) {
				brojac++;
			}
		}
		System.out.println("Brojevi koji su manji od maksimalnog elementa: " +brojac);
		//kada ga stampamo pokazace nam koliko ih je da su manji
		
	
}
	
}
