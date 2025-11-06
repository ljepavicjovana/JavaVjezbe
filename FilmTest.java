/*import java.util.ArrayList;
public class FilmTest {

	
		    public static void main(String[] args) {
		        ArrayList<Film> listaFilmova = new ArrayList<>();

		        // Dodavanje filmova
		        listaFilmova.add(new Film("Inception", "Sci-Fi", 9.0, 148));
		        listaFilmova.add(new Film("Titanic", "Romantika", 8.7, 195));
		        listaFilmova.add(new Film("Avengers", "Akcija", 8.4, 180));
		        listaFilmova.add(new Film("Interstellar", "Sci-Fi", 9.1, 169));
		        listaFilmova.add(new Film("Joker", "Drama", 8.6, 122));

		        // Pozivanje metoda
		        System.out.println("Najduži film: " + najduziFilm(listaFilmova));

		        System.out.println("\nFilmovi žanra 'Sci-Fi':");
		        for (Film f : filmoviPoZanru(listaFilmova, "Sci-Fi")) {
		            System.out.println(f);
		        }

		        System.out.println("\nProsječna ocjena svih filmova: " + prosjecnaOcjena(listaFilmova));
		    }

		    // Metoda za najduži film
		    public static Film najduziFilm(ArrayList<Film> lista) {
		        if (lista.isEmpty()) return null;
		        Film najduzi = lista.get(0);
		        for (Film f : lista) {
		            if (f.getTrajanjeMin() > najduzi.getTrajanjeMin()) {
		                najduzi = f;
		            }
		        }
		        return najduzi;
		    }

		    // Metoda za filmove po žanru
		    public static ArrayList<Film> filmoviPoZanru(ArrayList<Film> lista, String zanr) {
		        ArrayList<Film> rezultat = new ArrayList<>();
		        for (Film f : lista) {
		            if (f.getZanr().equalsIgnoreCase(zanr)) {
		                rezultat.add(f);
		            }
		        }
		        return rezultat;
		    }

		    // Metoda za prosječnu ocjenu
		    public static double prosjecnaOcjena(ArrayList<Film> lista) {
		        if (lista.isEmpty()) return 0;
		        double suma = 0;
		        for (Film f : lista) {
		            suma += f.getOcjena();
		        }
		        return suma / lista.size();
		    }
		

	}

*/
