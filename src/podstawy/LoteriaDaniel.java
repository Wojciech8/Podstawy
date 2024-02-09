package podstawy;

import java.util.Random;

public class LoteriaDaniel {
    public static void main(String[] args) {
        int[] tablica = new int[3];
        Random losowanie = new Random();
        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);
        for (int i = 0; i < 3; i++) {
            tablica[i] = losowanie.nextInt(1, 15);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(tablica[i]);
        }
    }
}
