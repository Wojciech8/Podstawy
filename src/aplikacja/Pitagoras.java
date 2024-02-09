package aplikacja;

import java.util.Scanner;

public class Pitagoras {
    public static void main(String[] args) {
        System.out.println("Podaj długości boków a i b");


        Scanner scaner = new Scanner(System.in);
        double boka = scaner.nextDouble();
        System.out.println("a = " + boka);
        double bokb = scaner.nextDouble();
        System.out.println("b = " + bokb);
        double przeciwProstokatna = policzPrzeciwprostokatna(boka, bokb);
        System.out.println("Przeciwprostokątna wynosi :" + przeciwProstokatna);


        // liczenie kątów Tablice tryg
       double katA = policzKat(boka, przeciwProstokatna);
        double katB = policzKat(bokb, przeciwProstokatna);
        double katC = 90; // Kąt prosty

        System.out.println("kąt a =" + katA);
        System.out.println("kat b =" + katB);
    }

    static double policzPrzeciwprostokatna(double boka, double bokb) {
        double przeciwProstokatna = Math.sqrt(boka * boka + bokb * bokb);
        return przeciwProstokatna;


    }

    static double policzKat(double bok, double przeciwProstokatna) {
        double kat = Math.toDegrees(Math.acos(bok / przeciwProstokatna));
        return kat;
    }

}
