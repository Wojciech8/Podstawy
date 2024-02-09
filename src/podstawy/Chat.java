package podstawy;

import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Zapytaj użytkownika o preferencje
        System.out.println("Czy wolisz programować, grać w gry, czy jedno i drugie?");
        System.out.println("1 - Programowanie");
        System.out.println("2 - Gry");
        System.out.println("3 - Jedno i drugie");
        System.out.print("Wybierz odpowiedni numer: ");
        int choice = scanner.nextInt();
        // Sprawdź wybór użytkownika
        if (choice == 1) {
            // Wybrano programowanie
            System.out.print("Podaj ulubiony język programowania: ");
            String programmingLanguage = scanner.next();
            // Wygeneruj komunikat
            System.out.println("Lubisz programować w języku " + programmingLanguage);
        } else if (choice == 2) {
            // Wybrano gry
            System.out.print("Podaj ulubioną grę: ");
            String favoriteGame = scanner.next();
            // Wygeneruj komunikat
            System.out.println("Lubisz grać w " + favoriteGame);
        } else if (choice == 3) {
            // Wybrano jedno i drugie
            System.out.print("Podaj ulubiony język programowania: ");
            String programmingLanguage = scanner.next();
            System.out.print("Podaj ulubioną grę: ");
            String favoriteGame = scanner.next();
            // Wygeneruj komunikat
            System.out.println("Lubisz programować w języku " + programmingLanguage + " i grać w " + favoriteGame);
        } else {
            // Nieprawidłowy wybór
            System.out.println("Nieprawidłowy wybór.");        }
         scanner.close();
    }
}
