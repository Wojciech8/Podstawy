package kompozycja;

class CzesciDemo {
    public static void main(String[] args) {
        int liczba = 10;

        Czesc czesc1 = new Czesc("rura");
        Czesc czesc2 = new Czesc("kolano");
        Czesc czesc3 = new Czesc("flansza");
        Czesc czesc4 = new Czesc("trójnik");
        Czesc czesc5 = new Czesc("kolano45");

        Uzytkownik uzytkownik = new Uzytkownik();
        Uzytkownik uzytkownik2 = new Uzytkownik();
        uzytkownik2.dodajUlubioneCzesci(czesc4);

        uzytkownik.dodajUlubioneCzesci(czesc1);
        uzytkownik.dodajUlubioneCzesci(czesc2);


        System.out.println("Ulubione części uzytkownika1: ");
        uzytkownik.wyswietlUlubione();
        System.out.println("Ulubione części uzytkownika2: ");
        uzytkownik2.wyswietlUlubione();


        //Zrobić klasy
        //zrobić obiekty w main
        //wstawić kilka części do ulubionych
        //wyświetlić użytkownika z ulubionymi częściami



    }



    /*


     //Część - nazwa
        //Użytkownik - ulubioneCzęści

        //Scenariusz:
        //Dodaj część do ulubionych
            //pokażą się wszystkie dostępne części z numerkami (5 części)
            //użytkownik pisze numerek
            //program dodaje część do listy ulubionych
        //Wyświetl ulubione części
            //program wyświetla Twoją listę ulubionych





Przykładowe działanie:

Co chcesz zrobić?
1. dodaj część do ulubionych
2. twoje ulubione części

1
Części do wyboru:
1. kolano
2. trojnik
3. rura
4. flansza
5. kolano 45

3
Dodano!
Co chcesz zrobić?
1. dodaj część do ulubionych
2. twoje ulubione części

1
Części do wyboru:
1. kolano
2. trojnik
3. rura
4. flansza
5. kolano 45

4
Dodano!
Co chcesz zrobić?
1. dodaj część do ulubionych
2. twoje ulubione części

2
Twoje ulubione części:
1. rura
2. flansza

Wpisz 0 aby wrócić do menu

0

Co chcesz zrobić?
1. dodaj część do ulubionych
2. twoje ulubione części
    * */
}
