package podstawy;

import java.util.Scanner;

public class WhileZliczaniePunktow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaPunktow = 0;
        int punkty;
        do {
            System.out.println("Podaj liczbę punktów. lub wpisz 0 aby zakończyć");
            punkty = scanner.nextInt();
            sumaPunktow += punkty;
            System.out.println("Suma punktów wynosi:  " + sumaPunktow);
        } while (punkty > 0);
        System.out.println("Łączna suma punktów:  " + sumaPunktow);
    }
}

