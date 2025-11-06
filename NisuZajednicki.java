/*Napisati program koji unosi dvije liste cijelih brojeva (ArrayList<Integer>)
i formira novu listu koja sadrži sve elemente koji se nalaze samo u jednoj od te dvije liste
(odnosno — elemente koji nisu zajednički).*/
import java.util.Scanner;
import java.util.ArrayList;
public class NisuZajednicki {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//prva lista
		ArrayList<Integer> a= new ArrayList<>();
		
		System.out.println("Koliko brojeva zelite da unesete");
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			System.out.println("Korisnik unosi " + (i+1) + ":");
			int element=sc.nextInt();
			a.add(element);
		}
		//druga lista koju korisnik unosi
		ArrayList<Integer> b = new ArrayList<>();
		
		System.out.println("Koliko brojeva zelite da unesete");
		int m=sc.nextInt();
		
		for(int s=0;s<m;s++) {
			System.out.println("Korisnik unosi " + (s+1) + ":");
			int elemenDrugog=sc.nextInt();
			b.add(elemenDrugog);
		}
		//nova lista
		ArrayList<Integer> jedna = new ArrayList<>();
		
		
		for (int element : a) {
		    if (!b.contains(element)) {
		        jedna.add(element);
		    }
		}
		
		for (int element : b) {
		    if (!a.contains(element)) {
		        jedna.add(element);
		    }
		}
		System.out.println("Lista koja sadrzi elemente koji nisu zajednicki za listu a i b je: "+jedna);
		
		sc.close();
		
		
	}

}
