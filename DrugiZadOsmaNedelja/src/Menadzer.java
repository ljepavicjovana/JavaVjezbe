
 class Menadzer extends Zaposleni{
	private static final double osnovica = 1300;
    private double bonus;
public Menadzer(String jedinstveniID, String ime, String prezime, double satnica, double ukupnoSati, double bonuss) {
	super(jedinstveniID, ime, prezime, satnica, ukupnoSati);
	bonus = bonuss;
}
@Override
public double izracunajPlatu() {
    return osnovica + 4 * ukupnoSati * satnica + bonus;
}
@Override
public String toString() {
	return "Menadzer [bonus=" + bonus + ", jedinstveniID=" + jedinstveniID + ", ime=" + ime + ", prezime=" + prezime
			+ ", satnica=" + satnica + ", ukupnoSati=" + ukupnoSati + "]";
}
}
