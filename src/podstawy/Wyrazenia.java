package podstawy;

public class Wyrazenia {
    public static void main(String[] args) {
        System.out.println("cena produktu = 359zl");
        System.out.println("1 rata kosztuje ");
        System.out.println(359/12.0);
        System.out.println("1 rata kosztuje  " + (359 + 12.0));
        System.out.println("3 rata kosztuje wiecej niz 50 zl?    " + (359/12.0 > 50));
    }
}
