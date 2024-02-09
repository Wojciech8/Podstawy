package metody;

import java.util.Scanner;

public class ParametryTrening {
    public static void main(String[] args) {
        System.out.println("Podaj ilość złotówek");
        Scanner skaner = new Scanner(System.in);
        double zloty = skaner.nextDouble();
        liczenie(zloty);


    }
    static void liczenie(double zloty) {
        double euro = zloty / 4.6;
        double dolary = zloty / 3.9;
        System.out.println("Masz " + dolary + "  dolarów");
        System.out.println("Masz " + euro + "  euro");

    }
}
