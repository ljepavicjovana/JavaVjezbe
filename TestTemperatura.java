import java.util.Scanner;
import java.util.ArrayList;
public class TestTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj temperatura");
		
		
		double duzina=sc.nextDouble();
		
		double temperatura[] = new double[(int) duzina];
		
		for(int i=0;i<temperatura.length;i++) {
			System.out.println("Element unijetog niza " + (i+1)+" temperatura:");
			 temperatura[i]=sc.nextDouble();
			 //mogli smo u [] da upisemo pet bez skenera da pitamo da se unese
			 
		

	}
		for(int i=0;i<temperatura.length;i++) {
			System.out.println("Duzina niza je " +temperatura.length);
			System.out.println("Temperature koje su unesene " +temperatura[i]);

}
		System.out.println("Sta zelite da brisete ");
		ArrayList<Double> novaLista = new ArrayList<>();
		double temp = sc.nextDouble();
		for(int i=0;i<temperatura.length;i++) {
			
			if(temperatura[i] != temp) {
				novaLista.add(temperatura[i]);
			}
			
			}
		
			
		
			
		
	for(double l:novaLista) {
		System.out.println(l + " ");

			
		}
	
}}
	

	

