package aplikacja;

import java.util.Scanner;

public class BazaCzesci2 {
    public static void main(String[] args) {
        poszukajCzesci();
    }
    public static void poszukajCzesci() {

        System.out.println("Podaj nr charge lub średnice");
        String [] charge = {"1","2","3","4","5","P","E"};
        double[] srednice = {10,20,30,40,50,60,70};
        double [] promien = {30,40,50,60,70,80,90};
        Scanner scanner = new Scanner(System.in);

        String wprowadzenie = scanner.nextLine();


        for (int i = 0; i < charge.length; i++) {
            if (wprowadzenie.equals(charge[i])) {
                System.out.println(promien[i]);
                return;
            }
        }
        double wprowadzanieDouble = Double.parseDouble(wprowadzenie);
        for (int i = 0; i < srednice.length; i++) {
            if (wprowadzanieDouble == srednice[i]) {
                System.out.println(promien[i]);
            }
        }
    }
}
