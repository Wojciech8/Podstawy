package aplikacja;

import java.util.Scanner;

public class Test2 {
    public static void charge() {
        System.out.println("Podaj charge");
        Scanner scanner = new Scanner(System.in);
        String[] charge = {"W","O","J","T","A","S"};
        double[]promien = {30,40,50,60,70,80};
        String wybor = scanner.nextLine();
        for (int i = 0; i < charge.length; i++) {
            if (wybor.equals(charge[i])) {
                System.out.println("promień = " + promien[i]);
            }

        }


    }
}
