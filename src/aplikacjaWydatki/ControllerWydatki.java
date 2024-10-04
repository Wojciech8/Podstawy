package aplikacjaWydatki;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerWydatki {

    private ServiceWydatki serviceWydatki = new ServiceWydatki();

    public void uruchomMenu() {
        Scanner scanner = new Scanner(System.in);
        int wybor;
        System.out.println("Podaj co chcesz zrobić");
        do {
            System.out.println("1 wprowadź wydatek,  2 pokaż wydatki  kwotę,  3 zakończ program");
            wybor = scanner.nextInt();
            switch (wybor) {
                case 1:
                    wprowadzWydatek();
                case 2:
                    System.out.println("Wyświetla wydatki");
                    ArrayList<Wydatek> wszystkieWydatki = serviceWydatki.getWydatki();
                    for (Wydatek wydatek : wszystkieWydatki) {
                        System.out.println(wydatek);
                    }
            }
        } while (wybor != 3);
        System.out.println("Program zakończony");
    }


    public void wprowadzWydatek() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz rodzaj wydatku");
        String rodzajWydatku = scanner.nextLine();
        ;
        System.out.println("Wpisz kwotę wydatku");
        Double kwotaWydatku = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Wpisz datę rok - miesiąc -  dzień");
        String dataString = scanner.nextLine();
        LocalDate dataWydatku = LocalDate.parse(dataString);
        Wydatek wydatek = new Wydatek(rodzajWydatku, kwotaWydatku, dataWydatku);


        serviceWydatki.zapiszWydatek(wydatek);
    }


}
