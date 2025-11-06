/*import java.util.ArrayList;

class Film {
    private String naziv;
    private String zanr;
    private double ocjena;
    private double trajanjeMin;

    
    public Film(String naziv, String zanr, double ocjena, double trajanjeMin) {
        this.naziv = naziv;
        this.zanr = zanr;
        this.ocjena = ocjena;
        this.trajanjeMin = trajanjeMin;
    }

   
    public Film() {
        this.naziv = "Nepoznat";
        this.zanr = "Nepoznat";
        this.ocjena = 0;
        this.trajanjeMin = 0;
    }

   
    public String getNaziv() { return naziv; }
    public void setNaziv(String naziv) { this.naziv = naziv; }

    public String getZanr() { return zanr; }
    public void setZanr(String zanr) { this.zanr = zanr; }

    public double getOcjena() { return ocjena; }
    public void setOcjena(double ocjena) { this.ocjena = ocjena; }

    public double getTrajanjeMin() { return trajanjeMin; }
    public void setTrajanjeMin(double trajanjeMin) { this.trajanjeMin = trajanjeMin; }

    @Override
    public String toString() {
        return "Film [naziv=" + naziv + ", zanr=" + zanr + ", ocjena=" + ocjena + ", trajanjeMin=" + trajanjeMin + "]";
    }
}

// Glavni program
public class FilmTest {

    // a) Najduži film
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

    // b) Filmovi po žanru
    public static ArrayList<Film> filmoviPoZanru(ArrayList<Film> lista, String zanr) {
        ArrayList<Film> rezultat = new ArrayList<>();
        for (Film f : lista) {
            if (f.getZanr().equalsIgnoreCase(zanr)) {
                rezultat.add(f);
            }
        }
        return rezultat;
    }

   
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