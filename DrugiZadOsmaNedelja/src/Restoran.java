import java.util.ArrayList;
import java.util.List;

public class Restoran {
    private String naziv;
    private String adresa;
    private String PIB;
    public List<Zaposleni> zaposleni;

    public Restoran(String naziv, String adresa, String PIB) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.PIB = PIB;
        this.zaposleni = new ArrayList<>();
    }
    

    public String getNaziv() {
		return naziv;
	}


	public String getAdresa() {
		return adresa;
	}


	public String getPIB() {
		return PIB;
	}


	public List<Zaposleni> getZaposleni() {
		return zaposleni;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	public void setPIB(String pIB) {
		PIB = pIB;
	}


	public void setZaposleni(List<Zaposleni> zaposleni) {
		this.zaposleni = zaposleni;
	}


	public void dodajZaposlenog(Zaposleni z) { zaposleni.add(z); }
    public void ukloniZaposlenog(Zaposleni z) { zaposleni.remove(z); }

    public Zaposleni nadjiPoId(String id) {
        for (Zaposleni z : zaposleni) {
            if (z.getJedinstveniID().equals(id)) return z;
        }
        return null;
    }
}
