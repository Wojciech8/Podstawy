package aplikacja;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Podaj co mam znaleźć charge czy średnica");
        Scanner scanner = new Scanner(System.in);
        String wybor = scanner.nextLine();
        if (wybor.equals("charge")) {
            Test2.charge();
        } else if (wybor.equals("średnica")) {
            Test3.srednica();
        } else {
            System.out.println("Błąd nie mam takich danych");
        }
    }
}
