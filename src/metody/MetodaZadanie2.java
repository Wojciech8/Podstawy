package metody;

import java.util.Random;
import java.util.Scanner;

public class MetodaZadanie2 {
    public static void main(String[] args) {
        System.out.println("Podaj swoją ulubioną liczbę");
        ulubionaLiczba();
        System.out.println("Podaj trzy liczby ja dodam je do sibie i podam wynik");
        sumaLiczbb();
        System.out.println("Teraz wylosuje liczbę od 1-10");
        losowanieLiczby();
        System.out.println("Podaj mi dwie liczby podzielę pierwszą przez drugą");
        dzielenie();
        System.out.println("Podaj mi Rok miesiąc i dzień ja go wyświetlę");
        data();
        takiesame();

    }

    static void ulubionaLiczba() {
        Scanner scaner = new Scanner(System.in);
        int liczba = scaner.nextInt();
        System.out.println("Twoja ulubiona liczba to : " + liczba);
    }

    static void sumaLiczbb() {
        Scanner scaner = new Scanner(System.in);
        int liczba1 = scaner.nextInt();
        int liczba2 = scaner.nextInt();
        int liczba3 = scaner.nextInt();
        int suma = liczba1 + liczba2 + liczba3;
        System.out.println("Suma twoich liczb to : " + suma);

    }

    static void losowanieLiczby() {
        Random losowanie = new Random();
        int liczba = losowanie.nextInt(1, 11);
        System.out.println("Wylosowana liczba to :" + liczba);
    }

    static void dzielenie() {
        Scanner scanner = new Scanner(System.in);
        double liczba1 = scanner.nextInt();
        double liczba2 = scanner.nextInt();
        double wynik = liczba1 / liczba2;
        if (liczba2 == 0) {
            System.out.println("Błąd -1");
        }
        System.out.println("Wynik dzielenia to :" + wynik);
    }

    static void data() {
        Scanner scaner = new Scanner(System.in);
        int rok = scaner.nextInt();
        int miesiac = scaner.nextInt();
        int dzien = scaner.nextInt();
        System.out.println(rok + " rok " + miesiac + " mieiąc " + dzien + " dzień");
    }

    static void takiesame () {
        int liczba1 = 5;
        int liczba2 = 5;
        int liczba3 = 5;
        if (czyWszystkieIdentyczne(liczba1, liczba2,liczba3)) {
            System.out.println("Takie same");
        } else {
            System.out.println("Inne");
        }
    }

     static boolean czyWszystkieIdentyczne(int liczba1, int liczba2, int liczba3) {
        return liczba1 == liczba2 && liczba2 == liczba3;
    }
}
