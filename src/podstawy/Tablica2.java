package podstawy;

import java.util.Arrays;
import java.util.Random;

public class Tablica2 {
    public static void main(String[] args) {
        liczby();
        wartosciLogiczne2();
        litery2();
        losowanie2();



        //Tablica zmienno przecinkowa


        //Tablica wartości Bollean


        //podstawy.Tablice znaków


        //podstawy.Tablice obiektów Random



    }

    static void litery2() {
        char[] litery = {'J', 'A', 'V', 'A'};
        System.out.println(Arrays.toString(litery));
    }

    static void liczby() {
        double[] liczby = {1, 2.4, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(liczby));
    }

    static void wartosciLogiczne2() {
        boolean[] wartościLogiczne = {true, false};
        System.out.println(Arrays.toString(wartościLogiczne));
    }

    static void losowanie2() {
        Random[] losoweObiekty = {new Random(), new Random(), new Random()};
        Random drugiRandom = losoweObiekty[1];
        int wylosowanaLiczba = drugiRandom.nextInt(6);
        System.out.println(wylosowanaLiczba);

    }
}
