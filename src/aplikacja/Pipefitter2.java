package aplikacja;

import obiektowe.BazaCzesciObiektowa;
import obiektowe.BazaCzesciObiektowa2;

import java.util.Scanner;

public class Pipefitter2 {
    public static void main(String[] args) {
        System.out.println("Co potrzebujesz policzyć wstawke, trójkąt, kolano, cześci");
        Scanner scanner = new Scanner(System.in);
        String wybor = scanner.nextLine();

        if (wybor.equals("wstawke")) {
            Pipes.policzWstawke();
        } else if (wybor.equals("trójkąt")) {
            Offset.policzPodwojnyTrojkat();
        } else if (wybor.equals("kolano")) {
            LiczenieKataKolana.odcinekKolana();
        } else if (wybor.equals("części")) {
            BazaCzesciObiektowa2.poszukajCzesci();

        } else {
            System.out.println("Nie rozumiem poleceń");
        }


    }
}
