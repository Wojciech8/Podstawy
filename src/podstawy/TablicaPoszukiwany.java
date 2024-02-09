package podstawy;

public class TablicaPoszukiwany {
    public static void main(String[] args) {

        int[] liczby = new int[4];
        String[] teksty = new String[2];
        liczby[0] = 13;//dzień ucieczki
        liczby[1] = 6;//miesiąc ucieczki
        liczby[2] = 2023;// rok ucieczki
        liczby[3] = 1000000;// nagroda za schwutanie

        teksty[0] = "Wojciech";
        teksty[1] = "Osiadacz";
        System.out.println("Dzień :" + liczby[0]);
        System.out.println("Miesiąc :" + liczby[1]);
        System.out.println("Rok :" + liczby[2]);
        System.out.println("Nagroda za schwytanie :" + liczby[3]);
        System.out.println("Imię poszukiwanego :" + teksty[0]);
        System.out.println("Nazwisko poszukiwanego  :" + teksty[1]);
    }

}
