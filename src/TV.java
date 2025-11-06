
 class TV extends EProizvodi {
	 //TV, atribut: veličina ekrana
	 private double velicinaEkrana;

	 public TV(String opis, String sifraProizvoda, double uvoznaCijena, double velicinaEkrana) {
		super(opis, sifraProizvoda, uvoznaCijena);
		this.velicinaEkrana=velicinaEkrana;
		
	 }

	 public double getVelicinaEkrana() {
		 return velicinaEkrana;
	 }

	 public void setVelicinaEkrana(double velicinaEkrana) {
		 this.velicinaEkrana = velicinaEkrana;
	 }
	 @Override
	    public double obracunajMaloprodajnuCijenu() {
	        double cijena = super.obracunajMaloprodajnuCijenu();
	        if (velicinaEkrana > 65) {
	            cijena *= 1.10; 
	        }
	        return cijena;
	    }

	 @Override
	 public String toString() {
		return "TV [velicinaEkrana=" + velicinaEkrana + ", getVelicinaEkrana()=" + getVelicinaEkrana()
				+ ", obracunajMaloprodajnuCijenu()=" + obracunajMaloprodajnuCijenu() + ", getOpis()=" + getOpis()
				+ ", getSifraProizvoda()=" + getSifraProizvoda() + ", getUvoznaCijena()=" + getUvoznaCijena()
				+ ", getTip()=" + getTip() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	 }

	
	 
	 
}
