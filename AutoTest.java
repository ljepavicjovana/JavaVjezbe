import java.util.ArrayList;
public class AutoTest {

	public static void main(String[] args) {
		ArrayList<Auto> listaAuta = new ArrayList<>();

        listaAuta.add(new Auto("Audi", 2005, 120, true, 1800, true));
        listaAuta.add(new Auto("Fiat", 1980, 60, false, 1200, true));  // ne može se registrovati
        listaAuta.add(new Auto("BMW", 2018, 150, true, 2000, true));

        for (Auto a : listaAuta) {
            System.out.println(a);
        }

        double ukupna = Auto.ukupnaRegistracija(listaAuta);
        System.out.println("\nUkupna registracija svih registrovanih auta: " + ukupna);
    }

	}


