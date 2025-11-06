
public class Rezervacija {
	
	    private String sala;
	    private String datum;
	    private int pocetakMin;
	    private int krajMin;
	    private String predmet;
	    private String nosilac;

	    public Rezervacija(String sala, String datum, int pocetakMin, int krajMin, String predmet, String nosilac) {
	        this.sala = sala;
	        this.datum = datum;
	        this.pocetakMin = pocetakMin;
	        this.krajMin = krajMin;
	        this.predmet = predmet;
	        this.nosilac = nosilac;
	    }

	    // Getteri
	    public String getSala() { return sala; }
	    public String getDatum() { return datum; }
	    public int getPocetakMin() { return pocetakMin; }
	    public int getKrajMin() { return krajMin; }
	    public String getPredmet() { return predmet; }
	    public String getNosilac() { return nosilac; }

	    // Pomocna metoda za prikaz vremena u HH:MM formatu
	    private String formatVreme(int min) {
	        int h = min / 60;
	        int m = min % 60;
	        return String.format("%02d:%02d", h, m);
	    }

	    @Override
	    public String toString() {
	        return sala + " | " + datum + " | " + formatVreme(pocetakMin) + "-" + formatVreme(krajMin) +
	                " | " + predmet + " (" + nosilac + ")";
	    }
	}


