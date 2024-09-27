package aplikacjaWydatki;

import java.time.LocalDate;
import java.util.Scanner;

public class ControllerWydatki {

   private ServiceWydatki serviceWydatki = new ServiceWydatki();
    public void wprowadzWydatek(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz rodzaj wydatku");
        String rodzajWydatku = scanner.nextLine();;
        System.out.println("Wpisz kwotę wydatku");
        Double kwotaWydatku = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Wpisz datę rok - miesiąc -  dzień");
        String dataString = scanner.nextLine();
        LocalDate dataWydatku = LocalDate.parse(dataString);
        Wydatek wydatek = new Wydatek(rodzajWydatku,kwotaWydatku,dataWydatku);
        System.out.println("Twoja ilość wydatków to " + wydatek);

        serviceWydatki.zapiszWydatek(wydatek);
        System.out.println(serviceWydatki);

    }

    public void wprowadzWydatki(){
        do {
            wprowadzWydatek();
        } while (true);
    }




}
