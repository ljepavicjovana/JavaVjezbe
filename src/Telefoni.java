
 class Telefoni extends EProizvodi {
//Telefoni, atribut: operativni sistem, veličina ekrana
	private String operativniSistem;
	private double velicinaEkrana;
	
	public Telefoni(String opis, String sifraProizvoda, double uvoznaCijena, String op, double velicina) {
		super(opis, sifraProizvoda, uvoznaCijena);
		operativniSistem = op;
		velicinaEkrana = velicina;
	}

	public String getOperativniSistem() {
		return operativniSistem;
	}

	public double getVelicinaEkrana() {
		return velicinaEkrana;
	}

	public void setOperativniSistem(String operativniSistem) {
		this.operativniSistem = operativniSistem;
	}

	public void setVelicinaEkrana(double velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}
	
	@Override
    public double obracunajMaloprodajnuCijenu() {
        double cijena = super.obracunajMaloprodajnuCijenu(); 
        if (velicinaEkrana > 6) {
            cijena *= 1.03; 
        }
        return cijena;
    }

	@Override
	public String toString() {
		return "Telefoni [operativniSistem=" + operativniSistem + ", velicinaEkrana=" + velicinaEkrana + ", opis="
				+ opis + ", sifraProizvoda=" + sifraProizvoda + ", uvoznaCijena=" + uvoznaCijena
				+ ", getOperativniSistem()=" + getOperativniSistem() + ", getVelicinaEkrana()=" + getVelicinaEkrana()
				+ ", obracunajMaloprodajnuCijenu()=" + obracunajMaloprodajnuCijenu() + ", getOpis()=" + getOpis()
				+ ", getSifraProizvoda()=" + getSifraProizvoda() + ", getUvoznaCijena()=" + getUvoznaCijena()
				+ ", getTip()=" + getTip() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	
	
}
