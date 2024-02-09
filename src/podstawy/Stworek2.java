package podstawy;

import java.util.Random;
import java.util.Scanner;

public class Stworek2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Nadaj imię stworkowi");
        String imie = scaner.nextLine();
        Random losowanie = new Random();
        int zdrowie = losowanie.nextInt(1, 11);
        int najedzenie = losowanie.nextInt(1, 11);
        int checZabawy = losowanie.nextInt(1, 11);
        System.out.println("Zdrowie : " + zdrowie );
        System.out.println("Najedzenie : " + najedzenie);
        System.out.println("Chęć zabawy : " + checZabawy);
        System.out.println("Właściciel stworka miał wypadek musisz się nim zaopiekować");
        System.out.println("Stan dinozaura ");
        if (zdrowie >= 6) {
            System.out.println("podstawy.Stworek czuje się dobrze");
        } else if (zdrowie <=5 && zdrowie >=3) {
            System.out.println("podstawy.Stworek czuje się źle");
        } else {
            System.out.println("podstawy.Stworek czuje się bardzo źle");
        }
        if (najedzenie >= 6) {
            System.out.println("podstawy.Stworek jest najedzony");
        } else if (najedzenie <=5 && najedzenie >= 3) {
            System.out.println("podstawy.Stworek jest głodny");
        } else {
            System.out.println("podstawy.Stworek jest bardzo głodny");
        }
        if (checZabawy >=6) {
            System.out.println("podstawy.Stworek jest ubawiony");
        } else if (checZabawy <=5 && checZabawy >=3) {
            System.out.println("podstawy.Stworek chce sie bawić");
        } else {
            System.out.println("podstawy.Stworek chce się bardzo bawić");
        }


    }
}
