package aplikacja;

import java.util.Scanner;

public class PrzelicznikCalinaMm {
    public static void main(String[] args) {

        // Przeliczenie cali na mm
        System.out.println("Przeliczymy cale na mm wpisz ilość");
        Scanner scanner = new Scanner(System.in);
        double mm = scanner.nextDouble();
        double cal = mm / 25.4;
        System.out.println(cal);
    }
}
