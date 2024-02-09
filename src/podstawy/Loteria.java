package podstawy;

import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        int[] tablica = new int[6];
        Scanner skanowanie = new Scanner(System.in);
        System.out.println("Wybierz 6 liczb od 1-24");

        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj jedną liczbę od 1-24");
            int liczba = skanowanie.nextInt();
            if (liczba <= 0 || liczba > 24) {
                System.out.println("Podana liczba jest nieprawidłowa");
            } else {
                tablica[i] = liczba;
            }


        }
        System.out.println("Wszystkie liczby :");
        for (int i = 0; i < 6; i++) {
            System.out.println(tablica[i]);
        }


    }
}
