import java.util.Scanner;
import java.util.ArrayList;

public class ProbaZadatak {

    public static void main(String[] args) {
        EProizvodi r1 = new Racunari("Gaming laptop", "RA001", 1000, "Intel i7", 16);
        EProizvodi t1 = new Telefoni("Smartphone", "TE002", 500, "Android", 6.5);
        EProizvodi tv1 = new TV("Smart TV", "TV003", 800, 70);

        System.out.println("Racunari maloprodajna cijena: " + r1.obracunajMaloprodajnuCijenu());
        System.out.println("Telefon maloprodajna cijena: " + t1.obracunajMaloprodajnuCijenu());
        System.out.printf("TV maloprodajna cijena: %.2f\n", tv1.obracunajMaloprodajnuCijenu());

        Scanner sc = new Scanner(System.in);
        ArrayList<EProizvodi> proizvodi = new ArrayList<>();
        int izbor;

        do {
            System.out.println("\n--- MENI ---");
            System.out.println("1. Unos uređaja");
            System.out.println("2. Prikaz svih uređaja");
            System.out.println("3. Prikaz uređaja određenog tipa");
            System.out.println("0. Izlaz");
            System.out.print("Izbor: ");
            izbor = sc.nextInt();
            sc.nextLine(); 

            if (izbor == 1) {
                System.out.print("Opis: ");
                String opis = sc.nextLine();
                System.out.print("Šifra (RA/TE/TV): ");
                String sifra = sc.nextLine().toUpperCase();
                System.out.print("Uvozna cijena: ");
                double cijena = sc.nextDouble();
                sc.nextLine();

                if (sifra.startsWith("RA")) {
                    System.out.print("Procesor: ");
                    String proc = sc.nextLine();
                    System.out.print("Memorija (GB): ");
                    int mem = sc.nextInt();                 
                    proizvodi.add(new Racunari(opis, sifra, cijena, proc, mem));
                    sc.nextLine();
                } 
                else if (sifra.startsWith("TE")) {
                    System.out.print("\nOperativni sistem: ");
                    String op = sc.nextLine();
                    System.out.print("Velicina ekrana: ");
                    double velicinaEkrana = sc.nextDouble();                 
                    proizvodi.add(new Telefoni(opis, sifra, cijena, op, velicinaEkrana));
                    sc.nextLine();
                } 
                else if (sifra.startsWith("TV")) {
                    System.out.print("\nVelicina ekrana: ");
                    double velicinaEkrana = sc.nextDouble();
                    proizvodi.add(new TV(opis, sifra, cijena, velicinaEkrana));
                    sc.nextLine();
                } 
                else {
                    System.out.println("Nepoznata šifra!");
                }
            }

            else if (izbor == 2) {
                if (proizvodi.isEmpty()) {
                    System.out.println("Lista je prazna, odnosno nema proizvoda!");
                } else {
                    for (EProizvodi e : proizvodi) {
                        System.out.println(e + " | Maloprodajna cijena: " + e.obracunajMaloprodajnuCijenu());
                    }
                }
            }

            else if (izbor == 3) {
                System.out.println("Odaberite tip: 1 - Računari | 2 - Telefoni | 3 - TV");
                int tip = sc.nextInt();
                System.out.println("\n--- ODABRANI UREĐAJI ---");

                for (EProizvodi p : proizvodi) {
                    if (tip == 1 && p instanceof Racunari)
                        System.out.println(p + " | Cijena: " + p.obracunajMaloprodajnuCijenu());
                    else if (tip == 2 && p instanceof Telefoni)
                        System.out.println(p + " | Cijena: " + p.obracunajMaloprodajnuCijenu());
                    else if (tip == 3 && p instanceof TV)
                        System.out.println(p + " | Cijena: " + p.obracunajMaloprodajnuCijenu());
                }
            }

        } while (izbor != 0);

        System.out.println("Kraj programa.");
        sc.close();
    }
}
