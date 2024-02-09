package metody;

import java.util.Scanner;

public class Zwaracanie2 {
    public  static void main(String[] args) {
        int liczba = Zwaracanie2.podajLiczbe("Podaj liczbę");
        System.out.println(liczba);

    }
    public static int podajLiczbe(String rzadanie) {

        System.out.println(rzadanie);
        Scanner skaner = new Scanner(System.in);
        int liczba = skaner.nextInt();
        return liczba;
    }
}
