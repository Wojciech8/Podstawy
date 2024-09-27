package instalacja;

public class WykonanieMain {
    public static void main(String[] args) {


        Czesc czesc1 = new Czesc(100,20,40,"kolano", "zwykle");
        Czesc czesc2 = new Czesc(200,30,50,"rura","prosta");
        Instalacja instalacja1 = new Instalacja();

        instalacja1.dodajCzesc(czesc1);
        instalacja1.dodajCzesc(czesc2);
        instalacja1.wyswietlInstalacje();

        System.out.println("Instalacja kosztuje: " + instalacja1.kosztBazowyInstalacji() + " zł");

    }
}
