
 class Kuvar extends Zaposleni {
	 private static final double fiksniDodatak = 1500;
		public Kuvar(String jedinstveniID, String ime, String prezime, double satnica, double ukupnoSati) {
			super(jedinstveniID, ime, prezime, satnica, ukupnoSati);
			
		}
		 @Override
		    public double izracunajPlatu() {
		        double sedmicnaPlata = ukupnoSati * satnica;
		      
		        return fiksniDodatak + 4 * sedmicnaPlata ;
		    }
		 @Override
		 public String toString() {
			return "Kuvar [jedinstveniID=" + jedinstveniID + ", ime=" + ime + ", prezime=" + prezime + ", satnica="
					+ satnica + ", ukupnoSati=" + ukupnoSati + "]";
		 }
}
