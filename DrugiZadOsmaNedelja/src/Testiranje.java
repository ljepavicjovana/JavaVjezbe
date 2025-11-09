import java.util.Arrays;

public class Testiranje {
    public static void main(String[] args) {
        Restoran restoran = new Restoran("Restoran1", "Ulica 1", "123456789");

        
        Konobar k1 = new Konobar("K1", "Marko", "Markovic", 10, 0, 5);
        Kuvar ku1 = new Kuvar("KU1", "Ivana", "Ivanovic", 12, 0);
        Menadzer m1 = new Menadzer("M1", "Petar", "Petrovic", 15, 0, 200);
        Konobar k2 = new Konobar("K2", "Ana", "Anic", 9, 0, 2);
        Kuvar ku2 = new Kuvar("KU2", "Milan", "Milic", 11, 0);

        restoran.dodajZaposlenog(k1);
        restoran.dodajZaposlenog(ku1);
        restoran.dodajZaposlenog(m1);
        restoran.dodajZaposlenog(k2);
        restoran.dodajZaposlenog(ku2);

        Smjene s1 = new Smjene("2025-11-01", 9, 17, "jutarnja", Arrays.asList(k1, ku1, m1));
        Smjene s2 = new Smjene("2025-11-01", 17, 21, "popodnevna", Arrays.asList(k1, k2, ku2));

        s1.dodajSateZaposlenima();
        s2.dodajSateZaposlenima();

        
        System.out.printf("%-3s %-10s %-10s %-12s %-5s %-20s %-10s%n",
                "ID", "Ime", "Prezime", "Tip", "Sati", "Dodatak/Bonus", "Plata(EUR)");

        double ukupno = 0;
        for (Zaposleni z : restoran.zaposleni) {
            ObracunPlate obracun = new ObracunPlate(z, 11, 2025);
            obracun.ispisi();
            ukupno += obracun.getIznosPlate();
        }

        System.out.println("Ukupan trosak plata: " + ukupno + " EUR");
    }
}
