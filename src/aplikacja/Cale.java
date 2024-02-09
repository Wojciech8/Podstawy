package aplikacja;

import java.util.Scanner;

public class Cale {
    public static void main(String[] args) {
        double cal = 25.4;
        Scanner scanner = new Scanner(System.in);
        double policz = scanner.nextDouble();
        double policz1 = scanner.nextDouble();
        double policzone = policz/policz1 * cal;
        System.out.println(policzone);
    }
}
