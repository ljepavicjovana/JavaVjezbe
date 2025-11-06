import java.util.Scanner;
import java.util.Random;

public class RandomNiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Unesite dužinu niza: ");
        int n = sc.nextInt();

        int[] niz = new int[n];

        
        for (int i = 0; i < n; i++) {
            niz[i] = rand.nextInt(10) + 1;
        }

        System.out.print("Originalni niz: ");
        for (int x : niz) {
            System.out.print(x + " ");
        }

        double[] noviNiz = new double[n]; 

        for (int i = 0; i < n; i++) {
            if (niz[i] % 2 == 0) {
                noviNiz[i] = -1 * niz[i];
            } else {
                noviNiz[i] = 1.0 / niz[i];
            }
        }

        System.out.print("\nIzmijenjeni niz: ");
        for (double x : noviNiz) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
