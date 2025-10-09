import java.util.Scanner;
public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int velicinaNiza = sc.nextInt();
		
		int[] bodovi = new int[velicinaNiza];
		
		for(int i = 0; i < bodovi.length;i++) {
			System.out.println("Unesite " + (i + 1) + ".element niza:");
			bodovi[i] = sc.nextInt();
	}
	
		for(int i = 0; i < brojevi.length; i++) {
			for(int j = 0; j < brojevi.length - i - 1; j ++) {
				if(brojevi[j] > brojevi[j+1]) {
					int temp = brojevi[j];
					brojevi[j]= brojevi[j+1];
					brojevi[j+1]=temp;
					//bubble sort uoredim trenutni element sa sledecim
					//temp-da sacuvam u privremenu varijablu u suprotnom bismo gubili podatak
					/*
					brojevi[j]=brojeci[j+1];
					brojevi[j+1]=brojevi[j];
					*/
				}
			}
		}
		for(int x:brojevi) {
			System.out.println(x);
			
		}
		sc.close();

} 
	
}
