
public class Zaposleni {
	//. Svaki zaposleni ima
//	jedinstveni ID, ime, prezime, satnicu (plataPoSatu) i ukupan broj sati koje odradi tokom jedne
	//sedmice (ukupanBrojSati).
	protected String jedinstveniID;
	protected String ime;
	protected String prezime;
	protected double satnica;
	protected double ukupnoSati;
	
	public Zaposleni(String jedinstveniID, String ime, String prezime, double satnica, double ukupnoSati) {
		super();
		this.jedinstveniID = jedinstveniID;
		this.ime = ime;
		this.prezime = prezime;
		this.satnica = satnica;
		this.ukupnoSati = ukupnoSati;
	}

	public String getJedinstveniID() {
		return jedinstveniID;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public double getSatnica() {
		return satnica;
	}

	public double getUkupnoSati() {
		return ukupnoSati;
	}

	public void setJedinstveniID(String jedinstveniID) {
		this.jedinstveniID = jedinstveniID;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public void setSatnica(double satnica) {
		this.satnica = satnica;
	}

	public void setUkupnoSati(double ukupnoSati) {
		this.ukupnoSati = ukupnoSati;
	}
	public double izracunajPlatu() {
	        return 4 * ukupnoSati * satnica; 
	    }
	

	@Override
	public String toString() {
		return "Zaposleni [jedinstveniID=" + jedinstveniID + ", ime=" + ime + ", prezime=" + prezime + ", satnica="
				+ satnica + ", ukupnoSati=" + ukupnoSati + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String dodatniPodaci() {
        return "-";
    }

	
}
