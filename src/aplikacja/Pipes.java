package aplikacja;

import java.util.Scanner;

public class Pipes {
    public static void main(String[] args) {
        policzWstawke();
    }
    public static void policzWstawke() {

        System.out.println("Podaj długość odcinka");
        Scanner scaner = new Scanner(System.in);
        double dlOdcinka = scaner.nextDouble();
        System.out.println("Długość odcinka wynosi" + dlOdcinka);


        System.out.println("Podaj promień kolan");
        Scanner scanner = new Scanner(System.in);
        double kolanko1 = scanner.nextDouble();
        double kolanko2 = scanner.nextDouble();
        System.out.println("Kolano 1 wynosi " + kolanko1);
        System.out.println("Kolanko2 wynosi" + kolanko2);


        System.out.println("Długość wstawki wynosi :");
        double wstawka = policzWstawke(kolanko1, kolanko2, dlOdcinka);
        System.out.println("Długość wstawki wynosi" + wstawka);

    }

    static double policzWstawke(double kolanko1, double kolanko2, double dlOdcinka) {
        double wstawka = dlOdcinka - kolanko1 - kolanko2;
        return wstawka;
    }

}
