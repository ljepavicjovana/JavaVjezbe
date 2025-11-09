
 class Konobar extends Zaposleni {
	private double prekovremeniSati;

	 public Konobar(String jedinstveniID, String ime, String prezime, double satnica, double ukupnoSati, double prekovremeniSati) {
		super(jedinstveniID, ime, prezime, satnica, ukupnoSati);
		this.prekovremeniSati=prekovremeniSati;
		
	 }

	 public double getPrekovremeniSati() {
		 return prekovremeniSati;
	 }

	 public void setPrekovremeniSati(double prekovremeniSati) {
		 this.prekovremeniSati = prekovremeniSati;
	 }

	 @Override
	 public String toString() {
		return "Konobar [prekovremeniSati=" + prekovremeniSati + ", getPrekovremeniSati()=" + getPrekovremeniSati()
				+ ", getJedinstveniID()=" + getJedinstveniID() + ", getIme()=" + getIme() + ", getPrezime()="
				+ getPrezime() + ", getSatnica()=" + getSatnica() + ", getUkupnoSati()=" + getUkupnoSati()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	 }
	 
	 @Override
	    public double izracunajPlatu() {
	        double sedmicnaPlata = ukupnoSati * satnica;
	        double prekovremenaPlata = prekovremeniSati * satnica * 1.2;
	        return 4 * (sedmicnaPlata + prekovremenaPlata);
	    }
	 @Override
	    public String dodatniPodaci() {
	        return "Prekovremeni sati: " + prekovremeniSati;
	    }

}
