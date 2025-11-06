import java.util.ArrayList;

public class GPSTest {

	public static void main(String[] args) {
		ArrayList<GPSPrijemnik> lista = new ArrayList<>();

        lista.add(new GPSPrijemnik("Garmin 1", "SN001", 45.8150, 15.9819, 120));
        lista.add(new GPSPrijemnik("Garmin 2", "SN002", 44.8176, 15.8790, 150));
        lista.add(new GPSPrijemnik("Garmin 3", "SN003", 46.0569, 14.5058, 90));
        lista.add(new GPSPrijemnik("Garmin 4", "SN004", 43.5081, 16.4390, 200));

        // Test pronalaska po serijskom broju
        GPSPrijemnik pronadjen = GPSPrijemnik.pronadjiPoSerijskom(lista, "SN003");
        System.out.println("Pronađen GPS: " + pronadjen);

        // Test filtriranja po nadmorskoj visini
        ArrayList<GPSPrijemnik> filtrirani = GPSPrijemnik.filtrirajPoAltitude(lista, 100, 160);
        System.out.println("\nGPS prijemnici sa nadmorskom visinom između 100 i 160:");
        for (GPSPrijemnik gps : filtrirani) {
            System.out.println(gps);
        }

	}

}
