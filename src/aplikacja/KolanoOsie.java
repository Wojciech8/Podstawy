package aplikacja;

import java.util.Scanner;

public class KolanoOsie {
    public static void oskolana() {
        System.out.println("Podaj promień kolana");
        Scanner scanner = new Scanner(System.in);
        double promien = scanner.nextDouble();
        System.out.println("Podaj kąt");
        double kat = scanner.nextDouble();
        // Oblicz tangens kąta  stopni
        // kąt dzielę na pół aby mieć dwa odcinki osi (np45 stopni trzeba tanges 22,5 stopnia
        double tangens = Math.tan(Math.toRadians(kat/2));//liczy mi stopnie na tangens i wyciaga z nawiasu
        System.out.println("oś wewnętrzna wynosi z jednej strony " + promien * tangens);

    }
}
