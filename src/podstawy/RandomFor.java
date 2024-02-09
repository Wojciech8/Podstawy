package podstawy;

import java.util.Random;
import java.util.Scanner;

public class RandomFor {
    public static void main(String[] args) {
        Scanner zapytanie = new Scanner(System.in);
        System.out.println("Ile razy mam losować ?");
        int iloscLosowan = zapytanie.nextInt();

        for (int i = 0; i < iloscLosowan; i++) {
            Random losowanie = new Random();
            int liczba = losowanie.nextInt(1, 10);
            System.out.println("wylosowana liczba to : " + liczba);
        }
    }
}
