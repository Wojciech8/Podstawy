package aplikacja;

import java.util.Scanner;

public class Test3 {
    public static void srednica() {
        System.out.println("Podaj średnice");
        Scanner scanner = new Scanner(System.in);
        double[]srednica = {20,30,40,50,60,70};
        double[]promien = {40,50,60,70,80,90};
        double wybor = scanner.nextDouble();


        for (int i = 0; i < srednica.length ; i++) {
            if (wybor == srednica[i]) {
                System.out.println("Promień = " + promien[i]);
            }

        }
    }
}
