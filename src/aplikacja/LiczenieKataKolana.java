package aplikacja;

import java.util.Scanner;

public class LiczenieKataKolana {
    public static void odcinekKolana() {
        System.out.println("Teraz przeliczę tobie kąt dla danego kolana");

        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj promień kolana");
        double promien = scanner.nextDouble();
        System.out.println("Podaj średnice kolana");
        double srednica = scanner.nextDouble();
        System.out.println("Podaj kąt kolana");
        double kat = scanner.nextDouble();

        // liczę łuk Zewnętrzny
        double lukZewnentrzny = (promien + srednica / 2) * Math.PI * promien * 2 / 360;

        System.out.println("Luk zewnętrzny dla 90 stopni wynosi " + lukZewnentrzny);

        // Liczę łuk Wewnętrzny
        double lukWewnterzny = (promien - srednica / 2) * Math.PI * promien * 2 / 360;

        System.out.println("Luk wewntętrzny dla 90 stopni wynosi " + lukWewnterzny);


        //Teraz trzeba wszystko max skrócić

        double katKolanaZew = lukZewnentrzny / 90 * kat;
        System.out.println("Długość łuku kolana na zewnątrz dla  " + kat + " stopni wynosi " + katKolanaZew);


        double katKolanaWew = lukWewnterzny / 90 * kat;
        System.out.println("Długość łuku kolana wewnątąrz dla  " + kat + " stopni wynosi " + katKolanaWew);



        // Oblicz tangens kąta  stopni
        // kąt dzielę na pół aby mieć dwa odcinki osi (np45 stopni trzeba tanges 22,5 stopnia
        double tangens = Math.tan(Math.toRadians(kat/2));//liczy mi stopnie na tangens i wyciaga z nawiasu
        System.out.println("oś wewnętrzna wynosi z jednej strony " + promien * tangens);


    }
}
