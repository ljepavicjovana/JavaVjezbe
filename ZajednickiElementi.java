/*Napisati program koji za unijete nizove a i b vraća niz zajedničkih elementa
niza a i niza b. Elementi niza a i niza b su brojevi.
Input 1: a = {1,2, 3}, b = {3, 2} Output 1: {2, 3}
Input 2: a = {2, 3, 4}, b = {1, 1, 7} Output 2: {}*/
import java.util.ArrayList;
import java.util.Scanner;
public class ZajednickiElementi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		
		System.out.print("Koliko brojeva zelite da unesete");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Element na poziciji" + (i+1) + ":");
			int element=sc.nextInt();
			a.add(element);
		}
		ArrayList<Integer> b = new ArrayList<>();
		System.out.print("Koliko brojeva zelite da unesete");
		int m=sc.nextInt();
		
		for(int s = 0; s< m; s++) {
			System.out.println("Element na poziciji" + (s+1) + ":");
			int elementDrugog=sc.nextInt();
			b.add(elementDrugog);
			
		}
		//sada pravim novu listu za rezultat
		ArrayList<Integer> zajednicki= new ArrayList<>();
		for (int element : a) { //za arraylist a
		    if (b.contains(element)) { //ako arraylist b sadrzi element iz arraylist a
		        if (!zajednicki.contains(element)) { // zajednicki mi je arraylist zajednicki koju sam napravila i znak uzvika je da se ne ponovi 
		            zajednicki.add(element);//ovo je da doda zajednicki element kao sto se trazi u arraylist zajednicki
		        }
		    }
		}
		System.out.println("Zajednički elementi su: " + zajednicki);
		sc.close();	
		
	}

}
