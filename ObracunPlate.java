
	public class ObracunPlate {
	    private Zaposleni zaposleni;
	    private int mjesec;
	    private int godina;
	    private double iznosPlate;
	    private String napomena;

	    public ObracunPlate(Zaposleni zaposleni, int mjesec, int godina) {
	        this.zaposleni = zaposleni;
	        this.mjesec = mjesec;
	        this.godina = godina;
	        this.iznosPlate = zaposleni.izracunajPlatu();
	        this.napomena = zaposleni.dodatniPodaci();
	    }
	    

	    public Zaposleni getZaposleni() {
			return zaposleni;
		}


		public int getMjesec() {
			return mjesec;
		}


		public int getGodina() {
			return godina;
		}


		public String getNapomena() {
			return napomena;
		}


		public void setZaposleni(Zaposleni zaposleni) {
			this.zaposleni = zaposleni;
		}


		public void setMjesec(int mjesec) {
			this.mjesec = mjesec;
		}


		public void setGodina(int godina) {
			this.godina = godina;
		}


		public void setIznosPlate(double iznosPlate) {
			this.iznosPlate = iznosPlate;
		}


		public void setNapomena(String napomena) {
			this.napomena = napomena;
		}


		public void ispisi() {
	        System.out.printf("%-3s %-10s %-10s %-12s %-5.1f %-20s %-10.2f EUR%n",
	            zaposleni.getJedinstveniID(),
	            zaposleni.getIme(),
	            zaposleni.getPrezime(),
	            zaposleni.getClass().getSimpleName(),
	            zaposleni.getUkupnoSati(),
	            napomena,
	            iznosPlate);
	    }

	    public double getIznosPlate() { return iznosPlate; }
	}


