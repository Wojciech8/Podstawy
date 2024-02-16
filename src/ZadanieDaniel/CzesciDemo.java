package ZadanieDaniel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CzesciDemo {
    public static void main(String[] args) {

        ArrayList<Czesc> ulubioneCzesci = new ArrayList<>();
        ArrayList<Czesc> dostepneCzesci = new ArrayList<>();

        dostepneCzesci.add(new Czesc("kolano"));
        dostepneCzesci.add(new Czesc("kolano45"));
        dostepneCzesci.add(new Czesc("rura"));
        dostepneCzesci.add(new Czesc("flansza"));
        dostepneCzesci.add(new Czesc("trójnik"));

        Scanner scaner = new Scanner(System.in);

        while (true) {
            System.out.println("Co chcesz zrobić");
            System.out.println("1. dodaj czesc do ulubionych");
            System.out.println("2. twoje ulubione czesci");

            int wybor = scaner.nextInt();


            if (wybor == 1) {
                System.out.println("Części do wyboru");

                for (int i = 0; i < dostepneCzesci.size(); i++) {
                    System.out.println(dostepneCzesci.get(i).nazwa);


                }
                int numerek = scaner.nextInt();
                ulubioneCzesci.add(dostepneCzesci.get(numerek - 1));
                System.out.println("Dodano");
            } else if (wybor == 2) {
                System.out.println("Twoje ulubione czesci");

                for (int i = 0; i < ulubioneCzesci.size(); i++) {
                    System.out.println((i + 1) + "." + ulubioneCzesci.get(i).nazwa);
                }
                System.out.println("Wpisz 0 aby wrócić do menu");

                int powrot = scaner.nextInt();
                    if (powrot == 0){
                        continue;
                }

            }
        }
    }
}
