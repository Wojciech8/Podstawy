package podstawy;

import java.util.Scanner;

public class Poradnikdietetyczny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int wiek = scanner.nextInt();
        if (wiek < 0 || wiek > 150) {
            System.out.println("Nie wyświetlamy absurdalnych wartości");

        return;
        }
        System.out.println("Poadaj swój wzrost w cm");
        int wzrost = scanner.nextInt();
        if (wzrost < 50 || wzrost > 300) {
            System.out.println("Nie wyświetlamy absurdalnych wartości");
            return;
        }
        System.out.println("Podaj swoją wagę w kilogramach");
        int waga = scanner.nextInt();
        if (waga < 30 || waga > 600) {
            System.out.println("Nie wyświetlamy absurdalnych wartości");
            return;
        }
        if (wiek > 100) {
            System.out.println("Nie udzielamy porad ludziom starszym powyżej 100 lat");
            return;
        }
        if (wiek <= 18) {
            System.out.println("Porady dla nieletnich są opatrzone specjalną klauzulą");
            System.out.println("Porady dla nieletnich udzielamy tylko za zgodą rodziców");
            return;
        }
        if (wiek == 14 && waga > 100 ) {
            System.out.println("OSTRZEŻENIE dla 14 skontaktuj się ze swoim lekarzem pilnie ");
            return;
        }
        if (wiek <= 14 && waga < 40 && wzrost > 100) {
            System.out.println("Ostrzeżenie o anoreksji");
            return;
        }
        if (waga > 100 && wzrost > 200) {
            System.out.println("Waga jest uzasadniona");
            return;
        }
    }
}





