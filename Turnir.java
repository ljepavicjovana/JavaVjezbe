/*Napisati klasu Turnir koja se sastoji od sljedećih atributa: nazivTurnira (string),
listaIgrača (niz parova oblika [ime, brojBodova], par kao niz od 2 elementa),
brojRundi (integer). Potrebno je implementirati sljedeće funkcionalnosti:
a. Konstruktor klase Turnir koji postavlja početne vrijednosti atributa
nazivTurnira, listaIgrača, brojIgrača i brojRundi. Atribut listaIgrača treba
da bude prazna lista.
b. Getteri i setteri za sve atribute klase. Obratiti pažnju na ograničenja
atributa brojRundi čija vrijednost je veća od 0, a manja od 10.
c. Metod dodajIgrača sa parametrom imeIgrača koja dodaje novog igrača
(par) u listu/niz igrača turnira tako da je brojBodova inicijalno 0.
d. Metod obrišiIgrača sa parametrom imeIgrača kojom se briše igrač na
osnovu unesenog imena.
e. Metod pokreniRundu koja simulira odigravanje jedne runde između dva
igrača. Funkcija treba da prikaže ishod runde i par igrača u jednoj
rudni. Na kraju treba uvećati broj odigranih rundi za 1. Za rudnu se
nasumično iz liste/niza igrača biraju 2 igrača. U jednoj rundi igrač koji
ima više bodova pobjeđuje sa vjerovatnoćom od 60% u odnosu na
protivnika. Napomena: importovati Random iz util paketa. Nakon toga:
Random random = new Random();
int randomNumber = random.nextInt(10) + 1;//ovo ce generisati
random broj izmedju 1 i 10.
f. Metod prikaziNajboljegIgrača koja prikazuje ime igrača koji je na putu
da osvoji turnir. To je igrač sa najvećim brojem bodova.
g. Metod prikaziNajboljegIgrača koja prikazuje ime igrača koji je na putu
da osvoji turnir. To je igrač sa najvećim brojem bodova*/
import java.util.ArrayList;
import java.util.Random;

public class Turnir {

    private String nazivTurnira;
    private ArrayList<Igrac> listaIgraca;
    private int brojRundi;

    
    public Turnir(String nazivTurnira, int brojRundi) {
        this.nazivTurnira = nazivTurnira;
        setBrojRundi(brojRundi); // svakako cu imati u setter za brojRundi uslov da je izmedju 1 i 9 
        this.listaIgraca = new ArrayList<>();
    }

    
    public String getNazivTurnira() {
        return nazivTurnira;
    }

    public void setNazivTurnira(String nazivTurnira) {
        this.nazivTurnira = nazivTurnira;
    }

    public ArrayList<Igrac> getListaIgraca() {
        return listaIgraca;
    }

    public int getBrojRundi() {
        return brojRundi;
    }

    public void setBrojRundi(int brojRundi) {
        if (brojRundi > 0 && brojRundi < 10) {
            this.brojRundi = brojRundi;
        } else {
            System.out.println("Broj rundi mora biti između 1 i 9!");
            this.brojRundi = 1; 
        }
    }

   
    public void dodajIgraca(String imeIgraca) {
        listaIgraca.add(new Igrac(imeIgraca));
    }

   
    public void obrisiIgraca(String imeIgraca) {
        listaIgraca.removeIf(igrac -> igrac.getIme().equalsIgnoreCase(imeIgraca));
    }

    
    public void pokreniRundu() {
        if (listaIgraca.size() < 2) {
            System.out.println("Nema dovoljno igrača za odigrati rundu!");
            return;
        }

        Random random = new Random();
        int index1 = random.nextInt(listaIgraca.size());
        int index2;
        do {
            index2 = random.nextInt(listaIgraca.size());
        } while (index2 == index1);

        Igrac igrac1 = listaIgraca.get(index1);
        Igrac igrac2 = listaIgraca.get(index2);

        // Određivanje pobjednika sa 60% šanse za igrača sa više bodova
        int pobjednik = random.nextInt(100); // 0-99
        if (igrac1.getBrojBodova() >= igrac2.getBrojBodova()) {
            if (pobjednik < 60) {
                igrac1.setBrojBodova(igrac1.getBrojBodova() + 1);
                System.out.println(igrac1.getIme() + " pobjeđuje protiv " + igrac2.getIme());
            } else {
                igrac2.setBrojBodova(igrac2.getBrojBodova() + 1);
                System.out.println(igrac2.getIme() + " pobjeđuje protiv " + igrac1.getIme());
            }
        } else {
            if (pobjednik < 60) {
                igrac2.setBrojBodova(igrac2.getBrojBodova() + 1);
                System.out.println(igrac2.getIme() + " pobjeđuje protiv " + igrac1.getIme());
            } else {
                igrac1.setBrojBodova(igrac1.getBrojBodova() + 1);
                System.out.println(igrac1.getIme() + " pobjeđuje protiv " + igrac2.getIme());
            }
        }

        brojRundi++; 
    }

    
    public void prikaziNajboljegIgraca() {
        if (listaIgraca.isEmpty()) {
            System.out.println("Nema igrača na turniru.");
            return;
        }

        Igrac najbolji = listaIgraca.get(0);
        for (Igrac igrac : listaIgraca) {
            if (igrac.getBrojBodova() > najbolji.getBrojBodova()) {
                najbolji = igrac;
            }
        }
        System.out.println("Najbolji igrač: " + najbolji.getIme() + " sa " + najbolji.getBrojBodova() + " bodova");
    }

   
    public class Igrac {
        private String ime;
        private int brojBodova;

        public Igrac(String ime) {
            this.ime = ime;
            this.brojBodova = 0;
        }

        public String getIme() {
            return ime;
        }

        public int getBrojBodova() {
            return brojBodova;
        }

        public void setBrojBodova(int brojBodova) {
            this.brojBodova = brojBodova;
        }

        @Override
        public String toString() {
            return ime + " (" + brojBodova + " bodova)";
        }
    }
}
