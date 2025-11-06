/*) Kreirati klasu GPSPrijemnik koja će kao podatke članove imati: nazivPrijemnika (string),
serijskiBroj (string), latitude (realni broj), longitude (realni broj) i altitude (nadmorska visina, realni
broj). Klasa treba da posjeduje odgovarajuće konstruktore, inspektore i mutatore, kao i:
a. statičku metodu koja će u nizu GPS prijemnika pronaći prijemnik specificiranog serijskog broja
(serijski broj je jedan od argumenata metode); metoda vraća pronađeni prijemnik;
b. statičku metodu koja iz niza GPS prijemnika izdvaja one koji se nalaze u specificiranom opsegu
nadmorske visine (opseg se definiše minimalnom i maksimalnom nadmorskom visinom).
Kreirati testnu klasu GPSTest u čijoj funkciji main ćete učitati niz GPS prijemnika i demonstrirati
upotrebu svih metoda klase.*/
import java.util.ArrayList;
public class GPSPrijemnik {
	//atributi
	private String nazivPrijemnika;
	private String serijskiBroj;
	private  double latitude;
	private double longitude;
	private double altitude;
	
	public GPSPrijemnik(String nazivPrijemnika, String serijskiBroj, double latitude, double longitude, double altitude) {
		this.nazivPrijemnika=nazivPrijemnika;
		this.serijskiBroj=serijskiBroj;
		this.latitude=latitude;
		this.longitude=longitude;
		this.altitude=altitude;
		
		
	}
	
	public String getNazivPrijemnika() {
		return nazivPrijemnika;
	}
	public String getSerijskiBroj() {
		return serijskiBroj;
	}
	public double getLatitude() {
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public double getAltitude() {
		return altitude;
	}
	public void setNazivPrijemnika(String nazivPrijemnika) {
		this.nazivPrijemnika = nazivPrijemnika;
	}
	public void setSerijskiBroj(String serijskiBroj) {
		this.serijskiBroj = serijskiBroj;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	// statičku metodu koja će u nizu GPS prijemnika pronaći prijemnik specificiranog serijskog broja
	//(serijski broj je jedan od argumenata metode); metoda vraća pronađeni prijemnik;
	 public static GPSPrijemnik pronadjiPoSerijskom(ArrayList<GPSPrijemnik> lista, String trazeniBroj) {
	        for (GPSPrijemnik gps : lista) {
	            if (gps.getSerijskiBroj().equalsIgnoreCase(trazeniBroj)) {
	                return gps;
	            }
	        }
	        return null; 
	    }
	 public static ArrayList<GPSPrijemnik> filtrirajPoAltitude(ArrayList<GPSPrijemnik> lista, double minAltitude, double maxAltitude) {
	        ArrayList<GPSPrijemnik> rezultat = new ArrayList<>();
	        for (GPSPrijemnik gps : lista) {
	            if (gps.getAltitude() >= minAltitude && gps.getAltitude() <= maxAltitude) {
	                rezultat.add(gps);
	            }
	        }
	        return rezultat;
	    }

	    @Override
	    public String toString() {
	        return nazivPrijemnika + " (" + serijskiBroj + "), Lat: " + latitude + ", Lon: " + longitude + ", Alt: " + altitude;
	    }
}
