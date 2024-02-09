package podstawy;

import java.util.Random;
import java.util.Scanner;

public class PapierKamienNozyce {
    public static void main(String[] args) {
        System.out.println("Gra papier, kamien, nożyczki");
        Scanner scaner = new Scanner(System.in);
        Random losowanie = new Random();
        String wybor = scaner.nextLine();
        int liczba = losowanie.nextInt(0, 3);// 0 papier  1 kamien 2 nozyczki
        System.out.println("Wybrałeś = " + wybor);
        System.out.println("Przeciwnik wybrał = " + liczba);
        // jeśli komp wylosowal 0 a ty wybrales papier to jest remis
        if (liczba == 0 && wybor.equals("Papier")) {
            System.out.println("Zremisowałeś");
        } else if (liczba == 1 && wybor.equals("Papier")) {
            System.out.println("Przeciwnik przegrał wybrał kamień");
        }else if (liczba == 2 && wybor.equals("Papier")) {
            System.out.println("Przegrałeś przeciwnik wybrał nożyczki");
        } else if (liczba == 0 && wybor.equals("Kamien")) {
            System.out.println("Przegrałeś przeciwnik wybrał papier");
        }  else if (liczba == 1 && wybor.equals("Kamien")) {
        System.out.println("Przeciwnik zremisował wybrał kamień");
    }else if (liczba == 2 && wybor.equals("Kamien")) {
        System.out.println("Wygrałeś przeciwnik wybrał nożyczki");

        }else if (liczba == 1 && wybor.equals("Nozyczki")) {
            System.out.println("Przeciwnik wygrał wybrał kamień");
        }else if (liczba == 2 && wybor.equals("Nozyczki")) {
            System.out.println("Zremisowałeś przeciwnik wybrał nożyczki");
        } else if (liczba == 0 && wybor.equals("Nozyczki")) {
            System.out.println("Wygrałeś przeciwnik wybrał papier");
        }
    }
}
