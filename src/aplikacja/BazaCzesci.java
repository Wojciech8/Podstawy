package aplikacja;

import java.util.Scanner;

public class BazaCzesci {
    public static void poszukajCzesciPodajacSrednice() {
        double[] srednice = {10,20,30,40,50,60,70};
        double[] promienie = {30,40,50,60,70,80,90};
        System.out.println("Podaj średnice");
        Scanner scaner = new Scanner(System.in);

        double jegoSrednica = scaner.nextDouble();
        for (int i = 0; i < srednice.length; i++) {

            if (jegoSrednica == srednice[i]) {
                System.out.println(promienie[i]);
            }

        }



    }
}
