
public class EProizvodi {
//u opis proizvoda, šifre proizvoda i uvozna cijena
	//proizvoda.
	protected String opis;
	protected String sifraProizvoda;
	protected double uvoznaCijena;
	
	
	public EProizvodi(String opis, String sifraProizvoda, double uvoznaCijena) {
		super();
		this.opis = opis;
		this.sifraProizvoda = sifraProizvoda;
		this.uvoznaCijena = uvoznaCijena;
	}


	public String getOpis() {
		return opis;
	}


	public String getSifraProizvoda() {
		return sifraProizvoda;
	}


	public double getUvoznaCijena() {
		return uvoznaCijena;
	}


	public void setOpis(String opis) {
		this.opis = opis;
	}


	public void setSifraProizvoda(String sifraProizvoda) {
		this.sifraProizvoda = sifraProizvoda;
	}


	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	public String getTip() {
        return sifraProizvoda.substring(0, 2).toUpperCase();
    }
	
	 public double obracunajMaloprodajnuCijenu() {
	       
	        return uvoznaCijena * 1.05;
	    }


	 @Override
	 public String toString() {
		return "EProizvodi [opis=" + opis + ", sifraProizvoda=" + sifraProizvoda + ", uvoznaCijena=" + uvoznaCijena
				+ ", getOpis()=" + getOpis() + ", getSifraProizvoda()=" + getSifraProizvoda() + ", getUvoznaCijena()="
				+ getUvoznaCijena() + ", getTip()=" + getTip() + ", obracunajMaloprodajnuCijenu()="
				+ obracunajMaloprodajnuCijenu() + "]";
	 }


	
}
