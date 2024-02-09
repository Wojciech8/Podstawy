package podstawy;

import java.util.Random;

public class PetlaWhile1 {
    public static void main(String[] args) {
        System.out.println("Zaczynamy losowanie !");
        Random random = new Random();
        int liczba;
         do {
            liczba = random.nextInt(10) + 1;
            System.out.println(liczba);
            if (liczba == 10) {
                System.out.println("Trafione!!!");
            }
        }while (liczba < 10);
    }
}
