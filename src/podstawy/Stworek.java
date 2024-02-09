package podstawy;

import java.util.Random;
import java.util.Scanner;

public class Stworek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nadaj imię stworkowi");
        String imie = scanner.nextLine();
        Random random = new Random();
        int zdrowie = random.nextInt(2, 11);
        int najedzenie = random.nextInt(2, 11);
        int checZabawy = random.nextInt(2, 11);
        System.out.println("Zdrowie : " + zdrowie);
        System.out.println("Najedzeni :   " + najedzenie);
        System.out.println("Chęć zabawy :  " + checZabawy);
        System.out.println("Właściciel stworka miał wypadek teraz ty musisz się nim opiekować");
        System.out.println("Stan dinozaura:");
        if (zdrowie >= 6) {
            System.out.println("podstawy.Stworek czuje się dobrze");
        } else if (zdrowie <= 5 && zdrowie >= 3) {
            System.out.println("podstawy.Stworek czuje się żle");
        } else {
            System.out.println("podstawy.Stworek jest w stanie ciężkim");
        }


        if (najedzenie >= 6) {
            System.out.println("podstawy.Stworek jest najedzony");
        } else if (najedzenie <= 5 && najedzenie >= 3) {
            System.out.println("podstawy.Stworek jest głodny");
        } else {
            System.out.println("podstawy.Stworek umiera z glodu");
        }
        if (checZabawy >= 6) {
            System.out.println("podstawy.Stworek nie potrzebuje zabawy");
        } else if (checZabawy <= 5 && checZabawy >= 3) {
            System.out.println("podstawy.Stworek potrzebuje zabawy");
        } else {
            System.out.println("podstawy.Stworek bardzo się nudzi");
        }
        System.out.println("chcesz NAKARMIC storka");
        System.out.println("chcesz POLOZYC pac stworka");
        System.out.println("chcesz się z nim BAWIC");
        String wybor = scanner.nextLine();
        if (wybor.equals("NAKARMIC")) {
            System.out.println("podstawy.Stworek zostal nakarmiony");
            najedzenie = najedzenie + 2;
        } else if (wybor.equals("POLOZYC")) {
            System.out.println("podstawy.Stworek polozyl sie spac");
            zdrowie = zdrowie + 2;
        } else if (wybor.equals("BAWIC")) {
            System.out.println("podstawy.Stworek zosatal ubawiony");
            checZabawy = checZabawy + 2;
        }
        if (wybor.equals("NAKARMIC")) {
            checZabawy = checZabawy - 2;
        }
        if (wybor.equals("BAWIC")) {
            zdrowie = zdrowie - 1;
        }
        if (wybor.equals("POLOZYC")) {
            najedzenie = najedzenie - 2;
        }
        if (najedzenie > 7 || wybor.equals("NAKARMIC")) {
            System.out.println("podstawy.Stworek nie jest głodny");
        } else if (najedzenie <5 || wybor.equals("BAWIC" + "POLOZYC")) {
            zdrowie = zdrowie - 3;
            
        }
        System.out.println("Zdrowie : " + zdrowie);
        System.out.println("Najedzeni :   " + najedzenie);
        System.out.println("Chęć zabawy :  " + checZabawy);

        System.out.println("Minął kolejny dzień. Dziś stworek czuje się ");
        zdrowie = random.nextInt(2, 11);
        najedzenie = random.nextInt(2, 11);
        checZabawy = random.nextInt(2, 11);
        System.out.println("Zdrowie : " + zdrowie);
        System.out.println("Najedzeni :   " + najedzenie);
        System.out.println("Chęć zabawy :  " + checZabawy);
        if (zdrowie >= 6) {
            System.out.println("podstawy.Stworek czuje się dobrze");
        } else if (zdrowie <= 5 && zdrowie >= 3) {
            System.out.println("podstawy.Stworek czuje się żle");
        } else {
            System.out.println("podstawy.Stworek jest w stanie ciężkim");
        }


        if (najedzenie >= 6) {
            System.out.println("podstawy.Stworek jest najedzony");
        } else if (najedzenie <= 5 && najedzenie >= 3) {
            System.out.println("podstawy.Stworek jest głodny");
        } else {
            System.out.println("podstawy.Stworek umiera z glodu");
        }
        if (checZabawy >= 6) {
            System.out.println("podstawy.Stworek nie potrzebuje zabawy");
        } else if (checZabawy <= 5 && checZabawy >= 3) {
            System.out.println("podstawy.Stworek potrzebuje zabawy");
        } else {
            System.out.println("podstawy.Stworek bardzo się nudzi");
        }
        if (najedzenie > 7 && wybor.equals("NAKARMIC")) {
            zdrowie = zdrowie - 3;
            System.out.println("podstawy.Stworek nie jest głodny");
        }

    }
}











