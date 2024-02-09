package metody;

import java.util.Random;
import java.util.Scanner;

public class MetodaZadanie {
    public static void main(String[] args) {
        System.out.println("Jaka jest twoja ulubiona liczba ?");
        ulubionaLiczba();
        System.out.println("Podaj mi trzy liczby dodam je do siebie i podam tobie wynik");
        sumaLiczb();
        System.out.println("Teraz wylosuje tobie liczbę od 1 - 10");
        losowanieLiczb();
        System.out.println("Podaj liczbę lat ja podam tobie ile to dni");
        lataNadni();
        System.out.println("Podaj dwie liczby podzielę pierwszą przez drugą");
        dzielenieLiczb();
        System.out.println("Podaj mi który mamy rok miesiac i dzien");
        rokMiesiacDzien();

    }

    static void ulubionaLiczba() {
        Scanner scaner = new Scanner(System.in);
        int liczba = scaner.nextInt();
        System.out.println("Moja ulubiona liczba to :  " + liczba);
    }

    static void sumaLiczb() {
        Scanner scanner = new Scanner(System.in);
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        int liczba3 = scanner.nextInt();
        int suma = liczba1 + liczba2 + liczba3;

        System.out.println("Suma dodanych liczb to :  " + suma);
    }

    static void losowanieLiczb() {
        Random losowanie = new Random();
        int wylosowanaLiczba = losowanie.nextInt(1, 11);
        System.out.println("Wylosowana liczba to : " + wylosowanaLiczba);
    }

    static void lataNadni() {
        Scanner scanner = new Scanner(System.in);
        int liczbaLat = scanner.nextInt();
        int liczbaDni = liczbaLat * 365;
        System.out.println("Twoja liczba dni wynosi : " + liczbaDni);
    }

    static void dzielenieLiczb() {
        Scanner skaner = new Scanner(System.in);
        int liczba1 = skaner.nextInt();
        int liczba2 = skaner.nextInt();
        int dzielenie = liczba1 / liczba2;
        if (liczba2 == 0) {
            System.out.println("-1 wystąpił błąd");
        }
        System.out.println("Wynik dzielenia to : " + dzielenie);
    }

    static void rokMiesiacDzien() {
        Scanner skaner = new Scanner(System.in);
        int rok = skaner.nextInt();
        int miesiac = skaner.nextInt();
        int dzien = skaner.nextInt();
        String strRok = (rok + " rok " + miesiac + " miesiąc " + dzien + " dzień");
        System.out.println(strRok);
    }
}
