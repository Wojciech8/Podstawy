package aplikacja;

import java.util.Scanner;

public class Offset {
    public static void main(String[] args) {
        policzPodwojnyTrojkat();

    }
    public static void policzPodwojnyTrojkat() {
        // Liczymy przeciwprostokątną z tw.Pitagorasa
        System.out.println("Poadaj długość boku a :");
        Scanner scaner = new Scanner(System.in);
        double boka = scaner.nextDouble();
        System.out.println("Podaj długość boku b : ");
        double bokb = scaner.nextDouble();
        double bokc = Pitagoras.policzPrzeciwprostokatna(boka, bokb);
        System.out.println("Bok c wynosi : " + bokc);

        // liczymy kąty w naszym trójkącie
        double katA = Pitagoras.policzKat(boka, bokc);
        double katB = Pitagoras.policzKat(bokb, bokc);
        System.out.println("Kat A wynosi :" + katA);
        System.out.println("Kat B wynosi :" + katB);

        //teraz policzymy drugi trójkąt z jego kątami 45st

        double drugiC = Pitagoras.policzPrzeciwprostokatna(bokc, bokc);
        double katA2 = Pitagoras.policzKat(bokc, drugiC);
        double katB2 = Pitagoras.policzKat(bokc, drugiC);
        System.out.println("Bok c drugiego trójkąta wynosi :" + drugiC);
        System.out.println("Kąt A w drugim trójkącie wynosi : " + katA2);
        System.out.println("Kąt B w drugim trójkącie wynosi : " + katB2);
    }


}
