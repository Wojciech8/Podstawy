package podstawy;

import metody.Zwaracanie2;

import java.util.Scanner;

public class SklepAGD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cenę towaru od 100zł do 10.000zł");

        double cena = scanner.nextDouble();
        if (cena < 100 || cena > 10000) {
            System.out.println("Cena nie spełnia warunków udzielenia kredytu");
            return;
        }
        double liczbaRat = Zwaracanie2.podajLiczbe("Podaj liczbę rat od 6 do 48");
        if (liczbaRat < 6 || liczbaRat > 48) {
            System.out.println("Ilość rat nie spełnia warunków umowy");
            return;

        }
        double odsetki;
        if (liczbaRat >= 6 && liczbaRat <= 12) {
            odsetki = 0.025;
        } else if (liczbaRat >= 13 && liczbaRat <= 24) {
            odsetki = 0.05;
        } else {
            odsetki = 0.1;
        }
        double rata = cena * (1 + odsetki) / liczbaRat;
        podsumowanie(rata, odsetki);



    }
    static void podsumowanie(double rata, double odsetki) {
        System.out.println("Miesięczna rata wynosi " + rata + " zł");
        System.out.println("Odsetki wynoszą " + odsetki);

    }
}
