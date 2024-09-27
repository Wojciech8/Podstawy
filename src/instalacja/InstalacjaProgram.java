package instalacja;

import java.util.ArrayList;
import java.util.Scanner;

public class InstalacjaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witam, oto lista części proszę wybrać z listy wpisująć numer , na końcu zostaną podsumowane" );
        System.out.println("Aby zakończyć program wcisnij 0");
        Czesc czesc1 = new Czesc(100, 20, 40, "kolano", "zwykle");
        Czesc czesc2 = new Czesc(200, 30, 50, "rura", "prosta");
        Czesc czesc3 = new Czesc(300, 40, 60, "trójnik", "el. łączący");
        Czesc czesc4 = new Czesc(400, 50, 70, "flansza", "el.końcowy");
        Czesc czesc5 = new Czesc(500, 60, 80, "kolano45", "el. łączący");
        Instalacja instalacja = new Instalacja();


        ArrayList<Czesc> czesci = new ArrayList<>();

        czesci.add(czesc1);
        czesci.add(czesc2);
        czesci.add(czesc3);
        czesci.add(czesc4);
        czesci.add(czesc5);

       /* int numer = 0;
        for (Czesc czesc : czesci) {
            numer++;
            System.out.println(numer + "" + czesc);
        }*/





       /* ArrayList<Czesc> wybrane = new ArrayList<>();
        wybrane.add(czesci.get(wybor - 1));

       /* if (wybor == 1){
            wybrane.add(czesci.get(wybor - 1));
        } else if (wybor == 2) {
            wybrane.add(czesci.get(wybor - 1));
        } else if (wybor == 3) {
            wybrane.add(czesci.get(2));
        } else if (wybor == 4) {
            wybrane.add(czesci.get(3));
        } else if (wybor == 5) {
            wybrane.add(czesci.get(4));
        }else {
            System.out.println("Nie ma takiej części");
        }


        System.out.println("Twoje wybrane częsci: ");
        for (int i = 0; i < wybrane.size(); i++) {
            System.out.println(i+1 + "" +  wybrane.get(i));
        }*/

        while (true) {
            for (int j = 0; j < czesci.size(); j++) {
                System.out.println(j + 1 + "" + czesci.get(j));

            }
            int wybor = scanner.nextInt();
            if (wybor == 0) {
                break;
            }

            instalacja.dodajCzesc(czesci.get(wybor - 1));
            System.out.println("Całkowity koszt instalacji to : " + instalacja.kosztBazowyInstalacji() + " złotych");
            System.out.println("RABATA : " + instalacja.policzRabat());


        }

        System.out.println("");
        instalacja.wyswietlInstalacje();


    }
}

