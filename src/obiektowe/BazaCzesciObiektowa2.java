package obiektowe;

import java.util.Scanner;

public class BazaCzesciObiektowa2 {
    public static void poszukajCzesci() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nr charge lub średnice");
        String wybor = scanner.nextLine();
        Czesc czesc1 = new Czesc();
        Czesc czesc2 = new Czesc();
        Czesc czesc3 = new Czesc();
        Czesc czesc4 = new Czesc();
        Czesc czesc5 = new Czesc();

        Czesc[]czesci ={czesc1,czesc2,czesc3,czesc4,czesc5};




        czesci[0].charge = "w";
        czesc1.srednica = 10;

        czesc2.charge = "o";
        czesc2.srednica = 20;

        czesc3.charge = "j";
        czesc3.srednica = 30;

        czesc4.charge = "t";
        czesc4.srednica = 40;

        czesc5.charge = "e";
        czesc5.srednica = 50;


  /*      czesc1.wyswietl();
        czesc2.wyswietl();
        czesc3.wyswietl();
        czesc4.wyswietl();
        czesc5.wyswietl();

        czesci[0].wyswietl();
        czesci[1].wyswietl();
        czesci[2].wyswietl();
        czesci[3].wyswietl();
        czesci[4].wyswietl();

   */

        for (int i = 0; i < czesci.length; i++) {
            if (wybor.equals(czesci[i].charge)) {
                System.out.println(czesci[i].policzPromien());
                return;
            }
        }
        double wyborDouble = Double.parseDouble(wybor);
        for (int i = 0; i < czesci.length; i++) {
            if (wyborDouble == czesci[i].srednica) {
                System.out.println(czesci[i].policzPromien());
            }

        }


    }
}
