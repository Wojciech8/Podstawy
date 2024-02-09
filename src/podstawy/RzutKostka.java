package podstawy;

import java.util.Random;
import java.util.Scanner;
public class RzutKostka {

    public static void main(String[] args) {




        for (int i = 0; i < 3; i++) {
            polecenia();


            Scanner scanner = new Scanner(System.in);
            int liczbaScianek = scanner.nextInt();

            System.out.println("Rzucam kostką o ilości ścianek: " + liczbaScianek);

            Random random = new Random(6);
            int wynik = random.nextInt(liczbaScianek) + 1;
            System.out.println("Wyszło mi: " + wynik);

        }


    }
    static void polecenia() {
        System.out.println("Program rzuci dla Ciebie kostką do gry i wylosuje liczbę!");
        System.out.print("Proszę, podaj ile ścianek ma mieć kostka która rzucasz? 4, 6, 10 a może 20? ");
    }
}
