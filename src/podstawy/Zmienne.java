package podstawy;

public class Zmienne {
    //static int cenaProduktu = 400;

    public static void main(String[] args) {
        int cenaProduktu = 10000;
        double liczbaRat = 12;
        double jedRata = cenaProduktu/liczbaRat;
        boolean drogaRata = jedRata > 50;
        System.out.println("cena produktu = " + cenaProduktu);
        System.out.println("1 rata kosztuje ");

        System.out.println(cenaProduktu/liczbaRat);
        System.out.println("1 rata kosztuje  " + jedRata);
        System.out.println("3 rata kosztuje wiecej niz 50 zl?    " + drogaRata);
    }
}


