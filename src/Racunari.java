
 class Racunari extends EProizvodi{
	 private String procesor;
	 private int memorija;
	 
	 public Racunari(String opis, String sifraProizvoda, double uvoznaCijena, String procesor, int memorija) {
		super(opis, sifraProizvoda, uvoznaCijena);
		this.procesor=procesor;
		this.memorija=memorija;
	 }

	 public String getProcesor() {
		 return procesor;
	 }

	 public int getMemorija() {
		 return memorija;
	 }

	 public void setProcesor(String procesor) {
		 this.procesor = procesor;
	 }

	 public void setMemorija(int memorija) {
		 this.memorija = memorija;
	 }
	 @Override
	    public double obracunajMaloprodajnuCijenu() {
	        double cijena = super.obracunajMaloprodajnuCijenu(); 
	        cijena *= 1.05; 
	        return cijena;
	    }

	 @Override
	 public String toString() {
		return "Racunari [procesor=" + procesor + ", memorija=" + memorija + ", opis=" + opis + ", sifraProizvoda="
				+ sifraProizvoda + ", uvoznaCijena=" + uvoznaCijena + ", getProcesor()=" + getProcesor()
				+ ", getMemorija()=" + getMemorija() + ", obracunajMaloprodajnuCijenu()="
				+ obracunajMaloprodajnuCijenu() + ", getOpis()=" + getOpis() + ", getSifraProizvoda()="
				+ getSifraProizvoda() + ", getUvoznaCijena()=" + getUvoznaCijena() + ", getTip()=" + getTip()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	 }

	 
	
}
