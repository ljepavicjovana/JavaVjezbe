import java.util.Scanner;
public class Temperaturaa {
private double[] temperatura;
	
	public Temperaturaa(double[] temperatura) {
		this.temperatura = temperatura;
		
	}
	public double[] getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double[] temperatura) {
		this.temperatura = temperatura;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Unesite elemente niza: ");
		double []niz = new double[5];
		System.out.println("Unesite sve temperature: ");
		for(int i = 0; i < niz.length; i++ ) {
			System.out.println("Temperatura");
			niz[i]= sc.nextDouble();
			
			
		}
		System.out.println("Duzina niza: " + niz.length);

		
	}
	public double prosjecnaTemp(double[] niz) {
		double Pocetna=0;
		for(double temp: niz) {
			Pocetna += temp;
		}
		return Pocetna / niz.length;
	}
	public double maksimalnaTemperatura(double[] niz) {
		double max = niz[0];
		for (double temp:niz) {
			if(temp > max) {
				max = temp;
			}
		}
		return max;
		//za uklanjanje svih pojava koristili bismo brojac tipa double pa bi se on postavio na nulu
		
		System.out.println("Unesi temperaturu koju hoces da provjeris: ");
		double zeljenaTemp= sc.nextDouble();
		
		boolean postoji = false;
		
	}
}
