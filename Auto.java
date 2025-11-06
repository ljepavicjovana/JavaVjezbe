import java.util.ArrayList;
public class Auto {
	/*: markaAuta, godišteAuta, snagaMotora, prodato (da/ne),
	kubikažaMotora, registrovan(da/ne).*/
	private String markaAuta;
	private int godisteAuta;
	private int snagaMotora;
	private boolean prodato;
	private int kubikazaMotora;
	private boolean registrovan;
	//ovo se pise ovdje jer se odnosi na sve iz klase Auto
	private static int brojProdatihAuta = 0;
	
	//. Kreirati konstruktorsku metodu koristeći se this referencom.
	public Auto(String markaAuta,int godisteAuta, int snagaMotora, boolean prodato, int kubikazaMotora, boolean registrovan) {
		this.markaAuta=markaAuta;
		this.snagaMotora=snagaMotora;
		this.prodato=prodato;
		this.kubikazaMotora=kubikazaMotora;
		this.godisteAuta=godisteAuta;
		/*Kreirati i statički
		atribut klase koji prati koliko ima prodatih auta*/
		
		if(prodato) {
			brojProdatihAuta++;
		}
		
		//Ukoliko je godište auta starije od 1985.godine, auto se ne može registrovati, stoga prilikom pozivanja konstruktorske metode treba povesti računa o atributu
		//registrovan.
		if(godisteAuta<1985) {
			this.registrovan=false;	
		}else {
			this.registrovan=registrovan;
		}
	}
	
	//. Kreirati odgovarajuće getere i setere

	

	public String getMarkaAuta() {
		return markaAuta;
	}


	public int getSnagaMotora() {
		return snagaMotora;
	}


	public boolean isProdato() {
		return prodato;
	}


	public int getKubikazaMotora() {
		return kubikazaMotora;
	}


	public boolean isRegistrovan() {
		return registrovan;
	}


	public void setMarkaAuta(String markaAuta) {
		this.markaAuta = markaAuta;
	}


	public void setSnagaMotora(int snagaMotora) {
		this.snagaMotora = snagaMotora;
	}


	public void setProdato(boolean prodato) {
		this.prodato = prodato;
	}


	public void setKubikazaMotora(int kubikazaMotora) {
		this.kubikazaMotora = kubikazaMotora;
	}

//da bismo sigurni bili uslov pisemo i u settere.
	public void setRegistrovan(boolean registrovan) {
		if(godisteAuta<1985) {
			this.registrovan=false;
		}else {
			this.registrovan = registrovan;
		}
		
	}
	//Precrtati (@override) toString metodu koja štampa objekat klase Auto, formatirati po želji.
	@Override
	public String toString() {
		return "Auto [markaAuta=" + markaAuta + ", godisteAuta=" + godisteAuta + ", snagaMotora=" + snagaMotora
				+ ", prodato=" + prodato + ", kubikazaMotora=" + kubikazaMotora + ", registrovan=" + registrovan + "]";
	}
	
	//Kreirati statičku metodu kojom se računa iznos registracije svih auta, ukoliko se
	//auto može registrovati. Neka formula za računanje iznosa registracije bude:
		//koeficijentGodišta*kubikaža*snagaMotora, gdje je koeficijent godišta predstavljen u sledećoj tabeli:
	public double izracunajRegistraciju() {
	    double koef;

	    if (godisteAuta >= 1985 && godisteAuta <= 2000)
	        koef = 3.0;
	    else if (godisteAuta <= 2010)
	        koef = 2.0;
	    else
	        koef = 1.5;

	    return koef * kubikazaMotora * snagaMotora;
	}
//ukupna registracija
	public static double ukupnaRegistracija(ArrayList<Auto> listaAuta) {
	    double ukupno = 0;

	    for (Auto a : listaAuta) {
	        if (a.registrovan) { // ili a.isRegistrovan()
	            ukupno += a.izracunajRegistraciju();
	        }
	    }

	    return ukupno;
	}


}

