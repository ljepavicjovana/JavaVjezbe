import java.util.ArrayList;
public class PrvaArrayList {

	public static void main(String[] args) {
		ArrayList<String> imena = new ArrayList<>();

        //  Dodavanje elemenata
        imena.add("Ana");
        imena.add("Marko");
        imena.add("Petar");

        //  Ispis cijele liste
        System.out.println("Trenutna lista: " + imena);

        //  Pristup elementima po indeksu
        System.out.println("Prvo ime u listi: " + imena.get(0));

        // 5️⃣ Provjera da li lista sadrži neko ime
        if (imena.contains("Ana")) {
            System.out.println("Ana se nalazi u listi!");
        }

        //  Brisanje elementa
        imena.remove("Marko");
        System.out.println("Poslije brisanja: " + imena);

        //  Broj elemenata u listi
        System.out.println("Broj imena u listi: " + imena.size());

	}

}
