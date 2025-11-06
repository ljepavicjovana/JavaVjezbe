
import java.util.List;

public class Smjene {
    private String datum;
    private double pocetakSmjene;
    private double krajSmjene;
    private String tipSmjene;
    private List<Zaposleni> zaposleni;

    public Smjene(String datum, double pocetakSmjene, double krajSmjene, String tipSmjene, List<Zaposleni> zaposleni) {
        this.datum = datum;
        this.pocetakSmjene = pocetakSmjene;
        this.krajSmjene = krajSmjene;
        this.tipSmjene = tipSmjene;
        this.zaposleni = zaposleni;
    }
    

    public String getDatum() {
		return datum;
	}


	public double getPocetakSmjene() {
		return pocetakSmjene;
	}


	public double getKrajSmjene() {
		return krajSmjene;
	}


	public String getTipSmjene() {
		return tipSmjene;
	}


	public List<Zaposleni> getZaposleni() {
		return zaposleni;
	}


	public void setDatum(String datum) {
		this.datum = datum;
	}


	public void setPocetakSmjene(double pocetakSmjene) {
		this.pocetakSmjene = pocetakSmjene;
	}


	public void setKrajSmjene(double krajSmjene) {
		this.krajSmjene = krajSmjene;
	}


	public void setTipSmjene(String tipSmjene) {
		this.tipSmjene = tipSmjene;
	}


	public void setZaposleni(List<Zaposleni> zaposleni) {
		this.zaposleni = zaposleni;
	}


	public void dodajSateZaposlenima() {
        double trajanje = krajSmjene - pocetakSmjene;
        for (Zaposleni z : zaposleni) {
            z.setUkupnoSati(z.getUkupnoSati() + trajanje);
        }
    }
}
