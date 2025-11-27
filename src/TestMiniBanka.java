import java.util.Scanner;
public class TestMiniBanka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//neka bude pocetno stanje 1000 eura na racunu
		MiniBanka banka = new MiniBanka(1000); 

        while (true) {
            System.out.println("\nOdaberite opciju:");
            System.out.println("1. Prikaži stanje");
            System.out.println("2. Uplata");
            System.out.println("3. Isplata");
            System.out.println("4. Izlaz");

            int opcija = sc.nextInt();

            switch (opcija) {
                case 1:
                    banka.prikaziStanje();
                    break;
                case 2:
                    System.out.print("Unesite iznos za uplatu: ");
                    double uplata = sc.nextDouble();
                    banka.uplata(uplata);
                    break;
                case 3:
                    System.out.print("Unesite iznos za isplatu: ");
                    double isplata = sc.nextDouble();
                    banka.isplata(isplata);
                    break;
                case 4:
                    System.out.println("Hvala što koristite Mini Banku!");
                    sc.close();
                    return;
                default:
                    System.out.println("Nepoznata opcija!");
            }
        }
    }

	}


