package TreningObiekt;

public class LiczenieMain {
    public static void main(String[] args) {

        Rura rura1 = new Rura(40, 1000);
        Rura rura2 = new Rura(50,2000);
        Kolano kolano1 = new Kolano(40,80);
        Kolano kolano2 = new Kolano(50, 90);

        rura1.polaczKolano = kolano1;
        kolano1.polaczRura = rura2;
        rura2.polaczKolano = kolano2;
        kolano2.polaczRura = rura1;



        rura1.wyswietl();
    }
}
