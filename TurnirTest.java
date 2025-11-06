import java.util.Scanner;

public class TurnirTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Turnir turnir = new Turnir("Šahovski turnir", 3);

        turnir.dodajIgraca("Marko");
        turnir.dodajIgraca("Ana");
        turnir.dodajIgraca("Ivan");
        turnir.dodajIgraca("Maja");

        System.out.println("Igrači na turniru:");
        for (Turnir.Igrac igrac : turnir.getListaIgraca()) {
            System.out.println(igrac);
        }

        System.out.println("\n--- Simulacija rundi ---");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("\nRunda " + (i + 1) + ":");
            turnir.pokreniRundu();
        }

        
        System.out.println("\n--- Najbolji igrač ---");
        turnir.prikaziNajboljegIgraca();

       
        System.out.print("\nUnesi ime igrača za brisanje: ");
        String imeZaBrisanje = sc.nextLine();
        turnir.obrisiIgraca(imeZaBrisanje);

        System.out.println("\nIgrači nakon brisanja:");
        for (Turnir.Igrac igrac : turnir.getListaIgraca()) {
            System.out.println(igrac);
        }

        sc.close();
    }
}
