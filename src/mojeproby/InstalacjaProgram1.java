package mojeproby;

import instalacja.Czesc;

import java.util.ArrayList;
import java.util.Scanner;

public class InstalacjaProgram1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witam, oto lista części proszę wybrać z listy wpisująć numer , na końcu zostaną podsumowane");
        Czesc1 czesc1 = new Czesc1(100,20,40,"kolano", "zwykle");
        Czesc1 czesc2 = new Czesc1(200,30,50,"rura","prosta");
        Czesc1 czesc3 = new Czesc1(300,40,60,"trójnik","el. łączący");
        Czesc1 czesc4 = new Czesc1(400,50,70,"flansza","el.końcowy");
        Czesc1 czesc5 = new Czesc1(500,60,80,"kolano45","el. łączący");

        ArrayList<Czesc1> czesci = new ArrayList<>();

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

        for (int i = 0; i < czesci.size(); i++) {
            System.out.println(i+1 + "" +  czesci.get(i));
        }

        int wybor = scanner.nextInt();

        ArrayList<Czesc1> wybrane = new ArrayList<>();

        if (wybor == 1){
            wybrane.add(czesc1);
        } else if (wybor == 2) {
            wybrane.add(czesc2);
        } else if (wybor == 3) {
            wybrane.add(czesc3);
        } else if (wybor == 4) {
            wybrane.add(czesc4);
        } else if (wybor == 5) {
            wybrane.add(czesc1);
        }else {
            System.out.println("Nie ma takiej części");
        }


        System.out.println("Twoje wybrane częsci: ");
        for (int i = 0; i < wybrane.size(); i++) {
            System.out.println(i+1 + "" +  wybrane.get(i));
        }


    }
}
