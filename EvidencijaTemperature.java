
public class EvidencijaTemperature {
	private double[] temperature;
	private String datum;
	
	public EvidencijaTemperature( double[] temperature, String datum) {
		this.temperature=temperature;
		this.datum=datum;
	}
	public EvidencijaTemperature() {
		temperature=new double[0];
		datum=" ";
		
	}
	public double[] getTemperature() {
		return temperature;
	}
	public String getDatum() {
		return datum;
	}
	public void setTemperature(double[] temperature) {
		this.temperature = temperature;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	
	public static double prosjecnaTemperatura(double[] temperatura ) {
		double zbir = 0;
		int brojTemp=temperatura.length;
		for(int i = 0; i<brojTemp;i++) {
			zbir += temperatura[i];
			
		}
		return (zbir/brojTemp);
	}
}
