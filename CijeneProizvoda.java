/*Dat je niz koji sadrži cijene proizvoda u jednom marketu. Market je za ovu
nedelju odlučio da spusti cijene svim proizvodima. Kolika će zarada marketa
od tih proizvoda biti manja u odnosu na originalnu cijenu.
*/
public class CijeneProizvoda {

	public static void main(String[] args) {
		double cijene[] = {20,30,50};
		
		
	        double snizenjeCijene = 10; // 10% stavila sam proizvoljnu vrijednost jer nije data u zadatku
	        double zaradamarketa = 0;

	        for (int i = 0; i < cijene.length; i++) {
	            double novaCijena = cijene[i] * (1 - (snizenjeCijene / 100));
	            double razlikaCijena = cijene[i] - novaCijena; 
	            zaradamarketa += razlikaCijena;
	        }

		System.out.println("Razlika nove i stare cijene u marketu je: " +zaradamarketa);
	}
	

}
