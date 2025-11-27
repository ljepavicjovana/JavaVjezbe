
public class MiniBanka {
	private double stanje;

    public MiniBanka(double pocetnoStanje) {
        this.stanje = pocetnoStanje;
    }

    public void prikaziStanje() {
        System.out.println("Trenutno stanje: " + stanje + " EUR ");
    }

    public void uplata(double iznos) {
        if (iznos > 0) {
            stanje += iznos;
            System.out.println("Uplaćeno: " + iznos + " EUR ");
        } else {
            System.out.println("Nevažeći iznos!");
        }
    }

    public void isplata(double iznos) {
        if (iznos > 0 && iznos <= stanje) {
            stanje -= iznos;
            System.out.println("Isplaćeno: " + iznos + " EUR ");
        } else {
            System.out.println("Nevažeći iznos ili nema dovoljno sredstava!");
        }
    }

}
