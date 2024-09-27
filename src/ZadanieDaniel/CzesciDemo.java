package ZadanieDaniel;

import java.util.ArrayList;
import java.util.Scanner;

public class CzesciDemo {


    public static void main(String[] args) {
        ArrayList<Czesc> ulubione = new ArrayList<>();

       ArrayList<Czesc> dostepneCzesc =  przygotowanieDostepneCzesci();

        zarzadzajUlubionymi( ulubione,dostepneCzesc );
    }

    static  ArrayList<Czesc> przygotowanieDostepneCzesci() {
        ArrayList<Czesc> dostepne = new ArrayList<>();

        dostepne.add(new Czesc("kolano"));
        dostepne.add(new Czesc("kolano45"));
        dostepne.add(new Czesc("rura"));
        dostepne.add(new Czesc("flansza"));
        dostepne.add(new Czesc("trójnik"));
        return dostepne;
    }

    static void zarzadzajUlubionymi(ArrayList<Czesc> ulubione, ArrayList<Czesc> dostepne) {
        Scanner scaner = new Scanner(System.in);
        while (true) {
            System.out.println("Co chcesz zrobić");
            System.out.println("1. dodaj czesc do ulubionych");
            System.out.println("2. twoje ulubione czesci");

            int wybor = scaner.nextInt();


            if (wybor == 1) { //DODAWANIE

                System.out.println("Części do wyboru");

              /*  for (int i = 0; i < dostepne.size(); i++) {
                    System.out.println(dostepne.get(i).nazwa);
                }*/
                for (Czesc czesc : dostepne) {
                    System.out.println(czesc.nazwa);
                }

                int numerek = scaner.nextInt();
                Czesc czescDoDodania = dostepne.get(numerek - 1);
                ulubione.add(czescDoDodania);
                System.out.println("Dodano");

            } else if (wybor == 2) { //TWOJE ULUBIONE
                System.out.println("Twoje ulubione czesci");

                for (int i = 0; i < ulubione.size(); i++) {
                    System.out.println((i + 1) + "." + ulubione.get(i).nazwa);
                }
                System.out.println("Wpisz cokolwiek aby wrócić do menu");
                scaner = new Scanner(System.in);
                scaner.nextLine();
            }
        }
    }
}

//funkcje
// baza części
// wyliczenia
// budowanie schematu


//pomiary
//dobranie części
//liczenie
//wykonanie



